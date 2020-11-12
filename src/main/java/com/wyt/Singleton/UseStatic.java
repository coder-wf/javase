package com.wyt.Singleton;

import java.util.HashMap;
import java.util.Hashtable;

public class UseStatic {
	public static void main(String[] args) {
		//System.out.println("1");
		System.out.println("Count.counter is"+Count.counter);
		Count Tom = new Count();
		Count John = new Count();
		System.out.println(Tom.getserialNumber());
		System.out.println(John.getserialNumber());
		System.out.println("NOW Count.counter is"+Count.counter);
		
		
		HashMap map = new HashMap();
		
		map.put("wf", 666);
		map.put("wf", 777);
		
		Hashtable table = new Hashtable<>();
		
		
		System.out.println(map.get("wf"));
	}
}
