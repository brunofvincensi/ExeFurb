import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura em ºC");
        double c = sc.nextDouble();

        double f = ((9/5) * c) + 32;

        System.out.println(f + "Fº");

        sc.close();
    }
}
