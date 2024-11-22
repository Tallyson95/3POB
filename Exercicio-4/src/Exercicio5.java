import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        Collections.sort(numeros);
        System.out.println("Ordem crescente: " + numeros);

        Collections.reverse(numeros);
        System.out.println("Ordem decrescente: " + numeros);
        scanner.close();
    }
}
