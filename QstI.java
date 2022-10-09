package LstExrc;

import java.util.Scanner;

public class QstI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo à central Trooper. Informe-nos sua quantidade de créditos: ");
        double creds = Double.parseDouble(scanner.nextLine());
        System.out.println("Informe agora a quantia do aumento recebido: ");
        double aumento = Double.parseDouble(scanner.nextLine());

        var calc1 = (aumento / 100) * creds;
        var calc2 = calc1 + creds;

        System.out.println("Você possui, com o aumento, uma quantidade de créditos equivalentes à: " + calc2);
    }
}
