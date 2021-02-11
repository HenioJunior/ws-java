package _119_exer_correcao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ProgramTeste {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		
		Product p = new Product("TV", 1000.00);
		
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		Client client = new Client("Alex Green", "alex@gm", sdf.parse("15/03/1981") );
		
		System.out.println(client);
		
	}

}
