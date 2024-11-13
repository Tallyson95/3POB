import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        double fahrenheit = scanner.nextDouble();

        double celsius = 5.0 / 9.0 * (fahrenheit - 32);

        System.out.printf("Temperatura em Celsius: %.2f\n", celsius);

        scanner.close();
    }
}
