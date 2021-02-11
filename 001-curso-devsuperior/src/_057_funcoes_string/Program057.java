package _057_funcoes_string;

public class Program057 {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		
		String s02 = original.toUpperCase();
		//Elimina os espaços nos cantos da String
		String s03 = original.trim();
		//Caracter da posição 02 em diante
		String s04 = original.substring(2);
		//Recortar apartir do caracter 02 e abaixo do 09
		String s05 = original.substring(2, 9);
		
		String s06 = original.replace('a', 'x');
		
		String s07 = original.replace("abc", "xy");
		
		int i = original.indexOf("bc");
		int	j = original.lastIndexOf("bc");	
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("ToLowerCase: -" + s01 + "-");
		System.out.println("ToUpCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2 a 9): -" + s05 + "-");
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last Index of 'bc': " + j);
		System.out.println();
		
		//Operacao Split
		System.out.println("Operacao Split:");
		
		String s = "potato apple lemon";
		
		String [] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
