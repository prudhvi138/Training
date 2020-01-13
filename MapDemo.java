package com.cts;
import java.util.*;
import java.util.Map.Entry;



class MapDemo { 
    public static void main(String args[]) 
    { 
        
        HashMap<String, Integer> map = new  HashMap<String ,Integer>(); 
      map.put("java", 8000);
      map.put("c", 3000);
      map.put("python", 9000);
      map.put("angular", 14000);
      map.put("java", 6000);
      
       /* System.out.println(map); 
        System.out.println(map.get("java")); 
        System.out.println(map.containsKey("c")); 
       System.out.println(map.containsValue(14000)); 
       map.replace("c", 3000, 5000);
        System.out.println(map); */
       Set<Entry<String, Integer>> entries=map.entrySet();
        for(Map.Entry<String, Integer> entry :map.entrySet())
        {
        	System.out.println(entry.getKey()+"------------>"+entry.getValue());
        }
        for(Map.Entry<String, Integer> entry :entries)
        {
        	System.out.println(entry.getKey()+"============>"+entry.getValue());
        }
    } 
} 