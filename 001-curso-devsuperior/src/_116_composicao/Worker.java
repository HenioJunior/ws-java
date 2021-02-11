package _116_composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;
	
	//Nao incluir a lista no construtor
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * public void setContracts(List<HourContract> contracts) { this.contracts =
	 * contracts; }
	 * 
	 * N�o posso incluir o m�todo setContracts, pois esta recebendo uma outra lista
	 * e essa lista esta sendo atribuida para a lista de contratos do trabalhador.
	 */

	public void addContract(HourContract contract) {
		contracts.add(contract);

	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		
		double sum = baseSalary;
		
		//Declara��o do atributo cal
		Calendar cal = Calendar.getInstance();
		
		//Para cada contrato c
		for(HourContract c : contracts) {
			
			//Pegar a data do contrato c e definir como sendo a data do calendario 
			cal.setTime(c.getDate());
			
			//Cria��o das variaveis para a representa��o do mes/ano
			int c_year = cal.get(Calendar.YEAR);	//Extrair o ano e atribuir ao c_year
			int c_month = 1 + cal.get(Calendar.MONTH);	//Extrair o mes
			
			
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
			
		}
		
		return sum;
	}

}