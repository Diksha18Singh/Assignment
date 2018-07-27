package com.UsingThread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContactList {
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Contact> listStrings = new LinkedList<Contact>();
		
		listStrings.add(new Contact("Diksha", "Singh", 21, 32973322231l, "djhfcsdbf"));
		listStrings.add(new Contact("Megha", "Shanbhag", 21, 32973322231l, "fjvnhf"));
		listStrings.add(new Contact("Pranali", "Narkar", 21, 32973322231l, "vfdfbb"));
		listStrings.add(new Contact("Sonlai", "Gupta", 21, 32973322231l, "fvdfv"));
		//listStrings.add(new Contact("Diksha", "Singh", 21, 32973322231l, "djhfcsdbf"));
		//listStrings.add(new Contact("Diksha", "Singh", 21, 32973322231l, "djhfcsdbf"));
		
		
		ContactWriter c1=new ContactWriter("d:/data/test2.txt",  listStrings);
		ContactWriter c2=new ContactWriter("d:/data/test3.txt", listStrings);
		ContactWriter c3=new ContactWriter("d:/data/test4.txt",  listStrings);
		
		executor.submit(c1);
		executor.submit(c2);
		executor.submit(c3);
		
		
		
	}

}
