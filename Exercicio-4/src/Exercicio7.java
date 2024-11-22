import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        List<Integer> quadrados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            quadrados.add(numero * numero);
        }

        System.out.println("Quadrados dos números: " + quadrados);
        scanner.close();
    }
}
