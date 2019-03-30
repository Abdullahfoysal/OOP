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
       Thread obj=new Thread();
       int n=100;
       try{
           if(n==1010){
           Exception k=new Exception();
           throw k;
           }
           int nnn=n/0;
       }
       catch(ArithmeticException ex){
           System.out.println(ex);
       }
       catch(Exception ex){
           System.out.println(ex);
           
       }
       finally{
           System.out.println("End of Code");
       }
       
    }
    
}
