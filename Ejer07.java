import java.io.PrintStream;
import java.util.Scanner;

public class Ejer07 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {

        int largo = 0;
        int ancho = 0;
        int alto = 0;

        screen.println("Ingresa las medidas del acuario en cm");
        screen.println("Largo: ");
        largo = keyboard.nextInt();
        screen.println("Ancho: ");
        ancho = keyboard.nextInt();
        screen.println("Alto: ");
        alto = keyboard.nextInt();
        int calculo = (largo*ancho*alto)/1000;
        screen.println("El acuario necesitala los siguientes litros de agua: "+calculo);
    }
}
