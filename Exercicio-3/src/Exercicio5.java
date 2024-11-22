import java.util.Scanner;

public class Exercicio5 {
    public static void exercicio(Scanner scanner) {
        int count = 0, menor = 0, medio = 0, maior = 0;
        System.out.print("Digite a altura ou -1 para encerrar: ");
        double height;
        while ((height = scanner.nextDouble()) != -1) {
            count++;
            if (height < 1.60) menor++;
            else if (height <= 1.80) medio++;
            else maior++;
            System.out.print("Digite a altura ou -1 para encerrar: ");
        }
        System.out.println("Total pessoas: " + count);
        System.out.println("Menores que 1,60m: " + menor);
        System.out.println("Entre 1,60m e 1,80m: " + medio);
        System.out.println("Maiores que 1,80m: " + maior);
    }
}
