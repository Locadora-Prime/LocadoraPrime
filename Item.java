package locadora;

public class Item  {

	private String titulo;
	private String categoria;
	private int ano;
	private int classificacao;
    private String estudio;
	 

	public Item(String titulo, String categoria, int ano, int classificacao,String estudio) {
		super();
		this.titulo = titulo;
		this.categoria = categoria;
		this.ano = ano;
		this.classificacao = classificacao;
		this.estudio= estudio;
	}

	public String getEstudio() {
		return estudio;
	}

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public Item() {
		super();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

}
