package entidades;

public class Retangulo02 extends Draw {
private int base;
private int altura;
	public Retangulo02(int lados, String nome, int base, int altura) {
		super(lados, nome);
		this.base= base;
		this.altura= altura;
		
		
	}
	
	public void CalculaArea() {
		System.out.println("A área do " + getNome() +  " é " + (base *altura));
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
