/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_ejercico_arreglos_5;

/**
 *
 * @author moviles
 */
public class EVA1_16_EJERCICO_ARREGLOS_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int [] arregloPares = new int[50];  
        int [] arregloGuardar = new int[50];  
        
        for (int i = 0; i < arregloPares.length; i++) {
            arregloPares[i]=((int) (Math.random()*100) +1);
                System.out.print(arregloPares[i] + " ");
            }
           System.out.println("");
        for (int i = 0; i < arregloPares.length; i++) {
        if (arregloPares[i]%2==0) {
        System.out.print(arregloPares[i] + " ");
            }
        }
        
        
        
        System.out.println("");
        for (int i = 0; i < arregloPares.length; i++) {
            arregloPares[i]=((int) (Math.random()*100) +1);
            
                 if (arregloPares[i]%2==0) {
        System.out.print(arregloPares[i] + " ");
            }
        
        
     
        }
        }
}
        
    

