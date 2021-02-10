/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.uf2;

import java.util.Arrays;

/**
 *
 * @author alumne
 */
public class Exercici8 {
    
    public static void main(String[] args) {
        
        
       System.out.println(Arrays.toString(vectorDigits(0)));
       System.out.println(Arrays.toString(vectorDigits(12345)));
       System.out.println(Arrays.toString(vectorDigits(-12350)));
       System.out.println(Arrays.toString(vectorDigits(9)));
       System.out.println(Arrays.toString(vectorDigits(-8)));
       
       
    }
    
    public static int[] vectorDigits(int num){ //retorna un vector d'enters
        //Declaració de variables
        boolean negatiu = num<0; //Apuntem si el paràmetre és negatiu 
        int[] resultat=null;     //Vector on guardarem els dígits del paràmetre
        int index;               //Índex per recórrer el vector
        // if (num<0) negatiu=true
        // else negatiu=false;
        //negatiu=num<0?true:false;
        
        //Si el paràmetre és negatiu el passem a positiu
        if(negatiu) num*=-1;
        
        //Instanciem el vector utilitzant la llargada del paràmetre, però convertit a String
        String longitud=num+""; //Equivalent a Integer.toString(num)
        resultat=new int[longitud.length()];
        index=resultat.length-1; //Situem l'índex a la casella de més a la deta del vector.
        
        while(index>=0){  //while(num!=0)
            
            resultat[index]=num%10;//vull un número entre 0 i 9. Doncs poso el 10.
            index--;
            num/=10;
        }
        
        //Si el paràmetre és negatiu passem la primera casella del vector a negatiu
        if(negatiu) resultat[0]*=-1;
        
        return resultat;
    } 

    
}
Hi, I'm adding new lines to the project from the GitHub's editor.
