package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

	public static void main(String[] args) {
		//only put one type of data type
		ArrayList<String> words = new ArrayList<String>();
		words.add("hello");
		words.add("there");
		words.add("10");
	
		
		String item1 = words.get(2);
		System.out.println(item1);
		
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(6);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
		numbers.add(657);
		numbers.add(234);
		numbers.remove();
		
		for(int number : numbers) {
			System.out.println(number);
		}

	}

}
