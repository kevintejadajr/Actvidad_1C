import java.io.PrintStream;
import java.util.Scanner;

public class Ejer08 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {
        int ancho = 0;
        int alto = 0;

        screen.println("Ingresa las siguientes medidas del televisor en cm");
        screen.println("Ancho: ");
        ancho= keyboard.nextInt();
        int cuadrado1 = ancho*ancho;
        screen.println("Alto: ");
        alto = keyboard.nextInt();
        int cuadrado2 = alto*alto;
        double raiz2 = Math.sqrt(cuadrado1+cuadrado2);
        double pulgadas = raiz2*2.54;
        screen.println("El televisor mide "+pulgadas+" pulgadas");


    }
}
