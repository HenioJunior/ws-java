package _047_exercicios_while;

import java.util.Scanner;

public class Exercicio601 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a senha:");
			int senha = sc.nextInt();
			
			while(senha !=2002) {
				System.out.println("Senha inválida!");
				
				System.out.println("Digite a senha:");
				senha = sc.nextInt();					
				
			}
		}
		
		System.out.println("Acesso Permitido");
		
	}

}
