package com.cts;

public class GenericsType<T> {

	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("Prudhvi"); 
		String n = type.get();
		GenericsType type1 = new GenericsType(); 
		type1.set("Prudhvi"); 
		type1.set(10);
		GenericsType<Integer> Type = new GenericsType<>();
	
	}
}