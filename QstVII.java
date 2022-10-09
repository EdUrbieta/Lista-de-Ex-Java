package LstExrc;

import java.util.Scanner;

public class QstVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var opcao = "";
        var nome = "";
        var dias = 0;
        var arrecad = 0;
        var precoCheckout = 0;

        while (!opcao.equalsIgnoreCase("fim")) {
            System.out.println("Informe-nos vosso nome por favor: ");
            nome = scanner.nextLine();
            System.out.println("Olá! " + nome);
            System.out.println("Informe-nos quantos dias permaneceu aqui: ");
            dias = scanner.nextInt();

            if (dias < 10) {
                precoCheckout = 55 * dias;
            } else {
                precoCheckout = 48 * dias;
            }

            arrecad = arrecad + precoCheckout;

            System.out.println("Olá " + nome + ", o valor da sua conta é de: " + precoCheckout + "Reais");
            System.out.println("O total arrecadado até o momento: " + arrecad + "Reais");
            System.out.println("Digite fim para encerrar o programa: ");
            opcao = scanner.nextLine();
        }
    }
}
