import java.util.Scanner;

public class Exe05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de frangos: ");
        int nFrangos = sc.nextInt();

        System.out.println("R$" + nFrangos * 11.0);

        sc.close();
    }
}
