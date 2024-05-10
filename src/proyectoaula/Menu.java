/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoaula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author POWER
 */
public class Menu {
    private RegistrosUsuarios registroUsuarios;
    private RegistroReseñas registroReseña;
    private Map<String, Emprendimiento> emprendimientos;

    public Menu() {
        this.registroUsuarios = new RegistrosUsuarios();
        this.registroReseña = new RegistroReseñas();
        this.emprendimientos = new HashMap<>();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        Cuenta usuario = null;
        boolean salir= false;
        while (!salir) {
            System.out.println("1. Registrar");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Salir");
            System.out.println("Elige una opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch(opcion) {
                case 1 -> registrar(scanner);
                        
                case 2 -> {
                    Cuenta cuenta = iniciarSesion(scanner);
                    if (cuenta != null) {
                        switch (cuenta) {
                            case Cliente cliente -> menuCliente(scanner, cliente);
                            case Emprendedor emprendedor -> menuEmprendedor(scanner, emprendedor);
                            default -> {
                            }
                        }
                    } else {
                        System.out.println("Error... Username o Password incorrectas");
                    }
                }
                case 3 -> {
                    salir = true;
                    System.out.println("Saliendo...");
                    return;
                }
                default -> {
                    System.out.println("Opción no válida.");
                    System.out.println("");
                    break;
                }
            }
        }
    }

    private void registrar(Scanner scanner) {
        System.out.println("     ");
        System.out.println("REGISTRARSE");
        System.out.println("");
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        System.out.print("Correo electrónico: ");
        String correoElectronico = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        registroUsuarios.registrarCliente(cedula, username, password, correoElectronico, edad);
        System.out.println(" ");
        System.out.println("Cliente registrado con éxito.");
        System.out.println("");
    }

    private Cuenta iniciarSesion(Scanner scanner) {
        System.out.println("");
        System.out.println("INICIO DE SESION");
        System.out.println("");
        System.out.print("Nombre de usuario: ");
        String username = scanner.nextLine();

        System.out.print("Contraseña: ");
        String password = scanner.nextLine();

        return registroUsuarios.iniciarSesion(username, password);
    }

    private void menuUsuario(Scanner scanner, Cuenta usuario) {
       switch (usuario) {
           case Cliente cliente -> menuCliente(scanner, cliente);
           case Emprendedor emprendedor -> menuEmprendedor(scanner, emprendedor);
           default -> {
           }
       }
    }

