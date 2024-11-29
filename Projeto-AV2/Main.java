import view.FuncionarioView;
import model.Funcionario;
import model.Desenvolvedor;
import model.Gerente;
import model.Treinador;
import controller.FuncionarioController;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FuncionarioController controller = new FuncionarioController();
        FuncionarioView view = new FuncionarioView(controller);
        view.exibirMenu();

        salvarDadosNoArquivo(controller);
    }

    private static void salvarDadosNoArquivo(FuncionarioController controller) {
        File arquivo = new File("funcionarios.txt");

        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }

            FileWriter writer = new FileWriter(arquivo, false);

            for (Funcionario funcionario : controller.getFuncionarios()) {
                writer.write(funcionario.getNome() + " - " + funcionario.getSalario() + "\n");
            }

            writer.close();
            System.out.println("Dados gravados no arquivo com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
