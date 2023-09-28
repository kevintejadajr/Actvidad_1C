import java.io.PrintStream;
import java.util.Scanner;

public class Ejer03 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {
        int hrastrabaj = 0;
        float porcereten = 0;
        int costohra = 0;
        float salbruto = 0;
        float salneto = 0;
        float operac1 = 0;
        float operac2 = 0;

        screen.println("Ingrese las horas semanales trabajadas");
        hrastrabaj = keyboard.nextInt();
        screen.println("Ingrese el costo de la hora");
        costohra = keyboard.nextInt();
        screen.println("Ingrese el porcentaje de retención en la fuente");
        porcereten = keyboard.nextFloat();
        salbruto = (hrastrabaj*costohra);
        operac1 = (porcereten/100);
        operac2 = (operac1*salbruto);
        salneto = (salbruto-operac2);
        screen.println("El salario bruto semanal es: "+salbruto);
        screen.println("El salario neto semanal es: "+salneto);
        screen.println("El valor de la retención en la fuente es de: "+operac2);

    }
}
