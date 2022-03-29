import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero de até 3 digitos");

        int n = sc.nextInt();

        int centenas = n / 100;

        n = n % 100;

        int dezenas = n / 10;

        int unidades = n % 10;

        System.out.printf("%x centena(s)  %x dezena(s) %x unidade(s)", centenas, dezenas, unidades);

        sc.close();
    }
}
