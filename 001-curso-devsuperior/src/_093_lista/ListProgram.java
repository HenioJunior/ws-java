package _093_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// ADICIONAR NA LISTA;		
		List<String> list = new ArrayList<>();
		List<Integer> listId = new ArrayList<>();
		List<Double> listSalary = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Henry");
		list.add(2, "Marco");
		
		
		listId.add(100);
		listId.add(200);
		listId.add(300);
		listId.add(400);
		
		System.out.println("---------------------");
		
		//SALARY LIST
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("SALARY: ");
			
			listSalary.add(sc.nextDouble());
		}
		for (Double x : listSalary) {
			System.out.println(x);
		}
		
		System.out.println("FIND");
		
		Double findSalary = sc.nextDouble();
		Double fndSalary = listSalary.stream().filter(x -> x.equals(findSalary)).findFirst().orElse(null);
		System.out.println("FIND SALARY: " + fndSalary);
		
		
		
		
		System.out.println("---------------------");
		
		
		// TAMANHO DA LISTA;
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
				
		System.out.println("---------------------");
		
		// REMOVER DA LISTA;
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		// LOCALIZAR O INDICE ASSOCIADO AO NOME list.indexOf;
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------");
		
		// FILTRAR NA LISTA NOMES INICIADOS COM A:
		
			// DECLARAR UMA NOVA LISTA;
				// List<String> result = 
		
			// CONVERTER A LISTA PARA STREAM;;
				//  list.stream()
		
			// CHAMAR A FUNCAO FILTER;
				// .filter(x -> x.charAt(0) == 'A')
		
			// CONVERTER STREAM PARA LIST;
				// .collect(Collectors.toList());
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		// ENCONTRAR UM ELEMENTO DA LISTA QUE ATENDA A UM CERTO PREDICADO;
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("---------------------");
		
		// COMECE COM J;
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
		
		System.out.println("---------------------");
				
		Integer idTemp = sc.nextInt();
		Integer id = listId.stream().filter(x -> x.equals(idTemp)).findFirst().orElse(null);
		System.out.println("ID: " + id);
		
			
}
}
