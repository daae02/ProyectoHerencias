/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import juego.AerialFighter;
import juego.AerialStructure;
import juego.ArcherTower;
import juego.Beast;
import juego.Bomb;
import juego.Canyon;
import juego.Character;
import juego.Structure;
import juego.ContactFighter;
import juego.FileManager;
import juego.Hero;
import juego.Match;
import juego.MediumRangeFighter;
import juego.Mortar;
import juego.Save;
import juego.Wall;
/**
 *
 * @author Alejandra G
 */
public class ChooseFighter extends javax.swing.JFrame implements Serializable {
    public ArrayList<Character> army = new ArrayList<>();
    public ArrayList<Character> EnemyArmy = new ArrayList<>();
    public ArrayList<Character> armyDisponible = new ArrayList<>();
    public ArrayList<Structure> matchStructures = new ArrayList<>();
    Match match;
    public GUI GUIreference = new GUI();
    Menu menuGUI;
    public int level = 1;
    private int counter = 5;
    public int totalEntities = 0;
    
    /**
     * Creates new form ChooseFighter
     * @param menuGUI
     */
    public ChooseFighter(Menu menuGUI) {
        this.menuGUI = menuGUI;
        counter = 5;
        level = 1;
        actualizarContador();
        initComponents();
    }

    
    public ChooseFighter() {
        initComponents();
    }

