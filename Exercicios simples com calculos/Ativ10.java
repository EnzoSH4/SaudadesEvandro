import java.util.Scanner;

public class Ativ10 {
    public static void main(String[] args) {

        int dias;
        float valor;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos dia você deseja alugar um carro?: ");
        dias = scan.nextInt();
        System.out.println("Qual o valor da diária?: "                 );
        valor = scan.nextFloat();

        System.out.println(dias + " dias de aluguel, vão lhe custar: " + (valor * dias));

    }
}
