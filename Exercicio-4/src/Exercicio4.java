import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            somaNotas += nota;
            scanner.nextLine();
        }

        double media = somaNotas / 10;
        System.out.println("Nota média da turma: " + media);
        System.out.println("Alunos com nota superior à média:");
        for (int i = 0; i < nomes.size(); i++) {
            if (notas.get(i) > media) {
                System.out.println("Nome: " + nomes.get(i) + ", Nota: " + notas.get(i));
            }
        }
        scanner.close();
    }
}
