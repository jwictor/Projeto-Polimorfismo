package entidades;

public class Circulo extends Draw{
   
	private double pi =3.14;
	private double raio;
	
	
	public Circulo(int lados, String nome, double pi, double raio) {
		super(lados, nome);
		
		this.pi = pi;
		this.raio = raio;
	}
	public void calcularArea() {
		System.out.println("A área do " + getNome() +  " é " + (pi * (raio*raio)));
	}


	public double getPi() {
		return pi;
	}


	public void setPi(double pi) {
		this.pi = pi;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	
	
}
