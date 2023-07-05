import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {

        int num, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Número A: ");
        num = scan.nextInt();

        System.out.println("Digite o Número B: ");
        num2 = scan.nextInt();

        System.out.println(num + " + " + num2 + " = " + (num + num2));

    }
}
