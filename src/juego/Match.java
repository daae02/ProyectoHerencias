/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.ChooseFighter;
import Interfaces.GUI;
import java.util.ArrayList;

/**
 *
 * @author Diego Álvarez
 */
public class Match {
    public ArrayList<Character> army = new ArrayList<>();
    ArrayList<Character> EnemyArmy = new ArrayList<>();
    ChooseFighter chooseReference;
    GUI GUIreference;
    int level;
    
            
            
    public Match(){
        
    }
    public Match( ChooseFighter chooseReference, int level, ArrayList<Character> army, ArrayList<Character> EnemyArmy) {
        this.level = level;
        this.chooseReference = chooseReference;
        this.GUIreference = GUIreference;
        this.army = army;
    }
    public void startArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).start();
            EnemyArmy.get(i).start();
        }
    }
    
    public void pauseArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).setPause();
            EnemyArmy.get(i).setPause();
        }
    }
    
    public void stopArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).stopThread();
            EnemyArmy.get(i).stopThread();
        }
    } 
}
