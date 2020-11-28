/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Alejandra G
 */
/*Son	igual	que	los	mediano	alcance.	Sin	embargo,	tienen	la	particularidad	
de	 que	 no	 crecen	 conforme	 avanza	 el	 nivel,	 el	 nivel,	 resistencia	 y	 daño	
iniciales	lo	mantienen.	*/
public class Beast extends Character {

/*
    public Beast( String ImgAtk, int HP, int spaces, GUI GUIReference, String Img1, int damage, int range, int unlockLvl, int index) {
        super(ImgAtk, HP, spaces, GUIReference, Img1, damage, range, unlockLvl, index);

    }*/
    public Beast(String name,String Img1,String ImgAtk,int HP, int damage, int spaces, int range, int unlockLvl) {
        super(name, Img1,ImgAtk, HP, damage, spaces, range, unlockLvl);
    }

    public Beast() {
    }
    
    @Override
    public void levelUp(){
    }
    
    void attack() throws InterruptedException{
        int distance = (int) sqrt(pow(refLabel.getLocation().x-Objetive.refLabel.getLocation().x,2)+pow(refLabel.getLocation().y-Objetive.refLabel.getLocation().y,2));
        distance = abs(distance)/50;
        System.out.println("Distancia: "+distance+" mi distacia es "+ range);
        if(distance <= range){
            animation();
            Objetive.decrementLifePoint(damage);
            System.out.println(name+" ataco a "+Objetive.name+" #"+Objetive.index+" le quedan "+Objetive.HP+"HP");
            if(Objetive.HP<=0){
                Objetive = null;
            }
    }
    
    }
}
