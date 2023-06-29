import java.util.Scanner;

public class Ativ8 {
    public static void main(String[] args) {

        int num;
        Double doublenum;

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO INTEIRO: ");
        num = scan.nextInt();

        System.out.println("DIGITE UM NÚMERO REAL: "   );
        doublenum = scan.nextDouble();

        System.out.println("NUMERO REAL DIGITADO: " + doublenum );
        System.out.println("NÚMERO INTEIRO DIGITADO: " + num    );

    }
}
