/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

/**
 *
 * @author moviles
 */
public class EVA2_1_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista miLista = new Lista();
        //int [] arreglo = new int [1000000];
        
        for (int i = 0; i < 1000000; i++) {
            miLista.agregar(1000);
        }
        System.out.println("conteo de nodos" +  miLista.tamaLista());
        
        
        /*miLista.agregar(10);
        miLista.agregar(20);
        miLista.agregar(30);
        miLista.agregar(40);
        miLista.agregar(50);
        miLista.agregar(60);
        
        miLista.imprimir();*/
        
    }
    
}