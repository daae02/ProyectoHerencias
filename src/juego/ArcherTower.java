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
public class ArcherTower extends Structure{
        public ArcherTower()  {
        name = "Torre de Arqueras";
        Img1 = "/Interfaces/resources/archerTower.png";
        ImgAtk = "/Interfaces/resources/bomba.png";
        damage = 5;
        range = 6;
        unlockLvl = 2;
    }
    @Override
    public void levelUp(){
        damage++;
        range++;
    }
    void attack() throws InterruptedException{
        int distance = (int) sqrt(pow(refLabel.getLocation().x-Objetive.refLabel.getLocation().x,2)+pow(refLabel.getLocation().y-Objetive.refLabel.getLocation().y,2));
        distance = abs(distance)/50;
        System.out.println("Distancia: "+distance+" mi distacia es "+ range);
        if(distance <= range){
            //sonido aqui
            animation();
            Objetive.decrementLifePoint(damage);
            System.out.println(name+" ataco a "+Objetive.name+" #"+Objetive.index+" le quedan "+Objetive.HP+"HP");
            if(Objetive.HP<=0){
                Objetive = null;
            }
        }
    }
}
