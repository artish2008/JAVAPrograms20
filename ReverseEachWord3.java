package com.main.JavaPractice;
import java.util.Scanner;

public class ReverseEachWord3 {

		public static void revWords(){
			String input = "my name is arti";
	        StringBuilder sb = new StringBuilder();
	        String words[] = input.split(" ");//empty string
	        for (String word : words) {
	            for (int i = word.length() - 1; i >= 0; i--) {
	                sb.append(word.charAt(i));
	            }
	              sb.append(" ");
	        }
	        System.out.println (sb.toString());
	        //result : ym eman si itra 
		}


		public static void main(String[] args){
			
			ReverseEachWord3.revWords();
		}

	/* public static void revUsingBuffer(){
	 		
	 		String s = "Java is easy";
	 	    String[] str =s.split(" ");
	 	    StringBuffer buffer = new StringBuffer();
	 	    for(int i=str.length-1;i>=0;i--)
	 	    {
	 	        buffer.append(str[i]);
	 	        buffer.append(" ");
	 	    }
	 	    System.out.println("Original string: " + s);
	 	    System.out.println("Reverse word string:"+buffer.toString());
		}
		 
		 public static void main (String[]args){
			 
			 ReverseEachWord3 .revUsingBuffer();
		 }
		result:Original string: Java is easy
		Reverse word string:easy is Java 
		*/	
}
