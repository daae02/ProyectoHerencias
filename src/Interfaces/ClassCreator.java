/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diego Álvarez
 */
public class ClassCreator extends javax.swing.JFrame {
    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagen","jpg","jpeg","gif");
    /**
     * Creates new form NewJFrame
     */
    public ClassCreator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblImgMov = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        btnFileSelectorImgMov = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtRuteImgMov = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        ComboBoxClass = new javax.swing.JComboBox<>();
        lblClass = new javax.swing.JLabel();
        lblImgAtk = new javax.swing.JLabel();
        btnFileSelectorImgAtk = new javax.swing.JButton();
        txtRuteImgAtk = new javax.swing.JTextField();
        showImgAtk = new javax.swing.JLabel();
        showImgMov = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblImgMov.setText("Imagen en Movimiento: ");

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblWelcome.setText("Bienvenido al creador de personajes");

        btnFileSelectorImgMov.setText("Seleccionar Imagen");
        btnFileSelectorImgMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileSelectorImgMovActionPerformed(evt);
            }
        });

        lblName.setText("Nombre : ");

        txtRuteImgMov.setEditable(false);
        txtRuteImgMov.setText("Ruta de imagen");
        txtRuteImgMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuteImgMovActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        ComboBoxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblClass.setText("Clase : ");

        lblImgAtk.setText("Imagen de Ataque: ");

        btnFileSelectorImgAtk.setText("Seleccionar Imagen");
        btnFileSelectorImgAtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileSelectorImgAtkActionPerformed(evt);
            }
        });

        txtRuteImgAtk.setEditable(false);
        txtRuteImgAtk.setText("Ruta de imagen");
        txtRuteImgAtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuteImgAtkActionPerformed(evt);
            }
        });

        showImgAtk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/resources/NULLatk.png"))); // NOI18N

        showImgMov.setBackground(new java.awt.Color(255, 255, 255));
        showImgMov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/resources/NULL.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(lblClass))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxClass, 0, 129, Short.MAX_VALUE)
                    .addComponent(txtName))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRuteImgAtk)
                            .addComponent(txtRuteImgMov)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblImgMov)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFileSelectorImgMov))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblImgAtk)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnFileSelectorImgAtk)))
                                .addGap(0, 57, Short.MAX_VALUE)))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showImgAtk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showImgMov, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImgMov)
                    .addComponent(btnFileSelectorImgMov))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblClass))
                    .addComponent(txtRuteImgMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showImgMov, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImgAtk)
                    .addComponent(btnFileSelectorImgAtk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRuteImgAtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showImgAtk, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileSelectorImgMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileSelectorImgMovActionPerformed
        // TODO add your handling code here:
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(filter);
        int option = selector.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            txtRuteImgMov.setText(selector.getSelectedFile().getPath());   
            ImageIcon icon = new ImageIcon(txtRuteImgMov.getText());
            Image img = icon.getImage();
            img = img.getScaledInstance(90, 90,java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(img);
            showImgMov.setIcon(icon);
        }
        
    }//GEN-LAST:event_btnFileSelectorImgMovActionPerformed

    private void txtRuteImgMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuteImgMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuteImgMovActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnFileSelectorImgAtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileSelectorImgAtkActionPerformed
        // TODO add your handling code here:
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(filter);
        int option = selector.showOpenDialog(this);
        if(option==JFileChooser.APPROVE_OPTION){
            txtRuteImgAtk.setText(selector.getSelectedFile().getPath());
            ImageIcon icon = new ImageIcon(txtRuteImgAtk.getText());
            Image img = icon.getImage();
            img = img.getScaledInstance(90, 90,java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon = new ImageIcon(img);
            showImgAtk.setIcon(newIcon);
        }
    }//GEN-LAST:event_btnFileSelectorImgAtkActionPerformed

    private void txtRuteImgAtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuteImgAtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuteImgAtkActionPerformed

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
            java.util.logging.Logger.getLogger(ClassCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassCreator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxClass;
    private javax.swing.JButton btnFileSelectorImgAtk;
    private javax.swing.JButton btnFileSelectorImgMov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblImgAtk;
    private javax.swing.JLabel lblImgMov;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel showImgAtk;
    private javax.swing.JLabel showImgMov;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRuteImgAtk;
    private javax.swing.JTextField txtRuteImgMov;
    // End of variables declaration//GEN-END:variables
}
