package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.*;

public class Wordcounter {
	// Reads the file and counts word occurrences
    public String readToString(String resource) throws FileNotFoundException {
    	// Get the file's URL
        URL url = getClass().getClassLoader().getResource(resource);
        // Lists to store words and their counts
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        if (url != null) {
            File file = new File(url.getPath());
            Scanner sc = null;
            try {
                sc = new Scanner(file, "UTF-8");
                sc.useDelimiter("\\W+");

                while (sc.hasNext()) {
                    String nextWord = sc.next();
                    if (nextWord.length() <= 3) {
                        continue;
                    }
                    nextWord = nextWord.toLowerCase();
                    if (words.contains(nextWord)) {
                        int index = words.indexOf(nextWord);
                        count.set(index, count.get(index) + 1);
                    } else {
                        words.add(nextWord);
                        count.add(1);
                    }
                }
            } finally {
                if (sc != null) {
                    sc.close();
                }
            }

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < words.size(); i++) {
                output.append(words.get(i)).append("\t").append(count.get(i)).append("\n");
            }
            return output.toString();
        }
        throw new FileNotFoundException();
    }
    
}




