/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static library.newstudent.okcancel;

/**
 *
 * @author install
 */
public class returnbook extends javax.swing.JFrame {

    /**
     * Creates new form returnbook
     */
    public returnbook() {
        initComponents();
    }

    public String loginname;
    public returnbook(String name){
        initComponents();
        this.loginname=name;
    }
    
    public static Connection myConnection(){
    Connection con = null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
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

        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        bn = new javax.swing.JTextField();
        sn = new javax.swing.JTextField();
        is = new javax.swing.JTextField();
        rd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        bd = new app.bolivia.swing.JCTextField();
        jLabel22 = new javax.swing.JLabel();
        sd = new app.bolivia.swing.JCTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jCTextField3 = new app.bolivia.swing.JCTextField();
        jLabel26 = new javax.swing.JLabel();
        jCTextField4 = new app.bolivia.swing.JCTextField();
        jLabel27 = new javax.swing.JLabel();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        sr = new javax.swing.JButton();
        re = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 0, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 204, 204));
        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel14.setText("Return Date     :");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 160, -1));

        jLabel15.setBackground(new java.awt.Color(255, 204, 204));
        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setText("Student Name  :");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 160, -1));

        jLabel16.setBackground(new java.awt.Color(255, 204, 204));
        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel16.setText("Issue Date       :");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 160, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Literature_100px_1.png"))); // NOI18N
        jLabel17.setText("BOOK DETAILS");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 310, 90));

        jLabel18.setBackground(new java.awt.Color(255, 204, 204));
        jLabel18.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel18.setText("Book Name      :");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 150, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 2));

        jLabel19.setBackground(new java.awt.Color(255, 204, 204));
        jLabel19.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel19.setText("issue id           :");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 160, -1));

        id.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 210, 30));

        bn.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        bn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });
        jPanel5.add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 210, 30));

        sn.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        jPanel5.add(sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 210, 30));

        is.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        is.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isActionPerformed(evt);
            }
        });
        jPanel5.add(is, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 210, 30));

        rd.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdActionPerformed(evt);
            }
        });
        jPanel5.add(rd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 210, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_50px_1.png"))); // NOI18N
        jLabel20.setText("RETURN BOOK");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 460, 90));

        jPanel7.setBackground(new java.awt.Color(255, 0, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 310, 2));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 520, 100));

        bd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        bd.setPlaceholder("book id ..");
        bd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                bdFocusLost(evt);
            }
        });
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });
        jPanel1.add(bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 240, -1));

        jLabel22.setBackground(new java.awt.Color(255, 204, 204));
        jLabel22.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel22.setText("     Book id   :");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 190, -1));

        sd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        sd.setPlaceholder("student id ..");
        sd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sdFocusLost(evt);
            }
        });
        sd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdActionPerformed(evt);
            }
        });
        jPanel1.add(sd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 240, -1));

        jLabel23.setBackground(new java.awt.Color(255, 204, 204));
        jLabel23.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel23.setText("     Student id   :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 190, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/icons8_Book_50px_1.png"))); // NOI18N
        jLabel24.setText("BOOK DETAILS");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 90));

        jPanel8.setBackground(new java.awt.Color(255, 0, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 310, 2));

        jLabel25.setBackground(new java.awt.Color(255, 204, 204));
        jLabel25.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel25.setText("Issue date   :");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 130, -1));

        jCTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        jCTextField3.setPlaceholder("book id ..");
        jCTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 220, -1));

        jLabel26.setBackground(new java.awt.Color(255, 204, 204));
        jLabel26.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel26.setText("Student id   :");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        jCTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 0, 0)));
        jCTextField4.setPlaceholder("student id ..");
        jCTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTextField4ActionPerformed(evt);
            }
        });
        jPanel3.add(jCTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 220, -1));

        jLabel27.setBackground(new java.awt.Color(255, 204, 204));
        jLabel27.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel27.setText("Student id   :");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, -1));

        rSDateChooser2.setBackground(new java.awt.Color(255, 51, 51));
        rSDateChooser2.setColorBackground(new java.awt.Color(255, 51, 51));
        rSDateChooser2.setPlaceholder("issue date");
        jPanel3.add(rSDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 390, 700));

        sr.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        sr.setForeground(new java.awt.Color(255, 0, 51));
        sr.setText("SEARCH");
        sr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srActionPerformed(evt);
            }
        });
        jPanel1.add(sr, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 170, 40));

        re.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        re.setForeground(new java.awt.Color(255, 0, 51));
        re.setText("RETURN");
        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });
        jPanel1.add(re, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 680, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new home(loginname).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void bnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnActionPerformed

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

    private void isActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isActionPerformed

    private void rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdActionPerformed

    private void bdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bdFocusLost
        // TODO add your handling code here:
        /* if(!bd.getText().equals(" ")){
            getBookDetails();
        }*/
    }//GEN-LAST:event_bdFocusLost

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
        // TODO add your handling code here:
        // getBookDetails();
        //  public void getBookDetails(){

    }//GEN-LAST:event_bdActionPerformed

    private void sdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdFocusLost
        // TODO add your handling code here:
        /*  if(!sd.getText().equals(" ")){
            sdActionPerformed(java.);
        }*/
    }//GEN-LAST:event_sdFocusLost

    private void sdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdActionPerformed
        // TODO add your handling code here:
        //  getStudentDetails();
        //  public void getStudentDetails(){

    }//GEN-LAST:event_sdActionPerformed

    private void jCTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField3ActionPerformed

    private void jCTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTextField4ActionPerformed

    private void srActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srActionPerformed
        // TODO add your handling code here:
         Connection con=myConnection();
      
       try {
            java.sql.PreparedStatement prest,prest1;
            int book_id = Integer.parseInt(bd.getText());
         //    int s_id = Integer.parseInt(sd.getText());
             
            String returnb ="select * from issue where book_id= "+book_id;
            

            prest= con.prepareStatement(returnb);
          //  prest.setInt(1,book_id);

            ResultSet rs = prest.executeQuery();
            
            if (rs.next()) {
                int i = okcancel("Searching...");
                System.out.println("ret:" + i);
            while(rs.next()){
                
              // bid.setText(String.valueOf(rs.getInt("b_id")));//
                id.setText(rs.getString("issue_id"));
                bn.setText(rs.getString("bname"));
                sn.setText(rs.getString("student_name"));
                is.setText(rs.getString("i_date"));
                rd.setText(rs.getString("d_date"));
             }
            }
            else {
                int j = okcancel("wrong");
                System.out.println("ret:" + j);
                con.close();
                bd.setText("");
                sd.setText("");
            }

            rs.close();

            prest.close();
       } catch (SQLException ex) {
            Logger.getLogger(issuebook.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (NumberFormatException e) {
            {
                e.getMessage();  //You can use anyone like printStackTrace() ,getMessage() to handle the Exception
             }
        }
      
    }//GEN-LAST:event_srActionPerformed

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed
        // TODO add your handling code here:
         Connection con = myConnection();
        try{
            String iid = id.getText();
            String bid = bd.getText();
            String sid = sd.getText();
            String bookn = bn.getText();
            String student = sn.getText();
            String iss = is.getText();
            String ret = rd.getText();
//            
            
//            String y String ca = id.getText();
//           r = rd.get();
//            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//            idate = sdf1.format(is.getDa)
//            rdate = sdf.format(rd.getDate());

            java.sql.PreparedStatement prest;
            String book = "INSERT INTO returnbook(issue_id,bname,student_name,i_date,r_date)VALUES('"+iid+"','"+bookn+"','"+student+"','"+iss+"','"+ret+"')";
            prest = con.prepareStatement(book); 
            
            int count = prest.executeUpdate();
            if (count>0)
            {
                int i = okcancel("Book Returned");
                System.out.println("ret" +i);
                dispose();
                new home(loginname).setVisible(true);
                con.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(newbook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_reActionPerformed

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
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField bd;
    private javax.swing.JTextField bn;
    private javax.swing.JTextField id;
    private javax.swing.JTextField is;
    private javax.swing.JButton jButton3;
    private app.bolivia.swing.JCTextField jCTextField3;
    private app.bolivia.swing.JCTextField jCTextField4;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private rojeru_san.componentes.RSDateChooser rSDateChooser2;
    private javax.swing.JTextField rd;
    private javax.swing.JButton re;
    private app.bolivia.swing.JCTextField sd;
    private javax.swing.JTextField sn;
    private javax.swing.JButton sr;
    // End of variables declaration//GEN-END:variables
}