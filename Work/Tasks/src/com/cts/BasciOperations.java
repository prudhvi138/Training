package com.cts;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class BasciOperations {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		FileSystem fs=FileSystems.getDefault();
		/*Path path=fs.getPath("C:\\Users\\Lenovo\\Desktop\\File");
		System.out.println("Name count:"+path.getNameCount());
		System.out.println("Is Absolute : "+path.isAbsolute());*/
		String path="C:\\\\Users\\\\Lenovo\\\\Desktop\\\\File\"";
		//Files.createDirectory(path);
		
		}

	
}
