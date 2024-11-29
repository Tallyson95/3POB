package view;

import controller.FuncionarioController;

import java.util.Scanner;

public class FuncionarioView {
    private FuncionarioController controller;
    private Scanner scanner = new Scanner(System.in);

    public FuncionarioView(FuncionarioController controller) {
        this.controller = controller;
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Remover Funcionário");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> removerFuncionario();
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }

    private void cadastrarFuncionario() {
        System.out.print("Digite o tipo de funcionário (Desenvolvedor, Gerente, Treinador): ");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case "desenvolvedor" -> controller.adicionarFuncionario(new model.Desenvolvedor(nome, salario));
            case "gerente" -> controller.adicionarFuncionario(new model.Gerente(nome, salario));
            case "treinador" -> controller.adicionarFuncionario(new model.Treinador(nome, salario));
            default -> System.out.println("Tipo de funcionário inválido.");
        }
    }

    private void listarFuncionarios() {
        controller.listarFuncionarios();
    }

    private void removerFuncionario() {
        System.out.print("Digite o nome do funcionário a ser removido: ");
        String nome = scanner.nextLine();
        if (controller.removerFuncionario(nome)) {
            System.out.println("Funcionário removido com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
