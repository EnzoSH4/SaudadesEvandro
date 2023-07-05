import java.util.Scanner;

public class Ativ19{
    public static void main(String[] args) {
        
        int mes, idade;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos anos voce tem?: ");
        idade = scan.nextInt();
        System.out.println("voce tem " + idade + " anos e quantos meses de idade?: ");
        mes = scan.nextInt();

        System.out.println("Voce viveu: " + (mes * 31 + idade * 365));

    }
}