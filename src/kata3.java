import java.util.Scanner;

public class kata3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int subTotal = 0;
        int precioIngresado = 1;
        double descuento = 0;
        double IVA = 0;
        double total = 0;
        do {
            System.out.println("Ingrese el precio del producto (0 para terminar): ");
            precioIngresado = sc.nextInt();
            if (precioIngresado!=0 ){
                subTotal = subTotal + precioIngresado;
            }
        }while(precioIngresado!=0);
        IVA = (subTotal*0.19);
        total = subTotal + IVA;
        if(total>50000){
            descuento = total*0.10;
            total = total-descuento;
        }
        String mensaje = (descuento != 0 )? "Descuento del 10%: "+ descuento : ""; //operador ternario
        System.out.println("El total de la compra sin IVA es: "+ subTotal);
        System.out.println("El IVA sobre el total de su compra es: "+ IVA);
        System.out.println(mensaje);
        System.out.println("El total de su compra con el IVA es: "+ total);
    }
}
