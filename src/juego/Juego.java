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
    ArrayList<Character> army;
    /**
     * @param args the command line arguments
     */
    public Juego() {
        army = new ArrayList<Character>();
    }
    public void generateArmy(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            army.add(new Character());
        }
    }
    public static void main(String[] args) {
        } 
 }
