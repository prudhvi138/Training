package com.cts;
public class Selection {
	public static void main(String args[])
	{
		String[] array={"Neena", "meeta", "Geeta"," Reeta", "Seeta"};
		for ( int j=0; j < array.length-1; j++ )
	    {
	      int min = j;
	      for ( int k=j+1; k < array.length; k++ )
	      {
	        if ( array[k].toLowerCase().compareTo( array[min].toLowerCase() ) < 0 ) 
	        	min = k;  
	      String temp = array[j];
	      array[j] = array[min];
	      array[min] = temp;
	      }
	      for(int i=0;i<array.length;i++)
				System.out.print(array[i]+" ");
	      System.out.println();
	    }
	  }
	}