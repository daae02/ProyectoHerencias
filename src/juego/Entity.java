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
public class Entity extends Thread{
  GUI GUIReference;
  public JLabel refLabel;
  int index;
  String Img1;
  int    HP;
  int    damage;
  int    spaces;
  int    range;
  int    unlockLvl;
  int    posX;
  int    posY;
  boolean running;
  boolean pause;
    public Entity() {
    }
    public Entity(GUI GUIReference, int index) {
        this.GUIReference = GUIReference;
        this.index = index;
    }
    public Entity(GUI GUIReference, String Img1, int damage, int range, int unlockLvl,int index) {
        this.index = index;
        this.GUIReference = GUIReference;
        refLabel = GUIReference.generateLabel(index);
    }
    public Entity(String name,String Img1, int HP, int damage, int spaces, int range, int unlockLvl, int posX, int posY) {
        this.Img1 = Img1;
        this.HP = HP;
        this.damage = damage;
        this.spaces = spaces;
        this.range = range;
        this.unlockLvl = unlockLvl;
    }
    public Entity(String name,String Img1, int HP, int damage, int spaces, int range, int unlockLvl) {
        this.Img1 = Img1;
        this.HP = HP;
        this.damage = damage;
        this.spaces = spaces;
        this.range = range;
        this.unlockLvl = unlockLvl;
    }    
     public void stopThread(){
        this.running = false;
    }
    
    public void setPause(){
        this.pause = !this.pause;
    }
    
}
