public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Rua xxx, 12345", "4002-8922", "000.000.000-00", "João Silva");
        PessoaJuridica pj = new PessoaJuridica("Avenida B, 456", "8765-4321", "11.111.111/1111-11", "Empresa XYZ");

        Funcionario funcionario = new Funcionario("001", "987.654.321-00", "Carlos Oliveira", 3000.0f);
        Gerente gerente = new Gerente("002", "321.654.987-00", "Ana Souza", 5000.0f, 1000.0f);
        
        Vendas vendas = new Vendas(500.0f);

        System.out.println("Pessoa Física: " + pf.getNome() + " - CPF: " + pf.getCpf());
        System.out.println("Pessoa Jurídica: " + pj.getRazaoSocial() + " - CNPJ: " + pj.getCnpj());
        System.out.println("Funcionario: " + funcionario.getNome() + " - Salario: " + funcionario.getSalario());
        System.out.println("Gerente: " + gerente.getNome() + " - Salario: " + gerente.getSalario() + " - Gratificação: " + gerente.getGratificacao());
        System.out.println("Participação nos Lucros: " + vendas.getParticipacaoLucros());
    }
}
