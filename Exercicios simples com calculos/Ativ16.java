import java.util.Scanner;

public class Ativ16 {
    public static void main(String[] args) {

        float valor, desconto;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valor = scan.nextFloat();
        System.out.println("Digite o desconto: ");
        desconto = scan.nextFloat();

        System.out.println("Com o desconto de " + desconto + "% o valor fica: R$" + (valor - (valor * desconto / 100)));

    }
}
