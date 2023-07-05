import java.util.Scanner;

public class Ativ20 {
    public static void main(String[] args) {
        
        float lado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a medida em metros de um lado do quadrado: ");
        lado = scan.nextFloat();

        System.out.println("O quadrado tem uma area de: " + (lado * lado) + "m²");

    }
}
