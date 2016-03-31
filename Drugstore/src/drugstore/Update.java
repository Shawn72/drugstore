package drugstore;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 * @author SHAWN
 */
public class Update extends javax.swing.JFrame {
Connection conn;String dne,qt,exp;
int total;
      public void Imagers(){
    URL url=getClass().getResource("drugsIcon.jpg");
    ImageIcon icon=new ImageIcon(url);
    Image image=icon.getImage();
    this.setIconImage(image);
      }
    public Update() {
        initComponents();
        Imagers();
        datei.getDateEditor().setEnabled(false);
        setLocationRelativeTo(this);
           
             try {
                 Class.forName("com.mysql.jdbc.Driver");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
             }
              conn =Javaconect.connectme();//create connection to the database
             if (conn!= null) {
                System.out.println("Connected to database");
             }
             else
             {
         JOptionPane.showMessageDialog(this,"Please switch on MySQL server");
             }
          fillcombobox1();
          today();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        datei = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Update the drugs that already exist in the records");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Select drug:");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Received Qty:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Updated Qty:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 255, 102));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Existing Qty");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 255));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/back2.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.setEnabled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/update.jpg"))); // NOI18N
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/back.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(15);
        jButton2.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/home1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/exit.jpg"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setIconTextGap(15);
        jButton3.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/exit2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/add1.png"))); // NOI18N
        jButton4.setText("TOTAL");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/add2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextField1KeyTyped(evt);
            }
        });

        datei.setDateFormatString("yyy-MM-dd");
        datei.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Expiry Date:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jTextField1.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("REFRESH");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1)
                            .addComponent(jTextField2)
                            .addComponent(datei, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 66, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(datei, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
try{
String cb=  jComboBox1.getSelectedItem().toString();   
String qtrvd= jFormattedTextField1.getText(); 
String upd=jTextField2.getText();
if(qtrvd.equals("") || qtrvd.startsWith(" ")){
JOptionPane.showMessageDialog(null, "Please fill the textfield!");//checking for empty fields.
}
else{    //updating stock with new datails
   String sq="UPDATE drug_stock SET quantity=? WHERE drug_name='"+cb+"'"; 
   PreparedStatement stat = conn.prepareStatement(sq);
    stat.setString(1, upd);
  
   int rowInsert=stat.executeUpdate();
   if(rowInsert>0){
       JOptionPane.showMessageDialog(null, ""+cb+" stock updated successfully."); 
   }
 }
}catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }
Update u=new Update();
u.setVisible(true); 
dispose();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
try{ 
    String dn=(String)jComboBox1.getSelectedItem().toString();
    String sm="SELECT * FROM drug_stock where drug_name='"+dn+"'";
    Statement statement=conn.createStatement();
    ResultSet rs=statement.executeQuery(sm);
    
    if(rs.next()){
    dne=rs.getString("drug_name");
    qt=rs.getString("quantity");
    jTextField1.setText(qt);
    exp=rs.getDate("expiry_date").toString();
    ((JTextField)datei.getDateEditor().getUiComponent()).setText(exp);
    }

    try{
     String dt=jLabel8.getText();
     SimpleDateFormat dat = new SimpleDateFormat("yyyy-MM-dd");
     Date dat1=dat.parse(exp);
     Date dat2=dat.parse(dt);
     dat1.compareTo(dat2);
     if(dat1.before(dat2))
     {
      jLabel8.setForeground(Color.RED);
      JOptionPane.showMessageDialog(this, ""+dn+" has expired,please update");
       }
     else if(dat1.after(dat2))
     {
    jLabel8.setForeground(Color.GREEN);
     }else
    {
     jLabel8.setForeground(Color.RED);
     JOptionPane.showMessageDialog(this, ""+dn+" expires today, please update");
    }
   }
  catch(Exception e){}
     
  int qy=Integer.parseInt(qt);
  if(dn.equals(dne)){
  jFormattedTextField1.setText("");
  jTextField2.setText("0");
  }
  if(qy<25)
  {
  jTextField1.setForeground(Color.RED);
  }
  else if(qy>26)
  {
  jTextField1.setForeground(Color.GREEN);
  }
}
catch(SQLException e){
        e.printStackTrace();
}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
String cb=  jComboBox1.getSelectedItem().toString();   
String qtrvd= jFormattedTextField1.getText(); 
String upd=jTextField2.getText();

if(qtrvd.equals("") || qtrvd.startsWith(" ")){
JOptionPane.showMessageDialog(null, "Please fill the textfield!");//checking for empty fields.
if(((JTextField)datei.getDateEditor().getUiComponent()).getText().equals("")){
JOptionPane.showMessageDialog(this, "Please provide a date");
}
}
else{ //updating stock records     
   String sq="UPDATE drug_stock SET quantity=?,expiry_date=? WHERE drug_name='"+cb+"'"; 
   PreparedStatement stat = conn.prepareStatement(sq);
    stat.setString(1, upd);
    stat.setString(2, ((JTextField) datei.getDateEditor().getUiComponent()).getText());
  
   int rowInsert=stat.executeUpdate();
   if(rowInsert>0){
       JOptionPane.showMessageDialog(null, ""+cb+" stock updated successfully."); 
    }
  }
 }catch (SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }
