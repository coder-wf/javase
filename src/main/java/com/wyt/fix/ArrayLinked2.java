package com.wyt.fix;
  
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
  
public class ArrayLinked2 {
    public static void main(String[] args) {
        List<Integer> l;
        l = new ArrayList<>();
        insertFirst(l, "ArrayList");
  
        l = new LinkedList<>();
        insertFirst(l, "LinkedList");
  
    }
  
    private static void insertFirst(List<Integer> l, String type) {
        int total = 1000 * 100;
        final int number = 5;
        long start = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            //直接add就表示插入在最后
            l.add(number);
        }
        long end = System.currentTimeMillis();
        System.out.printf("在%s 最后面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, end - start);
    }
  
}