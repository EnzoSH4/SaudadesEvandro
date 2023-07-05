import java.util.Scanner;

public class Ativ5 {
    public static void main(String[] args) {

        float horas, valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas em um dia: "       );
        horas = scan.nextFloat();

        System.out.println("Digite o valor que cada hora trabalhada vale: ");
        valor = scan.nextFloat();

        System.out.println("O salario por um mês de trabalho é de: R$" + ( horas * valor ) * 31);

    }
}
