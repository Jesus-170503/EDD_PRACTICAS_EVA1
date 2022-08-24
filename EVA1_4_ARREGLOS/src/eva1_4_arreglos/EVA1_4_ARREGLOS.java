/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_arreglos;

/**
 *
 * @author jeal
 * 
 * TDA tipo abstracto de dato (objetos y clases)
 * arreglos enjava ------- objetos -------- tda
 * 
 * canelCase 
 * funciones e identificadores ----- empiezan en minusculas
 * funciones ----- identifican una accion ---- verbos
 * clases ----- emoiezan en mayusculas
 */
public class EVA1_4_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Tipo de dato [] identificador = new tipo de dato [tamaño]
        //Arreglo para capturar edades
        // todos los identificadores declarados son arreglos de enteros
        
        int [] arregloEdades, arregloSalario, arregloCali;
       //Solo arregloPromedio es arreglo
        double arregloPromedio[], porcentaje;
        //Los arreglos son objetos
        
        arregloEdades = new int[50];
        
        System.out.println(arregloEdades);
        
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i]= (int)(Math.random() * 100) ;
            
            
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" +  i + "] = " + arregloEdades[i]);
        }
                
    }
    
}
