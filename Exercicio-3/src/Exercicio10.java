import java.util.Scanner;

public class Exercicio10 {
    public static void exercicio(Scanner scanner) {
        int count = 0, even = 0, odd = 0, num;
        System.out.print("Digite um número ou -1 para encerrar: ");
        while ((num = scanner.nextInt()) != -1) {
            count++;
            if (num % 2 == 0) even++;
            else odd++;
            System.out.print("Digite um número ou -1 para encerrar: ");
        }
        System.out.println("Total números: " + count);
        System.out.println("Pares: " + even);
        System.out.println("Ímpares: " + odd);
    }
}
