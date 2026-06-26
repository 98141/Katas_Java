import java.util.Scanner;

public class kata7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalCompra = 0;
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {

            System.out.print("Ingresa el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingresa la cantidad: ");
            int cantidad = scanner.nextInt();

            double subtotal = precio * cantidad;
            double porcentajeDescuento;

            if (cantidad >= 1 && cantidad <= 2) {
                porcentajeDescuento = 0;
            } else if (cantidad >= 3 && cantidad <= 5) {
                porcentajeDescuento = 5;
            } else if (cantidad >= 6 && cantidad <= 10) {
                porcentajeDescuento = 10;
            } else {
                porcentajeDescuento = 15;
            }

            double descuento = subtotal * porcentajeDescuento / 100;
            double subtotalConDescuento = subtotal - descuento;
            double iva = subtotalConDescuento * 0.19;
            double total = subtotalConDescuento + iva;

            totalCompra += total;

            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento (" + porcentajeDescuento + "%): $" + descuento);
            System.out.println("IVA (19%): $" + iva);
            System.out.println("Total: $" + total);

            System.out.print("¿Agregar otro producto? (S/N): ");
            continuar = scanner.next();
        }

        System.out.println("Total de la compra: $" + totalCompra);

        scanner.close();
    }
}
