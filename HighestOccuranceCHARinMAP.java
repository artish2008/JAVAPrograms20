package com.main.JavaPractice;
import java.util.HashMap;
import java.util.Map.Entry;

public class HighestOccuranceCHARinMAP {


			public static void main(String[] args) {

				{
					HashMap<Character, Integer> map = new HashMap<Character, Integer>();
					String theString = "memmmmmey";
					for (int i = 0; i < theString.length(); i++) {
						if (map.containsKey(theString.charAt(i))) {
							map.put(theString.charAt(i), map.get(theString.charAt(i)) + 1);
						} else {
							map.put(theString.charAt(i), 1);
						}
					}
					char character = 0;
					int max_count = 0;
					for (Entry<Character, Integer> item : map.entrySet()) {
						if (max_count == 0) {
							
							character = item.getKey();
							max_count = item.getValue();
							
						} else {
							if (item.getValue() > max_count) {
								
								character = item.getKey();
								max_count= item.getValue();
							}
						}
						System.out.println(item.getKey() + ": " + item.getValue());
					}
					System.out.println(character);

				}
			}
		


	}


