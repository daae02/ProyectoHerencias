/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author Diego Álvarez
 */
public class Bomb extends Structure{
   ArrayList<Character> Objetives = new ArrayList<Character>();
   public Bomb() {
        name = "Bomba";
        Img1 = "/Interfaces/resources/bomba.png";
        ImgAtk = "/Interfaces/resources/bomba.png";
        damage = 4;
        range = 10;
        unlockLvl = 0;
    }
    void attack() throws InterruptedException{
        Objetives = GUIReference.currentMatch.explotion(this);
        if (Objetives.size()!=0){
            for (int i = 0; i<Objetives.size();i++){
                Objetives.get(i).HP-=damage;
            }
            die();
        }
        
    }
    

}
