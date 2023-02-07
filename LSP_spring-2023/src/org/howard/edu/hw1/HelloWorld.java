package org.howard.edu.hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("C:\\Users\\barry\\git\\LSP_assignment1BCC\\LSP_spring-2023\\tests.txt");
		} catch (FileNotFoundException e) {
//			 TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bufferReader = new BufferedReader(fileReader);
		
		try {
			System.out.println(bufferReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String currentLine;
		Set wordSet = new HashSet<>();
		String[] array = null;
 		String line;
 		int i=0;
		while((line = bufferReader.readLine()) != null){
		    array[i] = line;
		    i++;
		    System.out.println(array);
		}
//		while ((bufferReader.readLine())) {
//			wordSet.add(bufferReader.readLine().split(" "));
//			System.out.println(wordSet);
//			
//		}
	}

}
 