/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pharmacy;

/**
 *
 * @author prathamesh
 */

import Pharmacy.model.MedicineModel;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
//import java.sql.Connection;
//import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import connection.JDBCconnection;
//import hospital.LoginFrame;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Medicines extends javax.swing.JFrame {

    /**
     * Creates new form Medicines
     */
    public Medicines() {
        initComponents();
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
            String sql = "SELECT * FROM universitysystem.medicine";
            java.sql.ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String id = Integer.toString(rs.getInt("ID"));
                String medicine = rs.getString("MEDICINE_NAME");
                String price = rs.getString("PRICE");
                String quantity = rs.getString("QUANTITY");
                String company = rs.getString("COMPANY");
                
                String tbData[] = {id,medicine,price,quantity,company};
                DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
                
                 tb1Model.addRow(tbData);
                
            }


        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfMedicine = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbCompany = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicine = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE MEDICINES");

        jLabel2.setText("ID");

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        jLabel3.setText("MEDICINE_NAME");

        jLabel4.setText("PRICE ");

        jLabel5.setText("QUANTITY");

        tfMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMedicineActionPerformed(evt);
            }
        });

        tfPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPriceActionPerformed(evt);
            }
        });

        jLabel8.setText("COMPANY");

        cbCompany.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cipla", "Vertex", "Pfizer", "Roche", "Merck" }));

        buttonAdd.setText("ADD");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonUpdate.setText("UPDATE");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        tableMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MEDICINE_NAME", "PRICE", "QUANTITY", "COMPANY"
            }
        ));
        tableMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMedicine);

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("MEDICINE TABLE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonSearch.setText("VIEW");
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonCancel.setText("Log out");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(buttonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfID)
                                                .addComponent(tfMedicine)
                                                .addComponent(tfPrice)
                                                .addComponent(tfQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                                            .addGap(142, 142, 142)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(74, 74, 74)
                                            .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(buttonCancel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonDelete)
                    .addComponent(buttonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void tfMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMedicineActionPerformed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPriceActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
        if(tableMedicine.getSelectedRowCount()==1){
            
        int id =Integer.parseInt(tfID.getText());
        String medicine = tfMedicine.getText();
        String price = tfPrice.getText();
        String quantity = tfQuantity.getText();
        String production = "";
        String expiry = "";
        String company = (String) cbCompany.getSelectedItem().toString();
        
        MedicineModel medicines = new MedicineModel(id, medicine, price, quantity, company);
        medicines.updateMedicines();  
        
        tb1Model.setValueAt(medicine,tableMedicine.getSelectedRow(), 1);
        tb1Model.setValueAt(price,tableMedicine.getSelectedRow(), 2);
        tb1Model.setValueAt(quantity,tableMedicine.getSelectedRow(), 3); 
        tb1Model.setValueAt(production,tableMedicine.getSelectedRow(), 4); 
        tb1Model.setValueAt(expiry,tableMedicine.getSelectedRow(), 5); 
        tb1Model.setValueAt(company,tableMedicine.getSelectedRow(), 6); 
  
        }
        else{
            if(tableMedicine.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Select a Row");
            } 
        }
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:

        int id = Integer.parseInt(tfID.getText());
        String medicine = tfMedicine.getText();
        String price = tfPrice.getText();
        String quantity = tfQuantity.getText();
        String company = (String) cbCompany.getSelectedItem().toString();
        if(medicine.isEmpty()||quantity.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Details!");
        }
        else{
            MedicineModel medicines = new MedicineModel(id, medicine, price, quantity, company);
            medicines.insertMedicines();
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    
    public void medicine_table(){
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "root@123");

            java.sql.Statement statement = connection.createStatement();
            String sql = "SELECT * FROM universitysystem.medicine;";
   
            java.sql.ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){
                String id = rs.getString("Id");
                String medicine = rs.getString("MEDICINE_NAME");
                String price = rs.getString("PRICE");
                String quantity = rs.getString("QUANTITY");
                String company = rs.getString("COMPANY");
                
                String tbData[] = {id,medicine,price, quantity, company};
                DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
                
                tb1Model.addRow(tbData);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please add data in correct format");

    
    }                                 
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tableMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMedicineMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
        
        String tb1id = tb1Model.getValueAt(tableMedicine.getSelectedRow(),0).toString();
        String tb1medicine = tb1Model.getValueAt(tableMedicine.getSelectedRow(),1).toString();
        String tb1price = tb1Model.getValueAt(tableMedicine.getSelectedRow(),2).toString();
        String tb1quantity = tb1Model.getValueAt(tableMedicine.getSelectedRow(),3).toString();
        String tb1production = tb1Model.getValueAt(tableMedicine.getSelectedRow(),4).toString();
        String tb1expiry = tb1Model.getValueAt(tableMedicine.getSelectedRow(),5).toString();
        String tb1company = tb1Model.getValueAt(tableMedicine.getSelectedRow(),6).toString();
        
        tfID.setText(tb1id);
        tfMedicine.setText(tb1medicine);
        tfPrice.setText(tb1price);
        tfQuantity.setText(tb1quantity);
        cbCompany.setSelectedItem(tb1company);
        
    }//GEN-LAST:event_tableMedicineMouseClicked

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tb1Model = (DefaultTableModel)tableMedicine.getModel();
        if(tableMedicine.getSelectedRowCount()==1){
        int id = Integer.parseInt(tfID.getText());
        String medicine = tfMedicine.getText();
        String price = tfPrice.getText();
        String quantity = tfQuantity.getText();
        String production = "";
        String expiry = "";
        String company = (String) cbCompany.getSelectedItem().toString();
        MedicineModel medicines = new MedicineModel(id, medicine, price, quantity, company);
        medicines.deleteMedicines();
        
        tb1Model.removeRow(tableMedicine.getSelectedRow());
        
        tfID.setText("");
        tfMedicine.setText("");
        tfPrice.setText("");
        tfQuantity.setText("");
        cbCompany.setSelectedItem("");
        
        }
        
        else{
            if(tableMedicine.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is Empty"); 
            }
            else{
                JOptionPane.showMessageDialog(this, "Select a Row");
            } 
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
         this.hide();
        InventoryEnterpriseLogin frm = new InventoryEnterpriseLogin();
        frm.setVisible(true);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel medModel = (DefaultTableModel)tableMedicine.getModel();
        medModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String getMedQuery = "SELECT * FROM universitysystem.medicine";
            java.sql.ResultSet medData = statement.executeQuery(getMedQuery);

            while(medData.next()){
                String medName = medData.getString("MEDICINE_NAME");
                String price = medData.getString("PRICE");
                String quantity = medData.getString("QUANTITY");
                String company = medData.getString("COMPANY");
                
                String tbData[] = {medName,price, quantity, company};
                
                medModel.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_buttonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> cbCompany;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableMedicine;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMedicine;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables
}
