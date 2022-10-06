package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Application {
//TreeMap brings in the natural order! TreeMap<String, String> dictionary = new TreeMap<String, String>();
	//Duplicates Keys will be overridden
	public static void main(String[] args) {

		HashMap<String, String> dictionary = new HashMap<String, String>();
		//List is Add, Map is Put
		dictionary.put("Brave", "ready to face danger");
		dictionary.put("Brilliant", "exceptionally clever or talented");
		dictionary.put("Joy", "a feeling of great pleasure and happiness");
		dictionary.put("Confidence", "the feeling or belief that one can have faith in or rely on someone or something");
		
//		for(String word: dictionary.keySet())
//		{
//			System.out.println(dictionary.get(word));
//			//System.out.println(word);
//		}
		
		for( Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}

}
