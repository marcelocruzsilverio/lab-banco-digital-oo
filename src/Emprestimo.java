


import java.time.LocalDate;

public abstract class Emprestimo {
    protected double valor;
    protected double taxaJuros;
    protected int prazoMeses;
    protected LocalDate dataContrato;

    public Emprestimo(double valor, double taxaJuros, int prazoMeses) {
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
        this.dataContrato = LocalDate.now();
    }

    public abstract double calcularParcela();

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public int getPrazoMeses() {
		return prazoMeses;
	}

	public void setPrazoMeses(int prazoMeses) {
		this.prazoMeses = prazoMeses;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

   
}
