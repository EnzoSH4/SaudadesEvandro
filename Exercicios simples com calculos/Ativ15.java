import java.util.Scanner;

public class Ativ15 {
    public static void main(String[] args) {

        float altura, peso;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua altura: ");
        altura = scan.nextFloat();
        System.out.println("Qual seu peso: "  );
        peso = scan.nextFloat();

        System.out.println("O seu IMC é: " + (peso / altura));

    }
}
