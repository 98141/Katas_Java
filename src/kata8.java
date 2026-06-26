import java.util.Scanner;

public class kata8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double VALOR_HORA = 12000;

        int totalHoras = 0;
        int empleadosMas40 = 0;
        int empleadosMenos20 = 0;

        String nombresMas40 = "";

        System.out.print("Ingresa el número de empleados: ");
        int numeroEmpleados = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numeroEmpleados; i++) {

            System.out.print("Empleado " + i + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Horas trabajadas: ");
            int horas = scanner.nextInt();
            scanner.nextLine();

            totalHoras += horas;

            if (horas > 40) {
                empleadosMas40++;

                if (nombresMas40.equals("")) {
                    nombresMas40 = nombre;
                } else {
                    nombresMas40 += ", " + nombre;
                }
            }

            if (horas < 20) {
                empleadosMenos20++;
            }
        }

        double promedioHoras = (double) totalHoras / numeroEmpleados;
        double sueldoTotal = totalHoras * VALOR_HORA;

        System.out.println("--- Reporte de Turnos ---");
        System.out.println("Total de horas: " + totalHoras);
        System.out.println("Promedio de horas: " + promedioHoras);

        if (empleadosMas40 > 0) {
            System.out.println(
                    "Empleados con más de 40 horas: " + empleadosMas40 +
                            " (" + nombresMas40 + ")"
            );
        } else {
            System.out.println("Empleados con más de 40 horas: 0");
        }

        System.out.println("Empleados con menos de 20 horas: " + empleadosMenos20);
        System.out.println("Sueldo total: $" + sueldoTotal);

        scanner.close();
    }

}
