package car_dealership;

public class Employee {
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if(finance ==true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
			
			
		}else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			//Customer pays in cash
			processTransaction(cust, vehicle);
		} else {
			System.out.println(" customer will need more money to purchase "+ vehicle);
		}
		
	}
	
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran Credit History for the csutomer..");
		System.out.println("Customer has been approved to purchase the vehicle");
		
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle){
		System.out.println("Customer has purchased the Vehicle in cash..." + vehicle + " for the price "+ vehicle.getPrice());
	}
	
}
