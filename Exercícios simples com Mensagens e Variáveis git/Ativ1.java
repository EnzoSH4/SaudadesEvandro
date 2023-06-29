import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {

        String city, name;
        Scanner scan = new Scanner(System.in);

        System.out.println("QUAL SEU NOME?: ");
        name = scan.next().toUpperCase();
        System.out.println("QUAL CIDADE VOCÊ MORA?: ");
        city = scan.next().toUpperCase();
        System.out.println("OLÁ " + name + ", VOCÊ MORA EM: " + city);
    }
}
