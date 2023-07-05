import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {

        int num, num2;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um valor inteiro: "   );
        num = scan.nextInt();

        System.out.println("Digite outro valor inteiro: ");
        num2 = scan.nextInt();

        System.out.println(num + " x " + num2 + " = " + (num * num2));

    }
}
