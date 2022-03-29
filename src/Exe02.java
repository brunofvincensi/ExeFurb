import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o preco");
        double preco = sc.nextDouble();

        double desconto = preco * 0.12;

        System.out.println("O valor do desconto é de R$ " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + desconto);
    }
}
