/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import Interfaces.GUI;
import java.awt.Image;
import java.io.Serializable;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Diego Álvarez
 */
abstract public class Entity extends Thread implements Serializable{
  public String name;
  public transient GUI GUIReference;
  public JLabel refLabel;
  public int index;
  String Img1;
  protected Character Objetive;
  public String ImgAtk;
  public int    damage;
  public int    spaces;
  public int    range;
  public int    unlockLvl;
  boolean running;
  public boolean pause = false;
    public Entity() {
    }
    public Entity(GUI GUIReference, int index) {
        this.GUIReference = GUIReference;
        this.index = index;
    }
    /*public Entity(GUI GUIReference, String Img1, int damage, int range, int unlockLvl,int index) {
        this.index = index;
        this.GUIReference = GUIReference;
        refLabel = GUIReference.generateLabel(index);
    }
    public Entity(String name,String Img1, int HP, int damage, int spaces, int range, int unlockLvl, int posX, int posY) {
        this.name = name;
        this.Img1 = Img1;
        this.HP = HP;
        this.damage = damage;
        this.spaces = spaces;
        this.range = range;
        this.unlockLvl = unlockLvl;
    }*/
    public Entity(String name,String Img1,String ImgAtk ,int damage, int spaces, int range, int unlockLvl) {
        this.name = name;
        this.Img1 = Img1;
        this.ImgAtk = ImgAtk;
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
    void checkEnemy(){
        if(Objetive != null && Objetive.HP <= 0){
            Objetive = null;
        }
    }
    void animation() throws InterruptedException{
    } 
    void die(){
    }
    void attack() throws InterruptedException{
    }
    public void levelUp(){
    }
    public void drawLabel(){
    }
    public void copy(Character c){
    }
}
