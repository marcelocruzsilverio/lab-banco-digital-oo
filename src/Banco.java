

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	private List<Emprestimo> emprestimos;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
		this.emprestimos = new ArrayList<>();
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public void adicionarEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
	}

	public void gerarRelatorioSaldos() {
		Relatorio relatorio = new RelatorioSaldo(contas);
		relatorio.gerarRelatorio();
	}

	public void gerarRelatorioEmprestimos() {
		Relatorio relatorio = new RelatorioEmprestimos(emprestimos);
		relatorio.gerarRelatorio();
	}

	// Getters e Setters
}

