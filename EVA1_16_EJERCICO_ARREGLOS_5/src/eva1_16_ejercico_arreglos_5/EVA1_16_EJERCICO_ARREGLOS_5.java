/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_ejemplo_arreglos;

/**
 *
 * @author 3PY37LA_RS6
 */
public class EVA1_16_EJERCICO_ARREGLOS_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int [] arregloPares = new int[50];  
      
        
        for ( int i = 0; i < arregloPares.length; i++) {
            arregloPares[i]=((int) (Math.random()*100) +1);
                System.out.print(arregloPares[i] + " ");
            }
           System.out.println("");
           
        int [] arregloGuardar = new int[arregloPares.length]; // se hace una copia de simplemente las posiciones mas no de los valores como tal
             
        for ( int i = 0; i < arregloPares.length; i++) {
        if (arregloPares[i]%2==0) {
            arregloGuardar[i] =arregloPares[i];
        System.out.print(arregloGuardar[i] + " ");
            }
        }
        
    }
}
