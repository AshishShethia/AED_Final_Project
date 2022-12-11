/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package university;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;


/**
 *
 * @author Anish
 */
public class professor extends javax.swing.JFrame {

    /**
     * Creates new form professor
     */
    public professor() {
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
        btnViewStudData = new javax.swing.JButton();
        jLabeltitleProfessor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        subjectTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        remarksTxt = new javax.swing.JTextField();
        subjectTxt = new javax.swing.JTextField();
        sNameTxt = new javax.swing.JTextField();
        gradeTxt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        GradeTxt = new javax.swing.JTextField();
        jLabelLogoprofessor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnProfLogout = new javax.swing.JButton();
        lblProfName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnViewStudData.setBackground(new java.awt.Color(0, 0, 0));
        btnViewStudData.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnViewStudData.setForeground(new java.awt.Color(255, 255, 255));
        btnViewStudData.setText("View");
        btnViewStudData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStudDataActionPerformed(evt);
            }
        });

        jLabeltitleProfessor.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        jLabeltitleProfessor.setForeground(new java.awt.Color(0, 0, 0));
        jLabeltitleProfessor.setText("Grading");

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Subject"
            }
        ));
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(subjectTable);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Subject:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Remarks:");

        subjectTxt.setEnabled(false);
        subjectTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTxtActionPerformed(evt);
            }
        });

        sNameTxt.setEnabled(false);

        gradeTxt.setBackground(new java.awt.Color(0, 0, 0));
        gradeTxt.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        gradeTxt.setForeground(new java.awt.Color(255, 255, 255));
        gradeTxt.setText("Grade");
        gradeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Grade:");

        jLabelLogoprofessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/northeasternuniversity_logoseal-2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Student Name:");

        btnProfLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnProfLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnProfLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnProfLogout.setText("Log Out");
        btnProfLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(subjectTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sNameTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(GradeTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(remarksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(gradeTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewStudData, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelLogoprofessor)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jLabeltitleProfessor)
                                .addGap(302, 302, 302))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnProfLogout))
                                .addGap(35, 35, 35))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnProfLogout)
                        .addGap(22, 22, 22)
                        .addComponent(jLabeltitleProfessor))
                    .addComponent(jLabelLogoprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(subjectTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(GradeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(remarksTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewStudData)
                    .addComponent(gradeTxt))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProfName)
                .addGap(209, 209, 209))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProfName)
                .addGap(502, 502, 502))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String currSubjectTeach = "";
    String currProfUsername = "";

    public void setProfData(String profName, String currentSubjectTeach){
        lblProfName.setText("Welcome Professor " + profName);
        currSubjectTeach = currentSubjectTeach;
        currProfUsername = profName;
        System.out.println(currProfUsername);
    }
    
    private void btnViewStudDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStudDataActionPerformed
        // TODO add your handling code here:
        DefaultTableModel studSubModel = (DefaultTableModel)subjectTable.getModel();
        studSubModel.setRowCount(0);

        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.courseregistration WHERE Subject = '"+currSubjectTeach+"' and ProfessorName = '"+currProfUsername+"'";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String studName = studentData.getString("username");
                String subject = studentData.getString("Subject");

                String tbData[] = {studName,subject};

                studSubModel.addRow(tbData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnViewStudDataActionPerformed

    
public class CourseGrade{
        
        
        public static void CreateCourseGrade(String sName, String Subject, String Grade, String Remarks){
            
             try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            
            System.out.println("connection open");
            java.sql.Statement statement = connection.createStatement();
                        System.out.println("connection open");

            String query = "INSERT INTO universitysystem.coursegrade (studentName, subject, marks, remarks) values(?,?,?,?)";
                        System.out.println("connection insert");
            //statement.executeUpdate("insert into universitysystem.login" + "(role, username, password)" + "values ('BankEmployee','"+username+"', '"+password+"')");

           // java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            java.sql.PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1,sName);
            preparedStmt.setString(2,Subject);
            preparedStmt.setString(3,Grade);
            preparedStmt.setString(4,Remarks);

            
            System.out.println("connection insert");
            
           

            preparedStmt.execute();
             System.out.println("connection run");
             JOptionPane.showMessageDialog(null,"Details Added");

             connection.close();
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"please add data in correct format!");
        }      
             
        }
    
    }      
    
    
    
    
    private void gradeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeTxtActionPerformed
        String StudentName = sNameTxt.getText();
        String Subject = subjectTxt.getText();
        String Grade = gradeTxt.getText();
        String Remarks = remarksTxt.getText();

        if(sNameTxt.getText().isEmpty()|| gradeTxt.getText().isEmpty()||remarksTxt.getText().isEmpty()||subjectTxt.getText().isEmpty()           ){
            JOptionPane.showMessageDialog(null, "Plz Enter Details!");

        } else{

            // Community.CreateCommunity(house,person,community,city,hospital);
            CourseGrade.CreateCourseGrade(StudentName,Subject,Grade,Remarks);
        }

        //JOptionPane.showMessageDialog(this,"New Employ details Added");

        sNameTxt.setText("");
        subjectTxt.setText("");
        gradeTxt.setText("");
        remarksTxt.setText("");

    }//GEN-LAST:event_gradeTxtActionPerformed

    private void subjectTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTxtActionPerformed

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        // TODO add your handling code here:
        
         DefaultTableModel profModel = (DefaultTableModel)subjectTable.getModel();
                 String studentNameTxt = subjectTable.getValueAt(subjectTable.getSelectedRow(), 0).toString();

        sNameTxt.setText(subjectTable.getValueAt(subjectTable.getSelectedRow(), 0).toString());  
        subjectTxt.setText(subjectTable.getValueAt(subjectTable.getSelectedRow(), 1).toString());
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.courseregistration WHERE username = '"+studentNameTxt+"'";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            while(profData.next()){
                studentNameTxt = profData.getString("username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_subjectTableMouseClicked

    private void btnProfLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfLogoutActionPerformed
        // TODO add your handling code here:
        currSubjectTeach = "";
        currProfUsername = "";
        uniLogin uniLoginObj = new uniLogin();
        setVisible(false);
        uniLoginObj.setVisible(true);
    }//GEN-LAST:event_btnProfLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GradeTxt;
    private javax.swing.JButton btnProfLogout;
    private javax.swing.JButton btnViewStudData;
    private javax.swing.JButton gradeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogoprofessor;
    private javax.swing.JLabel jLabeltitleProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProfName;
    private javax.swing.JTextField remarksTxt;
    private javax.swing.JTextField sNameTxt;
    private javax.swing.JTable subjectTable;
    private javax.swing.JTextField subjectTxt;
    // End of variables declaration//GEN-END:variables
}
