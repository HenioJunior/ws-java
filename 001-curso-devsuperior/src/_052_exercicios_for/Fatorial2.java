package _052_exercicios_for;

public class Fatorial2 {

	private int numero;

	public Fatorial2() {};

	public Fatorial2(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

//Métodos
	public double calcularFatorial() {

		int fat;
		for (fat = 1; numero > 1; numero--) {
			fat *= numero;
		}
		return fat;
	}

}
