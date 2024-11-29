package controller;

import model.Funcionario;
import model.Desenvolvedor;
import model.Gerente;
import model.Treinador;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private static final String ARQUIVO = "funcionarios.txt";

    public FuncionarioController() {
        carregarFuncionariosDoArquivo();
    }

    private void carregarFuncionariosDoArquivo() {
        File arquivo = new File(ARQUIVO);
        if (!arquivo.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(" - ");
                if (dados.length == 2) {
                    String nome = dados[0];
                    double salario = Double.parseDouble(dados[1]);

                    funcionarios.add(new Desenvolvedor(nome, salario));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void salvarFuncionariosNoArquivo() {
        File arquivo = new File(ARQUIVO);

        try (FileWriter writer = new FileWriter(arquivo, false)) {
            for (Funcionario funcionario : funcionarios) {
                writer.write(funcionario.getNome() + " - " + funcionario.getSalario() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarFuncionariosNoArquivo();
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getNome() + " - " + funcionario.getSalario());
            }
        }
    }

    public boolean removerFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarios.remove(funcionario);
                salvarFuncionariosNoArquivo();
                return true;
            }
        }
        return false;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
