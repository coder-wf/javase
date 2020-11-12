package com.wyt.Singleton;

public class BubbleSort {
	
	public static void Sort(int[] arr){
		int num;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++ ){
				if(arr[j]>arr[j+1]){
					num = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]=num;
				}
			}
		}
	}
	
}
