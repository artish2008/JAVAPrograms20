package com.main.JavaPractice;

public class missingElementTest {

	public static void main(String[] args) {
		
		/*getMissingNo in array */
	/*1. Get the sum of numbers 
	       total = n*(n+1)/2
	2  Subtract all the numbers from sum and
	   you will get the missing number.
	   */
	
		 
		 int[] myArr={1,5,3,7,2,4,6,9};
		 int n=9;//total numbers are n=9 and 8 are declared so 1 is missing
		int  TotalSumOfNumbers= n*(n+1)/2;
		int sum=0;
		 for (int i=0;i<myArr.length;i++)
		 {
		 sum= sum+myArr[i];
		 
		 }
		 
		 int missingNo= TotalSumOfNumbers-sum;
	System.out.println("missing num is :" + missingNo);
}

}
