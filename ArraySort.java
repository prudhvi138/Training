package com.cts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(12,56,2,3,8,45));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
