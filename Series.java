package locadora;

public class Series extends Item {
	private int numeroDaTemporada;
	private int numeroDeEpisodeos;

	public Series() {
		super();

	}

	public Series(String titulo, String categoria, int ano, int classificacao, String estudio, int numeroDaTemporada,
			int numeroDeEpisodeos) {
		super(titulo, categoria, ano, classificacao, estudio);
		this.numeroDaTemporada = numeroDaTemporada;
		this.numeroDeEpisodeos = numeroDeEpisodeos;

	}

	public int getNumeroDaTemporada() {
		return numeroDaTemporada;
	}

	public void setNumeroDaTemporada(int numeroDaTemporada) {
		this.numeroDaTemporada = numeroDaTemporada;
	}

	public int getNumeroDeEpisodeos() {
		return numeroDeEpisodeos;
	}

	public void setNumeroDeEpisodeos(int numeroDeEpisodeos) {
		this.numeroDeEpisodeos = numeroDeEpisodeos;
	}

}
