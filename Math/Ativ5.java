import java.util.Scanner;
import java.lang.Math;

public class Ativ5 {
    public static void main(String[] args) {

        double oposto,hipotenusa;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do cateto oposto: ");
        oposto = scan.nextDouble();
        System.out.println("digite o valor da hipotenusa: "   );
        hipotenusa = scan.nextDouble();

        System.out.println("O valor do cateto adjacente é: " + Math.sqrt(Math.pow(hipotenusa,2 ) - Math.pow(oposto, 2)));

    }
}
