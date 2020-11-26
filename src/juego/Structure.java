/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import java.awt.Image;
import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Diego Álvarez
 */
public class Structure extends Entity {

    public Structure() {
    }
    @Override
    public void run(){
        running = true;
        while (running){ 
            try {
                checkEnemy(); 
                    if(Objetive != null){
                        attack();
                    }
                    else{
                        Objetive = GUIReference.currentMatch.getObjetive(generateTeam());
                    }
                    sleep(200);
                 }
            catch (InterruptedException ex) {
                
            }
            while(pause){
                try {
                    sleep(100);
                } 
                catch (InterruptedException ex) {
                    
                }
            }
            
        }
    }
    void animation() throws InterruptedException{
        try{
            ImageIcon icon = new ImageIcon(getClass().getResource(ImgAtk));
            icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
            this.GUIReference.LabelArray.get(index).setIcon(icon);
            sleep(100);  
            icon = new ImageIcon(getClass().getResource(Img1));
            icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
            this.GUIReference.LabelArray.get(index).setIcon(icon);
        }
        catch(Exception IndexOutOfBoundsException){
            sleep(100);
        }
    }
    private boolean generateTeam(){
        int team = (new Random()).nextInt(1);
        return (team<0);
    } 
    public void drawLabel(){
        this.refLabel = GUIReference.generateStructureLabel(index,Img1);
    }
    void die(){
        GUIReference.LabelArray.get(index).setVisible(false);
        GUIReference.LabelArray.get(index).setLocation(1200,1200);
        setPause();
    }
    public void levelUp(int points){
    }



}
