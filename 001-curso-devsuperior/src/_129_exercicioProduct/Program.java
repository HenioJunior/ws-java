package _129_exercicioProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<Product>();
		
		System.out.print("Enter the number of products:");
		Integer n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println("Product #" + (i+1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}else if(ch == 'u'){
				System.out.println("Manufacture date (DD/MM/YYYY)");
				Date manufacturedate = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufacturedate));
			}else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for(Product prod: list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		sc.close();
	}

}
