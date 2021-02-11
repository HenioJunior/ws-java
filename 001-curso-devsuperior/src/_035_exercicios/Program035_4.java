package _035_exercicios;

import java.util.Scanner;

public class Program035_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		if(horaInicial == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}else{
			if(horaFinal > horaInicial) {
				int duracao = horaFinal - horaInicial;
				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			}else {
				int duracao = 24 - horaInicial + horaFinal;
				System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			}
		}
		sc.close();
	}
}
