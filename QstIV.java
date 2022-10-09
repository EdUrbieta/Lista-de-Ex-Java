package LstExrc;

import java.util.Scanner;

public class QstIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comprastes 2 refris bem de boas, agora quantos litros de gasolina você deseja reabastecer?");
        double gasosa =  Double.parseDouble(scanner.nextLine());
        var newGasosa = (gasosa * 2.50) + 6;
        System.out.println("Terá de pagar o equiavalente à: " + newGasosa + " Reais");
    }
}
