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
public class Lista {
    private Nodo inicio;

    //por defaul, la lista se debe de encontrar vacia
    public Lista() {
        this.inicio = null;// no hay nodos en la lista 
    }
    
    
   public void imprimir(){
       Nodo temp = inicio;
       while(temp.getSiguiente() != null){
          System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
                 
                
            }
   }
    
    //agregar un nodo al final de la lista
    public void agregar(int valor){
        Nodo nuevoNodo = new Nodo(valor);
        
        
       // verificar si hay nodos en la lista
        if(inicio == null){//no hay nodos en la lista
            inicio = nuevoNodo;
        }else{//hay nodos en la lista
            // hay que movernos por la loista
            // usando un nodo temporal hasta
            // el ultimo nodo de la lista
            
            Nodo temp = inicio;
            
            //como mover a temp
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
                
            }
            temp.setSiguiente(nuevoNodo);
            
        }
        
    }
    
}
