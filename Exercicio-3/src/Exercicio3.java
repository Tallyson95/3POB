import java.util.Scanner;

public class Exercicio3 {
    public static void exercicio(Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Entre com a idade da pessoa " + (i + 1) + ": ");
            int age = scanner.nextInt();
            sum += age;
        }
        System.out.println("Media de idades: " + (sum / 10.0));
    }
}
