


public class EmprestimoImobiliario extends Emprestimo {

    public EmprestimoImobiliario(double valor, double taxaJuros, int prazoMeses) {
        super(valor, taxaJuros, prazoMeses);
    }

    @Override
    public double calcularParcela() {
        double taxaMensal = (taxaJuros / 100) / 12;
        return (valor * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -prazoMeses));
    }
}
