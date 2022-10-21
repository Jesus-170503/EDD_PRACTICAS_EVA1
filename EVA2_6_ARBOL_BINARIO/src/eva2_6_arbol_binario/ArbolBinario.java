/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbol_binario;

/**
 *
 * @author moviles
 */
public class ArbolBinario {
    
    private Nodo root;

    public ArbolBinario() {
        this.root = null;
    }
    // metodo publico para el usuario
    public void agregar(int valor){
        agregarRecur(valor, root);
    }
    
    //Merodo recursivo agregar
    //neesita el valir y el nodo actual
    private void agregarRecur(int valor, Nodo nodoActual){
        // 1 primero null
        //  2 se compara el valor
        // y asi sucesivamente se repite
        
        
    }
    
    
}
