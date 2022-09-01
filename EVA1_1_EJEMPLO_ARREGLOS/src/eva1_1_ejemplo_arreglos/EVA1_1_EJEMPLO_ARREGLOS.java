/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_ejemplo_arreglos;

import java.util.Scanner;



/**
 *
 * @author moviles
 */
public class EVA1_1_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Numero de grupos");
        int x = input.nextInt();
        //System.out.println("Numero de alumnos");
        //int y = input.nextInt();
        int[][] grupos=new int[x][];
        
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("Numero de alumnos");
            int iEstu = input.nextInt();
            grupos[i] = new int[iEstu];
            for (int j = 0; j < grupos[i].length; j++) {
                grupos[i][j]= input.nextInt();
                
            }
        }
        for (int i = 0; i < grupos.length; i++) {
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.println("[" + grupos[i][j] + "]" );
            }
            System.out.println("");
        }
        
        
        /*int arregloCali[][];
        
        arregloCali = new int[5][];*/
        
        
        
        
        
        
    }
    
    
    
    
}
