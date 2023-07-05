import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {

        Double base, altura;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base do triangulo: "  );
        base = scan.nextDouble();

        System.out.println("Digite a altura do triangulo: ");
        altura = scan.nextDouble();

        System.out.println("A area do triangulo é de: " + ((base * altura) / 2));

    }
}
