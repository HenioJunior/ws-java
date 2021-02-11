package _038_condic_ternaria;

public class Program038 {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto;

		// Expressão condicional ternária

		/* if (preco < 20.0){
			desconto = preco * 0.1;
		 }else{
		 desconto = preco * 0.05;}
		*/
		preco = 51.0;
		
		desconto = (preco > 50.0) ? preco * 0.30 : preco * 0.05;
		
		System.out.printf("%.2f", desconto);
	}

}
