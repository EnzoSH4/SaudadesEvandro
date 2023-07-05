import java.util.Scanner;

public class Ativ17 {
    public static void main(String[] args) {

        float preco;
        int parcela;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        preco = scan.nextFloat();

        System.out.println("Digite a quantidade de parcelas desejadas: ");
        parcela = scan.nextInt();

        System.out.println("Serão " + parcela + " parcelas de: R$" + (preco / parcela));


    }
}
