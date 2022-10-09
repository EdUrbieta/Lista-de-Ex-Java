package LstExrc;

import java.util.Scanner;

public class QstV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, caro proletário. Vejamos se você pode ter o mínimo em forma de prestrações.");
        System.out.println("Aviso, as prestações não podem exceder 30% do seu salário bruto!");
        System.out.println("Informe aqui vosso salário: ");
        double salario = scanner.nextDouble();
        System.out.println("Ótimo, agora informe o valor das prestações que deseja pagar.");
        double prestacao = scanner.nextDouble();

        if (prestacao <= salario * (30.0/100.0) ) {
            System.out.println("Você pode de bom grado obter esta linha de crédito.");
        } else {
            System.out.println("Você não é elegível à este programa de crédito.");
        }
    }
}
