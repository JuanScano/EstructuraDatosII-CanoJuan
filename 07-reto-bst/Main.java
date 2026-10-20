package 07-reto-bst;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolBST inventario = new ArbolBST();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Precarga inicial de productos de prueba
        inventario.insertar(new Producto(50, "Laptop Empresarial", 12));
        inventario.insertar(new Producto(30, "Teclado Mecanico", 45));
        inventario.insertar(new Producto(70, "Monitor LED 24'", 8));
        inventario.insertar(new Producto(20, "Mouse Inalambrico", 30));

        do {
            System.out.println(" === SISTEMA DE INVENTARIO JERARQUICO (BST) ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Buscar producto por codigo");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Listar inventario (Inorden)");
            System.out.println("5. Mostrar producto con menor y mayor codigo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese codigo (entero): ");
                        int cod = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        System.out.print("Ingrese nombre del producto: ");
                        String nom = scanner.nextLine();
                        System.out.print("Ingrese cantidad en stock: ");
                        int cant = scanner.nextInt();

                        if (inventario.buscar(cod) != null) {
                            System.out.println("¡Error! Ya existe un producto registrado con el código " + cod);
                        } else {
                            inventario.insertar(new Producto(cod, nom, cant));
                            System.out.println("¡Producto registrado con exito!");
                        }
                        break;

                    case 2:
                        System.out.print("Ingrese codigo a buscar: ");
                        int busc = scanner.nextInt();
                        Producto encontrado = inventario.buscar(busc);
                        if (encontrado != null) {
                            System.out.println("¡Encontrado! " + encontrado);
                            System.out.println("Comparaciones realizadas: " + inventario.getComparacionesUltimaBusqueda());
                        } else {
                            System.out.println("Producto con codigo " + busc + " no encontrado.");
                            System.out.println("Comparaciones realizadas: " + inventario.getComparacionesUltimaBusqueda());
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese codigo del producto a eliminar: ");
                        int elim = scanner.nextInt();
                        if (inventario.buscar(elim) == null) {
                            System.out.println("El codigo no existe en el inventario.");
                        } else {
                            inventario.eliminar(elim);
                            System.out.println("Producto eliminado correctamente.");
                        }
                        break;

                    case 4:
                        System.out.println("--- INVENTARIO ORDENADO POR CÓDIGO ---");
                        inventario.inorden();
                        break;

                    case 5:
                        Producto min = inventario.obtenerMinimo();
                        Producto max = inventario.obtenerMaximo();
                        if (min != null && max != null) {
                            System.out.println("Menor codigo -> " + min);
                            System.out.println("Mayor codigo -> " + max);
                        } else {
                            System.out.println("El inventario está vacio.");
                        }
                        break;

                    case 6:
                        System.out.println("Saliendo del sistema de inventario. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } else {
                System.out.println("Por favor, ingrese un numero valido.");
                scanner.next();
            }
        } while (opcion != 6);

        scanner.close();
    }
}
