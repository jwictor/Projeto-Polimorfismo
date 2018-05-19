package entidades;

public class Square extends Draw {
	
	private int base;
	private int altura;

	public Square(int lados, String nome, int base, int altura) {
		super(lados, nome);
		// TODO Auto-generated constructor stub
		this.base 	= base;
		this.altura = altura;
	}
	
	public void calcularArea() {
		System.out.println("A área do " + getNome() +  " é " + (base * altura));
	}
	
	

}
