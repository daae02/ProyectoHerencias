/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import juego.Match;

/**
 *
 * @author Diego Álvarez
 */
public class GUI extends javax.swing.JFrame {
    public ArrayList<JLabel> LabelArray; 
    public Match currentMatch;
    /**
     * Creates new form GUI
     */
    public GUI(Match match) {
        currentMatch = match;
        LabelArray = new ArrayList<JLabel> ();
        initComponents();
    }
    public GUI() {
        LabelArray = new ArrayList<JLabel> ();
        initComponents();
    }
       public JLabel generateLabel(int numeroThread,String direction){
        JLabel newLabel = new JLabel();
        newLabel.setForeground(new java.awt.Color(255, 255, 255));
        newLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newLabel.setSize(50, 50);
        ImageIcon icon = new ImageIcon(direction);
        int width = 50;
        int height = 50;
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
        newLabel.setIcon(icon);
        jLabel2.add(newLabel);
        newLabel.setOpaque(true);
        int x = ((new Random()).nextInt(950)/50) * 50;
        int y = ((new Random()).nextInt(950) / 50)* 50;
        newLabel.setLocation(x , y);
        LabelArray.add(numeroThread,newLabel);
        System.out.println("Labels: "+LabelArray.size());
        return newLabel;
    }
        public void moveLabel (int labelIndex,int enemyLabelIIndex){
        
        JLabel refLabel = LabelArray.get(labelIndex);
        JLabel refEnemy = LabelArray.get(enemyLabelIIndex);
        int direccion = (new Random()).nextInt(4);
        int x = refLabel.getLocation().x;
        int y = refLabel.getLocation().y;
        int xe = refEnemy.getLocation().x;
        int ye = refEnemy.getLocation().y;
        if (x-xe < 0 && x+50 <= 950){
            x = x+50;
        }
        else if(x-xe>0 && x-50 >= 0){
            x = x-50;
        }
        if (y-ye> 0  && y-50 >= 0){
            y = y-50;
        }
        else if (y-ye<0 && y+50 <= 950){
            y = y+50;
        }
        
        int ocupadoPor = isAvailablePostion(x, y, refLabel);
        if (ocupadoPor == -1)
            refLabel.setLocation(x, y);
        else
            System.out.println("Esta ocupada " + x + "," + y + " por " + LabelArray.get(ocupadoPor).getText());
    }
    
    public int isAvailablePostion(int x, int y, JLabel refLabel){      
        for (int i = 0; i < LabelArray.size(); i++) {
            if(LabelArray.get(i).getLocation().x == x && 
                    LabelArray.get(i).getLocation().y == y
                        && !LabelArray.get(i).equals(refLabel))
                return i;
        }
        return -1;
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
        start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 1050));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 80));
        jPanel1.setLayout(null);

        start.setBackground(new java.awt.Color(204, 153, 0));
        start.setText("START");
        start.setToolTipText("");
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
        });
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start);
        start.setBounds(440, 10, 99, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/resources/background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 1010);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void hideLabels(){
        for(int i = 0;i<LabelArray.size();i++){
            LabelArray.get(i).setVisible(false);
            }
        }
    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        currentMatch.startArmy();
    }//GEN-LAST:event_startActionPerformed

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_startMouseClicked

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
