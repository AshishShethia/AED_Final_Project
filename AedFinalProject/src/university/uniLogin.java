/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package university;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.signUp;

/**
 *
 * @author Anish
 */
public class uniLogin extends javax.swing.JFrame {

    /**
     * Creates new form uniLogin
     */
    public uniLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jButtonBackUniLogin = new javax.swing.JButton();
        jLabelLogoUNILogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnUsername = new javax.swing.JTextField();
        btnPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        selectUniRole = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabelTitlelogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBackUniLogin.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBackUniLogin.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButtonBackUniLogin.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBackUniLogin.setText("Back");
        jButtonBackUniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackUniLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBackUniLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 21, -1, -1));

        jLabelLogoUNILogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Northeastern_University_Logo-White.png"))); // NOI18N
        jPanel1.add(jLabelLogoUNILogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 350, 140));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 301, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 342, -1, -1));
        jPanel1.add(btnUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 298, 131, -1));
        jPanel1.add(btnPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 339, 134, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Role:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 383, -1, -1));

        selectUniRole.setForeground(new java.awt.Color(255, 255, 255));
        selectUniRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Professor", "University Admin" }));
        jPanel1.add(selectUniRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 380, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 421, -1, -1));

        jLabelTitlelogin.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabelTitlelogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitlelogin.setText("University Login");
        jPanel1.add(jLabelTitlelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 243, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toppng.com-vignette-png-19201080-overlay-photo-1920x1080.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String role = selectUniRole.getSelectedItem().toString();
        String username = btnUsername.getText();
        String password = btnPassword.getText();
        
        if(role.equals("Student")){
         try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.students WHERE username = '"+username+"' and password = '"+password+"'";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);
//            if(!studentData.next()){
//                JOptionPane.showMessageDialog(null,"Invalid Credentials");
//            }
                
            while(studentData.next()){
                String studName = studentData.getString("Name"); 
                
                student stud = new student();
                stud.setName(studName);
                setVisible(false);
                stud.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
        }else if(role.equals("Professor")){
            try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.professors WHERE username = '"+username+"' and password = '"+password+"'";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);

//            if(!profData.next()){
//                JOptionPane.showMessageDialog(null,"Invalid Credentials");
//            }
            
            while(profData.next()){
                String currentSubjectTeach = profData.getString("subjectTeach");
                professor profObj = new professor();
                profObj.setProfData(username, currentSubjectTeach);
                setVisible(false);
                profObj.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }else if(role.equals("University Admin")){
            if(username.equals("UNIADMIN") && password.equals("7890")){
                staffAdmin staffAdminObj = new staffAdmin();
                setVisible(false);
                staffAdminObj.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Credentials");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Enter Details Properly");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBackUniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackUniLoginActionPerformed
        // TODO add your handling code here:
        signUp signUpObj = new signUp();
        setVisible(false);
        signUpObj.setVisible(true);
    }//GEN-LAST:event_jButtonBackUniLoginActionPerformed

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
            java.util.logging.Logger.getLogger(uniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uniLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uniLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnPassword;
    private javax.swing.JTextField btnUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBackUniLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLogoUNILogin;
    private javax.swing.JLabel jLabelTitlelogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectUniRole;
    // End of variables declaration//GEN-END:variables
}
