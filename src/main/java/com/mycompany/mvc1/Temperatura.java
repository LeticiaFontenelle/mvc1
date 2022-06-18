/*
 * Base Exerc-Prof.Ramon C.
 */
package com.mycompany.mvc1;
/**
 *
 * @lf
 */
public class Temperatura {
    
    private double t =10;
    
    public void aumentar(){
        if(t<100){
            t++;
        }
    }
    public void diminuir(){
        if(t>0){
            t--; 
        }
    }    
    
    public double getT(){
        return t; 
    }
    
}
