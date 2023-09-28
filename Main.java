import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        int res = 0;

        screen.println("Ingrese el primer número");
        num1 = keyboard.nextInt();
        screen.println("Ingrese el segundo número");
        num2 = keyboard.nextInt();
        res=(num1*num2);
        screen.println("El resultado de la multiplicación es"+res);

    }
}