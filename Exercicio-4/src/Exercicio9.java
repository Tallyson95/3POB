import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        List<Integer> listaB = new ArrayList<>();
        List<Integer> listaC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número para a lista A, posição " + (i + 1) + ": ");
            listaA.add(scanner.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número para a lista B, posição " + (i + 1) + ": ");
            listaB.add(scanner.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            listaC.add(listaA.get(i) + listaB.get(i));
        }

        System.out.println("Lista C (soma de A e B): " + listaC);
        scanner.close();
    }
}
