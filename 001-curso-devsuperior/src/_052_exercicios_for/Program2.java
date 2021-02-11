package _052_exercicios_for;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sum = 0.f, sum2 = 1.f;
		Fatorial2 fatorial = new Fatorial2();
		
		System.out.println("Insira um valor para o qual deseja calcular seu fatorial: ");
		
		int n = sc.nextInt();
		int v = n+1;
		double[] vect = new double[v];
				
		for(int i = n; i > 0; i--) {
			fatorial.setNumero(i);
			vect[i] = fatorial.calcularFatorial();	
			
			System.out.println(i + "! = " + vect[i]);
			sum += vect[i];
			sum2 += 1.0/vect[i];
		}
			
		System.out.println("--------------------------");
		
		System.out.println("SOMA DOS FATORIAIS: " + sum);

		System.out.println("--------------------------");
		
		System.out.println("SOMA DA SEQUENCIA(1 + 1/X!): " + sum2);
					
		sc.close();

	}

}
