import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<Double> alturas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas.add(scanner.nextDouble());
            scanner.nextLine(); 
        }

        System.out.println("Pessoas com altura maior que 1,70 metros:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println("Nome: " + nomes.get(i) + " - Altura: " + alturas.get(i));
            }
        }
        scanner.close();
    }
}
