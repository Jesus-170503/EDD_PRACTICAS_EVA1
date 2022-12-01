/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_3_busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA3_3_BUSQUEDA_BINARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int [] arregloDatos = new int[8];
        int [] arregloSel = new int [arregloDatos.length];
        
        System.out.println("Arreglo Original");
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        System.out.println("Selection Sort");
        copiar(arregloDatos, arregloSel);
        imprimir(arregloSel);
        double ini = System.nanoTime();
        selectionSort(arregloSel);
        double fin = System.nanoTime();
        imprimir(arregloSel);
        System.out.println("Selection sort = " + (fin - ini));
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca elvalor a buscar: ");
        int buscar = input.nextInt();
        System.out.println("");
        System.out.println("El valor esta en " + busquedaBinaria(arregloSel, buscar));
        
    }
    
    public static void selectionSort(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            int min = i;
            //Busco el elemento (Posicion) Mas pequeño
            for (int j = i+1; j < arreglo.length; j++) {
               //buscar el minimoç
                if(arreglo[min] > arreglo[j])
                    min = j;
            }
            //Swap 
            if(min !=i){
                int temp = arreglo[i];
                arreglo[i] = arreglo[min];
                arreglo[min] = temp;
                
            }
        }
    } 
    
    

    
    public static void llenar(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
    }
    //Imprimir arreglo
     public static void imprimir(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] < 10)
            System.out.print("[" + arreglo[i] + "]" );
            else
            System.out.print("[" + arreglo[i] + "]" );
        }
         System.out.println("");
    }
    //Copiar arreglo
     public static void copiar(int[] arreglo, int [] copia) {
         for (int i = 0; i < arreglo.length; i++) {
             copia[i] = arreglo[i];
         }
         
         
    }
     
     //Busqueda binaria
    public static int busquedaBinaria(int [] datos, int valor){
        return busquedaBinariaRecu(datos, 0, datos.length-1, valor);
    }
    
    private static int busquedaBinariaRecu(int [] datos, int ini, int fin, int valor){
        int mitad = ini + ((fin-ini)/2);
        int resu = -1;
        
        if(ini < fin){//aqui hacemos la busqueda binaria recursiva
            if(valor == datos [mitad]){// lo encontramos 
                resu = mitad;
                 
            }else if(valor<datos[mitad]){//menor, estara a la izquierda
                   resu =  busquedaBinariaRecu(datos, 0, mitad -1, valor);
           }else{//Mayor, estara a la derecha
                resu = busquedaBinariaRecu(datos, mitad +1, fin, valor);
            }
            
        }
        
        return resu;
    }
    
    
}
