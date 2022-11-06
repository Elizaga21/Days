import java.util.Scanner;
public class Days_in_a_month {
    public static void main(String[] args) {
        int month, year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número de mes:");
        month = sc.nextInt();
        System.out.print("Escribe un año:");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        } if (month == 2)  {
            System.out.println("Febrero tiene 29 días");
        }
        else {

            switch (month){
                case 1: System.out.println("Enero tiene 31 días");
                    break;
                case 2: System.out.println("Febrero tiene 28 días");
                    break;
                case 3: System.out.println("Marzo tiene 31 días");
                    break;
                case 4: System.out.println("Abril tiene 30 días");
                    break;
                case 5: System.out.println("Mayo tiene 31 días");
                    break;
                case 6: System.out.println("Junio tiene 30 días");
                    break;
                case 7: System.out.println("Julio tiene 31 días");
                    break;
                case 8: System.out.println("Agosto tiene 31 días");
                    break;
                case 9: System.out.println("Septiembre tiene 30 días");
                    break;
                case 10: System.out.println("Octubre tiene 31 días");
                    break;
                case 11: System.out.println("Noviembre tiene 30 días");
                    break;
                case 12: System.out.println("Diciembre tiene 31 días");
                    break;
                default: System.out.println("Mes no válido");        }

            System.out.println("Programa Finalizado");

        }

    }
}

