package lambda.practical;

import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Car> cars = Arrays.asList(
				new Car("Honda", "Accord", "Red", 22300),
				new Car("Honda", "Civic", "Blue", 17700),
				new Car("Toyota", "Land Cruiser", "White", 48500),
				new Car("Toyota", "Corolla", "Black", 16200),
				new Car("Toyota", "Camry", "Blue", 24000),
				new Car("Nissan", "Sentra", "White", 17300),
				new Car("Mitsubishi", "Lancer", "White", 20000),
				new Car("Jeep", "Wrangler", "Red", 24500)
				);
		
//		printCarsPriceRange(cars, 18000, 22000);
//		printCarByColor(cars, "Red");
		System.out.println("Printing Cars between price 18000 and 22000");
	
		printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
		printCars(cars, (c) -> c.getColor().equals("Blue"));

	}

	public static void printCars(List<Car> cars, Condition<Car> condition) {
		for(Car c: cars) {
			if(condition.test(c)) {
				c.printCar();
			}
		}
	}
	


		
		@FunctionalInterface
		interface Condition<T> {
			public boolean test(T t);
		}
			
	}
