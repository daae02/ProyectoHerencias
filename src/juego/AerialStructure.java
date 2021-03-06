/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Diego Álvarez
 */
public class AerialStructure extends Structure{
  public AerialStructure() {
        name = "Lanza Cohetes";
        Img1 = "/Interfaces/resources/AirDefense.png";
        ImgAtk = "/Interfaces/resources/AirDefenseAtk.png";
        damage = 5;
        range = 10;
        unlockLvl = 4;
    }
    @Override
    public void levelUp(){
        damage++;
        range++;
    }
    public void attack() throws InterruptedException{
        int distance = (int) sqrt(pow(refLabel.getLocation().x-Objetive.refLabel.getLocation().x,2)+pow(refLabel.getLocation().y-Objetive.refLabel.getLocation().y,2));
        distance = abs(distance)/50;
        System.out.println("Distancia: "+distance+" mi distacia es "+ range);
        if (Objetive.getClass().equals(new AerialFighter().getClass())){
            if(distance <= range){
                //sonido aqui
                animation();
                Objetive.decrementLifePoint(damage);
                System.out.println(name+" ataco a "+Objetive.name+" #"+Objetive.index+" le quedan "+Objetive.HP+"HP");
                if(Objetive.HP<=0){
                    Objetive = null;
                }
            }
            else{
                Objetive = null;
            }
        }
        else{
            Objetive =null;
        }
    }

}
