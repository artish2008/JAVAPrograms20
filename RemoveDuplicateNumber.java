package com.main.JavaPractice;

import java.util.Scanner;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		
		int[] input={1,2,3,3,3,3,4,5,5,6};
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number to be remove");
		int num= sc.nextInt();
		
	 int length1= input.length;
	 for( int i=0;i<=length1;i++){
		 if(input[i]==num){// if it foinds match then length--
			 length1--;
			 
		 }

	}
System.out.println("new size of array length \n "+ length1);
}
}
/*//Results
Enter number to be remove
3
new size of array length 
 6
*/