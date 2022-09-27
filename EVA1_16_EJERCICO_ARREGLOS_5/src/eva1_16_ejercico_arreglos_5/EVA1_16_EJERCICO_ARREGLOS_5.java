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
                System.out.print("[" + arregloPares[i] + "]");
            }
           System.out.println("");

         
        int cont = 0; 
        for ( int i = 0; i < arregloPares.length; i++) {
        if (arregloPares[i]%2==0) {
            cont++;
            }
        }
        
        System.out.println("Imprimimos la copia con el numero de arreglos");
        
        int [] arregloGuardar = new int [cont]; // hacemos una arreglo con la cantidad de pares de el otro arreglo, para asi poder hacer la copia
        
        int ini =0;
        for (int i = 0; i < arregloPares.length; i++) {
           if(arregloPares[i]%2==0){
               arregloGuardar[ini]= arregloPares[i];
               System.out.print("[" + arregloGuardar[ini] + "]");
               ini++;
           }
           
        }
        
    }
}
