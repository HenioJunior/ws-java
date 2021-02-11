package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<Product>();
				
		Scanner sc = new Scanner(System.in);
						
		System.out.println("Enter a folder path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr); //Instanciando sourceFile do tipo File;
		File sourceFolder = sourceFile.getParentFile();
		boolean success = new File(sourceFolder + "\\out").mkdir(); //criação do diretorio
		
		FileWriter fileWriter = new FileWriter(sourceFolder + "\\out\summary.csv"); 
		
		
		

}
}
