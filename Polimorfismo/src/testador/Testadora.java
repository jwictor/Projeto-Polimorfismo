package testador;

import entidades.Draw;
import entidades.*;

public class Testadora {

	public static void main(String[] args) {
		
		Square quadrado = new Square(4, "quadrado", 5, 5);
		quadrado.calcularArea();
		
		Draw dw = quadrado;
		System.out.println("O nome desta forma é " + dw.getNome());
		System.out.println("------------------------------------------");
		
		Circulo c = new Circulo(2, "Circulo", 20, 5);
		c.calcularArea();
		
		Draw c1 = c;
		
		System.out.println("O nome desta forma é " + c1.getNome());
		
	   System.out.println("---------------------------------------------");
       Losango l = new Losango(5, "Losango", 6, 8);
       l.CalcularArea();
       Draw l1 =l;
       System.out.println("O nome desta forma é " + l1.getNome());
       System.out.println("----------------------------------------------");
       Retangulo02 r = new Retangulo02(5, "Retangulo", 6, 9);
       r.CalculaArea();
       Draw r1=r;
       System.out.println("O nome desta forma é " + r1.getNome());
       System.out.println("-----------------------------------------------");
       Trapezio t=new Trapezio(7, "Trapezio", 8, 6, 4);
       t.CalcularArea();
       Draw t1=t;
       System.out.println("O nome desta forma é " + t1.getNome());
       System.out.println("--------------------------------------------");
       Triangulo tri=new Triangulo(4, "Triangulo", 5, 8);
       tri.CalcularArea();
       Draw tri1=tri;
       System.out.println("O nome desta forma é " + tri1.getNome());
	}

}
