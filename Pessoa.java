package locadora;

public class Pessoa {

	private String nome;
	private String telefone;
	private String dataDoInicioDoAluguel;
	private String cpf;
	private boolean possuiItemAlugado;
	private Item produtoAlugado;
    
	public Pessoa(String nome, String telefone, String dataDoInicioDoAluguel, String cpf,Item produtoAlugado) {
		super(); 
		this.nome = nome;
		this.telefone = telefone;
		this.dataDoInicioDoAluguel = dataDoInicioDoAluguel;
		this.cpf = cpf;
		this.produtoAlugado = produtoAlugado;
	}

	public Pessoa() {
		super();
	}

	public Item getProdutoAlugado() {
		return produtoAlugado;
	}

	public void setProdutoAlugado(Item produtoAlugado) {
		this.produtoAlugado = produtoAlugado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getdataDoInicioDoAluguel() {
		return dataDoInicioDoAluguel;
	}

	public void setdataDoInicioDoAluguel(String dataDoInicioDoAluguel) {
		this.dataDoInicioDoAluguel = dataDoInicioDoAluguel;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
