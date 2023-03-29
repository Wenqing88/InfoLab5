/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package infolab5;

import model.Encounter;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author User
 */
public class NewEncounterPanel extends javax.swing.JPanel {

    /**
     * Creates new form doctorJPanel
     */
    public NewEncounterPanel() {
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

        bodyTempLabe = new javax.swing.JLabel();
        patientIDField = new javax.swing.JTextField();
        patientNameField = new javax.swing.JTextField();
        docIDField = new javax.swing.JTextField();
        doctorNameLabel = new javax.swing.JLabel();
        docNameField = new javax.swing.JTextField();
        docIDLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        patientLabel = new javax.swing.JLabel();
        heartRateField = new javax.swing.JTextField();
        patientIDLabel = new javax.swing.JLabel();
        bloodPressureField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        bodyTempField = new javax.swing.JTextField();
        vitalSignLabel = new javax.swing.JLabel();
        heartRateLabel = new javax.swing.JLabel();
        bloodPressureLabel = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();
        newEcounterLabel = new javax.swing.JLabel();

        bodyTempLabe.setText("Body Temperature");

        doctorNameLabel.setText("Attending Doctor");

        docIDLabel.setText("Docter ID");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        patientLabel.setText("Patient");

        patientIDLabel.setText("Patient ID");

        dateLabel.setText("Date");

        vitalSignLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        vitalSignLabel.setText("Vital Sign");

        heartRateLabel.setText("Heart Rate");

        bloodPressureLabel.setText("Blood Pressure");

        newEcounterLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        newEcounterLabel.setText("New Encounter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(submitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(newEcounterLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(doctorNameLabel)
                                .addComponent(docIDLabel)
                                .addComponent(patientLabel)
                                .addComponent(patientIDLabel)
                                .addComponent(dateLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vitalSignLabel)
                                .addGap(47, 47, 47)))
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(docNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(docIDField)
                            .addComponent(patientNameField)
                            .addComponent(patientIDField)
                            .addComponent(dateField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bodyTempLabe)
                            .addComponent(bloodPressureLabel)
                            .addComponent(heartRateLabel))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bloodPressureField, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(bodyTempField)
                            .addComponent(heartRateField))))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(newEcounterLabel)
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doctorNameLabel)
                    .addComponent(docNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docIDLabel)
                    .addComponent(docIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIDLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(vitalSignLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartRateLabel)
                    .addComponent(heartRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodPressureLabel)
                    .addComponent(bloodPressureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bodyTempLabe)
                    .addComponent(bodyTempField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(170, 170, 170)
                .addComponent(submitButton)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        Encounter encounter = new Encounter();
        // TODO add your handling code here:
        
        
        for(Patient p : PatientDirectory.getInstance().getPatients()){
            if(patientIDField.getText() == String.valueOf(p.getID())){
                p.addEncounterHistory(encounter);
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureField;
    private javax.swing.JLabel bloodPressureLabel;
    private javax.swing.JTextField bodyTempField;
    private javax.swing.JLabel bodyTempLabe;
    private javax.swing.JTextField dateField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField docIDField;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JTextField docNameField;
    private javax.swing.JLabel doctorNameLabel;
    private javax.swing.JTextField heartRateField;
    private javax.swing.JLabel heartRateLabel;
    private javax.swing.JLabel newEcounterLabel;
    private javax.swing.JTextField patientIDField;
    private javax.swing.JLabel patientIDLabel;
    private javax.swing.JLabel patientLabel;
    private javax.swing.JTextField patientNameField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel vitalSignLabel;
    // End of variables declaration//GEN-END:variables
}
