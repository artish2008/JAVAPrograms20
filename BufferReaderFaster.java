package com.File.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;

public class BufferReaderFaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("Test2.txt");
try{
	
	FileReader fr= new FileReader(f);
	BufferedReader br= new BufferedReader(fr);
	
		
	}catch (FileNotFoundException e){
		e.printStackTrace();
}

	}

}
