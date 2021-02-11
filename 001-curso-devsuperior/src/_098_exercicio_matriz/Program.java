package _098_exercicio_matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input matriz size:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0, x, y;

		int[][] mat = new int[m][n];
		System.out.println("Matriz[" + m + "]" + "[" + n + "]");
		System.out.println("Input:");
		for (int i = 0; i < mat.length ; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Position" + "[" + i + "]" + "[" + j + "]:");
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Leitura de X");
		x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1] + " ");
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j] + " ");
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}

		}
		sc.close();
	}
}
