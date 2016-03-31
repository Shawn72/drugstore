package drugstore;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import jxl.*;
import jxl.write.*;

/**
 *
 * @author tish
 */
public class ExcelEport {
    
 void fillData(JTable table, File file){
 try{
     
 //WritableWorkbook wkb1=Workbook.createWorkbook(file);
// WritableSheet sheet1= wkb1.createSheet("First sheet", 0);
 TableModel model=table.getModel();
 FileWriter  excel=new FileWriter(file);
 for(int i=0; i<model.getColumnCount();i++){
     excel.write(model.getColumnName(i)+"\t");
 //Label column=new Label(i,0,model.getColumnName(i));
 //sheet1.addCell(column);
  }
 excel.write("\n");
 int j;
 for(int i=0;i<model.getRowCount();i++){
 for(j=0;j<model.getColumnCount();j++){
 excel.write(model.getValueAt(i,j).toString()+"\t");
 //Label row=new Label(j,i+1,model.getValueAt(i, j).toString());
 //sheet1.addCell(row);
   
 }
      excel.write("\n");
  }
 excel.close();

  
 }catch(Exception ex){
  ex.printStackTrace();
 }
     
     
 }   
  
    
}