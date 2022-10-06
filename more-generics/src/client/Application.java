package client;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		Object myObject = new Object();
		String myVar = "hello";
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();
		emp = acc;
		
//		Cant merge the below as diffferent accounts
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
		ArrayList<Accountant> accountant = new ArrayList<Accountant>();
		accountant.add(new Accountant());
//		employees = accountant;
		
		
		//can assign with wildcard ? meaning any data type
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<String> accountant2 = new ArrayList<String>();
		employees2 = accountant2;
		
		//Question make takes place of the child class
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountant3 = new ArrayList<Accountant>();
		employees3 = accountant3; 
		
		ArrayList<? super Employee> employees4 = new ArrayList<>(); //super means it better be an employee or parent of employee
		ArrayList<Object> accountant4 = new ArrayList<Object>();
		employees4 = accountant4; //Cannot compile with parent as object
		
		makeEmployeeWork(employees);
		makeEmployeeWork(accountant);
		
	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
		}
	}

}
