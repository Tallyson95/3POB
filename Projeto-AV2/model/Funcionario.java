package model;

public abstract class Funcionario {
    private static int contador = 1;
    private int id;
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.id = obterNovoId();
        this.nome = nome;
        this.salario = salario;
    }

    public static int obterNovoId() {
        return contador++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract void exibirDetalhes();
}
