/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import java.util.ArrayList;

/**
 *
 * @author Diego Álvarez
 */
public class Match {
    ArrayList<Character> army;
    ArrayList<Character> Enemyarmy;
    GUI GUIreference;
    
    public Match(){
        
    }
    public Match(GUI GUIreference) {
        this.GUIreference = GUIreference;
        army = new ArrayList<Character>();
        Enemyarmy = new ArrayList<Character>();
    }
    public void startArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).start();
            Enemyarmy.get(i).start();
        }
    }
    
    public void pauseArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).setPause();
            Enemyarmy.get(i).setPause();
        }
    }
    
    public void stopArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).stopThread();
            Enemyarmy.get(i).stopThread();
        }
    } 
}
