import java.util.Scanner;

public class Exe04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();

        double n2 = sc.nextDouble();

        double n3 = sc.nextDouble();

        double media = (n1 * 0.5) + (n2 * 0.3) + (n3 * 0.2);

        System.out.println("Media: " + media);
        sc.close();
    }
}
