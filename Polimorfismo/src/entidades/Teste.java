package entidades;

public abstract class Teste {
	
	//Declara��o de atributo
	private final String nome;

	//M�todo construtor
	public Teste(String nome) {
		this.nome = nome;
	}

	//Retorna o nome (atributo da classe)
	public String getNome() {
		return nome;
	}
	
	//Exemplo de m�todo abstrato
	public abstract double calcularArea();


}