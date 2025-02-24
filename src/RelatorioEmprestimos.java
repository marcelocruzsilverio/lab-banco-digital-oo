

import java.util.List;

public class RelatorioEmprestimos implements Relatorio {
    private List<Emprestimo> emprestimos;

    public RelatorioEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de Empréstimos:");
        for (Emprestimo emprestimo : emprestimos) {
            System.out.printf("Valor: %.2f - Parcela: %.2f - Prazo: %d meses%n",
                    emprestimo.getValor(), emprestimo.calcularParcela(), emprestimo.getPrazoMeses());
        }
    }
}

