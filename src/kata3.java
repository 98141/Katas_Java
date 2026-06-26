import java.util.Scanner;

public class kata3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subTotal = 0;
        int precioIngresado = 1;
        double IVA = 0;
        double total = 0;
        do {
            System.out.println("Ingrese el precio de cada producto: ");
            precioIngresado = sc.nextInt();
            if (precioIngresado!=0 ){
                subTotal = subTotal + precioIngresado;
            }
        }while(precioIngresado!=0);
        IVA = (subTotal*0.19);
        total = subTotal + IVA;
        if(total>50000){
            double descuento = total*0.10;
            total = total-descuento;
            System.out.println("Descuento del 10%: "+ descuento);
        }
        System.out.println("El total de la compra sin IVA es: "+ subTotal);
        System.out.println("El IVA sobre el total de su compra es: "+ IVA);
        System.out.println("El total de su compra con el IVA es: "+ total);
    }
}
