package com.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException,IOException   {
		String path="C:\\Users\\Lenovo\\Desktop\\File\\data.txt";
		/*File file=new File(path);
		//System.out.println("can excute?"+file.canExecute());
		//System.out.println("can read?"+file.canRead());
		//System.out.println("can write?"+file.canWrite());
		//System.out.println("file exists?"+file.exists());
		//System.out.println("AbsolutePath"+file.getAbsolutePath());
		//System.out.println("file name"+file.getName());
		//System.out.println("Write data:");
    FileOutputStream fout=new FileOutputStream(path,true);
  Scanner sc=new Scanner(System.in);
  String msg=sc.nextLine();
    byte[] b=msg.getBytes();
    
    fout.write(b);
    fout.close();*/
     FileInputStream fin=new FileInputStream(path);
     FileOutputStream fout=new FileOutputStream("copied.txt");
     
     int i;
     while((i=fin.read())!=-1)
     {
    	fout.write(i);
     }
     fin.close();
	}

}
