import java.util.Scanner;

public class kata1 {
    public static void main(String[] args) {

        System.out.println("Kata 1: Calculadora de propinas");

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Ingrese el valor de la compra: ");
        double Cuenta = scanner.nextDouble();

        System.out.println("Ingrese el valor de la propina: ");
        int propina = scanner.nextInt();

        double totalPropina = (propina * Cuenta) / 100;
        System.out.println("Total propina: " + totalPropina);
        double totalCuenta = Cuenta + totalPropina;
        System.out.println("Total a pagar: " + totalCuenta) ;

        if (propina > 30){

            System.out.println("¡Propina generosa!");
        } else if (propina < 5) {

            System.out.println("¡Propina muy baja!");
        }
        scanner.close();
    }
}
