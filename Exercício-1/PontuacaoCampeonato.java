import java.util.Scanner;

public class PontuacaoCampeonato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da equipe:");
        String nomeEquipe = scanner.nextLine();
        System.out.println("Digite a quantidade de vitórias:");
        int vitorias = scanner.nextInt();
        System.out.println("Digite a quantidade de empates:");
        int empates = scanner.nextInt();
        System.out.println("Digite a quantidade de derrotas:");
        int derrotas = scanner.nextInt();

        int pontosGanhos = (vitorias * 3) + empates;
        int pontosPerdidos = derrotas * 3;

        System.out.printf("Equipe: %s\n", nomeEquipe);
        System.out.printf("Pontos ganhos: %d\n", pontosGanhos);
        System.out.printf("Pontos perdidos: %d\n", pontosPerdidos);

        scanner.close();
    }
}
