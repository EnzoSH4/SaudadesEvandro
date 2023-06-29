import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {

        int idade;
        Scanner scan = new Scanner(System.in);

        System.out.println("QUAL SUA IDADE?: ");
        idade = scan.nextInt();
        System.out.println("VOCÊ TEM " + idade + " ANOS DE IDADE!");
    }
}
