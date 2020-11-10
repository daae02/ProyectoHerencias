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


/*Aparecen	al	lado	del	primer	objetivo y	quedarán	allí	inmóviles.	Tienen	un	
largo	alcance.	Estos	no	se	desplazan.	Estos	hacen	ruido. Crecen	con	cada	
nivel.*/
public class AerialFighter  extends Character {
    
    public AerialFighter(String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(ImgAtk, HP, spaces, GUIReference, Img1, damage, range, unlockLvl, index);

    }
}
