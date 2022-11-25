/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_comparator;

import java.util.Comparator;
import java.util.LinkedList;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author moviles
 */
public class EVA_2_COMPARATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <Integer> miLista = new <Integer>LinkedList();
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        miLista.add((int)(Math.random() * 100));
        System.out.println(miLista);
        
        //ORDENAR --> COMPARATOR
        //COMPARATOR ES UNA INTERFAS
        
        Comparator ordenar = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer)o1;
                Integer val2 = (Integer)o2;
 
               return val1 - val2;
            }
        };
        
        miLista.sort(ordenar);
        System.out.println(miLista);
        
        LinkedList<Persona> listaPersonas = new <Integer>LinkedList();
        listaPersonas.add(new Persona("Juan", "Perez", "Jolote", 50,100.0));
        listaPersonas.add(new Persona("Carlos", "Martinez", "Jacquez", 30,200.0));
        listaPersonas.add(new Persona("Pepe", "Marcos", "Nirvana", 15,300.0));
        listaPersonas.add(new Persona("Camilo", "Mendez", "Narvaez", 20,400.0));
        
        //APPELLIDO PATERNO
        //SALARIO
        
         Comparator ordenar2 = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Integer val1 = (Integer)o1;
                Integer val2 = (Integer)o2;
                
                if(val1>val2){
                    
                }
                return val2;
                
                
            }
           
        };
         
         
         
         
         
         
        
    }
    
  
}
  class Persona{
        private String nombre;
        private String paterno;
        private String materno;
        private int edad;
        private double salario;

        public Persona(String nombre, String paterno, String materno, int edad, double salario) {
            this.nombre = nombre;
            this.paterno = paterno;
            this.materno = materno;
            this.edad = edad;
            this.salario = salario;
        }
        
        
        
        
        
        
        
    }
    