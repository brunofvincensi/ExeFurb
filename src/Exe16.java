import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int valorTenis = 250;

        System.out.println("Insira o valor do dinheiro que voce vai pagar");

        int n = sc.nextInt();

        if(n < 250){
            throw new RuntimeException("Dinheiro insuficiente");
        }

        n -= 250;

        int cem = n / 100;

        n = n % 100;

        int dez = n / 10;

        int um = n % 10;

        int totalNotas = cem + dez + um;

        System.out.println("Numero minimo de notas: " + totalNotas);
        System.out.println("Notas de 100: " + cem);
        System.out.println("Notas de 10: " + dez);
        System.out.println("Notas de 1: " + um);

        sc.close();
    }
}
