import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        System.out.println("Comprimento: ");
        double comprimento = sc.nextDouble();

        double area = altura * comprimento;

        int azulejos = (int) (area * 9);

        System.out.println("Valor gasto: " + azulejos * 12.5);
        sc.close();
    }
}
