/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;
import javax.swing.JLabel;

/**
 *
 * @author Diego Álvarez
 */
public class Entity extends Thread{
  Match matchReference;
  private JLabel refLabel;
  String Img1;
  int    damage;
  int    range;
  int    unlockLvl;
  int    posX;
  int    posY;

    public Entity() {
    }
    public Entity(Match matchReference, JLabel refLabel, String Img1, int damage, int range, int unlockLvl, int posX, int posY) {
        this.matchReference = matchReference;
        this.refLabel = refLabel;
        this.Img1 = Img1;
        this.damage = damage;
        this.range = range;
        this.unlockLvl = unlockLvl;
        this.posX = posX;
        this.posY = posY;
    }
 
}
