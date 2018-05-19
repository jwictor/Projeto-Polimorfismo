package entidades;

public class Trapezio extends Draw{
private int B;
private int b2;
private int altura;
	public Trapezio(int lados, String nome, int B, int b2, int altura) {
		super(lados, nome);
		this.B=B;
		this.b2=b2;
		this.altura=altura;
		
	}
	
	public void CalcularArea() {
		System.out.println("A área do " + getNome() +  " é " + (B+b2*altura/2));
	}
	
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getB2() {
		return b2;
	}
	public void setB2(int b2) {
		this.b2 = b2;
	}

}
