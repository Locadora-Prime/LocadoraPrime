package locadora;

public class Media {

	    private String titulo;
	    private String genero;
	    private int anoLancamento;

	    public Media(String titulo, String genero, int anoLancamento) {
	        this.titulo = titulo;
	        this.genero = genero;
	        this.anoLancamento = anoLancamento;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public int getAnoLancamento() {
	        return anoLancamento;
	    }

	    public void setAnoLancamento(int anoLancamento) {
	        this.anoLancamento = anoLancamento;
	    }

	    @Override
	    public String toString() {
	        return titulo + " (" + anoLancamento + "), " + genero;
	    }
	}

