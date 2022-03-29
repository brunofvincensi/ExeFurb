import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1º cateto");
        double cateto1 = sc.nextDouble();


        System.out.println("2º cateto");
        double cateto2 = sc.nextDouble();

        double hipotenusa = Math.sqrt( Math.pow(cateto1, 2) +  Math.pow(cateto2, 2));

        System.out.println("Hipotenusa: " + hipotenusa);

        sc.close();
    }
}
