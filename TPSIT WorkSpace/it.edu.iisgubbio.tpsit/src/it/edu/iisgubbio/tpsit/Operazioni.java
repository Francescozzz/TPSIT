package it.edu.iisgubbio.tpsit;

public class Operazioni {
	int n1, n2;
	
	public Operazioni(int x, int y) {
		
		 n1 = x;
		 n2 = y; 
		 
		
	}
	public int somma() {
		return n1 + n2;
	}
	
	public int prodotto (){
		return n1 * n2;
		
	}
	public static void main() {
		Operazioni op = new Operazioni(3,4);
		Operazioni opsomma = new Operazioni(3,4);
		Operazioni opprodotto = new Operazioni(3,4);
		
	}

}
