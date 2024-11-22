import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE, ocorrencias = 0;

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numero > maior) {
                maior = numero;
                ocorrencias = 1;
            } else if (numero == maior) {
                ocorrencias++;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Quantidade de ocorrências do maior número: " + ocorrencias);
        System.out.print("Posições: ");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == maior) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
