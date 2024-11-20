import java.io.*;
import java.util.*;

public class PacienteService {
    private static final String ARQUIVO = "pacientes.txt";

    public static void incluirPaciente(Paciente paciente) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            writer.write(paciente.getNumero() + "," + paciente.getPeso() + "," + paciente.getAltura());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao incluir paciente: " + e.getMessage());
        }
    }

    public static void listarPacientes() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                int numero = Integer.parseInt(dados[0]);
                double peso = Double.parseDouble(dados[1]);
                double altura = Double.parseDouble(dados[2]);
                Paciente paciente = new Paciente(numero, peso, altura);
                paciente.listarPaciente();
                System.out.println("------------------------");
            }
        } catch (IOException e) {
            System.out.println("Erro ao listar pacientes: " + e.getMessage());
        }
    }

    public static void alterarPaciente(int numero, double novoPeso, double novaAltura) {
        List<Paciente> pacientes = lerPacientes();
        boolean encontrado = false;

        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                paciente.setPeso(novoPeso);
                paciente.setAltura(novaAltura);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            sobrescreverArquivo(pacientes);
            System.out.println("Paciente alterado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public static void excluirPaciente(int numero) {
        List<Paciente> pacientes = lerPacientes();
        pacientes.removeIf(paciente -> paciente.getNumero() == numero);
        sobrescreverArquivo(pacientes);
        System.out.println("Paciente excluído com sucesso.");
    }

    private static List<Paciente> lerPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                int numero = Integer.parseInt(dados[0]);
                double peso = Double.parseDouble(dados[1]);
                double altura = Double.parseDouble(dados[2]);
                pacientes.add(new Paciente(numero, peso, altura));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler pacientes: " + e.getMessage());
        }
        return pacientes;
    }

    private static void sobrescreverArquivo(List<Paciente> pacientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Paciente paciente : pacientes) {
                writer.write(paciente.getNumero() + "," + paciente.getPeso() + "," + paciente.getAltura());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao sobrescrever arquivo: " + e.getMessage());
        }
    }
}
