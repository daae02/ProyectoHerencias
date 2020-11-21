/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.ChooseFighter;
import Interfaces.GUI;
import java.util.ArrayList;
import java.util.Random;

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
        this.EnemyArmy = EnemyArmy;
    }
    public void startArmy(){
        System.out.println("Cantidad: "+army.size());
        for (int i = 0; i <= army.size(); i++) {
            try{
                army.get(i).start();
            }
            catch(Exception e){
            }
        }
        for (int i = 0; i <= EnemyArmy.size(); i++) {
            try{
                EnemyArmy.get(i).start();
            }
            catch(Exception e){
            }
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
    public Character getObjetive(Character current) {
        if (current.good){
            int enemy = (new Random()).nextInt(EnemyArmy.size());
            if (EnemyArmy.get(enemy).HP >= 0){
                return EnemyArmy.get(enemy);
            }
            return null;
        }
        else{
            int enemy = (new Random()).nextInt(army.size());
                if (EnemyArmy.get(enemy).HP >= 0){
                    return army.get(enemy);
                }
                return null;
        }
    }
}
