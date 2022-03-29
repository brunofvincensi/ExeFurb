import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = sc.next();

        System.out.println("Numero de horas: ");
        int numHoras = sc.nextInt();

        System.out.println("numDependentes: ");
        int numDependenstes = sc.nextInt();

        double salarioBruto = (numHoras * 10) + (numDependenstes * 60);

        double salarioLiquido = salarioBruto - (salarioBruto * 0.13);

        System.out.printf("Nome: %s, salario bruto: %.2f, salario liquido %.2f", nome, salarioBruto, salarioLiquido);
        sc.close();
    }
}
