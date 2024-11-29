package model;

public class Treinador extends Funcionario {
    public Treinador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Treinador - ID: " + getId() + ", Nome: " + getNome() + ", Salário: " + getSalario());
    }
}
