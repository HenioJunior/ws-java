package _022_saida_dados;

import java.util.Locale;

public class Program022 {

	public static void main(String[] args) {
		/*double pix = Math.PI;
		System.out.printf("%.2f %n", pix);
		System.out.printf("%.4f", pix);
		System.out.println("O valor do pi é: " + pix);
		System.out.printf("O valor do pi é: %.5f %n", pix);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s, tem %d anos e ganha R$ %.2f reais. %n", nome, idade, renda);
		*/
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		
		System.out.printf("%s, which price is $ %.2f%n", product1, price1 );
		
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		System.out.println();
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		
		System.out.println();
		
		System.out.printf("Measure with eight decimal places: %.8f", measure);
		
		System.out.println();
		
		System.out.printf("Rouded (three decimal places): %.3f", measure);
		
		Locale.setDefault(Locale.US);
		System.out.println();
		
		System.out.printf("US decimal point: %.3f", measure);
	}

}
