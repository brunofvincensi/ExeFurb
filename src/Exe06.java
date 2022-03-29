import java.util.Scanner;

public class Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorPorQuilo = 25.0;
        double pesoPrato = 750.0;

        System.out.println("Peso da comida: ");
        double pesoComida = sc.nextDouble();

        System.out.println("R$" + (pesoComida + pesoPrato)/1000 * 25);

        sc.close();
    }
}
