/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaeva1_12_copia_objetos;

/**
 *
 * @author moviles
 */
public class EvaEVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int valor1, copiaValor;
        
        valor1=100;
        copiaValor=valor1;
        System.out.println("Valor = " + valor1);
        System.out.println("Copia =" + copiaValor);
        valor1++;
        System.out.println("Valor = " + valor1);
        System.out.println("Copia =" + copiaValor);
        //Ahora con objetos
        PruebaValor prueba = new PruebaValor();
        prueba.x=1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia=prueba;
        System.out.println("Ahora con objeto");
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia "   + pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba " + prueba.x);
        System.out.println("Prueba copia " + pruebaCopia.x);
        
    }
    
}
class PruebaValor{
    int x;
}