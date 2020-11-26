/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import java.awt.Image;
import java.io.Serializable;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Diego Álvarez
 */
abstract public class Character extends Entity implements Serializable{
    public int    HP;
    public boolean good;
    public boolean moving = true;
    public Character() { 
    }
 /*  public Character(String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(GUIReference, Img1, damage, range, unlockLvl, index);
        this.ImgAtk = ImgAtk;
    }*/
    public Character(String name,String Img1,String ImgAtk,int HP, int damage, int spaces, int range, int unlockLvl) {
        super(name,Img1,ImgAtk, damage, spaces, range, unlockLvl);
        this.HP = HP;
    }
    @Override
    public void run(){
        running = true;
        while (running){ 
            try {
                 if(!imDeath()){
                    checkEnemy(); 
                    if(Objetive != null){
                        if (moving)
                            GUIReference.moveLabel(index,Objetive.index);
                        attack();
                    }
                    else{
                        Objetive = GUIReference.currentMatch.getObjetive(good);
                    }
                    sleep(200);
                 }
                 else{
                    die();
                 }
                
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
        System.out.println("Me pasan:"+c.HP);
        this.range = c.range;
        this.Img1 = c.Img1;
        this.ImgAtk = c.ImgAtk;
        this.damage = c.damage;    
    }
    public void stopThread(){
        this.running = false;
    }
    
    public void setPause(){
        this.pause = !this.pause;
    }    
    boolean imDeath(){
        return HP <= 0;
    }
    void die(){
        GUIReference.LabelArray.get(index).setVisible(false);
        GUIReference.LabelArray.get(index).setLocation(1200,1200);
        GUIReference.currentMatch.checkVictory(!good);
        setPause();
    }
    
    public void levelUp(int points){
    }
}
    