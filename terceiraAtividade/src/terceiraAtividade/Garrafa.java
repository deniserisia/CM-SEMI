package terceiraAtividade;

public class Garrafa {


    public int capacidade;
    public String tipoMaterial;

    public Garrafa(){

    }

    public Garrafa(String tipoMaterial){
        this.tipoMaterial = tipoMaterial;
    }

    public Garrafa(int capacidade){
        this.capacidade = capacidade;
    }

    public Garrafa(int capacidade, String tipoMaterial){
        this.capacidade = capacidade;
        this.tipoMaterial = tipoMaterial;
    }

    public void mostrarConteudo(){
        System.out.printf("A capacidade em litros da garrafa �: %d",capacidade);
        System.out.printf("O tipo de Material �: %s\n\n", tipoMaterial);
    }
	
}
