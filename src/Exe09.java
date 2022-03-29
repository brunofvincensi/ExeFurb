import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Raio: ");
        double raio = sc.nextDouble();

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println("Volume: " + volume);

        sc.close();
    }
}
