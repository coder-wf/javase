package com.wyt.file;

import java.io.File;

/**
 * @author wf
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("E:/paul/chris");
        if(!file.exists()){
            //file.mkdir(); 直接执行此方法时，无法生成文件，当父文件paul存在时，执行此方法才会生成chris文件
            file.mkdirs();//执行此方法时，会生成所有文件
        }
    }

}
