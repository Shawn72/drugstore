package drugstore;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;

/**
 *
 * @author SHAWN
 */
public class Graphical extends javax.swing.JFrame {
            public void clock(){//method to display date and time on the screen
        Thread clock=new Thread()
        {
        @Override
        public void run()
        {
            try {
                 for(;;) {
                    String date = new SimpleDateFormat("EEEE       dd-MM-yyyy        HH:mm:ss").format(new Date());
                    jLabel2.setText(date);
                    sleep(1000);}
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
                         }
                       }
        
                   };
        
                 clock.start();                                             
      }
Connection conn;
      public void Imagers(){
    URL url=getClass().getResource("drugsIcon.jpg");
    ImageIcon icon=new ImageIcon(url);
    Image image=icon.getImage();
    this.setIconImage(image);
      }
    public Graphical() {
        initComponents();
        setLocationRelativeTo(this);
        clock();
        Imagers(); 
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
       JOptionPane.showMessageDialog(this,"Please switch on MySQL server");
             }
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DRUGSTORE RECORD MANAGEMENT SYSTEM");
        setBackground(new java.awt.Color(102, 102, 255));
        setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Stock Line Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Sales Line Graph");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Order Line Graph");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Please select the analysis you want to view");

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Order Bar Graph");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Stock Bar Graph");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setText("Sales Bar Graph");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/back.png"))); // NOI18N
        jButton7.setText("BACK");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/home1.png"))); // NOI18N
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

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/exit.jpg"))); // NOI18N
        jButton8.setText("EXIT");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setMargin(new java.awt.Insets(2, 0, 2, 1));
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/drugstore/exit2.png"))); // NOI18N
        jButton8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton8MouseMoved(evt);
            }
        });
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton9.setText("Order Pie Chart");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton10.setText("Stock Pie Chart");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("Sales Pie Chart");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Logged in as:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton3)
                                        .addComponent(jButton2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{//drawing a line graph
    String query="select drug_name,quantity_sold from sales_details";
    JDBCCategoryDataset dataset=new JDBCCategoryDataset(Javaconect.connectme(),query);
   
  JFreeChart chart=ChartFactory.createLineChart("Sales Linegraph Analysis","Drug","Quantity Sold",dataset,
  PlotOrientation.VERTICAL, false, true, true);
  BarRenderer renderer=null;
  CategoryPlot plot=null;
  renderer=new BarRenderer();
  ChartFrame frame=new ChartFrame("Sales Line Analysis",chart);
  frame.setVisible(true);
  frame.setLocationRelativeTo(this);
  frame.setSize(800,600);
  }
catch(SQLException ex){
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{//drawing a line graph
    String query="select drug_name,quantity from drug_stock";
    JDBCCategoryDataset dataset=new JDBCCategoryDataset(Javaconect.connectme(),query);
   
  JFreeChart chart=ChartFactory.createLineChart("Stock Linegraph Analysis","Drug","Quantity in Stock",dataset,
  PlotOrientation.VERTICAL, false, true, true);
  BarRenderer renderer=null;
  CategoryPlot plot=null;
  renderer=new BarRenderer();
  ChartFrame frame=new ChartFrame("Stock Analysis",chart);
  frame.setVisible(true);
  frame.setLocationRelativeTo(this);
  frame.setSize(800,650);
  
}catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  try{
    String query="select drug_name,quantity_ordered from orders";
    JDBCCategoryDataset dataset=new JDBCCategoryDataset(Javaconect.connectme(),query);
   
  JFreeChart chart=ChartFactory.createLineChart("Order Linegraph Analysis","Drug","Quantity Ordered",dataset,
  PlotOrientation.VERTICAL, false, true, true);
  BarRenderer renderer=null;
  CategoryPlot plot=null;
  renderer=new BarRenderer();
  ChartFrame frame=new ChartFrame("Orders",chart);
  frame.setVisible(true);
  frame.setLocationRelativeTo(this);
  frame.setSize(800,600);
  }
  catch(SQLException ex){
  Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} 
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try{
    String query="select drug_name,quantity_ordered from orders";
    JDBCCategoryDataset dataset=new JDBCCategoryDataset(Javaconect.connectme(),query);
   
  JFreeChart chart=ChartFactory.createBarChart("Order Barchart Analysis","Drug","Quantity Ordered",dataset,
          PlotOrientation.VERTICAL, false, true, false);

  CategoryPlot plot=chart.getCategoryPlot();
 plot.setRangeGridlinePaint(Color.BLACK);
  ChartFrame frame=new ChartFrame("Orders barchart",chart);
  frame.setVisible(true);
  frame.setLocationRelativeTo(this);
  frame.setSize(800,600);
  
final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
final File fil1= new File("Orders barchart.png");
    try {
        ChartUtilities.saveChartAsPNG(fil1, chart, 800, 600, info);
    } catch (IOException ex) {
        Logger.getLogger(Graphical.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
}       


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 try{//creating a barchart
     String query="select drug_name,quantity from drug_stock";
    JDBCCategoryDataset dataset=new JDBCCategoryDataset(Javaconect.connectme(),query);
   
  JFreeChart chart=ChartFactory.createBarChart("Stock Barchart Analysis","Drug","Quantity in Stock",dataset,
  PlotOrientation.VERTICAL, false, true, false);
  CategoryPlot plot=chart.getCategoryPlot();
   plot.setRangeGridlinePaint(Color.BLACK);
  ChartFrame frame=new ChartFrame("Stock barchart",chart);
  frame.setVisible(true);
  frame.setLocationRelativeTo(this);
  frame.setSize(800,600);
//saving the barchart as PNG format to enable printing.    
final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
final File fil1= new File("Stock barchart.png");
    try {
        ChartUtilities.saveChartAsPNG(fil1, chart, 800, 600, info);
    } catch (IOException ex) {
        Logger.getLogger(Graphical.class.getName()).log(Level.SEVERE, null, ex);
    }
  }catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 try{  
     String query="select drug_name, quantity_sold from sales_details";
    JDBCCategoryDataset dataset=new JDBCCategoryDataset(Javaconect.connectme(),query);
    JFreeChart chart=ChartFactory.createBarChart("Sales Barchart Analysis","Drug","Quantity_sold",dataset,
    PlotOrientation.VERTICAL, false, true, false);

    CategoryPlot plot=chart.getCategoryPlot();
    plot.setRangeGridlinePaint(Color.BLACK);
    ChartFrame frame=new ChartFrame("Sales barchart",chart);
    frame.setVisible(true);
    frame.setLocationRelativeTo(this);
    frame.setSize(800,600);
//saving the chart as PNG.
final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
final File fil1= new File("Sales barchart.png");
    try {
        ChartUtilities.saveChartAsPNG(fil1, chart, 800, 600, info);
    } catch (IOException ex) {
        Logger.getLogger(Graphical.class.getName()).log(Level.SEVERE, null, ex);
    }
  
}catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
} 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
Homepage h= new Homepage();
h.setVisible(true);
Homepage.jLabel15.setText(Graphical.jLabel3.getText());
dispose();
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
System.exit(0);  
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   try{
   String query="select drug_name,quantity_ordered from orders";
   JDBCPieDataset dataset=new JDBCPieDataset(Javaconect.connectme(),query);
   dataset.executeQuery(query);
   JFreeChart chart = ChartFactory.createPieChart("Orders piechart", dataset, true, true, false);
   PiePlot pl=(PiePlot)chart.getPlot();
   ChartFrame fr=new ChartFrame("Piechart", chart);
   fr.setVisible(true);
   fr.setSize(600, 600);
   fr.setLocationRelativeTo(this);
   final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
   final File fil1= new File("Orders Piechart.png");
    try {
        ChartUtilities.saveChartAsPNG(fil1, chart, 800, 600, info);
    } catch (IOException ex) {
        Logger.getLogger(Graphical.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
   
   catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
    }  
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
   try{
   String query="select drug_name,quantity from drug_stock";
   JDBCPieDataset dataset=new JDBCPieDataset(Javaconect.connectme(),query);
   dataset.executeQuery(query);
   JFreeChart chart = ChartFactory.createPieChart("Stock piechart", dataset, true, true, false);
   PiePlot pl=(PiePlot)chart.getPlot();
   ChartFrame fr=new ChartFrame("Piechart", chart);
  fr.setVisible(true);
  fr.setSize(600, 600);
  fr.setLocationRelativeTo(this);
  final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
  final File fil1= new File("Stock Piechart.png");
    try {
        ChartUtilities.saveChartAsPNG(fil1, chart, 800, 600, info);
    } catch (IOException ex) {
        Logger.getLogger(Graphical.class.getName()).log(Level.SEVERE, null, ex);
    }
  }catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
  try{
   String query="select drug_name,total_cost from sales_details";
   JDBCPieDataset dataset=new JDBCPieDataset(Javaconect.connectme(),query);
   dataset.executeQuery(query);
   JFreeChart chart = ChartFactory.createPieChart("Sales piechart", dataset, true, true, false);
  PiePlot pl=(PiePlot)chart.getPlot();
  ChartFrame fr=new ChartFrame("Piechart", chart);
  fr.setVisible(true);
  fr.setSize(600, 600);
  fr.setLocationRelativeTo(this);
  final ChartRenderingInfo info=new ChartRenderingInfo(new StandardEntityCollection());
  final File fil1= new File("Sales Piechart.png");
    try {
        ChartUtilities.saveChartAsPNG(fil1, chart, 800, 600, info);
    } catch (IOException ex) {
        Logger.getLogger(Graphical.class.getName()).log(Level.SEVERE, null, ex);
    }
  }catch(SQLException ex) {
        Logger.getLogger(Homepage.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseMoved
jButton8.setBackground(Color.RED);
    }//GEN-LAST:event_jButton8MouseMoved

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
jButton8.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseMoved
jButton7.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton7MouseMoved

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
jButton7.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_jButton7MouseExited
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Graphical().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}