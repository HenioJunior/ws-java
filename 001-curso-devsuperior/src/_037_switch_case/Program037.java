package _037_switch_case;


import java.util.Scanner;

public class Program037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia= "terca;";
			break;
		case 4:
			dia = "quarta";
			break;
		default: 
			dia = "valor invalido";
		break;
			
		}
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
