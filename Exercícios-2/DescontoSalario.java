import java.util.Scanner;

public class DescontoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do empregado:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo (M para masculino e F para feminino):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o salário bruto:");
        double salarioBruto = scanner.nextDouble();

        double desconto;
        if (sexo == 'M' || sexo == 'm') {
            desconto = salarioBruto * 0.05;
        } else {
            desconto = salarioBruto * 0.03;
        }

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
