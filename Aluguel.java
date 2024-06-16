package locadora;

public class Aluguel {
	Pessoa cliente;
	Item midia;

	public Aluguel(Pessoa cliente, Item midia) {
		super();
		this.cliente = cliente;
		this.midia = midia;

	}

	public Aluguel() {
		super();
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public Item getMidia() {
		return midia;
	}

	public void setMidia(Item midia) {
		this.midia = midia;
	}

}
