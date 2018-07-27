package com.UsingThread;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileList
{
	
	public static void main(String[] args)
	{
		//FileInputStream in=new FileInputStream(source);
		//FileOutputStream out=new FileOutputStream(destination);
		CopyFile2 s=new CopyFile2("d:/data/Flower.jpg","d:/data/enter1.jpg");
		//CopyFile2 destination=new CopyFile2();
		
		
		Thread t1=new Thread(s);
		//Thread t2=new Thread();
		t1.start();
		//t2.start();
		
	}
}