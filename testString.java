package com.main.JavaPractice;

public class testString {

	public static void main(String[] args) {
	
		
		//Reverse a String
		
		//String is a class, String are immutable once intialized it stores n String contant pool
		//String we cannot change later : we cunless we manually refering to that value 
	/*	
		String s="Hello";
		s.concat("world");
		System.out.println("output is :"+s);
		String str1="hello";
		String str2="hello";
		if(str1==str2){
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
    //when we create new String object then its not equal as reference is not equal in heap
		String s1=new String("hello");
		String s2=new String("Hello"); //result is Both are not equal
		if(s1==s2){// ==it compares reference
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		//but if we use if (s1.equals(s2)) // .equals it compares values// result will be Both are queal
		
		
		
	}*/
	/*
	String greet="hello world";
	
	char[] chars1=greet.toCharArray();//converting string into charcaterarray
	
	for(int i=0;i<greet.length();i++)
	{
		System.out.println(chars1[i]);
	}
	for(char ch : chars1){
		System.out.println(ch);	
	}

	h
	e
	l
	l
	o
	 
	w
	o
	r
	l
	d
	*/
		String greet="hello world";
		
		char[] chars1=greet.toCharArray();//converting string into charcaterarray
		System.out.println(greet.substring(6));
		System.out.println(greet.trim());
		
		String s="      hi      ";
		System.out.println(s.trim());
		System.out.println(greet.indexOf('1'));
		System.out.println(greet.charAt(4));
		
		//String buffer is mutable and String builder is mutable( we can change)
		//in mutliple threaded env to reduce deadlock we use string buffer
		
				//
				StringBuffer sb= new StringBuffer("hello");
				sb.append("world");
				System.out.println( sb);
				
				//only for single threaded env we string builder 
				StringBuilder sb1= new StringBuilder("hello");
				sb1.append("change");
				System.out.println( sb1);
			}	
		
	//2 ways to initialize string
	//when Using String Literals= String s="hello";--- it stores in SCP inside string constant pool
	//when using new keyword= String s= new String();----it stores directly on heap memory 
}
