import java.util.Scanner;

public class Exercicio8 {
    public static void exercicio(Scanner scanner) {
        String tallestName = "";
        double tallestHeight = 0, sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome: ");
            String name = scanner.next();
            System.out.print("Digite a altura: ");
            double height = scanner.nextDouble();
            sum += height;
            if (height > tallestHeight) {
                tallestHeight = height;
                tallestName = name;
            }
        }
        System.out.println("Altura média: " + (sum / 10));
        System.out.println("Mais alto: " + tallestName + " (" + tallestHeight + ")");
    }
}
