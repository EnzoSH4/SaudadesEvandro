import java.util.Scanner;

public class Ativ21 {
    public static void main(String[] args) {
        
        float peso, altura;

        Scanner scan = new Scanner (System.in);

        System.out.println("Quanto voce pesa?: ");
        peso = scan.nextFloat();
        System.out.println("Qual sua altura?: " );
        altura = scan.nextFloat();

        System.out.println("Seu IMC é: " + (peso / (altura * altura)));

    }
}
