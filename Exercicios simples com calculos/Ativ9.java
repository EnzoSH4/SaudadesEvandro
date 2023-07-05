import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args) {

        float litro, valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos litros de gasolina você deseja?: ");
        litro = scan.nextFloat();
        System.out.println("Qual o valor do litro?: ");
        valor = scan.nextFloat();

        System.out.println("Vai lhe custar: R$" + (litro * valor));

    }
}
