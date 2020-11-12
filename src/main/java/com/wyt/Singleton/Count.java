package com.wyt.Singleton;

import java.util.HashMap;

public class Count {

	private int serialNumber;
	static int counter = 0;

	public Count() {
		counter++;
		serialNumber = counter;
	}

	public int getserialNumber() {
		return serialNumber;
	}
	
	
	
	

}
