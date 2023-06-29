import java.util.Scanner;

public class Exercicios_Simples_Com_Mensagens {
    public static void main(String[] args) {
        //Vars n func
        Scanner scan = new Scanner(System.in);
        String Nome;

        System.out.printf("Qual seu nome: ");
        Nome = scan.next();
        System.out.println("Seu nome é: " + Nome);
    }
}