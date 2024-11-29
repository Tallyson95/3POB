package model;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Desenvolvedor - ID: " + getId() + ", Nome: " + getNome() + ", Salário: " + getSalario());
    }
}
