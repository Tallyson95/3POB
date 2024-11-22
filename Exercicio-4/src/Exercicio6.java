import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int negativos = 0, positivos = 0, nulos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            if (numero < 0) negativos++;
            else if (numero > 0) positivos++;
            else nulos++;
        }

        System.out.println("Números negativos: " + negativos);
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números nulos: " + nulos);
        scanner.close();
    }
}
