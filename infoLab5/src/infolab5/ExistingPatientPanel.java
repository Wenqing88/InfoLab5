/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package infolab5;

import java.awt.Image;
import java.awt.event.ActionEvent;
import static java.awt.image.ImageObserver.HEIGHT;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Address;
import model.Community;
import model.Encounter;
import model.Hospital;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author yulon
 */
public class ExistingPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form ExistingPatientPanel1
     */
    public ExistingPatientPanel() {
        initComponents();
        poplutateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoneNumLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        encounterInfoLabel = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        deletButton = new javax.swing.JButton();
        encounterInfojScrollPanel = new javax.swing.JScrollPane();
        encounterInfoTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        idDisplayLabel = new javax.swing.JLabel();
        existingPatientPanel = new javax.swing.JScrollPane();
        existingPatientInfo = new javax.swing.JTable();
        titleLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();
        communityField = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();

        phoneNumLabel.setText("Number");

        idLabel.setText("ID");

        addressLabel.setText("House Address");

        encounterInfoLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        encounterInfoLabel.setText("Encounter Info");

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        deletButton.setText("Delete");
        deletButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletButtonActionPerformed(evt);
            }
        });

        encounterInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Doctor", "DocID", "Heart Rate", "Blood Pressure", "Temperature"
            }
        ));
        encounterInfojScrollPanel.setViewportView(encounterInfoTable);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        existingPatientInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Patient ID", "Phone Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        existingPatientPanel.setViewportView(existingPatientInfo);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setText("Existing Patient");

        communityLabel.setText("Community");

        cityLabel.setText("City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(98, Short.MAX_VALUE)
                        .addComponent(existingPatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(encounterInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(191, 191, 191))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(phoneNumLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addComponent(communityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(71, 71, 71)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(addressField)
                                                .addComponent(numberField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(communityField)
                                                .addComponent(cityField))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deletButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(idDisplayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(viewButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(encounterInfojScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existingPatientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(idDisplayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletButton)
                    .addComponent(addButton)
                    .addComponent(updateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumLabel)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(communityLabel)
                    .addComponent(communityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(encounterInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encounterInfojScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Patient selectedPatient;
        int selectedIndex = existingPatientInfo.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be updated", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) existingPatientInfo.getModel();
            selectedPatient = (Patient) model.getValueAt(selectedIndex, 0);
            try{
                selectedPatient.setPhoneNumber(Long.parseLong(numberField.getText()));
            } catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(this, "Phone number should be in numbers only!",
                        "Invalid Input", HEIGHT);
            }
            

            Community comm = new Community();
            Address address = new Address(cityField.getText(), addressField.getText(), comm);
            selectedPatient.setAddress(address);
            selectedPatient.setName(nameField.getText());
            
            JOptionPane.showMessageDialog(this, "Patient Information is updated successfully.");
            poplutateTable();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = existingPatientInfo.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be viewed", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) existingPatientInfo.getModel();
            Patient selectedUser = (Patient) model.getValueAt(selectedIndex, 0);
            nameField.setText(selectedUser.getName());
            idDisplayLabel.setText(String.valueOf(selectedUser.getID()));
            numberField.setText(String.valueOf(selectedUser.getPhoneNumber()));
            addressField.setText(String.valueOf(selectedUser.getAddress().getHouse()));
            communityField.setText(String.valueOf(selectedUser.getAddress().getComm().getName()));
            cityField.setText(String.valueOf(selectedUser.getAddress().getCity()));
            
            //display encounter history
            DefaultTableModel encounterHistory = (DefaultTableModel) encounterInfoTable.getModel();
            encounterHistory.setRowCount(0);
            // still need to filter out hospitals which are not in the same community
            for (Encounter e : selectedUser.getEncounterHistory()) {
                Object[] row = new Object[6];
                row[0] = e.getDate().toString();
                row[1] = e.getDoctor().getName();
                row[2] = e.getDoctor().getID();
                row[3] = e.getVitalSign().getHeartRate();
                row[4] = e.getVitalSign().getBloodPressure();
                row[5] = e.getVitalSign().getTemperature();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deletButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedIndex = existingPatientInfo.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) existingPatientInfo.getModel();
            Patient selectedPatient = (Patient) model.getValueAt(selectedIndex, 0);
            PatientDirectory.getInstance().removePatient(selectedPatient);
            JOptionPane.showMessageDialog(this, "Patient Information is deleted successfully.");
            poplutateTable();
        }
    }//GEN-LAST:event_deletButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
            Patient patient;
            patient = new Patient();
            try{
                patient.setPhoneNumber(Long.parseLong(numberField.getText()));
            } catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(this, "Phone number should be in numbers only!",
                        "Invalid Input", HEIGHT);
            }
            

            Community comm = new Community();
            Address address = new Address(cityField.getText(), addressField.getText(), comm);
            patient.setAddress(address);
            patient.setName(nameField.getText());
            
            PatientDirectory.getInstance().addPatient(patient);
            JOptionPane.showMessageDialog(this, "Patient Information is updated successfully.");
            poplutateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    public void poplutateTable() {
        DefaultTableModel model = (DefaultTableModel) existingPatientInfo.getModel();
        model.setRowCount(0);
        // still need to filter out hospitals which are not in the same community
        for (Patient p : PatientDirectory.getInstance().getPatients()) {
            Object[] row = new Object[4];
            Address address = p.getAddress();
            row[0] = p;
            row[1] = p.getID();
            row[2] = p.getPhoneNumber();
            row[3] = address.getHouse() + "," + address.getComm().getName() + "," + address.getCity();
            model.addRow(row);
        }
        clearFields();
    }
    
    private void clearFields() {
        nameField.setText("");
        numberField.setText("");
        addressField.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField communityField;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JButton deletButton;
    private javax.swing.JLabel encounterInfoLabel;
    private javax.swing.JTable encounterInfoTable;
    private javax.swing.JScrollPane encounterInfojScrollPanel;
    private javax.swing.JTable existingPatientInfo;
    private javax.swing.JScrollPane existingPatientPanel;
    private javax.swing.JLabel idDisplayLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
