import java.util.Scanner;

public class Exercicio4 {
    public static void exercicio(Scanner scanner) {
        int masculino = 0, feminino = 0;
        String input;
        System.out.print("Digite o sexo (M/F) ou 'sair' para encerrar: ");
        while (!(input = scanner.next()).equalsIgnoreCase("sair")) {
            if (input.equalsIgnoreCase("M")) masculino++;
            else if (input.equalsIgnoreCase("F")) feminino++;
            System.out.print("Digite o sexo (M/F) ou 'sair' para encerrar: ");
        }
        System.out.println("Total de pessoas: " + (masculino + feminino));
        System.out.println("Total masculino: " + masculino);
        System.out.println("Total feminino: " + feminino);
    }
}
