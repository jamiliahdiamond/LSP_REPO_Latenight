package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
    public static int commonKeyValuePairs(
            HashMap<String, String> map1,
            HashMap<String, String> map2) {
        // check if map is empty or null
        if (map1 == null || map2 == null || map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }
        
        int commonPairs = 0;
        // iterate through keys of map 1
        for (String key : map1.keySet()) {
        	// check if map2 contains the same key and the same value of that key
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonPairs++;
            }
        }
        
        return commonPairs;
    }
}
