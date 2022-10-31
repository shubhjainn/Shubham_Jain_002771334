/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package secondAssignment.system.ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import secondAssignment.system.person.City;
import secondAssignment.system.person.Community;
import secondAssignment.system.person.DoctorDirectory;
import secondAssignment.system.person.Encounter;
import secondAssignment.system.person.EncounterHistory;
import secondAssignment.system.person.House;
import secondAssignment.system.person.Patient;
import secondAssignment.system.person.PatientDirectory;
import secondAssignment.system.person.VitalSigns;

/**
 *
 * @author sweta
 */
public class AddNewPatientRecord extends javax.swing.JFrame {

    /**
     * Creates new form AddNewPatientRecord
     */
    City city;
    PatientDirectory plist;
    DoctorDirectory dlist;

    public AddNewPatientRecord(PatientDirectory plist, City city, DoctorDirectory dlist) {
        initComponents();
        this.plist = plist;
        this.city = city;
        this.dlist = dlist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtResperatory = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        txtBloodpressure = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);

        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient ID");

        jLabel2.setText("Name");

        jLabel5.setText("Age");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel10.setText("City");

        jLabel11.setText("Address");

        jLabel12.setText("Community");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel13.setText("Email ID");

        jLabel14.setText("Information");

        jLabel15.setText("Vital Sign");

        jLabel3.setText("Add Patient");

        jLabel4.setText("Resperatory");

        jLabel6.setText("Heart Rate");

        jLabel7.setText("Weight");

        jLabel9.setText("Blood Pressure");

