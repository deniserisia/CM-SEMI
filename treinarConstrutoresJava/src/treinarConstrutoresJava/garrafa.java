package treinarConstrutoresJava;

public class garrafa {
	
	public int capacidade; // uma variavel global
	String tipoDoMaterial;
	
	public garrafa(String tipoDoMaterial) {
		this.tipoDoMaterial = tipoDoMaterial;
	}
	// tipo default
	public garrafa() {
	}
	// Escopo - SET: atribui um valor
	public garrafa(int capacidade) {
		this.capacidade = capacidade; // o uso do this � voltado pra variavel declarada globalmente
	}
	// INICIALIZAR AS VARIAVEIS AQUI
	public garrafa(String tipoDoMaterial, int capacidade) {
		this.tipoDoMaterial = tipoDoMaterial;
		this.capacidade = capacidade;
	}
	public void mostrarConteudo() {
		System.out.println("O tipo de material da garrafa �" + " " + tipoDoMaterial);
		System.out.println("A capacidade da garrafa �" + " " + capacidade);
	}
}
// this. � uma variavel global