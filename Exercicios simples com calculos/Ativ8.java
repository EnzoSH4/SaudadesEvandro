import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {

        float valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valor = scan.nextInt();

        System.out.println("O valor do produto é: R$" + valor);
        System.out.println("O valor do produto com desconto de 10% é: R$" + (valor - (valor * 10 / 100)));

    }
}
