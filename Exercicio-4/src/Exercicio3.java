import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> codigos = new ArrayList<>();
        List<String> nomes = new ArrayList<>();
        List<String> telefones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o código da pessoa " + (i + 1) + ": ");
            codigos.add(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes.add(scanner.nextLine());
            System.out.print("Digite o telefone da pessoa " + (i + 1) + ": ");
            telefones.add(scanner.nextLine());
        }

        String consulta;
        do {
            System.out.print("Digite o código para consulta ou 'sair' para encerrar: ");
            consulta = scanner.nextLine();
            if (!consulta.equalsIgnoreCase("sair")) {
                int codigo = Integer.parseInt(consulta);
                int index = codigos.indexOf(codigo);
                if (index != -1) {
                    System.out.println("Nome: " + nomes.get(index) + ", Telefone: " + telefones.get(index));
                } else {
                    System.out.println("Código não encontrado.");
                }
            }
        } while (!consulta.equalsIgnoreCase("sair"));
        scanner.close();
    }
}
