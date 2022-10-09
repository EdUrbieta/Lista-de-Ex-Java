package LstExrc;

import java.util.Scanner;

public class QstVI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alAprov = 0;
        int alRep = 0;
        int alEx = 0;
        double mediaClass = 0;

        for (int i = 1; i <= 6; i++) {

            System.out.println("Informe a primeira nota do " + i + "º aluno.");
            double nota1 = scanner.nextDouble();
            System.out.println("Informe a segunda nota do " + i + "º aluno.");
            double nota2 = scanner.nextDouble();
            var mediaAl = (nota1 + nota2) / 2;
            System.out.println("Média de aluno " + i + "º aluno: " + mediaAl);
            mediaClass = mediaAl + mediaClass;

            if (mediaAl > 7.0) {
                alAprov = alAprov + 1;
            } else if (mediaAl < 3.0) {
                alRep = alRep + 1;
            } else {
                alEx = alEx + 1;
            }

            System.out.println("O total de alunos aprovados são: " + alAprov);
            System.out.println("O total de alunos em exame são: " + alEx);
            System.out.println("O total de alunos reprovados são: " + alRep);
            System.out.println("A média da classe é de: " + mediaClass/i);
        }
    }
}
