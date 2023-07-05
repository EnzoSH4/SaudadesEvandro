import java.util.Scanner;

public class Ativ12 {
    public static void main(String[] args) {

        float valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valor = scan.nextFloat();

        System.out.println("Com o acréscimo de 15% o valor fica: R$" + ((valor * 15 / 100) + valor));

    }
}
