//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Ativ6 {

    public static void main(String[] args) {

        int dias, segundos, horas, minutos;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dias(s): "    );
        dias = scan.nextInt();
        System.out.println("Digite hora(s):"     );
        horas = scan.nextInt();
        System.out.println("Digite minuto(s): "  );
        minutos = scan.nextInt();
        System.out.println("Digite Segundo(s): " );
        segundos = scan.nextInt();



        System.out.println("Total de Segundos: " + ((dias * 86400) + (horas * 3600) + (minutos * 60) + segundos)
        + " segundos");

    }
}
