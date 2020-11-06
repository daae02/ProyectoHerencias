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
public class Structure extends Entity {

    public Structure(Match matchReference, JLabel refLabel, String Img1, int damage, int range, int unlockLvl, int posX, int posY) {
        super(matchReference, refLabel, Img1, damage, range, unlockLvl, posX, posY);
    }


}
