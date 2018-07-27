package com.UsingThread;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ContactWriter implements Runnable {

	private String s;
	List<Contact> listStrings = new LinkedList<Contact>();
	
	
	
	public ContactWriter(String s, List<Contact> listStrings) {
		super();
		this.s = s;
		this.listStrings = listStrings;
	}


	

	@Override
	public void run() {
		
		try(FileWriter writer= new FileWriter(s,true))
		{
			for(int i=0;i<listStrings.size();i++)
			{
				String buffer=listStrings.get(i).toString();
				writer.write(buffer);
				writer.flush();
			}
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
			
	}
	
	

}
