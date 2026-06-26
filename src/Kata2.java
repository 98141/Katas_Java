import java.util.Scanner;

public class Kata2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el total de la cuenta: ");
        double totalCuenta = sc.nextDouble();

        System.out.print("Ingresa el porcentaje de propina: ");
        double porcentaje = sc.nextDouble();

        double propina = totalCuenta * porcentaje / 100;
        double totalPagar = totalCuenta + propina;

        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" + totalPagar);

        if (porcentaje > 30) {
            System.out.println("¡Propina generosa!");
        } else if (porcentaje < 5) {
            System.out.println("Propina muy baja");
        }

        sc.nextLine();

        System.out.print("Ingresa el nombre de la bebida: ");
        String bebida = sc.nextLine();

        System.out.print("Ingresa la temperatura: ");
        double temperatura = sc.nextDouble();

        String clasificacion;

        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura >= 30 && temperatura <= 60) {
            clasificacion = "Templada";
        } else {
            clasificacion = "Fría";
        }

        System.out.println(bebida + ": " + clasificacion);

        sc.close();
    }
}