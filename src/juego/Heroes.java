/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;

/**
 *
 * @author Alejandra G
 */

/*Son	igual	que	los	de	contacto. Sin	embargo,	tienen	la	particularidad	de	que	
no	crecen	conforme	avanza	el	nivel; el	nivel,	resistencia	y	daño	iniciales	lo	
mantienen.*/


public class Heroes extends Character {
    String sound;

   /* public Heroes(String sound, String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(ImgAtk, HP, spaces, GUIReference, Img1, damage, range, unlockLvl, index);
        this.sound = sound;
    }*/
    public Heroes(String name,String Img1,String ImgAtk,int HP, int damage, int spaces, int range, int unlockLvl) {
        super(name, Img1,ImgAtk, HP, damage, spaces, range, unlockLvl);
    }
}
