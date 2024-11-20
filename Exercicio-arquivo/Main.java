import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Incluir paciente");
            System.out.println("2. Listar pacientes");
            System.out.println("3. Alterar paciente");
            System.out.println("4. Excluir paciente");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Número do paciente: ");
                    int numero = scanner.nextInt();
                    System.out.print("Peso do paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura do paciente: ");
                    double altura = scanner.nextDouble();
                    Paciente paciente = new Paciente(numero, peso, altura);
                    PacienteService.incluirPaciente(paciente);
                    break;
                case 2:
                    PacienteService.listarPacientes();
                    break;
                case 3:
                    System.out.print("Número do paciente a ser alterado: ");
                    int numeroAlterar = scanner.nextInt();
                    System.out.print("Novo peso: ");
                    double novoPeso = scanner.nextDouble();
                    System.out.print("Nova altura: ");
                    double novaAltura = scanner.nextDouble();
                    PacienteService.alterarPaciente(numeroAlterar, novoPeso, novaAltura);
                    break;
                case 4:
                    System.out.print("Número do paciente a ser excluído: ");
                    int numeroExcluir = scanner.nextInt();
                    PacienteService.excluirPaciente(numeroExcluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);
        
        scanner.close();
    }
}
