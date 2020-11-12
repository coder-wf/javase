package com.wyt.swing;
  
import java.awt.Dimension;
import java.awt.FlowLayout;
  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
  
public class TestGUI14 {
    public static void main(String[] args) {
  
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
  
        f.setLayout(new FlowLayout());
  
        JProgressBar pb = new JProgressBar();
  
        pb.setMaximum(100);
        pb.setValue(0);
        pb.setStringPainted(true);
         
        new Thread(){
            public void run(){
                int sleep = 100;
                for (int i = 0; i < 100; i++) {
                    pb.setValue(i+1);
                    try {
                         
                        Thread.sleep(sleep+ i*10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }.start();
         
        f.add(pb);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}