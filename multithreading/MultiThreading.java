/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author foysal
 */
public class MultiThreading {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int length=5; 
        int[] summation=new int[length];
      
        Multithread obj=new Multithread();
       Extend1 t1=new Extend1();
       Extend2 t2=new Extend2();
       
       Thread s1=new Thread(t1);
       Thread s2=new Thread(t2);
       
       s1.start();
       s2.start();
    

     
            
        try {
            s1.join();
            s2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
       
      for(int i=0;i<length;i++)
       {
           summation[i]=t1.sum1[i]+t2.sum2[i];
           
       }
        
       for(int i=0;i<length;i++)
       {
           
          System.out.println(summation[i]); 
           
       }
      
       
       
        
        
    }
    
}
