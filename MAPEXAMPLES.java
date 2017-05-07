package com.wrapper.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MAPEXAMPLES {
	
	public static void main(String[] args) {
		MAPEXAMPLES HH= new MAPEXAMPLES();
		HH.hashMapExample();
	}

	//Map key value pair keys are are unique BUT values can be duplicated
	//HashMap- 
	//march 6 2017 notes
	
	public void hashMapExample(){
		
		
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"Arti");
		map1.put(2, "Smitha");
		map1.put(1, "Arti");
		 
		//Entryset we can use too
		//
		Set<Integer> gg  = map1.keySet();//getting all the keys from map//
		//Set<Integer> java.util.Map.keySet()
//Method 1
		for (Integer ii: gg){
			 System.out.println( ii+"::"+ map1.get(ii));
		}
		//method2 is Entryset
	//Set<Entry<Integer,String>> gg= map1.entryset();
		for (Map.Entry<Integer, String> ee: map1.entrySet()){
			System.out.println( ee.getValue() +ee.getKey());
			
		}
	/* Iterator<Integer> strr=ids.iterator();
		 while(strr.hasNext()){
			 System.out.println( strr.next());// this is how we iterate in collections 
			 System.out.println( ids.lastIndexOf(strr));
			 */
	//we need to iterate to find duplicate values in Map else we can use as below	
		if (map1.containsKey(1)){
			System.out.println("MAP keys are are unique BUT values can be duplicated");
			if(map1.containsValue("harry")){
				System.out.println("Value is present ");
			}
		}
		
		}
	
public void LinkedhashMapExample(){
		
		Map<Integer,String> map1=new LinkedHashMap<Integer,String>();
		map1.put(1,"Arti");
		map1.put(2, "Smitha");
		map1.put(1, "Arti");
		 
		//Entryset we can use too
		
		Set<Integer> gg  = map1.keySet();//getting all the keys from map//
		//Set<Integer> java.util.Map.keySet()

		for (Integer ii: gg){
			 System.out.println( ii+"::"+ map1.get(ii));
		}
		
		}

public void TreeMapExample(){
	
	Map<Integer,String> map1=new TreeMap<Integer,String>();
	map1.put(1,"Arti");
	map1.put(2, "Smitha");
	map1.put(1, "Arti");
	 
	//Entryset we can use too
	
	Set<Integer> gg  = map1.keySet();//getting all the keys from map//
	//Set<Integer> java.util.Map.keySet()

	for (Integer ii: gg){
		 System.out.println( ii+"::"+ map1.get(ii));
	}
	
	}


/* Collections.reverseOrder();
Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface. (The natural ordering is the ordering imposed by the objects' own compareTo method.) This enables a simple idiom for sorting (or maintaining) collections (or arrays) of objects that implement the Comparable interface in reverse-natural-order. For example, suppose a is an array of strings. Then:
         Arrays.sort(a, Collections.reverseOrder());
*/
}
