import java.io.PrintStream;
import java.util.Scanner;

public class Ejer06 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {

        screen.println("Ingrese la cantidad de segundos: ");
        int seg = 0;
        seg = keyboard.nextInt();

        int min = seg/60;
        int hras = min/60;
        int dias = hras/24;

        screen.println("La cantidad de segundos ingresados en dias son: "+dias);
        screen.println("La cantidad de segundos ingresados en horas son: "+hras);
        screen.println("La cantidad de segundos ingresados en minutos son: "+min);
        screen.println("La cantidad de segundos ingresados son: "+seg);

    }
}
