package drugstore;

import static drugstore.Deleteditems.jComboBox1;
import java.awt.Image;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Glory
 */
public class Deletedsales extends javax.swing.JFrame {
Connection conn;
    public void Imagers(){
    URL url=getClass().getResource("drugsIcon.jpg");
    ImageIcon icon=new ImageIcon(url);
    Image image=icon.getImage();
    this.setIconImage(image);
      }
    public Deletedsales() {
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
JOptionPane.showMessageDialog(this,"Please switch on MySQL server");             }
              fillcombobox1();//calling method for fetching drug list from the database.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Deleted drug sales");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("RECOVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("REFRESH");
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    try{
    String drg=jComboBox1.getSelectedItem().toString();
    
    String del="select * from salesdeleted where drug_name='"+drg+"'";
    Statement statement=conn.createStatement();
    ResultSet rs=statement.executeQuery(del);
    if(rs.next()){
    String did=rs.getString("drug_id");
    String dnme=rs.getString("drug_name");
    String cat=rs.getString("category");
    String dtyp=rs.getString("drug_type");
    String dpps=rs.getString("drug_purpose");
    String expd=rs.getString("expiry_date");
    String qsd=rs.getString("quantity_sold");
    String qlt=rs.getString("quantity_left");
    String tcst=rs.getString("total_cost");
    String dat=rs.getString("date");
    
                String sql = "INSERT IGNORE INTO sales_details ( drug_id, drug_name,category,drug_type, drug_purpose,expiry_date,quantity_sold,"
                        + " quantity_left,total_cost,date) VALUES (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement state = conn.prepareStatement(sql);
                state.setString(1, did);
                state.setString(2, dnme);
                state.setString(3, cat);
                state.setString(4,dtyp );
                state.setString(5, dpps);
                state.setString(6, expd);
                state.setString(7, qsd);
                state.setString(8, qlt);
                state.setString(9, tcst);
                state.setString(10, dat);
                int rowsInserted = state.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, ""+drg+" recovered successfully from trashed items");

                  }else{ JOptionPane.showMessageDialog(null, "Unknown error");
                }
     }
     
     //Deleting a record
   String sm="DELETE FROM salesdeleted where (drug_name)=(?)";
   PreparedStatement stat=conn.prepareStatement(sm);
   stat.setString(1, drg);
    
   int rowsDeleted=stat.executeUpdate();
   if(rowsDeleted>0){
   JOptionPane.showMessageDialog(this, ""+drg+" sales trash status changed!!");
   Drugdispenser.jComboBox1.addItem(drg);
   }    
}catch(SQLException e){
     } }catch(NullPointerException e){
 JOptionPane.showMessageDialog(this, "Database empty, no deleted items");}     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
Homepage hp=new Homepage();
hp.setVisible(true);
dispose();
Homepage.jLabel15.setText(Deletedsales.jLabel2.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String u=jLabel2.getText();
Deletedsales it=new Deletedsales();
it.setVisible(true);
jLabel2.setText(u);
dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
public void fillcombobox1(){
try{
    String sm="SELECT * FROM salesdeleted";
    Statement statement=conn.createStatement();
    ResultSet rs=statement.executeQuery(sm);
    while(rs.next()){
    String dne=rs.getString("drug_name");
    jComboBox1.addItem(dne); 
    }
   }catch(SQLException e){
  }
}
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
            java.util.logging.Logger.getLogger(Deletedsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletedsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletedsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletedsales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Deletedsales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
