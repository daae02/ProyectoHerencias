package juego;


import juego.Structure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego Álvarez
 */
public class Wall extends Structure {
    public Wall() {
        name = "Muro";
        Img1 = "/Interfaces/resources/wall.png";
        unlockLvl = 1;
    }
    @Override
    public void levelUp(){
    }
    void attack() throws InterruptedException{
         sleep(100);   
        }
    
}
