import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dolares: ");
        double dolares = sc.nextDouble();

        System.out.println("Reais: " + dolares * 5.5);

        sc.close();
    }
}
