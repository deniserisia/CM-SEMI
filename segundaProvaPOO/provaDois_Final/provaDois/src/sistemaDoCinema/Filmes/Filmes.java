package sistemaDoCinema.Filmes;

public class Filmes{
	
	private String tituloDoFilme;
	private String genero;
	private String faixaEtaria;
	
	public String mostrarDados() {
		return "\n\nT�tulo do Filme: " + tituloDoFilme + "\nG�nero: " + genero + "\nFaixa et�ria: " + faixaEtaria;
	}

	public String getTituloDoFilme() {
		return tituloDoFilme;
	}
	public void setTituloDoFilme(String tituloDoFilme) {
		this.tituloDoFilme = tituloDoFilme;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	
}
