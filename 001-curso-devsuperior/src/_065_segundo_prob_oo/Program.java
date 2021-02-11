package _065_segundo_prob_oo;


//import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data:");
		Product product = new Product();

		System.out.println("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price:");
		product.price = sc.nextDouble();

		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();

		System.out.println("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in Stock: ");

		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed in Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println("Updated data: " + product);

		sc.close();
	}

}
