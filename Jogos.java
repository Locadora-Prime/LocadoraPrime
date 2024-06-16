package locadora;

public class Jogos extends Item {
 private String plataforma;

	

	public Jogos(String titulo, String categoria, int ano, int classificacao, String estudio) {
	super(titulo, categoria, ano, classificacao, estudio);
}

	public Jogos(String titulo, String categoria, int ano, int classificacao, String estudio, String plataforma) {
	super(titulo, categoria, ano, classificacao, estudio);
	this.plataforma = plataforma;
}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}
