package LstExrc;

import java.util.Scanner;

public class QstII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        var i = 0;

        while (i < 10) {
            System.out.println("Por favor digite seu número:");
            int n = leitor.nextInt();
            if (n % 2 == 0) {
                System.out.println("Número é par");
            } else {
                System.out.println("Número é impar");
            }
            i++;
        }
    }
}
