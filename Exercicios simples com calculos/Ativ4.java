import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {

        float celsius;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius: ");
        celsius = scan.nextFloat();

        System.out.println(celsius + "° Celsius equivalem a: " + ((celsius * 1.8) + 32) + "° Fahreinheit");

    }
}
