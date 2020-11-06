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
public class Character extends Entity {
    String ImgAtk;
    int    HP;
    int    spaces;

    public Character() {
    }
    public Character(String ImgAtk, int HP, int spaces, Match matchReference, JLabel refLabel, String Img1, int damage, int range, int unlockLvl, int posX, int posY) {
        super(matchReference, refLabel, Img1, damage, range, unlockLvl, posX, posY);
        this.ImgAtk = ImgAtk;
        this.HP = HP;
        this.spaces = spaces;
    }

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Jujaji");
        }
    }
    }
