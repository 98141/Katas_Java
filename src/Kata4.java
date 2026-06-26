import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaIngresado = 0;
        int horaIngresada = 0;
        System.out.println("Ingrse el día de la senana (1-7): ");
        diaIngresado = sc.nextInt();
        System.out.println("Ingrese la hora (0-23): ");
        horaIngresada = sc.nextInt();
        int diaIdentificado = switch(diaIngresado){
            case 1, 2, 3, 4, 5 -> 1;
            case 6 -> 2;
            case 7 -> 3;
            default -> 4;
        };

        if(diaIdentificado ==1 &&(horaIngresada>=6 && horaIngresada<20)){
            System.out.println("La cafeteria está abierta");
        } else if (diaIdentificado == 2 && (horaIngresada>=7 && horaIngresada<14)) {
            System.out.println("La cafeteria está abierta");
        }else if(diaIdentificado == 4 || horaIngresada<0 || horaIngresada>23) {
            System.out.println("Ingrese los datos dentro del rango establecido día (1-7) - Hora (0-23)");
        }else {
            System.out.println("Cerrado");
        }
        System.out.println("Horario de Lunes a viernes: 6:00 AM - 8:00 PM");
        System.out.println("Horario de sabado: 7:00 AM - 2:00 PM");

        sc.close();
    }
}
