import java.util.Scanner;

public class Ativ13 {
    public static void main(String[] args) {

        float valor;
        int qntd;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        valor = scan.nextFloat();
        System.out.println("Digite a quantia comprada do(e) produto(s): ");
        qntd = scan.nextInt();

        System.out.println(qntd + " produto(s) lhe custara(ão): " + (qntd * valor));

    }
}