    private void actualizarContador(){
        if (level == 1){
            counter = 5;
        }
        else {
            counter = 5+3*level;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btbFight = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boxCharac = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spinCant = new javax.swing.JSpinner();
        btbAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblHP = new javax.swing.JLabel();
        lbldamage = new javax.swing.JLabel();
        lblRange = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblPContador = new javax.swing.JLabel();
        lblContador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btbFight.setBackground(new java.awt.Color(100, 135, 0));
        btbFight.setText("¡Luchar!");
        btbFight.setEnabled(false);
        btbFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbFightActionPerformed(evt);
            }
        });
        jPanel1.add(btbFight, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 150, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/resources/CFcharac.png"))); // NOI18N
        jLabel4.setText("Texto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 180, -1));

        jPanel2.setBackground(new java.awt.Color(230,230,230,230));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Personaje: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        boxCharac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCharacActionPerformed(evt);
            }
        });
        jPanel2.add(boxCharac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 222, -1));

        jLabel2.setText("Cantidad: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        spinCant.setEditor(new javax.swing.JSpinner.DefaultEditor(spinCant));
        spinCant.setValue(1);
        spinCant.setBackground(Color.white);
        spinCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        spinCant.setAutoscrolls(true);
        spinCant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spinCant.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spinCantPropertyChange(evt);
            }
        });
        jPanel2.add(spinCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 222, -1));

        btbAdd.setText("Agregar");
        btbAdd.setEnabled(false);
        btbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAddActionPerformed(evt);
            }
        });
        jPanel2.add(btbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 400, 180));

        jPanel3.setBackground(new java.awt.Color(230,230,230,230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Información del personaje");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 20));

        jLabel9.setText("Vida:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel10.setText("Ataque:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel11.setText("Rango:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblHP.setText("jLabel12");
        jPanel3.add(lblHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));

        lbldamage.setText("jLabel12");
        jPanel3.add(lbldamage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        lblRange.setText("jLabel12");
        jPanel3.add(lblRange, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 330, 180));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¡Construye tu ejercito!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(230,230,230,230));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nivel actual: ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, 20));

        lblPContador.setText("Espacios disponibles:");
        jPanel4.add(lblPContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        lblContador.setAlignmentX(2.0F);
        lblContador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(lblContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 40, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 340, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/resources/CFbackground.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 450));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean checkNew(String name){
        for(int i= 0; i < (boxCharac.getItemCount());i++){
            if(name.equals(boxCharac.getItemAt(i))){
                return false;
            }
        }
        return true;
    }
    private void caractersAvailable(){
        armyDisponible.clear();
        boxCharac.removeAllItems();
        boxCharac.addItem("Seleccione el personaje: ");
        for (int i = 0; i < menuGUI.currentCharacters.size(); i++) {
            if (menuGUI.currentCharacters.get(i).unlockLvl <= level)
                armyDisponible.add(menuGUI.currentCharacters.get(i));
        }
        for (int i = 0; i < armyDisponible.size(); i++) {
            if (armyDisponible.get(i).unlockLvl <= level) 
                if (checkNew(armyDisponible.get(i).name)){
                    boxCharac.addItem(armyDisponible.get(i).name);
                }
        }
        //boxCharac.        
        
    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        int x = 0;
        int y = 0;
        spinCant.setValue(1);
        btbFight.setEnabled(false);
        actualizarContador();
        lblContador.setText(counter+"");
        lblLevel.setText(level+"");
        caractersAvailable();
    }//GEN-LAST:event_formWindowActivated

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here
    }//GEN-LAST:event_formMouseEntered

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        menuGUI.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void spinCantPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spinCantPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_spinCantPropertyChange
        private void addStructure(){
        matchStructures.get(matchStructures.size()-1).index = totalEntities;    
        matchStructures.get(matchStructures.size()-1).GUIReference = GUIreference;
        System.out.println("Prueba: "+matchStructures.get(matchStructures.size()-1).name+" "+matchStructures.get(matchStructures.size()-1).index);
        matchStructures.get(matchStructures.size()-1).drawLabel();
        totalEntities++;
    }
    private void generateStructure(){
        int cant;
        if (level == 1){
            cant = 5;
        }
        else {
            cant = 5+3*level;
        }
        boolean generate = true;
        int antiloop = 0;
        while(generate && antiloop < 10000){
            int structure= new Random().nextInt(5);
            switch (structure){
                case 0:
                    if(new Wall().unlockLvl <= level){
                        matchStructures.add(new Wall());
                        addStructure();
                        cant --;
                    }
                    break;
                case 1:
                    if(new Canyon().unlockLvl <= level){
                        matchStructures.add(new Canyon());
                        addStructure();
                        cant --;
                    }
                     break;
                case 2:
                     if(new Mortar().unlockLvl <= level){
                        matchStructures.add(new Mortar());
                        addStructure();
                        cant --;
                     }
                      break;
                case 3:
                    if(new Bomb().unlockLvl <= level){
                        matchStructures.add(new Bomb());
                        addStructure();
                        cant --;
                    }
                    break;
                case 4:
                    if(new AerialStructure().unlockLvl <= level){
                        matchStructures.add(new AerialStructure());
                        addStructure();
                        cant --;
                    }
                     break;
                case 5:
                    if(new ArcherTower().unlockLvl <= level){
                        matchStructures.add(new ArcherTower());
                        addStructure();
                        cant --;
                    }
                    break;
            }
            antiloop++;
            if (cant<=0)
                generate = false;
        }
    }
    
    
    
    private Character generateFighter(Character c){
        if(c.getClass().equals(new ContactFighter().getClass())){
            ContactFighter tmpChar = new ContactFighter();
            tmpChar.copy(c);
            return tmpChar;
        }
        else if(c.getClass().equals(new MediumRangeFighter().getClass())){
            MediumRangeFighter tmpChar = new MediumRangeFighter();
            tmpChar.copy(c);
            return tmpChar;
        }
        else if(c.getClass().equals(new AerialFighter().getClass())){
            AerialFighter tmpChar = new AerialFighter();
            tmpChar.copy(c);
            return tmpChar;
        }
        else if(c.getClass().equals(new Beast().getClass())){
            Beast tmpChar = new Beast(); 
            tmpChar.copy(c);
            return tmpChar;
        }
        else{
            Hero tmpChar = new Hero();
            tmpChar.copy(c);
            return tmpChar;
        }
    }
    private void addToArmy( ArrayList<Character> armyRef, int index,boolean team){
         armyRef.add(generateFighter(armyDisponible.get(index)));
         armyRef.get(armyRef.size()-1).index = totalEntities;
         armyRef.get(armyRef.size()-1).GUIReference = GUIreference;
         armyRef.get(armyRef.size()-1).good = team;
         armyRef.get(armyRef.size()-1).drawLabel();
         totalEntities++;
    }
    private void generateEnemyArmy(){
        int aSpaces;
        int antiLoop=1;
        if (level == 1){
            aSpaces = 5;
        }
        else {
            aSpaces = 5+3*level;
        }
        boolean generate = true;
        while(generate){
             antiLoop++;
             int tmpIndex = new Random().nextInt(armyDisponible.size());
             if(aSpaces - armyDisponible.get(tmpIndex).spaces>=0){
                 addToArmy(EnemyArmy,tmpIndex,false);
                 System.out.println("Espacios de "+  armyDisponible.get(tmpIndex).name + " : "+armyDisponible.get(tmpIndex).spaces);
                 aSpaces -= armyDisponible.get(tmpIndex).spaces;
                }
             if(aSpaces <= 0 || antiLoop>10000){
                 generate = false;
             }
        }
    }
    
    public void levelUp(){
        level++;
        army.clear();
        EnemyArmy.clear();
        matchStructures.clear();
        for (int i = 0; i < armyDisponible.size(); i++) {
            armyDisponible.get(i).levelUp(); 
        }
        armyDisponible.clear();
        generateStructure();
        if (level <4){
        for (int i = 0; i < matchStructures.size(); i++) {
            matchStructures.get(i).levelUp(); 
        }
        }
        caractersAvailable();
    }
    private void btbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAddActionPerformed
        // TODO add your handling code here:
        int cant = (Integer)spinCant.getValue();
        int index = boxCharac.getSelectedIndex()-1;
        if (counter >= (cant*armyDisponible.get(index).spaces)){
            if (index != -1){
                 for (int i = 0; i < cant; i++) {
                     addToArmy(army,index,true);
                     System.out.println("Espacios de "+  armyDisponible.get(index).name + " : "+armyDisponible.get(index).spaces);
                }
            }
            counter -= cant*armyDisponible.get(index).spaces;
            lblContador.setText(counter+"");
            spinCant.setValue(1);
            btbFight.setEnabled(true);
        }
        
    }//GEN-LAST:event_btbAddActionPerformed

    private void btbFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbFightActionPerformed
        // TODO add your handling code here:
        if (level == 1){
           generateStructure();
        }
        generateEnemyArmy();
        match = new Match(this,level,army,EnemyArmy,matchStructures);
        GUIreference.currentMatch = match;
        match.GUIreference = GUIreference;
        Save newSave = new Save(level,army,EnemyArmy,matchStructures);
        FileManager.writeObject(newSave,"C:\\ClashOfClans\\currentLevel.sav");
        this.setVisible(false);
        GUIreference.setVisible(true);
    }//GEN-LAST:event_btbFightActionPerformed

    private void boxCharacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCharacActionPerformed
        // TODO add your handling code here:
        int index = boxCharac.getSelectedIndex()-1;
        System.out.println(index);
        if (index >= 0){
            btbAdd.setEnabled(true);
            System.out.println(index);
            lblHP.setText(armyDisponible.get(index).HP+" golpes");
            lbldamage.setText(armyDisponible.get(index).damage+" golpe por segundo");
            lblRange.setText(armyDisponible.get(index).range+"");
            
        }
        else{
            btbAdd.setEnabled(false);
            lblHP.setText("");
            lbldamage.setText("");
            lblRange.setText("");
        }
        
    }//GEN-LAST:event_boxCharacActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChooseFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseFighter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCharac;
    private javax.swing.JButton btbAdd;
    private javax.swing.JButton btbFight;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblHP;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPContador;
    private javax.swing.JLabel lblRange;
    private javax.swing.JLabel lbldamage;
    private javax.swing.JSpinner spinCant;
    // End of variables declaration//GEN-END:variables
}
