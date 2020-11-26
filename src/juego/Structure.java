/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.GUI;
import java.util.Random;
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
    private boolean generateTeam(){
        int team = (new Random()).nextInt(1);
        return (team<0);
    }  
    public void levelUp(int points){
    }



}
