package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(43);
		newList.add(67);
		
		//List<Integer> li = new ArrayList<Integer>(list1); // Converts List into Array Last. 
		
		//list1.addAll(newList); //Merges List 1 with NewList 
		//list1.removeAll(newList); // Also remove all //also empty and clear
		
		//boolean hasValue = list1.contains(67);
		
		boolean hasValue = list1.retainAll(newList);
		
		System.out.println(list1);
		System.out.println(hasValue);
		

	}

}
