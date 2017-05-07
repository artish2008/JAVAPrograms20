package com.Java.concepts;

import java.util.HashMap;
import java.util.Map;

public class MapInterfacetest {

	public static void main(String[] args) {
		//int[] t= new int[]{1,2,3,4};
		//int [] arr={1,2,3,4};
		/*Java HashMap class implements the map interface by using a hashtable. It inherits AbstractMap class and implements Map interface.

		The important points about Java HashMap class are:

		A HashMap contains values based on the key.
		It contains only unique elements.
		It may have one null key and multiple null values.
		It maintains no order.
		
		//Useful methods of Map interface
		Set keySet()	It is used to return the Set view containing all the keys.
Set entrySet()	It is used to return the Set view containing all the keys and values.
		
		//Entry is the sub interface of Map. So we will be accessed it by
		 Map.Entry name. It provides methods to get key and value.
Methods of Map.Entry interface
Method	Description
Object getKey()	It is used to obtain key from that Entry
Object getValue()	It is used to obtain value.
		*/
		Map<Integer,String> m= new HashMap<Integer,String>();
			m.put(11,"arti");
			m.put(12, "monica");
			for (Map.Entry ee:m.entrySet())//entrySet()	It is used to return the Set view containing all the keys and values.
			{
		System.out.println("results:Key value are  "+ ee.getKey()+ee.getValue());
		//ee.getKey()	It is used to obtain key from that Entry
				}
		
	}

}
