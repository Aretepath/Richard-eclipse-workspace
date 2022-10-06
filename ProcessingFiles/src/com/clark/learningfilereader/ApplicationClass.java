package com.clark.learningfilereader;

import java.io.*;

public class ApplicationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("myfile.txt");
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);){
					
			String line = bufferedReader.readLine();
			
			while(line !=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File was not found: Error");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem Reading the file" + file.getName());
		} 
	}

}
