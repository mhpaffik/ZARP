/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bzarp;

/**
 *
 * @author Максим
 */
public class Kruh {
        private double r;
       
        public double dejObvod()
        {
            return 2 * Math.PI * r;
        }
        
        public double dejObsah()
        {
            return Math.PI * r * r;
        }
        
        public Kruh(double r) 
        { 
            this.r = r;
        }

    @Override
    public String toString() {
        return "Obvod kruhu je: " + dejObvod() + " A obsah je: " + dejObsah();
    }

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kruh kruh1 = new Kruh(25);    
        System.out.println(kruh1.toString());
    }
    
}
