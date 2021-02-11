package _097_matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input matriz size:");
		int n = sc.nextInt();
		int sum = 0;

		int[][] mat = new int[n][n];
		System.out.println("Matriz[" + n + "]" + "[" + n + "]");
		System.out.println("Input:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Position" + "[" + i + "]" + "[" + j + "]:");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.print("Main diagonal: ");
		// PERCORRER AS LINHAS
		for (int i = 0; i < n; i++) {
			// PERCORRER AS COLUNAS
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
				if (mat[i][j] < 0) {
					sum++;
				}
			}
		}
		System.out.println();
		System.out.println("Negative numbers: " + sum);
		sc.close();
	}
}