package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;

public class Driver {

	public static void main(String[] args) {
		Wordcounter fr = new Wordcounter();
		try {
			System.out.println(fr.readToString("main/java/resources/words.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
