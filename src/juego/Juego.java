/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.ArrayList;

/**
 *
 * @author Diego Álvarez
 */
public class Juego {
    ArrayList<Entity>Ejercito = new ArrayList<Character>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<10;i++){  
            Ejercito.add(i,new Character(i+""));
        } 
    }
    
}
