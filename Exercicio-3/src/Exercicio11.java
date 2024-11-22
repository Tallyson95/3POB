import java.util.Scanner;

public class Exercicio11 {
    public static void exercicio(Scanner scanner) {
        System.out.print("Digite a massa inicial em gramas: ");
        double mass = scanner.nextDouble();
        int time = 0;
        while (mass >= 0.5) {
            mass /= 2;
            time += 50;
        }
        System.out.println("Massa final: " + mass + "g");
        System.out.println("Tempo necessário: " + time + " segundos");
    }
}
