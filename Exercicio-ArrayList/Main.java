import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Incluir paciente");
            System.out.println("2. Alterar paciente");
            System.out.println("3. Excluir paciente");
            System.out.println("4. Consultar paciente");
            System.out.println("5. Listar todos os pacientes");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número do paciente: ");
                    int numero = scanner.nextInt();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    hospital.incluirPaciente(numero, peso, altura);
                    break;
                case 2:
                    System.out.print("Número do paciente a ser alterado: ");
                    numero = scanner.nextInt();
                    System.out.print("Novo peso: ");
                    peso = scanner.nextDouble();
                    System.out.print("Nova altura: ");
                    altura = scanner.nextDouble();
                    hospital.alterarPaciente(numero, peso, altura);
                    break;
                case 3:
                    System.out.print("Número do paciente a ser excluído: ");
                    numero = scanner.nextInt();
                    hospital.excluirPaciente(numero);
                    break;
                case 4:
                    System.out.print("Número do paciente a ser consultado: ");
                    numero = scanner.nextInt();
                    hospital.consultarPaciente(numero);
                    break;
                case 5:
                    hospital.listarTodosPacientes();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
