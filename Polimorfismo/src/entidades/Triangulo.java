package entidades;

public class Triangulo extends Draw{
	
	private int base;
	private int altura;
	
	
public Triangulo(int lados, String nome, int base, int altura) {
		super(lados, nome);
		this.setBase(base);
		this.setAltura(altura);		
	}


public void CalcularArea() {
	System.out.println("A área do " + getNome() +  " é " + (base * altura/2));
}


public int getBase() {
	return base;
}


public void setBase(int base) {
	this.base = base;
}


public int getAltura() {
	return altura;
}


public void setAltura(int altura) {
	this.altura = altura;
}

}
