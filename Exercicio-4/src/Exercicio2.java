import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> matriculas = new ArrayList<>();
        List<Double> salariosBrutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite a matrícula do empregado " + (i + 1) + ": ");
            matriculas.add(scanner.nextInt());
            System.out.print("Digite o salário bruto do empregado " + (i + 1) + ": ");
            salariosBrutos.add(scanner.nextDouble());
        }

        System.out.println("Dados dos empregados:");
        for (int i = 0; i < matriculas.size(); i++) {
            double desconto = salariosBrutos.get(i) * 0.11;
            double salarioLiquido = salariosBrutos.get(i) - desconto;
            System.out.println("Matrícula: " + matriculas.get(i) + ", Salário Bruto: " + salariosBrutos.get(i) + ", Desconto: " + desconto + ", Salário Líquido: " + salarioLiquido);
        }
        scanner.close();
    }
}
