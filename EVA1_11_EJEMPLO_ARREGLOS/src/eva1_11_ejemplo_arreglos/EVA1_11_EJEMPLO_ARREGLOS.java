/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author 3PY37LA_RS6
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

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
           
        
        for ( int i = 0; i < grupos.length; i++) {
            System.out.println("Numero de alumnos del grupo: " + (i+1));
            int iEstu = input.nextInt();
            grupos[i] = new int[iEstu];
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.println("ingrese la calificacion numero: " + (j+1));
                grupos[i][j]= input.nextInt();
            }
        }
        
        for ( int i = 0; i < grupos.length; i++) {
             System.out.println("Las calificaciones de grupo numero " + (i+1) + " son:");
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.print("[" + grupos[i][j] + "]" );
            }
            System.out.println("");
        }
        
       /* for ( int i = 0; i < grupos.length; i++) {
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.println("ingrese la calificacion numero: " + (j+1));
                grupos[i][j]= input.nextInt();
            }
        }
        
        for ( int i = 0; i < grupos.length; i++) {
             System.out.println("Las calificaciones de grupo numero " + (i+1) + " son:");
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.print("[" + grupos[i][j] + "]" );
            }
            System.out.println("");
        }*/
        
    }
    
}
