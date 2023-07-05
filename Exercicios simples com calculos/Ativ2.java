import java.util.Scanner;

public class Ativ2 {
    public static void main(String[] args) {

        Double raio, area;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o raio do seu circúlo: ");
        raio = scan.nextDouble();

        area = ((raio * raio) * 3.14);

        System.out.println("A area do ciruclo é de: " + area );




    }
}
