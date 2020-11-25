/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;

/**
 *
 * @author Diego Álvarez
 */
public class ContactFighter extends Character {
    String sound = "";
/*
    public ContactFighter(String sound, String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(ImgAtk, HP, spaces, GUIReference, Img1, damage, range, unlockLvl, index);
        this.sound = sound;
    }*/
    public ContactFighter(String name,String Img1,String ImgAtk,int HP, int damage, int spaces, int range, int unlockLvl) {
        super(name, Img1,ImgAtk, HP, damage, spaces, range, unlockLvl);
    }

    public ContactFighter() {
    }
    @Override
    public void levelUp(int points){
        damage += damage *(points/100);
        HP += HP *(points/40);
    }
}
