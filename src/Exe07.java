import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de lata de 350ml");
        double lata350 =  0.35 * (sc.nextInt());

        System.out.println("Quantidade de garrafa de 600ml");
        double garrafa600 = 0.6 * (sc.nextInt());

        System.out.println("Quantidade de garrafa de 2 litros");
        double garrafa2L = 2 * (sc.nextInt());

        double litros = lata350 + garrafa2L + garrafa600;

        System.out.println("Litros: " + litros);

    sc.close();
}
}
