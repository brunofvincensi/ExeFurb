import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Preco litro:");
        double preco = sc.nextDouble();

        System.out.println("Valor do pagameto: ");
        double valorPagamento = sc.nextDouble();

        System.out.println("Voce pode comprar " + (int) valorPagamento / preco + " litros");

        sc.close();
    }
}
