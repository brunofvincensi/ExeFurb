import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Distancia percorrida: ");
        double distancia = sc.nextDouble();

        System.out.println("Tempo gasto: ");
        double tempo = sc.nextDouble();

        double velocidadeMedia = distancia / tempo;

        double combustivel = distancia / 12;

        System.out.println("Velocidade média: " + velocidadeMedia + "km/h");
        System.out.println("Quantidade de combustivel: " + combustivel);

        sc.close();
    }
}
