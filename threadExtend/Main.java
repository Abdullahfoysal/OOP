/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threadExtend;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author foysal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtendThread obj=new ExtendThread("new thread");
        ExtendThread2 obj2=new ExtendThread2("two Thread");
        
        obj.start();
        obj2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
    
}
