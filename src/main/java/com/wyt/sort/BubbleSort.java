package com.wyt.sort;
import java.util.Arrays;

/**
 * @Author wf
 * @Date 2019/9/14 20:46
 * @Description 冒泡排序法
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,9,2,5,6,4,8,3,7};

        BubbleSort.bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
