import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {
        
        double raio;

        Scanner scan = new Scanner(System.in);



        System.out.println("Atividade A");
        System.out.println();

        System.out.println("Digite o raio: ");
        raio = scan.nextDouble();
        raio = Math.pow(raio,2);

        System.out.println("A area do circulo é: " + (3.14 * raio));



        System.out.println();
        System.out.println("Atividade B");
        System.out.println();

        System.out.println("Digite raio: ");
        raio = scan.nextDouble();

        System.out.println("A circunferencia é de " + (2 * 3.14) * raio);

        

        System.out.println();
        System.out.println("atividade C");
        System.out.println();

        double cateto_ad, cateto_op,soma_catetos;

        System.out.println("Escreva o cateto adjacente: ");
        cateto_ad = scan.nextInt();
        System.out.println("Escreva o cateto oposto: ");
        cateto_op = scan.nextInt();

        soma_catetos = Math.pow(cateto_ad,2) +  Math.pow(cateto_op,2);

        System.out.println("A hipotenusa é: " + Math.sqrt(soma_catetos));

        

        System.out.println();
        System.out.println("Atividade D");
        System.out.println();

        double lado,lado2;

        System.out.println("Digite o valor do lado A: ");
        lado = scan.nextDouble();
        System.out.println("Digite o valor do lado B:" );
        lado2 = scan.nextDouble();

        System.out.println("A area do retangulo é " + 2*(lado + lado2));
   
        

        System.out.println();
        System.out.println("Atividade E");
        System.out.println();

        float base, altura;

        System.out.println("Digite a altura do triangulo: ");
        altura = scan.nextFloat();
        System.out.println("Digite a base do triangulo: ");
        base = scan.nextFloat();

        System.out.println("A area do triangulo é: " +  (base * altura) / 2);
    }
}
