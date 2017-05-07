package com.main.JavaPractice;
import java.util.Arrays;

import java.util.ArrayList;

public class JavaArrayMain {
	
	
	public static void main(String[] args){
	
		
		int[] arr1={2,1,3,7,6};
		int[] arr2={5,3,7,1,9};
	 int minimum =arr2[0];
	for (int j=1;j<arr2.length;j++)
			if(arr2[j]<minimum){
		minimum=arr2[j];
		
				}
					System.out.println( "minimum smallest is : "+ minimum);
			}
			
}
		
		
		
	//prints all multiple of 5 in between 1 to 100	
	// WRP r=11;
	//if (r%2==0){
		//System.out.println( "It is even"+ r)
//	}	
	
	
	



	/*	int[] marks = {75,85,95,65};
		String[] student= new String[4];
		student[0]="eng";
		student[1]="maths";
		String[] Arra={"ac,GG"};
		for (int i=0;i<student.length;i++){
			System.out.println( "subject:" + student[i]+ marks[i]);
		}subject:eng75
		subject:maths85
		subject:null95
		subject:null65
	*/
		
		
/*	// to find print  repeated elements  in 2 array	
		int[] arr1={3,6,8,10,2,7};
		int[] arr2={4,5,6,10,7,3,12,1};
		System.out.println("length of array:" + arr1.length);
		System.out.println("length of array:" + arr2.length);
		
		for(int i=0;i<arr1.length;i++)
		{ 
			for (int j=0;j<arr2.length;j++){
				if (arr1[i]==arr2[j])
				System.out.println(arr1[i]);
				
			}
		}
	}
		
	length of array:6
	length of array:8
	3
	6
	10
	7*/
		
	/*//find smallest value in Array
		int[] numbers= new int[]{30,40,2,90,60};
		
		int small=numbers[0];//we first intialized smallest at zeroth location 
		//starting from 1 position that is 40
		for (int i=1;i<numbers.length;i++){
			if (numbers[i]<small)
				small=numbers[i];
		}
		
		System.out.println("smallest value is :" +small);
	}
	smallest value is :2
	same we can do for largest in array 	if (numbers[i]>small)
	*/
		/*
		int[][] arr;
	//	arr[0][0]=1;
	//	arr[0][1]=2;
	*/
		
		
		
		
/*
	 int[] Array1= new int[5];
	 {
	 Array1[0]=9;
	 Array1[1]=2;
	 Array1[2]=5;
	 Array1[3]=8;
	 Array1[4]=4;
	 
	 

	 System.out.println("Element at index 2: "
             + Array1[2]);
}
	 
	 //array are stored in heap memory
	 int[] ar= new int[3];
	*/
			
	
