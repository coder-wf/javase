package com.wyt.swing;
   
import java.io.File;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
   
public class TestGUI10 {
    public static void main(String[] args) {
   
        JFrame f = new JFrame("LoL");
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
   
        f.setLayout(null);
         
        File folder = new File("d:/project/j2se");
        File[] fs=folder.listFiles();
        JTabbedPane tp = new JTabbedPane();
        ImageIcon icon = new ImageIcon("e:/project/j2se/j.png");
        for (int i = 0; i < fs.length; i++) {
            JavaFilePane jfp =new JavaFilePane(fs[i]);
            tp.add(jfp);
            tp.setIconAt(i,icon );
            tp.setTitleAt(i, shortName(fs[i].getName()));
        }
 
        f.setContentPane(tp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
 
    private static String shortName(String name) {
        int length = 6;
        if(name.length()>length){
            return name.substring(0,length) + "...";
        }
        return name;
         
    }
}