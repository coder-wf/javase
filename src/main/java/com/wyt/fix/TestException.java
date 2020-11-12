package com.wyt.fix;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
 
public class TestException {
 
    public static void main(String[] args) {
         
        File f= new File("D:/tools/QuidwaySVNClient.exe");
         
        try{
            System.out.println("试图打开 D:/tools/QuidwaySVNClient.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("D:/tools/QuidwaySVNClient.exe不存在");
            e.printStackTrace();
        }
         
    }
}

