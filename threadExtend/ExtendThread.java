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
public class ExtendThread extends Thread{
    public String name;
   public ExtendThread(String name){
        this.name=name;
    }
    
    @Override
    public void run(){
        
        for(int i=0;i<5;i++){
            try {
                System.out.println(name);
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(ExtendThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
