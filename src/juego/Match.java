/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.ChooseFighter;
import Interfaces.GGend;
import Interfaces.GUI;
import Interfaces.LastLevel;
import java.io.Serializable;
import static java.lang.Math.abs;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Diego Álvarez
 */
public class Match implements Serializable{
    transient public  ArrayList<Character> army = new ArrayList<>();
    transient public ArrayList<Character> EnemyArmy = new ArrayList<>();
    public ArrayList<Structure> matchStructures = new ArrayList<>();
    transient public ChooseFighter chooseReference;
    transient public GUI GUIreference;
    public int level;
    public LastLevel lastLvlWarn;
    
            
            
    public Match(){
        
    }
    public Match( ChooseFighter chooseReference, int level, ArrayList<Character> army, ArrayList<Character>EnemyArmy, ArrayList<Structure> structures) {
        this.level = level;
        this.chooseReference = chooseReference;
        this.army = army;
        this.EnemyArmy = EnemyArmy;
        this.matchStructures = structures;
    }
    public void SetGUIToElements(){
        for (int i = 0; i<army.size();i++){
            army.get(i).GUIReference=this.GUIreference;
            army.get(i).drawLabel();
        }
        for (int i = 0; i<EnemyArmy.size();i++){
            EnemyArmy.get(i).GUIReference=this.GUIreference;
            EnemyArmy.get(i).drawLabel();
        }
        for (int i = 0; i<matchStructures.size();i++){
            matchStructures.get(i).GUIReference=this.GUIreference;
            matchStructures.get(i).drawLabel();
        }
        chooseReference.GUIreference = this.GUIreference;
    }
    public void startArmy(){
        System.out.println("Cantidad: "+army.size());
        for (int i = 0; i <= army.size(); i++) {
            try{
                army.get(i).start();
                System.out.println(army.get(i).name+" #"+army.get(i).index+" empieza "+army.get(i).GUIReference.LabelArray.get(army.get(i).index).getX());
            }
            catch(Exception e){
            }
        }
        for (int i = 0; i <= EnemyArmy.size(); i++) {
            try{
                EnemyArmy.get(i).start();
                System.out.println(EnemyArmy.get(i).name+" #"+EnemyArmy.get(i).index+" empieza");
            }
            catch(Exception e){
            }
        }
       for (int i = 0; i <= matchStructures.size(); i++) {
            try{
                matchStructures.get(i).start();
                System.out.println(matchStructures.get(i).name+" #"+matchStructures.get(i).index+" empieza");
            }
            catch(Exception e){
            }
        }
    }
    
    public void pauseArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).setPause();
        }
        for (int i = 0; i < EnemyArmy.size(); i++) {
            EnemyArmy.get(i).setPause();
        }
        for (int i = 0; i < matchStructures.size(); i++) {
            matchStructures.get(i).setPause();
        }
    }
    public void easyMode(){
        for (int i = 0; i < EnemyArmy.size(); i++) {
            EnemyArmy.get(i).setPause();
        }
        for (int i = 0; i < matchStructures.size(); i++) {
            matchStructures.get(i).setPause();
        }
    }
    public void stopArmy(){
        for (int i = 0; i < army.size(); i++) {
            army.get(i).stopThread();
        }
        for (int i = 0; i < EnemyArmy.size(); i++) {
             EnemyArmy.get(i).stopThread();
        }
       for (int i = 0; i < matchStructures.size(); i++) {
             matchStructures.get(i).stopThread();
        }
    }
    public ArrayList<Character> explotion(Bomb currentBomb){
        ArrayList<Character> objetiveCharacters = new ArrayList<Character>(); 
        JLabel place = currentBomb.GUIReference.LabelArray.get(currentBomb.index);
            for(int j = 0; j<army.size();j++){
                JLabel current = army.get(j).GUIReference.LabelArray.get(army.get(j).index);
                if(abs((current.getLocation().x - place.getLocation().x)) <= currentBomb.range*50 &&
                   abs((current.getLocation().y - place.getLocation().y)) <= currentBomb.range*50 ){
                    objetiveCharacters.add(army.get(j));
                    System.out.println("Añadido");
                }
            }
            for(int j = 0; j<EnemyArmy.size();j++){
                JLabel current = EnemyArmy.get(j).GUIReference.LabelArray.get(EnemyArmy.get(j).index);
                if(abs((current.getLocation().x - place.getLocation().x)) <= currentBomb.range*50 &&
                   abs((current.getLocation().y - place.getLocation().y)) <= currentBomb.range*50 ){
                    objetiveCharacters.add(EnemyArmy.get(j));
                    System.out.println("Añadido");
                }
            }
            return objetiveCharacters;
    }
    public Character getObjetive(boolean team) {
        boolean validObjetive = true;
        int antiloop = 0;
        if (team){
            while(validObjetive && antiloop < 10000){
                int enemy = (new Random()).nextInt(EnemyArmy.size());
                if (EnemyArmy.get(enemy).HP >= 0){
                    return EnemyArmy.get(enemy);
                }
                antiloop++;
            }
            return null;
        }
        else{
            while(validObjetive && antiloop < 10000){
                int enemy = (new Random()).nextInt(army.size());
                if (army.get(enemy).HP >= 0){
                    return army.get(enemy);
                }
                antiloop++;
            }
        }
        return null;
    }
    public void checkVictory(boolean team){
        System.out.println("Entra");
        lastLvlWarn = new LastLevel(chooseReference);
        ArrayList<Character> checkArmy = new ArrayList<Character>();
        boolean end = true;
        if (team){
            checkArmy = EnemyArmy;        
        }
        else{
            checkArmy = army;
        }
        for(int i = 0; i<checkArmy.size();i++){
            if(checkArmy.get(i).HP > 0){
               end = false;
            }
        }
        if (end){
            stopArmy();
            GUIreference.hideLabels();
            chooseReference.totalEntities = 0;
            GGend guiFinal;
            if(team){
                System.out.println("Ganó");
                GUIreference.setVisible(false);
                String url = "/Interfaces/resources/victory.gif";
                guiFinal = new GGend(url);
                guiFinal.setVisible(true);
                try {
                        sleep(2600);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
                }
                guiFinal.dispose(); 
                GUIreference.dispose(); 
                chooseReference.levelUp();
                if (chooseReference.level > 14){
                        lastLvlWarn.lblNivel.setText(chooseReference.level+"");
                        lastLvlWarn.setVisible(true);
                }
        
                
                else{
                    chooseReference.setVisible(true);
                }
            }   

            else{
                System.out.println("Perdio");
                GUIreference.setVisible(false);
                String url = "/Interfaces/resources/defeat.gif";
                guiFinal = new GGend(url);
                guiFinal.setVisible(true);
                try {
                        sleep(2600);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
                }
                guiFinal.dispose();
                GUIreference.dispose(); 
                //GUIreference.setVisible(false);
                chooseReference.armyDisponible.clear();
                chooseReference.army.clear();
                chooseReference.EnemyArmy.clear();
                chooseReference.matchStructures.clear();
                chooseReference.setVisible(true);
            }
    }
}

}
