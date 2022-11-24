/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_ordenamientos;

/**
 *
 * @author moviles
 */
public class EVA3_1_ORDENAMIENTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arregloDatos = new int[15];
        int [] arregloSel = new int [arregloDatos.length];
         int [] arregloins = new int [arregloDatos.length];
          int [] arregloQ = new int [arregloDatos.length];
          
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
        
        //*****************************************************
        System.out.println("insertion Sort");
        copiar(arregloDatos, arregloins);
        imprimir(arregloins);
        ini = System.nanoTime();
        selectionSort(arregloins);
        fin = System.nanoTime();
        imprimir(arregloins);
        System.out.println("insertion sort = " + (fin - ini));
        
        //+++++++++++++++++++++++++++++++++++++++++++
        
        System.out.println("quick sort");
        copiar(arregloDatos, arregloQ);
        imprimir(arregloQ);
        ini = System.nanoTime();
        quickSort(arregloQ);
        fin = System.nanoTime();
        imprimir(arregloQ);
        System.out.println("Quick sort = " + (fin - ini));
        
        
        
    }
    //LLenar arreglo
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
     
    //Sekection sort O(n^2)
    //Comparaciones 
    //Intercambios (Swap)
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
    
    
    public static void insertionSort(int [] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            int temp = arreglo[i]; // es lo que se va a trasladar hacia donde correponde 
            int insP = i;
            //BUSCAMOS EN QUE POSICIO DEBE DE QUEDAR TEMP
            // ESA POSICION QUEDA ALMACENADA EN insP
            for (int prev = i -1; prev >= 0; prev--) {//Comparar
                if(arreglo[prev] > temp){
                    //Swap (intercambio parcial)
                    arreglo[insP] = arreglo[prev];
                    insP--;
                    
                }else{
                    break;
                }
                
                
            }
            arreglo[insP] = temp;
            
        }
    }
    
    //BUBBLE SORT NO LO VAMOS A PEOGRAMAR
    
    // QUICKSORT PUBLICO
    public static void quickSort(int [] arreglo){
        quickSortRec(arreglo, 0, arreglo.length-1);
    }
    private static void quickSortRec(int[] arreglo, int ini, int fin){
        //pivote --> posicion 
        //dos indices:
        //ind_grad --> busca los mayores al pivote
        //ind_peq --> busca los menores al pivote
        //si se encuentran valores, se intercambian
        //si se cruzan, se intercambian pivote con ind_peq
        //quicksort a cada lado del pivote
            int pivote, big, small, temp;  //Temp es para hacer swap
            pivote = ini;
            big = ini;
            small = fin;
            
            //if(ini<fin){
            
            while(big < small){// los indices se cruzaron
            
            
            // mover los indices 
            while(arreglo[big] <= arreglo[pivote] && big < small){ //Buscar los elementos mas grandes que el pivote
               big++;
            }
            while(arreglo[small] > arreglo[pivote]){ //Buscar los elementos mas pequeños que el pivote
               small--;
            }
            
            //verificamos que no hayan cruzados, si hay intercambiamos
            if(big<small){
                temp = arreglo[big];
                arreglo[big] = arreglo[small];
                arreglo[small]= temp;
                
            }
            }
            
            //swap pivote con small
               temp = arreglo[pivote];
                arreglo[pivote] = arreglo[small];
                arreglo[small]= temp;
                pivote = small;
                
                  
    //Llamada recursiva 
    if(ini<pivote){
    quickSortRec(arreglo, ini, pivote -1 );
    }
    if(fin>pivote){
    quickSortRec(arreglo, pivote +1, fin);
    //}
    }   
    }
  
    
    
}
