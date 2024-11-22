import java.util.Scanner;

public class Exercicio6 {
    public static void exercicio(Scanner scanner) {
        int total = 0, menor18 = 0;
        System.out.print("Digite a idade ou -1 para encerrar: ");
        int idade;
        while ((idade = scanner.nextInt()) != -1) {
            total++;
            if (idade < 18) menor18++;
            System.out.print("Digite a idade ou -1 para encerrar: ");
        }
        System.out.println("Total pessoas: " + total);
        System.out.println("Porcentagem menores de 18: " + (menor18 * 100.0 / total) + "%");
        System.out.println("Porcentagem 18 ou mais: " + ((total - menor18) * 100.0 / total) + "%");
    }
}
