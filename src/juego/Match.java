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
public class Match {
    ArrayList<Character> army;
    GUI GUIreference;
    public Match(GUI GUIreference) {
        this.GUIreference = GUIreference;
        army = new ArrayList<Character>();
    }
    public void generateArmy(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            army.add(new Character());
        }
    }
}
