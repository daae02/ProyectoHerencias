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
        damage = 2;
        range = 2;
        unlockLvl = 0;
    }
    void attack() throws InterruptedException{
        System.out.println("Bomba #"+index+" ataca");
        Objetives = GUIReference.currentMatch.explotion(this);
        if (Objetives.size()!=0){
            for (int i = 0; i<Objetives.size();i++){
                System.out.println("Bomba ataca a "+Objetives.get(i).name+" #"+Objetives.get(i).index+" Le quedan: "+Objetives.get(i).HP);
                Objetives.get(i).decrementLifePoint(damage); 
            }
            die();
        }
        
    }
    

}
