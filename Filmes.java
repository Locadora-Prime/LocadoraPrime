package locadora;

public class Filmes extends Item {
 private double duracao;
	public Filmes() {
		super();
		
	}

	public Filmes(String titulo, String categoria, int ano, int classificacao,double duracao,String estudio) {
		super(titulo, categoria, ano, classificacao,estudio);
	    this.duracao = duracao;
	    
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
       
}
