import java.util.Scanner;

public class Kata5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = sc.nextInt();

        System.out.print("Ingresa la hora (0-23): ");
        int hora = sc.nextInt();

        boolean abierta = false;

        switch (dia) {
            case 1: case 2: case 3: case 4: case 5:
                if (hora >= 7 && hora < 18) {
                    abierta = true;
                }
                break;

            case 6:
                if (hora >= 7 && hora < 14) {
                    abierta = true;
                }
                break;

            case 7:
                System.out.println("Cerrada (Domingos cerrado)");
                return;

            default:
                System.out.println("Día inválido");
        }

        if (dia != 7 && dia >= 1 && dia <= 6) {
            if (abierta) {
                System.out.println("La cafetería está abierta.");
            } else {
                if (dia == 6) {
                    System.out.println("Cerrada (Horario de sábado: 7:00 AM - 2:00 PM)");
                } else {
                    System.out.println("Cerrada (Horario: 7:00 AM - 6:00 PM)");
                }
            }
        }

        int opcion = 0;
        int total = 0;

        while (opcion != 6) {

            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Café ($4000)");
            System.out.println("2. Muffin ($3500)");
            System.out.println("3. Sandwich ($7500)");
            System.out.println("4. Jugo ($5000)");
            System.out.println("5. Té ($3000)");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    total += 4000;
                    System.out.println("Agregaste Café");
                    break;
                case 2:
                    total += 3500;
                    System.out.println("Agregaste Muffin");
                    break;
                case 3:
                    total += 7500;
                    System.out.println("Agregaste Sandwich");
                    break;
                case 4:
                    total += 5000;
                    System.out.println("Agregaste Jugo");
                    break;
                case 5:
                    total += 3000;
                    System.out.println("Agregaste Té");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        System.out.println("Total del pedido: $" + total);

        sc.close();
    }
}