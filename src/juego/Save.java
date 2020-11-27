/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Interfaces.ChooseFighter;
import Interfaces.GUI;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Diego Álvarez
 */
public class Save  implements Serializable{
    public  ArrayList<Character> army = new ArrayList<>();
    public ArrayList<Character> EnemyArmy = new ArrayList<>();
    public ArrayList<Structure> matchStructures = new ArrayList<>();
    public int level;

    public Save(int level,ArrayList<Character> army, ArrayList<Character> EnemyArmy,ArrayList<Structure> matchStructures) {
        this.level = level;
        this.matchStructures = matchStructures;
        this.EnemyArmy = EnemyArmy;
        this.army = army;
    }
}
