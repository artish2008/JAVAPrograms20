package com.wrapper.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
//difference List and set
	//set allows only unique elements 
	//HashSet veryfast ,data is unsorted and unordered, it will allow one Null
	//TreeSet sorted in natural ascending order 
/*	public void setExample(){
		Set<String> ss=new HashSet<String>();
		ss.add("arti");
		ss.add("arti");
		ss.add("arti");
		ss.add("monica");
		
		 for(int i=0;i<ss.size();i++){
			 System.out.println( ss);
		 }
	//*/
		 
		 public void LinkedHashset(){ // ordered by insertion order maintains order faster for insertions and deletions
				Set<String> ss=new HashSet<String>();//set is unique 
				ss.add("arti");
				ss.add("arti");
				ss.add("arti");
				ss.add("monica");
				
				 for(int i=0;i<ss.size();i++){
					 System.out.println( ss);
				 }
			
				for (String gg:ss) {
					 System.out.println(gg);
				 }
				}
		//Treeset sorts in natural ascending order NOT the insertion order
 //Treeset will not allow NULL it will give null pointer exception
		// Set<String> ss=new Treeset<String>();
		 
		 
		// so vector, linkedHAsMap allow one null
		 //HashTable  Null NOT allowed it will give NUll poiter exception
		 //NULL NO at all not in in value neiher in key 
		//TreeSET Do not allow NULL
		 //IN  TreeMAP will NOT allow NULL value BUT NULL value is okay in value only 
		 
		 public void TreesetExample(){ 
				Set<String> ss=new TreeSet<String>();//set is unique 
				ss.add("arti");
				ss.add("arti");
				ss.add("arti");
				ss.add("monica");
				
				 for(int i=0;i<ss.size();i++){
					 System.out.println( ss);
				 }
			
				for (String gg:ss) {
					 System.out.println(gg);
				 }
				}
 
 
 
	 
	 public static void main(String args[]){
		 SetExample le=new SetExample();
		// le.setExample();
		 
		
		
	}}
	
