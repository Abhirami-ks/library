/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import static library.newstudent.okcancel;

/**
 *
 * @author install
 */
public class newbook extends javax.swing.JFrame {

    /**
     * Creates new form newbook
     */
    public newbook() {
        initComponents();
    }

    public String loginname;
    public newbook(String name){
        initComponents();
        this.loginname=name;
    }
    
     public static Connection myConnection(){
    Connection con = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl="jdbc:mysql://localhost:3306/library?"+"user=root&&password=";
        con=DriverManager.getConnection(connectionUrl);
        }   catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        a = new app.bolivia.swing.JCTextField();
        y = new app.bolivia.swing.JCTextField();
        t = new app.bolivia.swing.JCTextField();
        c = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText(" TITLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("AUTHOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("CATEGORY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("YEAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 90, 30));

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 80, 30));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel6.setText("                     ADD BOOK");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 440, -1));

        a.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        a.setPlaceholder("Enter book author..");
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 210, 30));

        y.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        y.setPlaceholder("Enter book Year");
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 210, 30));

        t.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        t.setPlaceholder("Enter book title..");
        getContentPane().add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 152, 210, 30));

        c.setFont(new java.awt.Font("Sylfaen", 3, 14)); // NOI18N
        c.setPlaceholder("Enter category");
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 210, 30));

        jLabel5.setBackground(new java.awt.Color(255, 153, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/123456.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new home(loginname).setVisible(true);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con = myConnection();
        try{
            String ti = t.getText();
            String au = a.getText();
            String ca = c.getText();
            String yr = y.getText();
            PreparedStatement prest;
            String book = "INSERT INTO addbook(bname,bauthor,bcategory,byear)VALUES('"+ti+"','"+au+"','"+ca+"','"+yr+"')";
            prest = con.prepareStatement(book); 
            
            int count = prest.executeUpdate();
            if (count>0)
            {
                int i = okcancel("Book has been added.");
                System.out.println("ret" +i);
                dispose();
                new home(loginname).setVisible(true);
                con.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(newbook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new newbook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField a;
    private app.bolivia.swing.JCTextField c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private app.bolivia.swing.JCTextField t;
    private app.bolivia.swing.JCTextField y;
    // End of variables declaration//GEN-END:variables
}
