


import java.util.List;

public class RelatorioSaldo implements Relatorio {
    private List<Conta> contas;

    public RelatorioSaldo(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de Saldos:");
        for (Conta conta : contas) {
            System.out.printf("Conta %d - Saldo: %.2f%n", conta.getNumero(), conta.getSaldo());
        }
    }
}
