/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_22_fibonacci;

import java.util.Scanner;

/**
 *
 * @author moviles
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
       // int serie = input.nextInt();
 
       /* for (int i = 1; i <= serie; i++) {
            System.out.print(fibonacci(i) + " ");
        }*/
           System.out.print(fibonacci(5) + " ");
        
    }
    
    public static int fibonacci (int n){
         if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    
    }
    
    
    
    
}
