/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student1;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w
 */
public class promoteStudent extends javax.swing.JFrame {

    /**
     * Creates new form promoteStudent
     */
    public promoteStudent() {
        initComponents();
        Manageroom1();
    }
    public void Manageroom1(){
    PreparedStatement pst=null;
    java.sql.Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("Select * from student");
            //pst.setString(1,jC.getItemAt(jC.getSelectedIndex()));
            //String v1= jC.getSelectedItem().toString();
            
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while(rs.next()){
                //Vector is like the dynamic array.
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                   
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("fathername"));
                    columnData.add(rs.getString("aadharnumber"));
                    columnData.add(rs.getString("dob"));
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }  
        } catch (ClassNotFoundException | SQLException ex) {}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        rollno = new javax.swing.JTextField();
        cl = new javax.swing.JComboBox<>();
        cl1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        promotestd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SearchStd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" }));

        cl1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHOOSE", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" }));

        jLabel4.setText("Roll no");

        jLabel5.setText("Class");

        promotestd.setText("Promote");
        promotestd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promotestdActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Father Name", "aadharr no", "Dob"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel2.setText("New Class");

        SearchStd.setText("Search");
        SearchStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchStdActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left-arrow.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cl, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SearchStd)
                                        .addGap(18, 18, 18)
                                        .addComponent(refresh))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(promotestd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cl1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(promotestd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchStd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void promotestdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promotestdActionPerformed
        // TODO add your handling code here:
        PreparedStatement pst;
        ResultSet rs;
        String addh= jTable1.getValueAt(0, 2).toString() ;
         try {
if(cl1.getSelectedItem().equals("1st")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 1st(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 1st set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("2nd")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 2nd(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 2nd set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("3rd")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 3rd(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 3rd set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("4th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 4th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 4th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("5th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 4th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 4th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("6th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 5th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 5th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("7th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 6th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 6th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("8th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 7th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 7th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("9th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 8th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 8th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}
else if(cl1.getSelectedItem().equals("10th")){
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("insert into 10th(fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg) select fathername,mothername,class,dob,contact,email,religion,aadharnumber,nationality,gender,state,city,pin,address,fatheroccupation,name,studentimg from student where rollno=? and class=?");
            pst.setString(1,rollno.getText());
            pst.setString(2, cl.getItemAt(cl.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update 10th set class=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.executeUpdate();
           
            pst=con.prepareStatement("update student set class=? where aadharnumber=?");
            pst.setString(1, cl1.getItemAt(cl1.getSelectedIndex()));
            pst.setString(2,addh);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Promoted");
            
}


        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");

                if(cl.getSelectedItem().equals("1st")){   
                pst=con.prepareStatement("DELETE FROM 1st where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
                
         }
         else if(cl.getSelectedItem().equals("2nd")){
                pst=con.prepareStatement("DELETE FROM 2nd where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }

         else if(cl.getSelectedItem().equals("3rd")){
                pst=con.prepareStatement("DELETE FROM 3rd where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }
         else if(cl.getSelectedItem().equals("4th")){
                pst=con.prepareStatement("DELETE FROM 4th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
          }
         else if(cl.getSelectedItem().equals("5th")){
                pst=con.prepareStatement("DELETE FROM 5th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }
         else if(cl.getSelectedItem().equals("6th")){
                pst=con.prepareStatement("DELETE FROM 6th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }
         else if(cl.getSelectedItem().equals("7th")){
                pst=con.prepareStatement("DELETE FROM 7th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }
         else if(cl.getSelectedItem().equals("8th")){
                pst=con.prepareStatement("DELETE FROM 8th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }
         else if(cl.getSelectedItem().equals("9th")){
                pst=con.prepareStatement("DELETE FROM 9th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         } 
         else if(cl.getSelectedItem().equals("10th")){
                pst=con.prepareStatement("DELETE FROM 10th where aadharnumber=?");
                pst.setString(1,addh);
                pst.executeUpdate();
         }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
       
                                               
         
         
        
    }//GEN-LAST:event_promotestdActionPerformed

    private void SearchStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchStdActionPerformed
        // TODO add your handling code here:
           
    PreparedStatement pst=null;
    java.sql.Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("Select * from student where class=? AND rollno=?");
            pst.setString(1,cl.getItemAt(cl.getSelectedIndex()));
             pst.setString(2, rollno.getText());
            //String v1= jC.getSelectedItem().toString();
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while(rs.next()){
                //Vector is like the dynamic array.
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("fathername"));
                    columnData.add(rs.getString("aadharnumber"));
                    columnData.add(rs.getString("dob"));
                 }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }  
        } catch (ClassNotFoundException | SQLException ex) {}  
       
    }//GEN-LAST:event_SearchStdActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:PreparedStatement pst=null;
        rollno.setText(null);
        cl.setSelectedIndex(0);
        
    PreparedStatement pst=null;
    java.sql.Statement st=null;
    ResultSet rs=null;
    java.sql.Connection con=null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("Select * from student");
            //pst.setString(1,jC.getItemAt(jC.getSelectedIndex()));
            //String v1= jC.getSelectedItem().toString();
            
            rs=pst.executeQuery();
            ResultSetMetaData stData=(ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel) jTable1.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while(rs.next()){
                //Vector is like the dynamic array.
                Vector columnData=new Vector();
                for(int i=1;i<=q;i++){
                    
                    columnData.add(rs.getString("name"));
                    columnData.add(rs.getString("fathername"));
                    columnData.add(rs.getString("aadharnumber"));
                    columnData.add(rs.getString("dob"));
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }  
        } catch (ClassNotFoundException | SQLException ex) {}
        
        
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        homepage hm = new homepage();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(promoteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(promoteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(promoteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(promoteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new promoteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchStd;
    private javax.swing.JComboBox<String> cl;
    private javax.swing.JComboBox<String> cl1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton promotestd;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField rollno;
    // End of variables declaration//GEN-END:variables
}
