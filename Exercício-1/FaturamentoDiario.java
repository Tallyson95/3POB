import java.util.Scanner;

public class FaturamentoDiario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de games vendidos:");
        int totalGames = scanner.nextInt();
        System.out.println("Digite o preço de cada game:");
        double precoGame = scanner.nextDouble();

        System.out.println("Digite o total de calculadoras vendidas:");
        int totalCalculadoras = scanner.nextInt();
        System.out.println("Digite o preço de cada calculadora:");
        double precoCalculadora = scanner.nextDouble();

        System.out.println("Digite o total de canetas vendidas:");
        int totalCanetas = scanner.nextInt();
        System.out.println("Digite o preço de cada caneta:");
        double precoCaneta = scanner.nextDouble();

        double faturamentoGames = totalGames * precoGame;
        double faturamentoCalculadoras = totalCalculadoras * precoCalculadora;
        double faturamentoCanetas = totalCanetas * precoCaneta;
        double faturamentoTotal = faturamentoGames + faturamentoCalculadoras + faturamentoCanetas;

        System.out.printf("Faturamento com games: R$ %.2f\n", faturamentoGames);
        System.out.printf("Faturamento com calculadoras: R$ %.2f\n", faturamentoCalculadoras);
        System.out.printf("Faturamento com canetas: R$ %.2f\n", faturamentoCanetas);
        System.out.printf("Faturamento total: R$ %.2f\n", faturamentoTotal);

        scanner.close();
    }
}
