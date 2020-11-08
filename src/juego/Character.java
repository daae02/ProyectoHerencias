/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import javax.swing.JLabel;

/**
 *
 * @author Diego Álvarez
 */
public class Character extends Entity {
    String ImgAtk;
    int    HP;
    int    spaces;
    Character Objetive;

    public Character() {
    }
    public Character(GUI GUIreference, int index){
        super(GUIreference,index);
        refLabel = GUIReference.generateLabel(index);
                
    }
    public Character(String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(GUIReference, Img1, damage, range, unlockLvl, index);
        this.ImgAtk = ImgAtk;
    }


    @Override
    public void run(){
        int repeticiones = 100;
        running = true;
        while (running){ 
            try {
                if (repeticiones == 0) break;
                    sleep(1000);
                    GUIReference.moveLabel(index);
                    refLabel.setText("#" + this.index);         
                    repeticiones--;
                
            } 
            catch (InterruptedException ex) {
                
            }
            
            while(pause){
                try {
                    sleep(100);
                } 
                catch (InterruptedException ex) {
                    
                }
            }
            
        }
     }
       public void stopThread(){
        this.running = false;
    }
    
    public void setPause(){
        this.pause = !this.pause;
    }
    void attack(int damage, Character Objetive){
        Objetive.HP -= damage; 
    }
}
