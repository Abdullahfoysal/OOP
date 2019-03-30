/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threadExtend;

/**
 *
 * @author foysal
 */
public class ExtendThread2 extends Thread {
    public String name;
    public ExtendThread2(String name){
        this.name=name;
    }
    
    @Override
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println(name);
    }
    
   
}
