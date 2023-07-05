import java.util.Scanner;

public class Ativ24 {
    public static void main(String[] args) {

        int num,i;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = ler.nextInt();
        System.out.println("********************");
        System.out.println("Tabuada de: " + num);

        for(i = 0;i <= 10; i++){
             System.out.println(num + " x " + i + " = " +  + (num * i));
           
        }
        System.out.println("********************");
    }
}