  private void menuCliente(Scanner scanner, Cliente cliente) {
    boolean continuar = true;

    while (continuar) {
        System.out.println("");
        System.out.println("QUE DESEAS HACER?");
        System.out.println("");
        System.out.println("1. Buscar productos");
        System.out.println("2. Buscar emprendimientos");
        System.out.println("3. Convertirse en emprendedor");
        System.out.println("4. Salir");
        System.out.println("Elige una opción:");

        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1 -> buscarProductos(scanner);
            case 2 -> buscarEmprendimientos(scanner);
            case 3 -> {
                convertirseEnEmprendedor(scanner, cliente);
                continuar = false;
            }
            case 4 -> continuar = false;
            default -> System.out.println("Opción no válida.");
        }
    }
}
    private void buscarProductos(Scanner scanner) {
        System.out.println("");
        System.out.println("Buscar por código o nombre? (c/n)");
        System.out.println("");
        String tipoBusqueda = scanner.nextLine();

        if(tipoBusqueda.equalsIgnoreCase("c")) {
            System.out.print("Ingrese el código del producto: ");
            String codigo = scanner.nextLine();

            Producto productoEncontrado = null;
            for (Emprendimiento emp : emprendimientos.values()) {
                productoEncontrado = emp.buscarProductoPorCodigo(codigo);
                if (productoEncontrado != null) {
                    break;
                }
            }

            if (productoEncontrado != null) {
                System.out.println("Producto encontrado: " + productoEncontrado);
                System.out.println("");
                System.out.println("¿Deseas dejar una reseña? (s/n)");
                if (scanner.nextLine().equalsIgnoreCase("s")) {
                    dejarReseña(scanner, productoEncontrado);
                }
            } else {
                System.out.println("");
                System.out.println("Producto no encontrado.");
                System.out.println("");
            }
        } else if(tipoBusqueda.equalsIgnoreCase("n")) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            ArrayList<Producto> productosEncontrados = new ArrayList<>();
            for (Emprendimiento emp : emprendimientos.values()) {
                productosEncontrados.addAll(emp.buscarProductoPorNombre(nombre));
            }

            if (!productosEncontrados.isEmpty()) {
                System.out.println("Productos encontrados:");
                for (Producto producto : productosEncontrados) {
                    System.out.println(producto);
                }

                System.out.println("¿Deseas dejar una reseña? (s/n)");
                if (scanner.nextLine().equalsIgnoreCase("s")) { 
                    System.out.println("");
                    System.out.println("¿Cuál es el código del producto que quieres calificar?");
                    String codigo = scanner.nextLine();
                    Producto producto = productosEncontrados.stream()
                        .filter(p -> p.getCodigo().equals(codigo))
                        .findFirst().orElse(null);

                    if (producto != null) {
                        dejarReseña(scanner, producto);
                        
                    } else {
                        System.out.println("Código no válido.");
                        System.out.println("");
                    }
                }
            } else {
                System.out.println("No se encontraron productos con ese nombre.");
                System.out.println("");    
            }
        } else {
            System.out.println("Tipo de búsqueda no válido.");
            System.out.println("");
        }
    }

    private void buscarEmprendimientos(Scanner scanner) {
        System.out.print("Ingrese el nombre del emprendimiento: ");
        String nombre = scanner.nextLine();

        Emprendimiento emprendimiento = emprendimientos.get(nombre);

        if (emprendimiento != null) {
            System.out.println("Emprendimiento encontrado: " + emprendimiento);

            System.out.println("¿Deseas dejar una reseña para este emprendimiento? (s/n)");
            if (scanner.nextLine().equalsIgnoreCase("s")) {
                System.out.print("Describe tu reseña: ");
                String descripcion = scanner.nextLine();
                
                System.out.println("");
                System.out.println("¿Qué calificación le darías?");
                System.out.println("1. Pesima");
                System.out.println("2. Mala");
                System.out.println("3. Puede mejorar");
                System.out.println("4. Buena");
                System.out.println("5. Excelente");
                int calificacion = scanner.nextInt();
                scanner.nextLine();

                Reseña reseña = new Reseña(descripcion, calificacion);
                registroReseña.agregarReseña(reseña);
                emprendimiento.agregarReseña(reseña);

                System.out.println("Reseña agregada con éxito.");
                System.out.println("");
            }
        } else {
            System.out.println("Emprendimiento no encontrado.");
            System.out.println("");
        }
    }

    private void dejarReseña(Scanner scanner, Producto producto) {
        System.out.print("Describe tu reseña: ");
        String descripcion = scanner.nextLine();
        
        System.out.println("");
        System.out.println("¿Qué calificación le darías? (1-5)");
        System.out.println("");
        System.out.println("1. Pesima");
        System.out.println("2. Mala");
        System.out.println("3. Puede mejorar");
        System.out.println("4. Buena");
        System.out.println("5. Excelente");
        int calificacion = scanner.nextInt();
        scanner.nextLine();

        Reseña reseña = new Reseña(descripcion, calificacion);
        registroReseña.agregarReseña(reseña);

        System.out.println("Reseña agregada con éxito.");
    }
    
     private void convertirseEnEmprendedor(Scanner scanner, Cliente cliente) {
        System.out.print("Nombre del emprendimiento: ");
        String nombreEmprendimiento = scanner.nextLine();

        System.out.print("NIT: ");
        String nit = scanner.nextLine();

        System.out.print("¿Tiene tienda física? (s/n): ");
        String TiendaFisica = scanner.nextLine();

        String direccion = null;
        if (TiendaFisica.equalsIgnoreCase("s")) {
            System.out.print("Dirección de la tienda: ");
            direccion = scanner.nextLine();
        }

        registroUsuarios.convertirEnEmprendedor(cliente.getUsername(), nombreEmprendimiento, nit, direccion);

        System.out.println("Te has convertido en emprendedor con éxito.");

    }

    private void menuEmprendedor(Scanner scanner, Emprendedor emprendedor) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("");
            System.out.println("QUE DESEA HACER?");
            System.out.println("");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Ver promedio de calificaciones");
            System.out.println("4. Salir");
            System.out.println("Elige una opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1 -> agregarProducto(scanner, emprendedor);
                case 2 -> eliminarProducto(scanner, emprendedor);
                case 3 -> verPromedioCalificaciones(emprendedor);
                case 4 -> continuar = false;
                default -> System.out.println("Opción no válida.");
            }
        }
    }
    


    private void agregarProducto(Scanner scanner, Emprendedor emprendedor) {
        System.out.println("¿Qué tipo de producto vas a agregar? (s/p)");
        String tipoProducto = scanner.nextLine();

        System.out.print("Código: ");
        String codigo = scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        Producto producto = null;
        if (tipoProducto.equalsIgnoreCase("s")) {
            producto = new Servicio(codigo, nombre, precio, descripcion);
        } else if(tipoProducto.equalsIgnoreCase("p")) {
            producto = new Producto(codigo, nombre, precio, descripcion);
        }

        if (producto != null) {
            Emprendimiento emprendimiento = emprendimientos.get(emprendedor.getUsername());
            if (emprendimiento == null) {
                emprendimiento = new Emprendimiento(emprendedor.getUsername());
                emprendimientos.put(emprendedor.getUsername(), emprendimiento);
            }

            emprendimiento.agregarProducto(producto);
            System.out.println("Producto agregado con éxito.");
        } else {
            System.out.println("Tipo de producto no válido.");
        }
    }

    private void eliminarProducto(Scanner scanner, Emprendedor emprendedor) {
        System.out.println("");
        System.out.print("Ingrese el código del producto a eliminar: ");
        String código = scanner.nextLine();

        Emprendimiento emprendimiento = emprendimientos.get(emprendedor.getUsername());

        if (emprendimiento != null) {
            emprendimiento.eliminarProducto(código);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("Emprendimiento no encontrado.");
        }
    }
       private void verProductos(Emprendedor emprendedor) {
        ArrayList<Producto> productos = emprendedor.getProductos();
        if (productos.isEmpty()) {
            System.out.println("No hay productos.");
        } else {
            productos.forEach(System.out::println);
        }
    }

    private void verPromedioCalificaciones(Emprendedor emprendedor) {
        System.out.println("Promedio de calificaciones: " + emprendedor.obtenerPromedioCalificaciones());
    }

}
 