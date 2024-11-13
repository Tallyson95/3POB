import java.util.Scanner;

public class DescontoSalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Digite o nome do empregado:");
        String nome = scanner.nextLine();  // Consome a nova linha

        System.out.println("Digite o salário bruto do empregado:");
        double salarioBruto = scanner.nextDouble();

        double desconto;
        if (salarioBruto < salarioMinimo) {
            desconto = salarioBruto * 0.02;
        } else if (salarioBruto == salarioMinimo) {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.08;
        }

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