String us=jLabel9.getText();
Update u=new Update();
u.setVisible(true); 
jLabel9.setText(us);
dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try{  
String qtrvd= jFormattedTextField1.getText(); 
String qtinstock=jTextField1.getText();
int q=Integer.parseInt(qtrvd);
int n=Integer.parseInt(qtinstock);
if(jFormattedTextField1.getText().trim().equals("") || jFormattedTextField1.getText().trim().startsWith(" ")){
   JOptionPane.showMessageDialog(null, "Please fill the textfield!"); 
   }
else{
total=n+q;
String tot= Integer.toString(total);
jTextField2.setText(tot);
jTextField1.setText(tot);
jButton1.setEnabled(true);
  }
}
catch(NumberFormatException e){
JOptionPane.showMessageDialog(this, " Bad number format,PRESS BACKSPACE!!!");
}
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jFormattedTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField1KeyTyped
//textfield validation.
char ch=evt.getKeyChar();
if(!(Character.isDigit(ch)||(ch==KeyEvent.VK_BACK_SPACE) || ch==KeyEvent.VK_DELETE)){
    getToolkit().beep();
   evt.consume();
}
    }//GEN-LAST:event_jFormattedTextField1KeyTyped

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
try{  
String qtrvd= jFormattedTextField1.getText(); 
String qtinstock=jTextField1.getText();
int q=Integer.parseInt(qtrvd);
int n=Integer.parseInt(qtinstock);

if(jFormattedTextField1.getText().trim().equals("") || jFormattedTextField1.getText().trim().startsWith(" ")){
   JOptionPane.showMessageDialog(null, "Please fill the textfield!"); 
   }
else{
total=n+q;
String tot= Integer.toString(total);

jTextField2.setText(tot);
jTextField1.setText(tot);
jButton1.setEnabled(true);
jButton4.setEnabled(false);
   }
}
catch(NumberFormatException e){
JOptionPane.showMessageDialog(this, " Bad number format,PRESS BACKSPACE!!!");
}
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Homepage hp=new Homepage();
hp.setVisible(true);
dispose();
Homepage.jLabel15.setText(Update.jLabel9.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(EXIT_ON_CLOSE);       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
updateexist();        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
char ch=evt.getKeyChar();
if(!(Character.isDigit(ch)||(ch==KeyEvent.VK_BACK_SPACE) || ch==KeyEvent.VK_DELETE)){
    getToolkit().beep();
   evt.consume();
}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String usd=jLabel9.getText();
        Update pk = new Update();
        pk.setVisible(true);
        dispose();
        jLabel9.setText(usd);
       
    }//GEN-LAST:event_jButton5ActionPerformed
 
 public void updateexist(){
try{
String cb=  jComboBox1.getSelectedItem().toString();     
String qtinstock=jTextField1.getText();

String sq="UPDATE drug_stock SET quantity=? WHERE drug_name='"+cb+"'"; 
PreparedStatement stat = conn.prepareStatement(sq);
stat.setString(1, qtinstock);
  
   int rowInsert=stat.executeUpdate();
   if(rowInsert>0){
       JOptionPane.showMessageDialog(null, ""+cb+" stock quantity updated successfully."); 
    }
 }catch(SQLException ex){
     
 }
 }   
    
    
    public void fillcombobox1(){// method to fetch the drug list from stock records.
try{
    String sm="SELECT * FROM drug_stock";
    Statement statement=conn.createStatement();
    ResultSet rs=statement.executeQuery(sm);
    while(rs.next()){
    String dne=rs.getString("drug_name");
    String qtyex=rs.getString("quantity");
    jComboBox1.addItem(dne); 
    jLabel6.setText(qtyex);
    jFormattedTextField1.setText("");
   }
}catch(SQLException e){
        e.printStackTrace();
    }
}
 
   public void today(){//method to display date and time on the screen
        Thread clock=new Thread()
        {
        @Override
        public void run()
        {
         for(;;) {
               String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    jLabel8.setText(date);
                    }
                  }
                 };
             clock.start();   
            } 
 
 
 
public static void main(String args[]) {
     java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Update().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datei;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
