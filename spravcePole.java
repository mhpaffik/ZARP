/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bzarp;

/**
 *
 * @author Максим
 */
public class spravcePole {
        public int [] pole;
        
        public spravcePole (int delka)
        {
            pole = new int[delka];
            for(int i = 0; i < delka; i++)
            {
                pole[i] = (int)(Math.random() * 100);
            }
           
        }
        
        public int max()
        {
          int max = 0;
            for (int i = 0; i < pole.length; i++) {
                if (pole[i] > max) {
                    max = pole[i];
                 }
            }
             return max;   
        }
        
        public int min ()
        {
           int min = 10;
            for(int i = 0; i< pole.length; i++)
            {
                if(pole[i] < min)
                {
                    min = pole[i];
                 }
            }
            return min;  
        }
        
        public int suma()
        {
             int suma = 0;
         for(int i = 0; i<pole.length; i++)
         {
             suma += pole[i];
         }
         return suma;
        }
        
        public double prumer()
        {
             double prum = (double)suma() /(double)pole.length;
          return prum;
        }

    @Override
    public String toString() {
        String vypis;
        vypis = "[";
        for(int i = 0; i<pole.length; i++)
         {
             vypis += String.valueOf(pole[i]);
             if(i< pole.length - 1)
             {
             vypis += ", ";
             }
         }
        vypis += "]";
        return vypis;
    }
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        spravcePole pole1 = new spravcePole(10);
        spravcePole pole2 = new spravcePole(20);
        System.out.println(pole1.toString());
        System.out.println(pole2.toString());
        System.out.println("Nejvetsi cislo je: " + pole2.max());
        System.out.println("Nejmensi cislo je: " + pole2.min());
        System.out.println("Suma je: " + pole2.suma());
        System.out.println("Prumer je: " + pole2.prumer());
        
    }
    
}
