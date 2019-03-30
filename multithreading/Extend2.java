/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import static java.lang.Double.sum;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author foysal
 */
public class Extend2 extends Multithread implements Runnable {

  
    @Override
    public void run(){
        for(int i=0;i<length;i++){
            //System.out.println("Two");
            sum2[i]+=ara2[i];
            //System.out.println(sum1[i]);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Extend2.class.getName()).log(Level.SEVERE, null, ex);
//        }
        }
         
    }
    
}