        jLabel16.setText("Temperature");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(237, 237, 237))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBloodpressure, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResperatory, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtResperatory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtBloodpressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel8)))
                        .addGap(77, 77, 77)
                        .addComponent(btnSave)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(128, 128, 128))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    public static boolean addPatientInformationclientSideValidation(javax.swing.JFrame frame, String patientID, String name, String age, String community, String address, String email) {
        if (Pattern.compile("^[1-9]\\d*$").matcher(patientID).matches() && !patientID.equals("")) {
            System.out.println("Patient ID is valid.");
            if (Pattern.compile("^[a-zA-Z\\s]*$").matcher(name).matches() && !name.equals("")) {
                System.out.println("Name is valid.");
                if (Pattern.compile("^[1-9]\\d*$").matcher(age).matches() && !age.equals("")) {
                    System.out.println("Age is valid.");
                    if (Pattern.compile("^[a-zA-Z\\s]*$").matcher(community).matches() && !community.equals("")) {
                        System.out.println("Community is valid.");
                        if (Pattern.compile("^[a-zA-Z\\s]*$").matcher(address).matches() && !address.equals("")) {
                            System.out.println("Address is valid.");
                            if (Pattern.compile("^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*"
                                    + "@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$").matcher(email).matches() && !email.equals("")) {
                                System.out.println("Email ID is valid.");
                                return true;
                            } else {
                                JOptionPane.showMessageDialog(frame, "Email ID is not in specified format", "Alert", JOptionPane.WARNING_MESSAGE);

                            }
                        } else {
                            JOptionPane.showMessageDialog(frame, "Address is not valid. Only characters and spaces are allowed", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Community is not valid. Only characters and spaces are allowed", "Alert", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(frame, "Age is not valid. Only numbers are allowed.", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Name field is not valid. Only characters and spaces are allowed", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Patient ID is not valid. Only numbers are allowed.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }

    public static boolean addPatientVitalSignsclientSideValidation(javax.swing.JFrame frame, String bp, String pulse, String bt, String respiration, String weight) {
        if (Pattern.compile("^[1-9]\\d*$").matcher(respiration).matches() && !respiration.equals("")) {
            System.out.println("Respiration field is valid.");
            if (Pattern.compile("^[1-9]\\d*$").matcher(pulse).matches() && !pulse.equals("")) {
                System.out.println("Heart field is valid.");
                if (Pattern.compile("^[1-9]\\d*$").matcher(weight).matches() && !weight.equals("")) {
                    System.out.println("Weight field is valid.");
                    if (Pattern.compile("^[1-9]\\d*$").matcher(bp).matches() && !bp.equals("")) {
                        System.out.println("Blood pressure field is valid.");
                        if (Pattern.compile("^[1-9]\\d*$").matcher(bt).matches() && !bt.equals("")) {
                            System.out.println("Temperature field is valid.");
                            return true;

                        } else {
                            JOptionPane.showMessageDialog(frame, "Temperature field is not valid. Only Numbers are allowed..", "Alert", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Blood pressure field is not valid. Only Numbers are allowed..", "Alert", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(frame, "Weight field is not valid. Only Numbers are allowed..", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Heart field is not valid. Only Numbers are allowed..", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Respiration field is not valid. Only Numbers are allowed..", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

//        if (!validateInput()) {
//            JOptionPane.showMessageDialog(this, "Enter valid details.");
//        }
        String name = txtName.getText();
        String id = txtPatientID.getText();
        String age = txtage.getText();
        String email = txtEmailID.getText();
        String residence = txtAddress.getText();
        String community = txtCommunity.getText();

        Community c1 = city.getCommunity(community);
        House house = new House(residence);
        if (c1.getCommunityName() != null) {
            c1.addHouse(house);
            System.out.println("Old community found:" + c1.getCommunityName());
        } else {
            c1.setCommunityName(community);
            c1.addHouse(house);
            city.addCommunity(c1);

            System.out.println("New community added:" + c1.getCommunityName());

        }
        boolean passed = addPatientInformationclientSideValidation(this, id, name, age, community, residence, email);
        if (passed) {
            int patientid = Integer.parseInt(id);
            int patientAge = Integer.parseInt(age);

            String bp = txtBloodpressure.getText();
            String pulse = txtHeartRate.getText();
            String bt = txtTemperature.getText();
            String respiration = txtResperatory.getText();
            String weight = txtweight.getText();

//      Integer bp = Integer.parseInt(txtBloodpressure.getText());
//      Integer pulse = Integer.parseInt(txtHeartRate.getText());
//      Integer bt = Integer.parseInt(txtTemperature.getText());
//      Integer respiration = Integer.parseInt(txtResperatory.getText());
//      Integer weight= Integer.parseInt(txtweight.getText());
            boolean passed1 = addPatientVitalSignsclientSideValidation(this, bp, pulse, bt, respiration, weight);

            Double bp1 = Double.parseDouble(bp);
            Double pulse1 = Double.parseDouble(pulse);
            Double bt1 = Double.parseDouble(bt);
            Double respiration1 = Double.parseDouble(respiration);
            Double weight1 = Double.parseDouble(weight);
            if (passed1) {
                String timestamp = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").format(Calendar.getInstance().getTime());

                EncounterHistory encounterHistory = new EncounterHistory();
                VitalSigns vitalSigns = new VitalSigns(pulse1, bp1, weight1, respiration1, bt1);
                Encounter encounter = new Encounter(vitalSigns, timestamp);
                encounterHistory.addNewEncounter(encounter);
                Patient pat = new Patient(encounterHistory, name, patientid, patientAge, email, city, house, c1);
                plist.addPatient(pat);

                JOptionPane.showMessageDialog(this, "New Patient added.");
                setVisible(false);
                new AddNewPatientRecord(plist, city, dlist).setVisible(true);
//      txtName.setText("");
//      txtPatientID.setText("");
//      txtage.setText("");
//      txtEmail.setText("");
//      txtAddress.setText("");
//      txtCommunity.setText("");
//      txtCity.setText("");
//      txtBP.setText("");
//      txtHR.setText("");
//      txtTemperature.setText("");
//      txtRespiratoryRate.setText("");
//      Weight.setText("");
//        String patientID = txtPatientID.getText();
//        String name = txtName.getText();
//        String contactNumber = txtage.getText();
//        String age = txtCommunity.getText();
//        String gender = (String) cmbGender.getSelectedItem();
//        String address = txtAddress.getText();
//        String bloodgroup = txtEmailID.getText();
//        String majorDisease = txtMajorDisease.getText();
//        try{
//          JOptionPane.showMessageDialog(null, "Succesfully saved");
//          setVisible(false);
//          new AddNewPatientRecord().setVisible(true);
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Please enter correct data");
//            
//        }
                //       }
                //      
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

//    private boolean validateInput() {
//        if (txtName.getText().isEmpty() || txtPatientID.getText().isEmpty() || txtage.getText().isEmpty()
//                || txtEmailID.getText().isEmpty() || txtAddress.getText().isEmpty() || txtCommunity.getText().isEmpty()
//                || txtCity.getText().isEmpty() || txtBloodpressure.getText().isEmpty() || txtHeartRate.getText().isEmpty() || txtTemperature.getText().isEmpty()
//                || txtResperatory.getText().isEmpty() || txtweight.getText().isEmpty()) {
//            return false;
//
//        }
//        return true;
//    }

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddNewPatientRecord().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBloodpressure;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtResperatory;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
