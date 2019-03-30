/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author foysal
 */
public class Extend1 extends Multithread implements Runnable{
    
    
    

    
    @Override
    public void run() {
        for(int i=0;i<length;i++)
        {
            //System.out.println("One");
           
            sum1[i]=ara1[i];
            //System.out.println(sum1[i]);
//           try {
//                Thread.sleep(1);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Extend1.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
