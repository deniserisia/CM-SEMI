package terceiraAtividade;

public class classeQualquer {

	public static void main(String[] args) throws Exception {

        Garrafa garrafa01 = new Garrafa(1,"pl�stica");
        Garrafa garrafa02 = new Garrafa(3,"alum�nio");
        Garrafa garrafa03 = new Garrafa(2,"vidro");
        Garrafa garrafa04 = new Garrafa(5,"inoxid�vel");

        garrafa01.mostrarConteudo();
        garrafa02.mostrarConteudo();
        garrafa03.mostrarConteudo();
        garrafa04.mostrarConteudo();

    }
	
}
