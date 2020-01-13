/*Consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*" */






package com.cts;
import java.util.Scanner;

public class Stringdo {
	public static void main(String[] args) {
		String str="Global Warming";
		int len=str.length();
		StringBuffer sc=new StringBuffer(str);
		StringBuffer sc1=new StringBuffer(str);
		System.out.println(str.substring(10));
		System.out.println(str.substring(4,8));
		System.out.println(sc.delete(len-4,len));
		System.out.println(sc1.delete(0,4));
		System.out.println(str.indexOf("wa"));
		System.out.println (str.toLowerCase());
		System.out.println (str.toUpperCase());
		System.out.println(str.matches("[a-zA-Z0-9]+"));
		System.out.println(str.replace("a","*"));
		
		
		
		
	}

}
