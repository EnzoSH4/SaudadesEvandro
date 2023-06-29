import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args) {

        String nome, cidade, bairro;
        int idade;

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE SEU NOME: ");
        nome = scan.nextLine();

        System.out.println("DIGITE SUA IDADE: ");
        idade = scan.nextInt();

        System.out.println("DIGITE A CIDADE A QUAL VOCÊ MORA: ");
        cidade = scan.next();

        System.out.println("DIGITE O BAIRRO O QUAL VOCÊ MORA: ");
        bairro = scan.next();

        System.out.println("********************");
        System.out.println("NOME:   " + nome  );
        System.out.println("IDADE:  " + idade );
        System.out.println("CIDADE: " + cidade);
        System.out.println("BAIRRO: " + bairro);
        System.out.println("********************");

    }
}
