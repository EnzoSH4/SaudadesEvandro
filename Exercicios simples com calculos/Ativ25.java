import java.util.Scanner;

public class Ativ25 {
    public static void main(String[] args) {

        double valor;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor em dolar: ");
        valor = ler.nextDouble();

        System.out.println("o valor convertido em real é: " + valor * 4.81);
    }
}