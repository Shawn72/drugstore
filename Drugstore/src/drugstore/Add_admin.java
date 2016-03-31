package drugstore;
import static drugstore.Createacc.jTextField5;
import static drugstore.Createacc.jTextField6;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author SHAWN
 */
public class Add_admin extends javax.swing.JFrame {
Connection conn;
String pswd,psw,usere,usern;
      public void Imagers(){
    URL url=getClass().getResource("drugsIcon.jpg");
    ImageIcon icon=new ImageIcon(url);
    Image image=icon.getImage();
    this.setIconImage(image);
      }
    public Add_admin() {
        initComponents();
        Imagers();
        setLocationRelativeTo(this);
               try {
                 Class.forName("com.mysql.jdbc.Driver");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
             }
              conn =Javaconect.connectme();//create connection to the database
             if (conn!= null) {
                System.out.println("Connected to database");
             }else
             {
              JOptionPane.showMessageDialog(null,"Please switch on MySQL server and restart the Application");
              Admin ad=new Admin();
              ad.dispose();
             }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Admin password");

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(340, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(29, 29, 29))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void addadm(){
      try{
          try{
            String mb = Createacc.jTextField4.getText();
            String mn = Createacc.jTextField2.getText();
            String ln = Createacc.jTextField3.getText();
            String fn = Createacc.jTextField1.getText();
            String eml = Createacc.jTextField5.getText();
            String usnm = Createacc.jTextField6.getText();
            char[] apsd =jPasswordField1.getPassword();
            String psd1=Createacc.jPasswordField1.getText();
            String psd2=Createacc.jPasswordField2.getText();
            String ut = Createacc.jComboBox1.getSelectedItem().toString();
        
            String usertype="Administrator";
          if(apsd.equals("") || psd1.equals("") || psd1.equals(""))
       {
      JOptionPane.showMessageDialog(null, "Please enter the password!!");
       }
       else{
        String query="SELECT * FROM user_accounts where user_type='"+usertype+"'";
        Statement statement =  conn.createStatement();
        ResultSet rs =  statement.executeQuery(query);
      
        if(rs.next()){
         usere = rs.getString("user_email");
         usern = rs.getString("user_name");
         psw=rs.getString("password");
         
        if(jTextField5.getText().equals(usere)){//checking whether the user details are taken by another user
         JOptionPane.showMessageDialog(null, "That email is already taken, choose another");
          jTextField5.setText(" ");
          }
         
        if (jTextField6.getText().equals(usern)){
           JOptionPane.showMessageDialog(null, "That username is already taken, choose another");
           jTextField6.setText(" ");
           }
         }
       }
       char[]pss=psw.toCharArray();
     if (mb.equals("") || mn.equals("") || ln.equals("") || eml.equals("")
         || usnm.equals("") || apsd.equals("")) {
         JOptionPane.showMessageDialog(null, "Please fill out all the fields!");//checking for empty fields.
            }
        else if (Arrays.equals(apsd,pss)){///Password validation.

               //Registering new user...creating new a user account.
                String sqlv = "INSERT IGNORE INTO user_accounts (user_type, f_name, m_name, l_name, user_email, "
                        + "mobile, user_name, password) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement state = conn.prepareStatement(sqlv);

                state.setString(1, ut);
                state.setString(2, fn);
                state.setString(3, mn);
                state.setString(4, ln);
                state.setString(5, eml);
                state.setString(6, mb);
                state.setString(7, usnm);
                state.setString(8, psd2);
              
                int rowsInserted = state.executeUpdate();
                if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "account created successfully");
                    dispose();
                    
                }
             }else{
           JOptionPane.showMessageDialog(null, "Wrong password!!");
           jPasswordField1.setText("");
        }
      }
     catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
     }
    }catch(NumberFormatException e){
       e.getMessage();
       }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         addadm();
    }//GEN-LAST:event_jButton1ActionPerformed
    public void deleteitem(){
    try{
       String eml=Deleteuser.jComboBox1.getSelectedItem().toString();
       psw=jPasswordField1.getText();
       String ust="Administrator";
       String query="SELECT password from user_accounts"
               + " where user_type='"+ust+"'";
       Statement statement =  conn.createStatement();
       ResultSet rsa =  statement.executeQuery(query);
        
    
     if(rsa.next()){
      pswd=rsa.getString("password");
     }
     if(psw.equals(pswd)){ 
     //deleting a user from the user details table.
     String sm="DELETE FROM user_accounts where (user_email)=(?)";
     PreparedStatement stat=conn.prepareStatement(sm);
     stat.setString(1, eml);
     int rowsDeleted=stat.executeUpdate();
     if(rowsDeleted>0){   
     JOptionPane.showMessageDialog(this, ""+eml+" deleted successfully!!");
     dispose();
       } 
      } 
    else{
       JOptionPane.showMessageDialog(rootPane, "Wrong password!!","Error Message!!",
    JOptionPane.WARNING_MESSAGE); 
       jPasswordField1.setText("");
     }
    
}catch(SQLException e){} 
 }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
deleteitem();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost

    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   Homepage g=new Homepage();
   g.setVisible(true);
   dispose();
   Homepage.jLabel15.setText("Logged in as:  Administrator");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased

    }//GEN-LAST:event_jPasswordField1KeyReleased
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
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Add_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
