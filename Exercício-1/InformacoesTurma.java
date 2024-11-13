import java.util.Scanner;

public class InformacoesTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código da turma:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade de alunos do sexo masculino:");
        int qtdMasculino = scanner.nextInt();
        System.out.println("Digite a quantidade de alunos do sexo feminino:");
        int qtdFeminino = scanner.nextInt();
        System.out.println("Digite a quantidade de alunos aprovados:");
        int qtdAprovados = scanner.nextInt();

        int totalAlunos = qtdMasculino + qtdFeminino;
        int qtdReprovados = totalAlunos - qtdAprovados;

        double porcentagemMasculino = (qtdMasculino / (double) totalAlunos) * 100;
        double porcentagemFeminino = (qtdFeminino / (double) totalAlunos) * 100;
        double porcentagemReprovados = (qtdReprovados / (double) totalAlunos) * 100;

        System.out.printf("Total de alunos: %d\n", totalAlunos);
        System.out.printf("Porcentagem de alunos do sexo masculino: %.2f%%\n", porcentagemMasculino);
        System.out.printf("Porcentagem de alunos do sexo feminino: %.2f%%\n", porcentagemFeminino);
        System.out.printf("Porcentagem de alunos reprovados: %.2f%%\n", porcentagemReprovados);

        scanner.close();
    }
}
