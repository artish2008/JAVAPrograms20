package com.wrapper.collections;

public class WrapperPrimitive1 {

	public static void main(String[] args) {
		//we cannot use primitive data types in collections 
		
		/*primitive has its own wrapper class
	Need of wrapper classes:Number classes 
	character and boolean need NOT inhetrite from number class
	they wrap the primitive data type and help in using inbuilt methods
	
	to use the primitives inside java Collections which allows objects 
	
		byte we have Byte class
		short has Short 
		int- Integer ( Integer class has methods to convert int to string or vice versa

parseInt : static method which we use directly calling class name 
toString:static method
*/
		int i=10;
		float f=45.6f;
		Integer i1=new Integer(20);//object of Integer class
		Integer i2= 20;
		boolean b=true;
		Boolean b1=true;//object creation of class boolean
		
		String s1="650";
		//parseint converts String to integer
		int i3=Integer.parseInt(s1);
		System.out.println(i3);
		
		//converts string to float 
		float f21=Float.parseFloat("65.56");
		//to string converts integer to string
		
		String s2=i1.toString();
		String s3=Integer.toString(54);
		
		//primitive to integer object 
		Integer i4=Integer.valueOf(5);
		
		
		
		//tycasting is converting one datatype to anotehr datatype 
		//
	}

/*	autobox is only with primitive converst to wrapper
	or wrapper class object converted to primitive
	it is done nternally using unboxing concept in JAVA

	Primitive datatypes to Wrapper clas-int to Integer -autoboxing
	WrapperClass to Primitive -Integere to int-unboxing
	*/
	
	
}
