import java.util.Scanner;

public class Exercicio7 {
    public static void exercicio(Scanner scanner) {
        int max = Integer.MIN_VALUE, num;
        System.out.print("Digite um número ou -1 para encerrar: ");
        while ((num = scanner.nextInt()) != -1) {
            if (num > max) max = num;
            System.out.print("Digite um número ou -1 para encerrar: ");
        }
        System.out.println("Maior número: " + max);
    }
}
