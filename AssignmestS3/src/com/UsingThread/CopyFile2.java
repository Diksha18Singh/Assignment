package com.UsingThread;

import java.io.*;
import java.util.*;

public class CopyFile2 implements Runnable {

	private String source,destination;
	FileInputStream in;
	
	public CopyFile2(String n,String s){
		
		source=n;
		destination=s;
		
	}
	public void run(){
		try{
			FileInputStream in=new FileInputStream(source);
			FileOutputStream out=new FileOutputStream(destination);
			byte[] buffer=new byte[1000];
			int len=in.read(buffer,0,1000);
			
			while(len>0)
			{
				out.write(buffer, 0, 1000);
				out.flush();
				len=in.read(buffer,0,1000);
			}
			in.close();
			out.close();
		}catch(IOException e)
		{
			System.out.println("FILE not Found");
		}
		finally
		{
			
			
		}
		
		
	}
	
	
	
	
	}
	
	
	


