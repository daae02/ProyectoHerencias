/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import java.io.Serializable;
import java.util.Random;
import javax.swing.JLabel;
/**
 *
 * @author Diego Álvarez
 */
public class Character extends Entity implements Serializable{
    public String ImgAtk;
    protected int    HP;
    protected Character Objetive;
    protected int level = 1;
    public Character() { 
    }
    public Character(GUI GUIreference, int index){
        super(GUIreference,index);
        refLabel = GUIReference.generateLabel(index);
                
    }
 /*  public Character(String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(GUIReference, Img1, damage, range, unlockLvl, index);
        this.ImgAtk = ImgAtk;
    }*/
    public Character(String name,String Img1,String ImgAtk,int HP, int damage, int spaces, int range, int unlockLvl) {
        super(name,Img1, HP, damage, spaces, range, unlockLvl);
        this.ImgAtk = ImgAtk;
    }
    @Override
    public void run(){
        System.out.println("Label "+index+" generada "+refLabel.toString());
        running = true;
        while (running){ 
            try {
                    GUIReference.currentMatch.getObjetive();
                    GUIReference.moveLabel(index,range,Objetive.index); 
                    sleep(100);
                
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
    public void copy(Character c){
        this.name = c.name;
        this.HP = c.HP;
        
    }
    public void drawLabel(){
        System.out.println("Nombre: "+name);
        refLabel = GUIReference.generateLabel(index);
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
    void nextLevel(){
        level++;
        HP += new Random().nextInt(level);
        damage += new Random().nextInt(level);
    }
}
    