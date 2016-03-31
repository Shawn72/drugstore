package drugstore;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * @author SHAWN
 */

public class Drugdispenser extends javax.swing.JFrame {

    public void clock() {//method to display date and time on the screen
        Thread clock = new Thread() {
            @Override
            public void run() {
                try {
                    for (;;) {
                        String date = new SimpleDateFormat("EEEE       dd-MM-yyyy        HH:mm:ss").format(new Date());
                        jLabel11.setText(date);
                        sleep(1000);
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        };

        clock.start();
    }
    Connection conn;
    Statement stt, stm;
    double total, qto, total2, total3;
    String snm, dnm, dati;

    public void Imagers() {
        URL url = getClass().getResource("drugsIcon.jpg");
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage();
        this.setIconImage(image);
    }

    public Drugdispenser() {
        initComponents();
        Imagers();
        setLocationRelativeTo(this);
        //jLabel17.setText("Logged in as:"+Login.jTextField1.getText());
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn = Javaconect.connectme();//create connection to the database
        if (conn != null) {
            System.out.println("Connected to database");
        } else {
            JOptionPane.showMessageDialog(null, "Please switch on MySQL server and restart the Application");
            Drugdispenser ad = new Drugdispenser();
            ad.dispose();
        }
        datess();
        fillcombobox1();
        clock();
        today();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dose = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRUGSTORE RECORD MANAGEMENT SYSTEM");
        setResizable(false);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DRUG STOCK OUT RECORDING PAGE");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Please enter the details of the drugs sold to the client");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Drug-Name:");

        jTextField6.setBackground(new java.awt.Color(255, 204, 204));
        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 204));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Category:");

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(204, 204, 255));
        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 204));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Drug-Type:");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Drug-Purpose:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Expiry date:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Qty out:");

        jComboBox1.setBackground(new java.awt.Color(255, 102, 255));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Qty left:");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 255));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 51, 204));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Cost:");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(204, 204, 255));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 102, 255));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/save1.png"))); // NOI18N
        jButton1.setText("SAVE RECORD");
        jButton1.setEnabled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setMargin(new java.awt.Insets(2, 0, 2, 6));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/save2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/refresh1.jpg"))); // NOI18N
        jButton2.setText("REFRESH");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/refresh.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/add2.png"))); // NOI18N
        jButton3.setText("COMPUTE TOTAL COST");
        jButton3.setEnabled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/add1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/delete12.png"))); // NOI18N
        jButton4.setText("DELETE RECORD");
        jButton4.setEnabled(false);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setMargin(new java.awt.Insets(2, 1, 2, 14));
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/delete1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/view1.jpg"))); // NOI18N
        jButton5.setText("STOCK REPORT");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/view2.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/back.png"))); // NOI18N
        jButton6.setText("BACK TO LOGIN");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/home1.png"))); // NOI18N
        jButton6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton6MouseMoved(evt);
            }
        });
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 102, 255));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 51));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/exit.jpg"))); // NOI18N
        jButton7.setText("EXIT PAGE");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setMargin(new java.awt.Insets(2, 0, 2, 4));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/exit2.png"))); // NOI18N
        jButton7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton7MouseMoved(evt);
            }
        });
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(204, 204, 255));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 255));

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(204, 204, 255));
        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 204));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Quantity in stock:");

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 204, 204));
        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 204));

        jTextField10.setBackground(new java.awt.Color(204, 204, 255));
        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(51, 0, 204));
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Unit Cost:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Quantity sold:");

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/back2.png"))); // NOI18N
        jButton8.setText("UPDATE RECORD");
        jButton8.setEnabled(false);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setMargin(new java.awt.Insets(2, 0, 2, 5));
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/update.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setEditable(false);
        jFormattedTextField1.setForeground(new java.awt.Color(51, 51, 255));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jFormattedTextField2.setEditable(false);
        jFormattedTextField2.setForeground(new java.awt.Color(51, 51, 255));
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("Kshs:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("Date Today:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 255));
        jLabel19.setText("ID: ");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel20.setIconTextGap(0);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Dosage:");

        dose.setEditable(false);
        dose.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dose.setForeground(new java.awt.Color(51, 51, 255));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/drugs4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/refresh.png"))); // NOI18N
        jButton9.setToolTipText("Reload");
        jButton9.setEnabled(false);
        jButton9.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/refresh1.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/search2.png"))); // NOI18N
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/search3.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 255));
        jLabel24.setText("CASH:");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 51, 255));
        jButton14.setText("CHANGE");
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 102, 255));
        jButton12.setText("RECEIPT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 255));
        jButton11.setText("TOTAL");
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 102, 255));
        jButton13.setText("ADD");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(jButton9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField8)
                                                        .addComponent(jTextField7)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField3)
                                                        .addComponent(jTextField4)
                                                        .addComponent(jTextField5))
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(18, 18, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jTextField6)
                                                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dose, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(dose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );

        jDesktopPane1.add(jPanel3);
        jPanel3.setBounds(10, 10, 900, 480);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 255));
        jLabel23.setText("Logged in as:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed

    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String cb = (String) jComboBox1.getSelectedItem().toString();
            String ctry = jTextField5.getText();
            String ql = jTextField3.getText();
            String dtyp = jTextField8.getText();
            String dps = jTextField7.getText();
            String exp = jTextField1.getText();
            String qs = jFormattedTextField1.getText();
            String updates = jFormattedTextField2.getText();
            String idd = jLabel4.getText();
            String dd = jLabel20.getText();

            if (jTextField6.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the textfield!");
            }
            //recording drugs sold,..the drugs out of the store to customers  
            String sql = "INSERT INTO sales_details (drug_id,drug_name, category, drug_type,"
                    + " drug_purpose, expiry_date, date, quantity_sold, quantity_left,"
                    + " total_cost) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, idd);
            statement.setString(2, cb);
            statement.setString(3, ctry);
            statement.setString(4, dtyp);
            statement.setString(5, dps);
            statement.setString(6, exp);
            statement.setString(7, dd);
            statement.setString(8, qs);
            statement.setString(9, ql);
            statement.setString(10, updates);
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(null, "" + cb + " sales recorded sucessfully");
                jButton1.setEnabled(false);
                jButton3.setEnabled(false);
            }

            String sqq = "UPDATE sales_details SET quantity_left=?,quantity_sold=?,total_cost=?WHERE drug_name='" + cb + "' AND date='" + dd + "'";
            PreparedStatement sta = conn.prepareStatement(sqq);

            sta.setString(1, ql);
            sta.setString(2, qs);
            sta.setString(3, updates);

            int rowInser = sta.executeUpdate();
            if (rowInser > 0) {
                JOptionPane.showMessageDialog(null, "" + cb + " sales details updated successfully.");
            }

            String tcs = jTextField10.getText();
            Double csst = Double.parseDouble(tcs);

            String tc = jTextField9.getText();
            Double cs = Double.parseDouble(tc);

            double uptcst = csst * cs;
            String tct = Double.toString(uptcst);

            //Updating details of the drugs in stock.
            String sq = "UPDATE drug_stock SET quantity=?, total_cost=? WHERE drug_name='" + cb + "'";
            PreparedStatement stat = conn.prepareStatement(sq);

            stat.setString(1, ql);
            stat.setString(2, tct);

            int rowInsert = stat.executeUpdate();
            if (rowInsert > 0) {
                JOptionPane.showMessageDialog(null, "" + cb + " stock updated successfully.");
            }
            jButton1.setEnabled(false);
            jButton8.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill the required info please");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        try {
            String dn = (String) jComboBox1.getSelectedItem().toString();

            String sm = "SELECT * FROM drug_stock where drug_name='" + dn + "'";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sm);

            if (rs.next()) {
                String di = rs.getString("drug_id");
                jLabel4.setText(di);
                String cat = rs.getString("category");
                jTextField5.setText(cat);
                String typ = rs.getString("drug_type");
                jTextField8.setText(typ);
                String dpps = rs.getString("drug_purpose");
                jTextField7.setText(dpps);
                String exp = rs.getDate("expiry_date").toString();
                jTextField1.setText(exp);
                String ds = rs.getString("dosage");
                dose.setText(ds);
                String qtstk = rs.getString("quantity");
                jTextField9.setText(qtstk);
                String cpu = rs.getString("cost_per_unit");
                jTextField10.setText(cpu);

                String dt = jLabel20.getText();
                jTextField6.setText("");
                jTextField2.setText("");
                
                try {
                    SimpleDateFormat dat = new SimpleDateFormat("yyyy-MM-dd");
                    Date dat1 = dat.parse(exp);
                    Date dat2 = dat.parse(dt);
                    dat1.compareTo(dat2);
                    if (dat1.before(dat2)) {
                        jTextField1.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(this, "" + dn + " has expired,please dispose or update");
                        jButton1.setEnabled(false);
                        jButton8.setEnabled(false);
                        jTextField6.setEditable(false);
                        jFormattedTextField1.setEnabled(false);
                        jFormattedTextField2.setEnabled(false);
                    } else if (dat1.after(dat2)) {
                        jTextField1.setBackground(Color.GREEN);
                    } else {
                        jTextField1.setBackground(Color.RED);
                        JOptionPane.showMessageDialog(this, "" + dn + " expires today");
                        jButton1.setEnabled(false);
                        jButton8.setEnabled(false);
                        jFormattedTextField1.setEnabled(false);
                        jFormattedTextField2.setEnabled(false);
                    }
                } catch (Exception e) {
                }

                int q = Integer.parseInt(qtstk);
                if (q < 25) {
                    jTextField9.setBackground(Color.RED);
                    JOptionPane.showMessageDialog(this, "Please place an Order for " + dn + "");
                } else {
                    jTextField9.setBackground(Color.GREEN);
                }
                String sql = "select * from sales_details where drug_name='" + dn + "'";
                Statement statem = conn.createStatement();
                ResultSet rss = statem.executeQuery(sql);
                while (rss.next()) {
                    snm = rss.getString("drug_name");
                    String qs = rss.getString("quantity_sold");
                    jFormattedTextField1.setText(qs);
                    String c = rss.getString("total_cost");
                    jFormattedTextField2.setText(c);
                }
                if (dn.equals(snm)) {
                    jFormattedTextField1.setEditable(false);
                    jFormattedTextField2.setEditable(false);
                    jButton8.setEnabled(true);
                    jButton1.setEnabled(false);
                } else {
                    jFormattedTextField1.setEditable(false);
                    jFormattedTextField1.setText("0");
                    jFormattedTextField2.setText("0");
                    jButton1.setEnabled(false);
                    jButton8.setEnabled(false);
                }
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        calcprice();
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ud=jLabel17.getText();
        Drugdispenser dp = new Drugdispenser();
        dp.setVisible(true);
        dispose();
        jButton1.setEnabled(true);
        jLabel17.setText(ud); 
        jButton2.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
    }//GEN-LAST:event_jTextField8ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  calcprice();      
    }//GEN-LAST:event_jButton3ActionPerformed
