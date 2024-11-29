package model;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Gerente - ID: " + getId() + ", Nome: " + getNome() + ", Salário: " + getSalario());
    }
}
