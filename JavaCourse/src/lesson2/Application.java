package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Lion");
		animals.add("Fox");
		animals.add("Giraffe");
		animals.add("Hedgehog");
		animals.add("Squirel");
		animals.add("Rabbit");
		animals.add("Mouse");
		
//		//forloop
//		for(int i = 0; i <animals.size(); i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		//forEach
//		for(String value : animals) {
//			System.out.println(value);
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle Vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);
		vehicles.add(new Vehicle("Honda", "accord", 12000, false));
		vehicles.add(Vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		for(Vehicle car : vehicles) {
			System.out.println(car);
		}
		
		}
	}


