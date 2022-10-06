package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
//repeats if you use ArrayLists	// HashSets Prevents it. 
	public static void main(String[] args) {
		//LinkedHashset Maintains the order
		HashSet<Animal> animals = new HashSet<Animal>();
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);

		//Hash Set is not able to identify unique values.
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		System.out.println(animal1.equals(animal4));
		
		
		for(Animal value : animals) {
			System.out.println(value);
		}
	}

}
