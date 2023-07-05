import java.lang.Math;

public class Ativ3 {
    public static void main(String[] args) {
        
        double angulo = 60;

        System.out.println("Calcular a tangente de um ângulo em radianos: " + Math.toRadians(Math.atan(angulo)));
        System.out.println("Calcular o arco seno: " + Math.asin(Math.toRadians(angulo)));
        System.out.println("Calcular o arco cosseno: " + Math.toRadians(Math.acos(angulo)));
        System.out.println("Calcular o arco tangente: " + Math.toRadians(Math.atan(angulo)));
        System.out.println("Calcular o logaritmo natural: " + Math.log(angulo));
    }
}
