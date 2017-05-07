package com.wrapper.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LISTCollectionsJava {

	/*public int ListExample() {
		
/*used often are 
 * int[] id=new int[20]; we need to know before hand
 *  but in collections we can increase storage
 * Collections is a class
 *  List is interface  
 *  ArrayList class implements List interface( we cannot create object of Interfaces)
 *  
 * List is Interface and Arraylist is implementation class(child class)
 * The ArrayList class extends AbstractList and implements the List interface
 * 
 * Need of ArrayList: from Standard java Arrays
 * The ArrayList class extends AbstractList and implements the List
 *  interface. ArrayList supports dynamic arrays that can grow as needed.
 *   Standard Java arrays are of a fixed length. After arrays are created, they cannot grow or shrink, which means that you 
 * must know in advance how many elements an array will hold.
 * 
 * Array will not be having key value 
 * Set will allow only unique elements we cannot do in Array
 * ArraylIst will always allows duplicate value or allows to add null value 
 * ArrayLIst maintains order of insertion
 * 
 */
		//stack extends vestor//LIFO
		//ids.add, size, get are method of List interface 
		//ids is object of ArrayList as used new ArrayList  and (Arrraylist class)is implementing this methods of interface List
	/*	List<Integer> ids= new ArrayList<Integer>();//<Integer> means giving genericc in java
		ids.add(1);
		ids.add(2);
		ids.add(null);//ArrayList allows null values 
		ids.add(2);//allows duplicates ( more then 1 also)

		list<String> names= new ArrayList<String>();
		names.add("Arti");
		names.add("Monica");
		 for(int i=0;i<ids.size();i++){
			 System.out.println("result"+ ids.get(i));
		 }
		 
		 for (String name: names){
			 System.out.println("results: "+ name); 
		 }*/
	
	
		 //vector is synchronised slower as it allows one after the another 
	//ArraylIst is unsynchronised and faster 
	//Vector can handle capacity and methods in vestor are synchronised
	
		 //vector intial capacity we can change 
		 public void vectorExample(){
			 Vector<Integer> ids= new Vector<Integer>(5,2);//after 5 we want to icrement by 2
			 ids.add(1);
			 ids.add(2);
			 ids.add(3);
			 ids.add(4);
			 ids.add(5);
			 ids.add(0, 2);
			 for(int i=0;i<ids.size();i++){
				 System.out.println( ids.get(i));
			 }
		 }
	//		 System.out.println(ids.capacity()); 
			
			 
			 //linkedList is faster it follows insertion order like arralistBUT
			 //DIFF 
// linkedList has pre and next nodes element references whichmakes it in insertions and deletions 
			 //faster for insertion and deletion, addFirst(), addLast, peek() return the heda element 
			 //pop()
			 //Array List do not have pre and next nodes element
			 
			 public void LinkedListExample(){
				 LinkedList<Integer> ids= new LinkedList<Integer>();
				 ids.add(1);
				 ids.add(2);
				 ids.add(3);
				 ids.add(4);
				 ids.add(5);
			
				 for(int i=0;i<ids.size();i++){
					 System.out.println( ids.get(i));
				 }
				 
				 Iterator<Integer> strr=ids.iterator();
				 while(strr.hasNext()){
					 System.out.println( strr.next());// this is how we iterate in collections 
					 System.out.println( ids.lastIndexOf(strr));
				 }
				// list has METHODS sort method, compareTo,Hashcode,reverseOrder
				/* Collections..reverseOrder();
				 Returns a comparator that imposes the reverse of the natural ordering on a collection of objects that implement the Comparable interface. (The natural ordering is the ordering imposed by the objects' own compareTo method.) This enables a simple idiom for sorting (or maintaining) collections (or arrays) of objects that implement the Comparable interface in reverse-natural-order. For example, suppose a is an array of strings. Then:
				          Arrays.sort(a, Collections.reverseOrder());
				 */
				 //Comparable is interface eithe rwe can use Implements Comparable
				 //or ompareTo method
				 
				 
				 
				
		 }
		 //linked list is double linked list 
		 //
			 public void LinkedHashsetExample(){
				 LinkedList<Integer> ids= new LinkedList<Integer>();
				 ids.add(1);
				 ids.add(2);
				 ids.add(3);
				 ids.add(4);
				 ids.add(5);
			
				 for(int i=0;i<ids.size();i++){
					 System.out.println( ids);
				 }
					 
				 }
			
			 
			 public static void main(String args[]){
				 LISTCollectionsJava le=new LISTCollectionsJava();
				// le.ListExample();
				 le.vectorExample();
			 le.LinkedListExample();
		 }
	

}
