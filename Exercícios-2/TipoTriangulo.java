import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado:");
        int x = scanner.nextInt();

        System.out.println("Digite o valor do segundo lado:");
        int y = scanner.nextInt();

        System.out.println("Digite o valor do terceiro lado:");
        int z = scanner.nextInt();

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("Triângulo equilátero");
            } else if (x == y || y == z || x == z) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }

        scanner.close();
    }
}
