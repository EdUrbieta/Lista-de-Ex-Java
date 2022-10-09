package LstExrc;

import java.util.Scanner;

public class QstVIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var opcao = "";
        var nome = "";
        var gen = "";
        var peso = 0.0;
        var idade = 0;
        var altura = 0.0;
        var quantM = 0;
        var quantH = 0;

        while (!opcao.equalsIgnoreCase("fim")) {
            System.out.println("Informe-nos vosso nome por favor: ");
            nome = scanner.nextLine();

            System.out.println("Olá, " + nome + ", qual é o vosso gênero? — M: Mulher | H - Homem");
            gen = scanner.nextLine()
                    if (gen.equalsIgnoreCase("M")) {
                        quantM = quantM + 1;
                    } else if (gen.equalsIgnoreCase("H")){
                        quantH = quantH + 1;
                    } else {
                        System.out.println("Input inválido.");
                    }

            System.out.println("Digite fim para encerrar o programa: ");
            opcao = scanner.nextLine();

        }
    }
}
// Não consegui fazer