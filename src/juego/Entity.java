/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Diego Álvarez
 */
public class Entity extends Thread{
  String name;
  String Img1;
  int    HP;
  int    damage;
  int    spaces;
  int    range;
  int    unlockLvl;
  int    posX;
  int    posY;

    public Entity() {
    }
    public Entity(String name,String Img1, int HP, int damage, int spaces, int range, int unlockLvl, int posX, int posY) {
        this.name = name;
        this.Img1 = Img1;
        this.HP = HP;
        this.damage = damage;
        this.spaces = spaces;
        this.range = range;
        this.unlockLvl = unlockLvl;
        this.posX = posX;
        this.posY = posY;
    }

    public Entity(String name) {
        this.name = name;
    }



  
}
