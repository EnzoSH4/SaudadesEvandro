import java.util.Scanner;

public class Ativ14 {
    public static void main(String[] args) {

        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        System.out.println("O cubo de " + num + " é: " + ((num * num) * num));

    }
}
