package LstExrc;

import java.util.Scanner;

public class QstIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var opcao = "";
        var nome = "";

        while (!opcao.equalsIgnoreCase("fim")) {
            System.out.println("Informe-nos vosso nome por favor: ");
            nome = scanner.nextLine();
            System.out.println("Olá! " + nome);
            System.out.println("Vamos verificar a possibilidade de você obter um salário!");
            System.out.println("Digite a quantia de seu salário: ");
            double salary = Double.parseDouble(scanner.nextLine());

            if (salary < 500) {
                System.out.println("Você é elegível para o aumento!");
                double novoSalary = salary * 1.20;
                System.out.println("O seu novo salário é de: " + novoSalary);
            } else {
                System.out.println("Você não é elegível ara o aumento.");
            }

            System.out.println("Digite fim para encerrar o programa: ");
            opcao = scanner.nextLine();
        }
    }
}
