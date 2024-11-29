package model;

public class GerenteDesenvolvedor extends Funcionario {
    public GerenteDesenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Gerente e Desenvolvedor - ID: " + getId() + ", Nome: " + getNome() + ", Salário: " + getSalario());
    }
}
