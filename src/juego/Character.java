/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Diego Álvarez
 */
public class Character extends Entity {
    String ImgAtk;
 
    
    
    public Character() {
    }
 
    public Character(String ImgAtk,String name, String Img1, int HP, int damage, int spaces, int range, int unlockLvl, int posX, int posY) {
        super(name,Img1, HP, damage, spaces, range, unlockLvl, posX, posY);
        this.ImgAtk = ImgAtk;
    }

    public Character(String name) {
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Jujaji");
        }
    }
    }