package com.wyt.socket;
 
import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class TestSocket1 {
 
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip =host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
    }
}