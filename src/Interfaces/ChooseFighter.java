/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.awt.Color;
import java.util.ArrayList;
import juego.Character;
import juego.Match;
/**
 *
 * @author Alejandra G
 */
public class ChooseFighter extends javax.swing.JFrame {
    public ArrayList<Character> army = new ArrayList<>();
    ArrayList<Character> EnemyArmy = new ArrayList<>();
    Match match;
    GUI GUIreference = new GUI();
    Menu menuGUI;
    protected int level = 1;
    private int counter = 5;
    private int totalEntities = 0;
    
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
        lblContador = new javax.swing.JLabel();
        lblPContador = new javax.swing.JLabel();
        boxCharac = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btbAdd = new javax.swing.JButton();
        spinCant = new javax.swing.JSpinner();
        btbFight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        lblContador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 30, 20));

        lblPContador.setText("Espacios disponibles:");
        jPanel1.add(lblPContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jPanel1.add(boxCharac, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 222, -1));

        btnBack.setText("Regresar");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        btbAdd.setText("Agregar");
        btbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAddActionPerformed(evt);
            }
        });
        jPanel1.add(btbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

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
        jPanel1.add(spinCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 222, -1));

        btbFight.setText("¡Luchar!");
        btbFight.setEnabled(false);
        btbFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbFightActionPerformed(evt);
            }
        });
        jPanel1.add(btbFight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 150, 60));

        jLabel1.setText("Personaje: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setText("Cantidad: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/resources/BGCreateCarac.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 310));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        int x = 0;
        int y = 0;
        actualizarContador();
        lblContador.setText(counter+"");
        for (int i = 0; i < menuGUI.currentCharacters.size(); i++) {
            String url = menuGUI.currentCharacters.get(i).ImgAtk;
            boxCharac.addItem(menuGUI.currentCharacters.get(i).name);
        }        // TODO add your handling code here:
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

    private void btbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAddActionPerformed
        // TODO add your handling code here:
        int cant = (Integer)spinCant.getValue();
        if (cant <= counter){
            int index = boxCharac.getSelectedIndex();
            if (index != -1){
                 for (int i = 0; i < cant; i++) {
                    Character nChar = menuGUI.currentCharacters.get(index);
                    army.add(nChar);
                    army.get(army.size()-1).index = totalEntities;
                    army.get(army.size()-1).GUIReference = GUIreference;
                    army.get(army.size()-1).name += i;
                    army.get(army.size()-1).drawLabel();
                    
                    totalEntities++;
                }
            }
            counter -= cant;
            lblContador.setText(counter+"");
            btbFight.setEnabled(true);
        }
        
    }//GEN-LAST:event_btbAddActionPerformed

    private void btbFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbFightActionPerformed
        // TODO add your handling code here:
        match = new Match(this,level,army,EnemyArmy);
        GUIreference.currentMatch = match;
        this.setVisible(false);
        GUIreference.setVisible(true);
        
    }//GEN-LAST:event_btbFightActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblPContador;
    private javax.swing.JSpinner spinCant;
    // End of variables declaration//GEN-END:variables
}
