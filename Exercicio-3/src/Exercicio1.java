import java.util.Scanner;

public class Exercicio1 {
    public static void exercicio(Scanner scanner) {
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com o preço do produto " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            sum += price;
        }
        System.out.println("Soma dos preços: " + sum);
    }
}
