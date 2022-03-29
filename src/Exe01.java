import java.util.Scanner;

public class Exe01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o comprimento");
        float comprimento = sc.nextFloat();

        System.out.println("Insira a largura");
        float largura = sc.nextFloat();

        System.out.println(comprimento * largura);

        sc.close();
    }

}
