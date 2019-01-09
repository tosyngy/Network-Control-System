/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.net.*;
import java.util.*;
/**
 *
 * @author Oginni
 */
public class GetIP {
   
    public static void main(String[] args) {
        try {
           
            myIPs();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public String getIP(){
        InetAddress ownIP=null;
        try {
          ownIP= InetAddress.getLocalHost();
            System.out.println("address "+ ownIP.getHostAddress());
       
        } catch (Exception e) {
        }
       return ownIP.getHostAddress();
    }
    
    
    
    public String getSystemName(){
        InetAddress ownIP=null;
        try {
          ownIP= InetAddress.getLocalHost();
            System.out.println("address "+ ownIP.getHostName());
       
        } catch (Exception e) {
        }
       return ownIP.getHostName();
    }
    
    
    
    public String getSystemNUsername(){
      return System.getProperty("user.name");
    }
    
    
   static Vector<String> myIPs(){
        Vector<String> val= new Vector<>();
        try {
              Enumeration e= NetworkInterface.getNetworkInterfaces();
              while (e.hasMoreElements()) {
                  NetworkInterface n= (NetworkInterface) e.nextElement();
                  Enumeration ee=n.getInetAddresses();
                  while (ee.hasMoreElements()) {
                     InetAddress i= (InetAddress) ee.nextElement();
                     if(i.getHostAddress().contains(".")){
                     val.addElement(i.getHostAddress());
                      System.out.println(i.getHostName() +"   "+i.getHostAddress());
                     }
                     
                  }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
  return val;
   }
   
   
   static Vector<String> myHostNames(){
        Vector<String> val= new Vector<>();
        try {
              Enumeration e= NetworkInterface.getNetworkInterfaces();
              while (e.hasMoreElements()) {
                  NetworkInterface n= (NetworkInterface) e.nextElement();
                  Enumeration ee=n.getInetAddresses();
                  while (ee.hasMoreElements()) {
                     InetAddress i= (InetAddress) ee.nextElement();
                     if(i.getHostName().contains("-")){
                     val.addElement(i.getHostName());
                      System.out.println(i.getHostName() +"   "+i.getHostAddress());
                     }
                     
                  }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
  return val;
   }
    
   
   public String getServerIp(){
        String ownIP=null;
       for(int i=0; i<myHostNames().size(); i++){
       if(!myHostNames().elementAt(i).equalsIgnoreCase(getSystemName())){
       ownIP=myIPs().elementAt(i);
       break;
       }
       }
       return ownIP;
    } 
   
   public String getRealIp(){
        String ownIP=null;
       for(int i=0; i<myHostNames().size(); i++){
       if(myHostNames().elementAt(i).equalsIgnoreCase(getSystemName())){
       ownIP=myIPs().elementAt(i);
       break;
       }
       }
       return ownIP;
    } 
   
}
