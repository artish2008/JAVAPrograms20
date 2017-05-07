package com.File.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileJAVAIO {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
    File f =new File("Test.txt");//only in memory it is 
    f.exists();
 
    System.out.println("results: "+  f.exists());
    //results:false
   try{
	   f.createNewFile();// we creating new file
   }
   catch (IOException e){
	   e.printStackTrace();
   }
   System.out.println("results: "+  f.exists());
   //results:true
	}
*/
	//Ctrl shift o will import all te packages
/*	File f3= new File("Test.txt");// in buffer 
	try{
		FileWriter fw= new FileWriter(f3);
		fw.write("Good evening ");
		fw.flush();//we clearing the temporary
		fw.close();
		
		FileReader fr= new FileReader("c:\\Users\\Arti\\Documents\\Newdata1");//or (fw);
		char[] ch=new char[1000];
		fr.read(ch);
		for (char cc: ch){
			System.out.println("results: "+ cc);
		}
		
	}catch (IOException e){
		e.printStackTrace();
	}
	*/
	
// BufferReader is better 	line by line , much amount of data 
	
	File f3= new File("Test.txt");// in buffer 
	try{
		FileWriter fw= new FileWriter(f3);
		fw.write("Good evening ");
		fw.flush();//we clearing the temporary
		fw.close();
		
		FileReader fr= new FileReader("c:\\Users\\Arti\\Documents\\Newdata1");//or (fw);
		char[] ch=new char[1000];
		fr.read(ch);
		for (char cc: ch){
			System.out.println("results: "+ cc);
		}
		
	}catch (IOException e){
		e.printStackTrace();
	}
	
}}
