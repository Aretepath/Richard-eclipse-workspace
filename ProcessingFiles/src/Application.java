import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		
//		for(int i=0;i <=3; i++) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter some Text: ");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
		
	
		
		
//		}
	
	File file = new File("myfiles.txt");
	Scanner input = null;
	try {
		input = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while(input.hasNextLine()) {
		String line = input.nextLine();
		System.out.println(line);
	}
	input.close();
	
	
	MyFileUtils myUtil = new MyFileUtils();
	try {
		System.out.println(myUtil.subtract10FromLargerNumber(11));		
	} catch (Exception e) {
		e.printStackTrace();
	}

	}
}