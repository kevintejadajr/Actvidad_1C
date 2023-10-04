import java.io.PrintStream;
import java.util.Scanner;

public class Ejer05 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {

        screen.println("Ingrese la cantidad de dinero en Pesos Colombianos (COP): ");
        int cop = 0;
        cop = keyboard.nextInt();

        double usd = cop*0.00024;
        double eur = cop*0.00023;

        screen.println("La cantidad ingresada de COP en USD (Dolares) es: "+usd);
        screen.println("La cantidad ingresada de COP en EUR (Euros) es: "+eur);

    }
}
