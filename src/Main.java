

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Cliente cliente1 = new Cliente("João Silva");
        Conta conta1 = new ContaCorrente(cliente1);
        conta1.depositar(1000);
        banco.adicionarConta(conta1);

        Cliente cliente2 = new Cliente("Maria Souza");
        Conta conta2 = new ContaPoupanca(cliente2);
        conta2.depositar(2000);
        banco.adicionarConta(conta2);

        Emprestimo emprestimo1 = new EmprestimoPessoal(5000, 2, 24);
        banco.adicionarEmprestimo(emprestimo1);

        Emprestimo emprestimo2 = new EmprestimoImobiliario(100000, 5, 360);
        banco.adicionarEmprestimo(emprestimo2);

        banco.gerarRelatorioSaldos();
        banco.gerarRelatorioEmprestimos();
    }
}
