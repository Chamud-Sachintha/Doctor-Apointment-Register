/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientappointmentregister;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import patientappoinmentregister.dao.PatientDetails;
import patientappoinmentregister.service.PatientService;
import patientappointmentregister.util.Util;

/**
 *
 * @author Sherlock
 */
public class AppoinmentRegister extends javax.swing.JFrame {

    public AppoinmentRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male_radio = new javax.swing.JRadioButton();
        female_radio = new javax.swing.JRadioButton();
        fname_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        mobile_txt = new javax.swing.JTextField();
        lname_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        appoinment_table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        doc_name_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        payment_sts_cmb = new javax.swing.JComboBox();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Appoinment Register");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Register Appoinment Details");

        jLabel2.setText("Patient First Name :- ");

        jLabel3.setText("Patient Last Name :- ");

        jLabel4.setText("Age :- ");

        jLabel5.setText("Mobile Number :- ");

        jLabel6.setText("Gender :- ");

        male_radio.setText("Male");

        female_radio.setText("Female");

        appoinment_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient #", "First Name", "Last Name", "Age", "Mobile Number", "Gender", "Doctor's Name", "Payment Status"
            }
        ));
        appoinment_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appoinment_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appoinment_table);

        jButton2.setText("Reset Feilds");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        add_btn.setText("Create Appoinment");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel7.setText("Doctor's Name :- ");

        jLabel8.setText("Paid Status :- ");

        payment_sts_cmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Paid", "Pending" }));

        update_btn.setText("Update Appoinment");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete Appoinment");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(add_btn)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(update_btn)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete_btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(male_radio)
                                                .addGap(41, 41, 41)
                                                .addComponent(female_radio)
                                                .addGap(56, 56, 56))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(mobile_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                                .addComponent(age_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(fname_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lname_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(63, 63, 63)
                                                .addComponent(doc_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(payment_sts_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(doc_name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(payment_sts_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(age_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mobile_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(male_radio)
                    .addComponent(female_radio))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(add_btn)
                    .addComponent(update_btn)
                    .addComponent(delete_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void resetAllFeilds(){
        fname_txt.setText(null);
        lname_txt.setText(null);
        age_txt.setText(null);
        mobile_txt.setText(null);
        male_radio.setSelected(false);
        female_radio.setSelected(false);
        doc_name_txt.setText(null);
        payment_sts_cmb.setSelectedIndex(-1);
    }
    
    int patientId = 1;
    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        PatientDetails pDetails = new PatientDetails();
        String gender = "";
        
        if(fname_txt.getText().equals("") || lname_txt.getText().equals("") || age_txt.getText().equals("") || 
                mobile_txt.getText().equals("") ||doc_name_txt.getText().equals("") || payment_sts_cmb.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please Fill All Details.");
        }else{
            if(male_radio.isSelected() == true){
                gender = "Male";
            }else{
                gender = "Female";
            }
            
            try{
                pDetails.setFirstName(fname_txt.getText());
                pDetails.setLastName(lname_txt.getText());
                pDetails.setAge(Integer.parseInt(age_txt.getText()));
                pDetails.setMobileNumber(mobile_txt.getText());
                pDetails.setGender(gender);
                pDetails.setDoctorName(doc_name_txt.getText());
                pDetails.setPaymentStatus(payment_sts_cmb.getSelectedItem().toString());

//                Object[] appoinmentDetails = {pDetails.getPatientId(),pDetails.getFirstName(),pDetails.getLastName(),pDetails.getAge(),pDetails.getMobileNumber(),
//                                                pDetails.getGender(),pDetails.getDoctorName(),pDetails.getPaymentStatus()};
//
//                DefaultTableModel tblModel = (DefaultTableModel)appoinment_table.getModel();
//                tblModel.addRow(appoinmentDetails);
                if(PatientService.savePatientAppointmentDetails(pDetails) == true){
                    JOptionPane.showMessageDialog(rootPane, "Patient Appoinment Added.");
                    resetAllFeilds();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Patient Appoinment Not Added.");
                    resetAllFeilds();
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "There Is An Error Occured.");
            }
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        update_btn.setEnabled(false);
        delete_btn.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void appoinment_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appoinment_tableMouseClicked
        int index = appoinment_table.getSelectedRow();
        TableModel tableModel = appoinment_table.getModel();
        
        fname_txt.setText(tableModel.getValueAt(index, 1).toString());
        lname_txt.setText(tableModel.getValueAt(index, 2).toString());
        age_txt.setText(tableModel.getValueAt(index, 3).toString());
        mobile_txt.setText(tableModel.getValueAt(index, 4).toString());
        
        if(tableModel.getValueAt(index, 5).toString().equals("Male")){
            male_radio.setSelected(true);
        }else{
            female_radio.setSelected(true);
        }
        
        doc_name_txt.setText(tableModel.getValueAt(index, 6).toString());
        payment_sts_cmb.setSelectedItem(tableModel.getValueAt(index, 7));
        
        add_btn.setEnabled(false);
        update_btn.setEnabled(true);
        delete_btn.setEnabled(true);
    }//GEN-LAST:event_appoinment_tableMouseClicked

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        int selectedRowIndex = appoinment_table.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel)appoinment_table.getModel();
        
        if(selectedRowIndex >= 0){
            tableModel.setValueAt(fname_txt.getText(), selectedRowIndex, 1);
            tableModel.setValueAt(lname_txt.getText(), selectedRowIndex, 2);
            tableModel.setValueAt(age_txt.getText(), selectedRowIndex, 3);
            tableModel.setValueAt(mobile_txt.getText(), selectedRowIndex, 4);
            
            if(male_radio.isSelected()){
                female_radio.setSelected(false);
                tableModel.setValueAt(male_radio.getText(), selectedRowIndex, 5);
            }else{
                male_radio.setSelected(false);
                tableModel.setValueAt(female_radio.getText(), selectedRowIndex, 5);
            }
            
            tableModel.setValueAt(doc_name_txt.getText(), selectedRowIndex, 6);
            tableModel.setValueAt(payment_sts_cmb.getSelectedItem(), selectedRowIndex, 7);
        }else{
            JOptionPane.showMessageDialog(rootPane, "There is an Error Occured.");
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel)appoinment_table.getModel();
        if(appoinment_table.getSelectedRow() != -1) {
            // remove selected row from the model
            tableModel.removeRow(appoinment_table.getSelectedRow());
            resetAllFeilds();
            JOptionPane.showMessageDialog(null, "Appointment Delete Successfully.");
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resetAllFeilds();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AppoinmentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppoinmentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppoinmentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppoinmentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppoinmentRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField age_txt;
    private javax.swing.JTable appoinment_table;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField doc_name_txt;
    private javax.swing.JRadioButton female_radio;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JRadioButton male_radio;
    private javax.swing.JTextField mobile_txt;
    private javax.swing.JComboBox payment_sts_cmb;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
