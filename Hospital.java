import java.util.ArrayList;

public class Hospital {
    private ArrayList<Paciente> pacientes;

    public Hospital() {
        pacientes = new ArrayList<>();
    }

    public void incluirPaciente(int numero, double peso, double altura) {
        Paciente paciente = new Paciente(numero, peso, altura);
        pacientes.add(paciente);
    }

    public void alterarPaciente(int numero, double novoPeso, double novaAltura) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                paciente.setPeso(novoPeso);
                paciente.setAltura(novaAltura);
                System.out.println("Paciente " + numero + " atualizado!");
                return;
            }
        }
        System.out.println("Paciente não encontrado!");
    }

    public void excluirPaciente(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                pacientes.remove(paciente);
                System.out.println("Paciente " + numero + " excluído!");
                return;
            }
        }
        System.out.println("Paciente não encontrado!!");
    }

    public void consultarPaciente(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                paciente.listarPaciente();
                return;
            }
        }
        System.out.println("Paciente não encontrado!");
    }

    public void listarTodosPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            for (Paciente paciente : pacientes) {
                paciente.listarPaciente();
                System.out.println("    ");
            }
        }
    }
}
