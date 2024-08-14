package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapSorting {
	public static void main(String[] args) {
		Map<Integer,String>mp=new HashMap<>();
		mp.put(1, "Krishna");
		mp.put(2, "Rahul");
		mp.put(5, "Mohan");
		mp.put(6, "Rajesh");
		mp.put(9, "Sohan");
		 System.out.println(mp);
		// Convert the map to a list of Map.Entry objects
        List<Map.Entry<Integer,String >> entryList = new ArrayList<>(mp.entrySet());

        // Sort the list by values in ascending order
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> entry1, Map.Entry<Integer, String> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        System.out.println(entryList);
        // Create a new LinkedHashMap to store the sorted key-value pairs
        Map<Integer,String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry< Integer,String> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Print the sorted map
        System.out.println(sortedMap);
			
		};
	}
