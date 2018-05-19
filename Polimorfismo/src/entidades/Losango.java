package entidades;

public class Losango extends Draw {
private int D;
private int d2;

	public Losango(int lados, String nome, int D, int d2) {
		super(lados, nome);
		this.D=D;
		this.d2=d2;
		
	}
public void CalcularArea() {
	System.out.println("A área do " + getNome() +  " é " + (D*d2/2));
}
	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}

	public int getD2() {
		return d2;
	}

	public void setD2(int d2) {
		this.d2 = d2;
	}

}
