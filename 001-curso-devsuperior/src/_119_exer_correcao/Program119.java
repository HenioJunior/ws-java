package _119_exer_correcao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program119 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY)");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(status, new Date() , client);
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1;i <= n; i++) {
			System.out.println("Enter #" + i + " item data:" );
			
			System.out.print("Product name: ");
			sc.hasNextLine();
			String prodName = sc.next();
			
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			
			Product product = new Product(prodName, prodPrice);
			
			System.out.print("Quantity: ");
			int prodQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(prodQuantity, prodPrice, product);
			
			order.addItem(orderItem);
		}
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
