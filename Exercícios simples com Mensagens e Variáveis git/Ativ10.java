import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero A: ");
        a = scan.nextInt();

        System.out.println("Digite o numero B: ");
        b = scan.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("******************************");
        System.out.println("Os valores foram invertidos: " );
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("******************************");

    }
}
