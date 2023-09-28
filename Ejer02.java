import java.io.PrintStream;
import java.util.Scanner;

public class Ejer02 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {
        long num = 0;
        long res = 0;

        screen.println("Ingrese su número telefónico");
        num = keyboard.nextLong();
        res=(num/10000000);
        screen.println("El prefijo de la linea es: "+res);

    }
}
