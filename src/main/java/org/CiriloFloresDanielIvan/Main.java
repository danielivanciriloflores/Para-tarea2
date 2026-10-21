package org.CiriloFloresDanielIvan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int contadorClientes = 0;

        while (opcion != 2) {
            System.out.println("================================");
            System.out.println("       CAFETERÍA ESCOLAR");
            System.out.println("================================");
            System.out.println("1. Registrar compra");
            System.out.println("2. Salir");
            System.out.println("================================");
            System.out.println("Seleccione una opción:");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("================================");
                    System.out.println("       REGISTRAR COMPRA");
                    System.out.println("================================");

                    System.out.println("Nombre del cliente:");
                    String nombreCliente = sc.nextLine();

                    System.out.println("¿Cuántos productos comprará?:");
                    int cantidadProductos = sc.nextInt();

                    double subtotal = 0;

                    for (int i = 1; i <= cantidadProductos; i++) {
                        System.out.println("Producto " + i);

                        System.out.println("Precio:");
                        double precio = sc.nextDouble();

                        System.out.println("Cantidad:");
                        int cantidad = sc.nextInt();

                        double importe = precio * cantidad;
                        System.out.println("Importe: $" + importe);

                        subtotal = subtotal + importe;
                    }
                    double descuento = 0;
                    if (subtotal < 100) {
                        descuento = 0;
                    } else if (subtotal >= 100 && subtotal < 300) {
                        descuento = subtotal * 0.05;
                    } else {
                        descuento = subtotal * 0.10;
                    }

                    double total = subtotal - descuento;
                    contadorClientes++;
                    System.out.println("================================");
                    System.out.println("       RESUMEN DE COMPRA");
                    System.out.println("================================");
                    System.out.println("Cliente: " + nombreCliente);
                    System.out.println("Subtotal: $" + subtotal);
                    System.out.println("Descuento: $" + descuento);
                    System.out.println("Total: $" + total);
                    System.out.println("================================");
                    break;

                case 2:
                    System.out.println("Saliendo del sistema...");
                    System.out.println("Total de compras registradas en la sesión: " + contadorClientes);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor intente de nuevo.");
                    break;
            }
        }

        sc.close();
    }
}
