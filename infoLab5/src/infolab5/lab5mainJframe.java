/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package infolab5;

import java.awt.CardLayout;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class lab5mainJframe extends javax.swing.JFrame {

    /**
     * Creates new form lab5mainJframe
     */
    public lab5mainJframe() {
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

        SplitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        newPatientButton = new javax.swing.JButton();
        newEncounterButton = new javax.swing.JButton();
        sysAdminButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        newPatientButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        newPatientButton.setText("New Patient");
        newPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButtonActionPerformed(evt);
            }
        });

        newEncounterButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        newEncounterButton.setText("New Encounter");
        newEncounterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEncounterButtonActionPerformed(evt);
            }
        });

        sysAdminButton.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        sysAdminButton.setText("Administrator");
        sysAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(newPatientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(newEncounterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(sysAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPatientButton)
                    .addComponent(newEncounterButton)
                    .addComponent(sysAdminButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(topPanel);

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(bottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButtonActionPerformed
        // TODO add your handling code here:
        NewPatientPanel newPatientPanel = new NewPatientPanel(); // create new panel
        SplitPane.setBottomComponent(newPatientPanel);    
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_newPatientButtonActionPerformed

    private void newEncounterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEncounterButtonActionPerformed
        // TODO add your handling code here:
        NewEncounterPanel newEncounterPanel = new NewEncounterPanel(); // create new panel
        SplitPane.setBottomComponent(newEncounterPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_newEncounterButtonActionPerformed

    private void sysAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysAdminButtonActionPerformed
        // TODO add your handling code here:
        AdminPanel adminPanel = new AdminPanel(); // creation new panel
        SplitPane.setBottomComponent(adminPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
    }//GEN-LAST:event_sysAdminButtonActionPerformed
                               
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
            java.util.logging.Logger.getLogger(lab5mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab5mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab5mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab5mainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab5mainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton newEncounterButton;
    private javax.swing.JButton newPatientButton;
    private javax.swing.JButton sysAdminButton;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
