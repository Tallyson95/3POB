import java.util.Scanner;

public class SalarioEmpregados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a matrícula do primeiro empregado:");
        int matricula1 = scanner.nextInt();
        System.out.println("Digite o salário do primeiro empregado:");
        double salario1 = scanner.nextDouble();

        System.out.println("Digite a matrícula do segundo empregado:");
        int matricula2 = scanner.nextInt();
        System.out.println("Digite o salário do segundo empregado:");
        double salario2 = scanner.nextDouble();

        double desconto1 = salario1 * 0.05;
        double salarioFinal1 = salario1 - desconto1;

        double acrescimo2 = salario2 * 0.09;
        double salarioFinal2 = salario2 + acrescimo2;

        System.out.printf("Desconto do primeiro empregado: R$ %.2f\n", desconto1);
        System.out.printf("Acréscimo do segundo empregado: R$ %.2f\n", acrescimo2);
        System.out.printf("Salário final do primeiro empregado: R$ %.2f\n", salarioFinal1);
        System.out.printf("Salário final do segundo empregado: R$ %.2f\n", salarioFinal2);

        scanner.close();
    }
}
