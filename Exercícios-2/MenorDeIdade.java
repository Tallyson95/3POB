import java.util.Scanner;

public class MenorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("É menor");
        }

        scanner.close();
    }
}
