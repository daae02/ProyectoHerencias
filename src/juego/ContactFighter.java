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
import java.applet.AudioClip;
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
    
    void attack() throws InterruptedException{
        //AudioClip sonido;
        //sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Interfaces/resources/barbarian.wav"));
        //sonido.play();
        int distance = (int) sqrt(pow(refLabel.getLocation().x-Objetive.refLabel.getLocation().x,2)+pow(refLabel.getLocation().y-Objetive.refLabel.getLocation().y,2));
        distance = abs(distance)/50;
        System.out.println("Distancia: "+distance+" mi distacia es "+ range);
        if(distance <= range){
            //sonido aqui
            animation();
            Objetive.HP -= damage;
            System.out.println(name+" ataco a "+Objetive.name+" #"+Objetive.index+" le quedan "+Objetive.HP+"HP");
            if(Objetive.HP<=0){
                Objetive = null;
            }
        }
    }
}
