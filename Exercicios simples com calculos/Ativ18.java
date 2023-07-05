import java.util.Scanner;

public class Ativ18 {
    public static void main(String[] args) {
        
        int idade, ano;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: "   );
        idade = scan.nextInt();
        System.out.println("Em que ano estemos?: ");
        ano = scan.nextInt();
        
        System.out.println("Você nasceu em: " + (ano - idade));

    }
}
