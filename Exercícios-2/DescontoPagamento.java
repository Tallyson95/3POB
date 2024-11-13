import java.util.Scanner;

public class DescontoPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade de produtos:");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço unitário do produto:");
        double precoUnitario = scanner.nextDouble();

        System.out.println("Digite a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito):");
        int formaPagamento = scanner.nextInt();

        double valorTotal = quantidade * precoUnitario;
        double desconto = 0;

        switch (formaPagamento) {
            case 1: 
                desconto = valorTotal * 0.10;
                break;
            case 2:
                desconto = valorTotal * 0.02;
                break;
            case 3:
                desconto = valorTotal * 0.05;
                break;
            case 4:
                desconto = valorTotal * 0.03;
                break;
        }

        double valorFinal = valorTotal - desconto;

        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        scanner.close();
    }
}
