package com.main.JavaPractice;
import java.util.HashMap;
import java.util.Map;


public class CountCharOccuranceinMAP {

	public static void main(String[] args) {
		
		
//Find the count of each  character occurance or duplicate 
				String str = "mymmmmmney";
				int len = str.length();
				Map<Character, Integer> numofChars = new HashMap<Character, Integer>();

				for (int i = 0; i < len; i++)
				{
				    char charAt = str.charAt(i);

				    if (!numofChars.containsKey(charAt))
				    {
				        numofChars.put(charAt, 1);
				    }
				    else
				    {
				        numofChars.put(charAt, numofChars.get(charAt) + 1);
				    }
				}

				System.out.println(numofChars);
			}
		
//results:  {e=1, y=2, m=6, n=1}
	}