public void calcprice(){
try {
            try {
                String qt = jTextField6.getText();
                String qtinstock = jTextField9.getText();
                String tt = jTextField10.getText();

                if (jTextField6.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please fill the textfield!");
                     String ud=jLabel17.getText();
                     Drugdispenser dp = new Drugdispenser();
                     dp.setVisible(true);
                     dispose();
                     jLabel17.setText(ud);
                     if(ud.equals("Administrator")){
                     jButton9.setEnabled(true);
                     }
                } else {
                    int n = Integer.parseInt(qtinstock);
                    int m = Integer.parseInt(qt);
                    double ttl = Double.parseDouble(tt);

                    String qst = jFormattedTextField1.getText();
                    int qs = Integer.parseInt(qst);
                    String cs = jFormattedTextField2.getText();
                    double cst = Double.parseDouble(cs);

                    if (m > n) {
                        JOptionPane.showMessageDialog(null, "Quantity out can't be greater than quantity in stock, try again!!");
                        jTextField6.setText(" ");
                        jTextField3.setText(" ");
                        jTextField4.setText(" ");

                     String ud=jLabel17.getText();
                     Drugdispenser dp = new Drugdispenser();
                     dp.setVisible(true);
                     dispose();
                     jLabel17.setText(ud); 
                     if(ud.equals("Administrator")){
                     jButton9.setEnabled(true);
                     }
                    } else { //calculating the cost of the stock out and stock left.
                        int sum = m + qs;
                        total2 = n * ttl;
                        total = m * ttl;
                        int sub = n - m;
                        double updcst = total + cst;

                        String up = Double.toString(updcst);
                        String tot = Integer.toString(sub);
                        String upqt = Double.toString(sum);
                        jTextField3.setText(tot);
                        DecimalFormat df=new DecimalFormat("0.00");
                        jTextField4.setText(df.format(total));
                        jFormattedTextField1.setText(upqt);
                        jFormattedTextField2.setText(up);
                        jTextField9.setText(tot);
                        jButton13.setEnabled(true);
                        String nam = (String) jComboBox1.getSelectedItem().toString();
                        if (sub < 25) {
                            jTextField9.setBackground(Color.RED);
                            JOptionPane.showMessageDialog(null, "" + nam + " stock is RUNNING LOW please make an order.");
                        } else {
                            jTextField9.setBackground(Color.YELLOW);
                        }
                    }
                }
                String na = (String) jComboBox1.getSelectedItem().toString();
                String sql = "select * from sales_details where drug_name='" + na + "'";
                Statement statem = conn.createStatement();
                ResultSet rss = statem.executeQuery(sql);

                while (rss.next()) {
                    dnm = rss.getString("drug_name");
                    dati = rss.getString("date");
                }
                if (na.equalsIgnoreCase(dnm) && jLabel20.getText().trim().equals(dati)) {
                    jButton8.setEnabled(true);
                    jButton1.setEnabled(false);
                    jButton3.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Click Update");
                } else if (!na.equalsIgnoreCase(dnm) && jLabel20.getText().trim().equals(dati)) {
                    jButton1.setEnabled(true);
                    jButton8.setEnabled(false);
                } else if (na.equalsIgnoreCase(dnm) && !jLabel20.getText().trim().equals(dati)) {
                    jButton1.setEnabled(true);
                    jButton3.setEnabled(false);
                    jButton8.setEnabled(false);
                } else {
                    jButton1.setEnabled(true);
                    jButton3.setEnabled(false);
                    jButton8.setEnabled(false);
                }

            } catch (SQLException e) {
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Integers only");
        }
}
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
        Drugdispenser d = new Drugdispenser();
        d.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Report ty = new Report();
        ty.setVisible(true);
        Report.jLabel5.setText(Drugdispenser.jLabel17.getText());
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField6KeyTyped
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            String df = jLabel20.getText();
            String cb = jComboBox1.getSelectedItem().toString();
            String ql = jTextField3.getText();
            String nqinsk = jTextField9.getText();
            String qntysold = jFormattedTextField1.getText();
            String tcst = jFormattedTextField2.getText();

            if (jTextField6.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the textfield!");
            } else {
                //Updatimg the sales record database with new values of drugs sold.
                String sqq = "UPDATE sales_details SET quantity_left=?,quantity_sold=?,total_cost=?WHERE drug_name='" + cb + "' AND date='" + df + "'";
                PreparedStatement sta = conn.prepareStatement(sqq);

                sta.setString(1, ql);
                sta.setString(2, qntysold);
                sta.setString(3, tcst);

                int rowInser = sta.executeUpdate();
                if (rowInser > 0) {
                    JOptionPane.showMessageDialog(null, "" + cb + " sales details updated successfully.");
                }
                jButton8.setEnabled(false);
                jButton1.setEnabled(false);

                String tcs = jTextField10.getText();
                Double csst = Double.parseDouble(tcs);

                String tc = jTextField9.getText();
                Double cs = Double.parseDouble(tc);

                double uptcst = csst * cs;
                String tct = Double.toString(uptcst);
                //Updating details of the drugs in stock.
                String sq = "UPDATE drug_stock SET quantity=?,total_cost=? WHERE drug_name='" + cb + "'";
                PreparedStatement stat = conn.prepareStatement(sq);

                stat.setString(1, nqinsk);
                stat.setString(2, tct);
                int rowInsert = stat.executeUpdate();
                if (rowInsert > 0) {
                    JOptionPane.showMessageDialog(null, "" + cb + " stock updated successfully.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill all the required fields please");
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Deletesale dl = new Deletesale();
        dl.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseMoved
        jButton7.setBackground(Color.RED);
    }//GEN-LAST:event_jButton7MouseMoved
    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        jButton7.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseMoved
        jButton6.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton6MouseMoved

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        jButton6.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButton6MouseExited

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Drugdispenser dp = new Drugdispenser();
        dp.setVisible(true);
        dispose();
        jLabel17.setText(Homepage.jLabel15.getText());
        jButton4.setEnabled(true);
        jButton9.setEnabled(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed

    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        try {
            String cb = (String) jComboBox1.getSelectedItem();
            String upd = jTextField10.getText();

            String sq = "UPDATE drug_stock SET cost_per_unit=? WHERE drug_name='" + cb + "'";
            PreparedStatement stat = conn.prepareStatement(sq);

            stat.setString(1, upd);
            int rowInsert = stat.executeUpdate();
            if (rowInsert > 0) {
                JOptionPane.showMessageDialog(null, "" + cb + " unit cost updated successfully.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Fill all the required fields please");
        }
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
        char ch = evt.getKeyChar();//Textfield validation.
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }    }//GEN-LAST:event_jTextField10KeyTyped

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Searchdrug d = new Searchdrug();
        d.setVisible(true);
        Searchdrug.jLabel2.setText(Drugdispenser.jLabel17.getText());
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    double totals = 0;
    int totq = 0;
    double totmoney=0;

    public void totalprice() {
        try{
        String summ=jTextField2.getText();
        String usr = jLabel17.getText();
        if(summ.equals("")){
        JOptionPane.showMessageDialog(this, "Pleasethe CASH issued by the customer","Error message",JOptionPane.ERROR_MESSAGE);
        }
        else {
        Double smed=Double.parseDouble(summ);
        DecimalFormat df=new DecimalFormat("0.00");
        jTextField2.setText(df.format(smed));
        String to=jTextField2.getText();
        Double tmoney=Double.parseDouble(to); 
        totmoney=tmoney-totals;
        String ln1 = String.format("%-15s %5s %10s\n", "------", "----", "-----");
        String ln21 = String.format("%-15s %5s %10.2f\n", "CASH:", " ", smed);
        String ln22 = String.format("%-15s %5s %10.2f\n\n", "CHANGE:", " ", totmoney);
        String ln20 = String.format("Served by " + usr + "\n\n");
        String ln3 = String.format("THANK YOU, WELCOME AGAIN\n");
        jButton11.setEnabled(false);

        String output = ln1 + ln21 + ln22 + ln20 + ln3;
        String tt = Receipt.jTextPane1.getText();

        Receipt.jTextPane1.setText(tt + output);
        jButton14.setEnabled(false);
      }
    }
    catch(NullPointerException e){
  JOptionPane.showMessageDialog(this, "Enter the CASH and pull up the receipt first","Error Mesdsage",JOptionPane.ERROR_MESSAGE);
    }
}

    public void receipt() {
        try {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            PageFormat pgformat = printerJob.defaultPage();
            Paper paper = new Paper();
            double lines = 0;
            paper.setSize(180.0, (double) (paper.getHeight() + lines * 10.0));
            int margin = 0;
            paper.setImageableArea(margin, margin, paper.getWidth() - margin * 2, paper.getHeight() - margin * 2);
            pgformat.setPaper(paper);
            pgformat.setOrientation(PageFormat.PORTRAIT);
            printerJob.setPrintable(Receipt.jTextPane1.getPrintable(null, null), pgformat);
            printerJob.print();

        } catch (PrinterException ex) {
            Logger.getLogger(Drugdispenser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String ln1 = String.format("%-15s %5s %10s\n", "------", "----", "-----");
        String ln2 = String.format("%-15s %5s %10.2f\n\n", "Total", totq, totals);
        String tt = Receipt.jTextPane1.getText();
        Receipt.jTextPane1.setText(tt  +ln1 + ln2);
        jButton14.setEnabled(true);
        jButton11.setEnabled(false);

    }//GEN-LAST:event_jButton11ActionPerformed
    public void additem() {
        try {
            try{               
            String item = jComboBox1.getSelectedItem().toString();
            String qty = jTextField6.getText();
            int qtyy = Integer.parseInt(qty);
            String cst = jTextField4.getText();
            double cost = Double.parseDouble(cst);
            String line = String.format("%-15s %5d %10.2f\n", item, qtyy, cost);
            totals += cost;
            totq += qtyy;
            String Rtp = Receipt.jTextPane1.getText();
            Receipt.jTextPane1.setText(Rtp + line);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Please click RECEIPT button first", "Message", JOptionPane.ERROR_MESSAGE);
        }}catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this, "Please enter the Quantity out", "Message", JOptionPane.ERROR_MESSAGE);
        }

    }
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pullup();
        jButton13.setEnabled(true);
        jButton12.setEnabled(false);
    }//GEN-LAST:event_jButton12ActionPerformed
    public void pullup() {
        String dates = new SimpleDateFormat("EEEE   dd-MM-yyyy     HH:mm:ss\n\n").format(new Date());
        String s0 = String.format("OFFICIAL RECEIPT\n");
        String s01 = String.format(dates);
        String s = String.format("%-15s %5s %10s\n", "Item", "Qty", "Price");
        String s1 = String.format("%-15s %5s %10s\n", "-----", "----", "-----");
        String output = s0 + s01 + s + s1;
        Receipt rc = new Receipt();
        rc.setVisible(true);
        Receipt.jTextPane1.setText(output);

    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        additem();
        jButton13.setEnabled(false);
        jButton11.setEnabled(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      totalprice();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
    jButton11.setEnabled(true);
    jButton14.setEnabled(true);
    }//GEN-LAST:event_jTextField2FocusGained

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      totalprice();
    }//GEN-LAST:event_jButton14ActionPerformed
    public void fillcombobox1() { //this method updates the combobox that displays a drop down list of drugs in stock
        try {
            String sm = "SELECT * FROM drug_stock group by drug_name";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sm);
            while (rs.next()) {
                String dne = rs.getString("drug_name");
                jComboBox1.addItem(dne);
            }
        } catch (SQLException e) {
        }
    }

    public void datess() {
        String d1 = jLabel20.getText();
        String d2 = jTextField1.getText();
        SimpleDateFormat dat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date dat1 = dat.parse(d1);
            Date dat2 = dat.parse(d2);
            if (dat2.before(dat1)) {
                jTextField1.setBackground(Color.RED);
            }
        } catch (Exception e) {
        }
    }

    public void today() {//method to display date and time on the screen
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
                    jLabel20.setText(date);
                }
            }
        };
        clock.start();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Drugdispenser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    public static javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
