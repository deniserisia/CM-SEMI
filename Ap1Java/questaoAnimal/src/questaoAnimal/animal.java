package questaoAnimal;

public class animal {
	
	String especie;
	Double peso;
	
	public animal(String especie, Double peso) {	
	}
	public animal() {
		System.out.println("Objeto do tipo Animal foi instanciado!");
	}
}
// O construtor nada mais � do que um m�todo respons�vel por alocar espa�o na mem�ria,
// para a manipula��o do objeto e pode conter tamb�m a chamada para outros m�todos,
// possibilitando assim a cria��o de objetos mais comlexos na orienta��o a objetos.
// Al�m disso, � v�lido lembrar que o construtor � respons�vel por construir um objeto com
// determinados valores.