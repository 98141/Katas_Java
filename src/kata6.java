import java.util.Scanner;

public class kata6 {
    public static void main(String[] args) {

        System.out.println("Kata 6: Número de Clientes por Hora");
        Scanner scanner = new Scanner(System.in);

        int totalClientes = 0;
        int contadorHoras = 0;
        int horaConMasClientes = 0;
        int maxClientes = 0;

        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        int hora = scanner.nextInt();

        while (hora != -1) {

            System.out.print("Ingresa el número de clientes en esa hora: ");
            int clientes = scanner.nextInt();

            totalClientes += clientes;
            contadorHoras++;

            if (clientes > maxClientes) {
                maxClientes = clientes;
                horaConMasClientes = hora;
            }

            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = scanner.nextInt();
        }

        System.out.println("--- Reporte de Clientes ---");
        System.out.println("Total de clientes: " + totalClientes);

        if (contadorHoras > 0) {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.printf("Promedio por hora: %.2f%n", promedio);
            System.out.println(
                    "Hora con más clientes: " + horaConMasClientes +
                            " (" + maxClientes + " clientes)"
            );
        } else {
            System.out.println("No se ingresaron horas válidas.");
        }

        scanner.close();

    }
}
