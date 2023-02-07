package org.howard.edu.lsp.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Scanner txtFile = new Scanner(new File("C:\\Users\\barry\\git\\LSP_assignment1BCC\\LSP_spring-2023\\test.txt"));
		while (txtFile.hasNext ()) {
			String word = txtFile.next();
			word = word.toLowerCase();


			if (word.length() <= 3) {
				continue;
			}
			if (map.containsKey(word)) {
				int count = map.get(word) +1;
				map.put(word,  count);
			}
			else {
				map.put(word,  1);
			}
		}
		txtFile.close();
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}

}
