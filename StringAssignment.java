package com.main.JavaPractice;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// o/p This1 is2 is3 nice4
		String original=("This is is nice");
		//when we split String it stores in an Array
		String[] split1= original.split(" ");
		System.out.println(split1);
		for(int i=0;i<split1.length;i++)
		{
			System.out.println(split1[i]+(i+1));
			
		}
		//import java.util.Scanner
		//Scanner ss= new Scanner(System.in)
		//original=ss.nextLine();
		
		//method for reverse a String of 2 words output: house animal
		/*String original=("house hello");
		String reverse="";
	   for (int i=original.length()-1;i>=0;i--)
			reverse= reverse+original.charAt(i);
            System.out.println("the reverse String is : \n"+ reverse);
            */
		//o/p the reverse String is : 
	    //o/p esuoh olleh
		
            
//for palindrome we can add condition if (original.equals(reverse)) S.O.P (" it is palindrome")
         /*   if(original.equals(reverse))
            
            	System.out.println("it is Palindrome");
            	else
            		System.out.println("it is not Palindrome");
            */
          //  o/p the reverse String is : 
          //esuoh
          //it is not Palindrome
            
            
            //search a substring and replacewith another
            //reverse entire word not charecters hello world o/p world hello
         
		//String original=("house monday");
		
		// System.out.println("the reverse word is : \n"+original(i));
            
            
            
            }
            
            
		}
	
	
	
	
	
	


