import java.util.Scanner;

public class Ativ9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome, rua, cidade, estado;
        int cpf, cep, num, phone;

        System.out.println("DIGITE SEU NOME: "               );
        nome = scan.nextLine().toUpperCase();

        System.out.println("DIGITE SEU CPF: "                );
        cpf = scan.nextInt();

        System.out.println("DIGITE SEU TELEFONE CELULAR: "   );
        phone = scan.nextInt();

        System.out.println("DIGITE SEU ESTADO: "             );
        estado = scan.next();

        System.out.println("DIGITE SUA CIDADE: "             );
        cidade = scan.next().toUpperCase();

        System.out.println("DIGITE SUA RUA: "             );
        rua = scan.next().toUpperCase();

        System.out.println("DIGITE O NÚMERO DA PROPRIEDADE: ");
        num = scan.nextInt();

        System.out.println("DIGITE CEP: "                    );
        cep = scan.nextInt();

        System.out.println("*************************");
        System.out.println("NOME: " + nome                                            );
        System.out.println("ENDEREÇO: RUA " + rua + " NÚMERO: " + num + " CEP: " + cep);
        System.out.println("CIDADE: " + cidade                                        );
        System.out.println("ESTADO: " + estado                                        );
        System.out.println("CPF: " + cpf                                              );
        System.out.println("TELEFONE: " + phone                                       );
        System.out.println("*************************");

    }
}

