


public class EmprestimoPessoal extends Emprestimo {

    public EmprestimoPessoal(double valor, double taxaJuros, int prazoMeses) {
        super(valor, taxaJuros, prazoMeses);
    }

    @Override
    public double calcularParcela() {
        double taxaMensal = taxaJuros / 100;
        return (valor * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -prazoMeses));
    }
}

