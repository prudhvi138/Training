package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		addNames(names);
		names.forEach(System.out::println);
		List<String> lengthScale=names.stream().filter(s->s.length() >=7).collect(Collectors.toList());
		System.out.println("The names which length greater than 7:\n");
		lengthScale.forEach(System.out::println);
		List<String>capNames=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		capNames.forEach(System.out::println);
	}

	private static void addNames(List<String> names) {
		names.add("shankar");
		names.add("ram");
		names.add("vishal");
		names.add("krishna");
		names.add("vamsi");
	}
	}
	
