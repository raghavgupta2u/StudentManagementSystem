/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student1;

import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
/**
 *
 * @author w
 */
public class printresult extends javax.swing.JFrame {
    String roll=Showresulte.rolll;
    String classs=Showresulte.clas;
    String studentname;
    String mothername;
    String fathername;
    String English;
    String Mathematics;
    String Hindi;
    String Art;
    String Gk;
    String Evs;
    String physical;
    String cse;
    String Science;
    String sst;
    String punjabi;
    
    String pEnglish;
    String pMathematics;
    String pHindi;
    String pArt;
    String pGk;
    String pEvs;
    String pphysical;
    String pcse;
    String pScience;
    String psst;
    String ppunjabi;
    
    int eng1;
    int math1;
    int hindi1;
    int art1;
    int gk1;
    int evs1;
    int physiacl1;
    int cse1;
    int Science1;
    int sst1;
    int punjabi1;
    
    String total;
    String dob;
    String result;
    byte img;
   /**
     * Creates new form printresult
     */
    public printresult() {
        initComponents();
        
        if( classs.equals("1st") || classs.equals("2nd")){
        connect1();
        marksheet.setText("\t\t\t S.R.P.A Adarsh Bhartiya School \n");
        marksheet.setText(marksheet.getText()+"\t\t\t"+"                 MARKSHEET");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"Roll no:- "+roll+"\n");
        marksheet.setText(marksheet.getText()+"Class:- "+classs+"\n");
        marksheet.setText(marksheet.getText()+"Student Name:- "+studentname+"\n");
        marksheet.setText(marksheet.getText()+"Mother Name:- "+mothername+"\n");
        marksheet.setText(marksheet.getText()+"Father Name:- "+fathername+"\n");
        marksheet.setText(marksheet.getText()+"Date of Birth:- "+dob+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"   SNO  |       SUBJECTS                         |    THEORY  |    INTERNAL ASSESSMENT |    TOTAL|\n"
                                             +"      1     |   ENGLISH COMM                    |   "+English+ "            |    "+pEnglish+"                                          |       "+eng1+"          |\n"
                                             +"      2     |   HINDI                                       |    "+Hindi+"            |    "+pHindi+"                                          |       "+hindi1+"         |\n"
                                             +"      3     |   MATHEMATICS                      |    "+Mathematics+"            |    "+pMathematics+"                                          |       "+math1+"          |\n"
                                             +"      4     |   ART AND CRAFT                   |    "+Art+"            |    "+pArt+"                                          |       "+art1+"         |\n" 
                                             +"      5     |   GENERAL KNOWLEDGE    |    "+Gk+"            |    "+pGk+"                                          |       "+gk1+"         |\n");
        marksheet.setText(marksheet.getText()+"                                                                                                                                                        "+total+"            \n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"RESULT = "+result+"                                                      ");
    }
        else if (classs.equals("3rd") || classs.equals("4th")){
           connect2();
        marksheet.setText("\t\t\t S.R.P.A Adarsh Bhartiya School \n");
        marksheet.setText(marksheet.getText()+"\t\t\t"+"                 MARKSHEET");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"Roll no:- "+roll+"\n");
        marksheet.setText(marksheet.getText()+"Class:- "+classs+"\n");
        marksheet.setText(marksheet.getText()+"Student Name:- "+studentname+"\n");
        marksheet.setText(marksheet.getText()+"Mother Name:- "+mothername+"\n");
        marksheet.setText(marksheet.getText()+"Father Name:- "+fathername+"\n");
        marksheet.setText(marksheet.getText()+"Date of Birth:- "+dob+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"   SNO  |       SUBJECTS                         |    THEORY  |    INTERNAL ASSESSMENT |    TOTAL|\n"
                                             +"      1     |   ENGLISH COMM                    |   "+English+ "            |    "+pEnglish+"                                          |       "+eng1+"          |\n"
                                             +"      2     |   HINDI                                       |    "+Hindi+"            |    "+pHindi+"                                          |       "+hindi1+"         |\n"
                                             +"      3     |   MATHEMATICS                      |    "+Mathematics+"            |    "+pMathematics+"                                          |       "+math1+"          |\n"
                                             +"      4     |   ENVIROMENTAL STUDIES                   |    "+Evs+"            |    "+pEvs+"                                          |       "+evs1+"         |\n" 
                                             +"      5     |   GENERAL KNOWLEDGE    |    "+Gk+"            |    "+pGk+"                                          |       "+gk1+"         |\n");
        marksheet.setText(marksheet.getText()+"                                                                                                                                                        "+total+"            \n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"RESULT = "+result+"                                                      ");
        }
        else if (classs.equals("5th") || classs.equals("6th")){
           connect3();
        marksheet.setText("\t\t\t S.R.P.A Adarsh Bhartiya School \n");
        marksheet.setText(marksheet.getText()+"\t\t\t"+"                 MARKSHEET");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"Roll no:- "+roll+"\n");
        marksheet.setText(marksheet.getText()+"Class:- "+classs+"\n");
        marksheet.setText(marksheet.getText()+"Student Name:- "+studentname+"\n");
        marksheet.setText(marksheet.getText()+"Mother Name:- "+mothername+"\n");
        marksheet.setText(marksheet.getText()+"Father Name:- "+fathername+"\n");
        marksheet.setText(marksheet.getText()+"Date of Birth:- "+dob+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"   SNO  |       SUBJECTS                         |    THEORY  |    INTERNAL ASSESSMENT |    TOTAL|\n"
                                             +"      1     |   ENGLISH COMM                    |   "+English+ "            |    "+pEnglish+"                                          |       "+eng1+"          |\n"
                                             +"      2     |   HINDI                                       |    "+Hindi+"            |    "+pHindi+"                                          |       "+hindi1+"         |\n"
                                             +"      3     |   MATHEMATICS                      |    "+Mathematics+"            |    "+pMathematics+"                                          |       "+math1+"          |\n"
                                             +"      4     |   ENVIROMENTAL STUDIES                   |    "+Evs+"            |    "+pEvs+"                                          |       "+evs1+"         |\n" 
                                             +"      5     |   SOCIAL SCIENCE    |    "+sst+"            |    "+psst+"                                          |       "+sst1+"         |\n");
        marksheet.setText(marksheet.getText()+"                                                                                                                                                        "+total+"            \n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"RESULT = "+result+"                                                      ");
        }
        else if (classs.equals("7th") || classs.equals("8th")){
           connect4();
         marksheet.setText("\t\t\t S.R.P.A Adarsh Bhartiya School \n");
        marksheet.setText(marksheet.getText()+"\t\t\t"+"                 MARKSHEET");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"Roll no:- "+roll+"\n");
        marksheet.setText(marksheet.getText()+"Class:- "+classs+"\n");
        marksheet.setText(marksheet.getText()+"Student Name:- "+studentname+"\n");
        marksheet.setText(marksheet.getText()+"Mother Name:- "+mothername+"\n");
        marksheet.setText(marksheet.getText()+"Father Name:- "+fathername+"\n");
        marksheet.setText(marksheet.getText()+"Date of Birth:- "+dob+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"   SNO  |       SUBJECTS                         |    THEORY  |    INTERNAL ASSESSMENT |    TOTAL|\n"
                                             +"      1     |   ENGLISH COMM                    |   "+English+ "            |    "+pEnglish+"                                          |       "+eng1+"          |\n"
                                             +"      2     |   HINDI                                       |    "+Hindi+"            |    "+pHindi+"                                          |       "+hindi1+"         |\n"
                                             +"      3     |   MATHEMATICS                      |    "+Mathematics+"            |    "+pMathematics+"                                          |       "+math1+"          |\n"
                                             +"      4     |   SCIENCE                   |    "+Science+"            |    "+pScience+"                                          |       "+Science1+"         |\n" 
                                             +"      5     |   SOCIAL SCIENCE    |    "+sst+"            |    "+psst+"                                          |       "+sst1+"         |\n");
        marksheet.setText(marksheet.getText()+"                                                                                                                                                        "+total+"            \n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"RESULT = "+result+"                                                      ");
        }
        else if (classs.equals("9th") || classs.equals("10th")){
           connect5();
       marksheet.setText("\t\t\t S.R.P.A Adarsh Bhartiya School \n");
        marksheet.setText(marksheet.getText()+"\t\t\t"+"                 MARKSHEET");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"Roll no:- "+roll+"\n");
        marksheet.setText(marksheet.getText()+"Class:- "+classs+"\n");
        marksheet.setText(marksheet.getText()+"Student Name:- "+studentname+"\n");
        marksheet.setText(marksheet.getText()+"Mother Name:- "+mothername+"\n");
        marksheet.setText(marksheet.getText()+"Father Name:- "+fathername+"\n");
        marksheet.setText(marksheet.getText()+"Date of Birth:- "+dob+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"   SNO  |       SUBJECTS                         |    THEORY  |    INTERNAL ASSESSMENT |    TOTAL|\n"
                                             +"      1     |   ENGLISH COMM                    |   "+English+ "            |    "+pEnglish+"                                          |       "+eng1+"          |\n"
                                             +"      2     |   HINDI                                       |    "+Hindi+"            |    "+pHindi+"                                          |       "+hindi1+"         |\n"
                                             +"      3     |   MATHEMATICS                      |    "+Mathematics+"            |    "+pMathematics+"                                          |       "+math1+"          |\n"
                                             +"      4     |   SCIENCE                   |    "+Science+"            |    "+pScience+"                                          |       "+Science1+"         |\n" 
                                             +"      4     |   PHYSICAL EDUCATION                   |    "+physical+"            |    "+pphysical+"                                          |       "+physiacl1+"         |\n"         
                                             +"      5     |   SOCIAL SCIENCE    |    "+sst+"            |    "+psst+"                                          |       "+sst1+"         |\n");
        marksheet.setText(marksheet.getText()+"                                                                                                                                                        "+total+"            \n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"\n");
        marksheet.setText(marksheet.getText()+"RESULT = "+result+"                                                      ");
        }
    }
 
    public void connect1(){
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from resulte1st2nd where rollno=? AND class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            
            rs=pst.executeQuery();
            if(rs.next()){
                studentname=rs.getString("name");
                English=rs.getString("Eng");
                Hindi=rs.getString("hindi");
                Mathematics=rs.getString("Math");
                Art=rs.getString("Art");
                Gk=rs.getString("GK");
                pEnglish=rs.getString("peng");
                pHindi=rs.getString("phindi");
                pMathematics=rs.getString("pmath");
                pArt=rs.getString("part");
                pGk=rs.getString("pgk");
                total=rs.getString("total");
                result=rs.getString("resulte");
            }
            eng1 = Integer.parseInt(English) + Integer.parseInt(pEnglish);
            math1 = Integer.parseInt(Mathematics) + Integer.parseInt(pMathematics);
            hindi1 = Integer.parseInt(Hindi) + Integer.parseInt(pHindi);
            gk1 = Integer.parseInt(Gk) + Integer.parseInt(pGk);
            art1 = Integer.parseInt(Art) + Integer.parseInt(pArt);
            
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from student where rollno=? and class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            rs=pst.executeQuery();
            if(rs.next()){
                fathername=rs.getString("fathername");
                mothername=rs.getString("mothername");
                dob=rs.getString("dob");
                img =rs.getByte("img");
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void connect2(){
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from resulte3rd4th where rollno=? AND class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            
            rs=pst.executeQuery();
            if(rs.next()){
                studentname=rs.getString("name");
                English=rs.getString("Eng");
                Hindi=rs.getString("hindi");
                Mathematics=rs.getString("Math");
                Gk=rs.getString("gk");
                Evs=rs.getString("evs");
                pEnglish=rs.getString("peng");
                pHindi=rs.getString("phindi");
                pMathematics=rs.getString("pmath");
                pGk=rs.getString("pgk");
                pEvs=rs.getString("pevs");
                total=rs.getString("total");
                result=rs.getString("resulte");
            }
            eng1 = Integer.parseInt(English) + Integer.parseInt(pEnglish);
            math1 = Integer.parseInt(Mathematics) + Integer.parseInt(pMathematics);
            hindi1 = Integer.parseInt(Hindi) + Integer.parseInt(pHindi);
            gk1 = Integer.parseInt(Gk) + Integer.parseInt(pGk);
            evs1 = Integer.parseInt(Evs) + Integer.parseInt(pEvs);
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from student where rollno=? and class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            rs=pst.executeQuery();
            if(rs.next()){
                fathername=rs.getString("fathername");
                mothername=rs.getString("mothername");
                dob=rs.getString("dob");
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void connect3(){
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from resulte5th6th where rollno=? AND class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            
            rs=pst.executeQuery();
            if(rs.next()){
                studentname=rs.getString("name");
                English=rs.getString("Eng");
                Hindi=rs.getString("hindi");
                Mathematics=rs.getString("Math");
                Science=rs.getString("Science");
                Evs=rs.getString("evs");
                psst=rs.getString("socialscience");
                pEnglish=rs.getString("peng");
                pHindi=rs.getString("phindi");
                pMathematics=rs.getString("pmath");
                pScience=rs.getString("pScience");
                total=rs.getString("total");
                result=rs.getString("resulte");
            }
            eng1 = Integer.parseInt(English) + Integer.parseInt(pEnglish);
            math1 = Integer.parseInt(Mathematics) + Integer.parseInt(pMathematics);
            hindi1 = Integer.parseInt(Hindi) + Integer.parseInt(pHindi);
            Science1 = Integer.parseInt(Science) + Integer.parseInt(pScience);
            evs1 = Integer.parseInt(Evs) + Integer.parseInt(pEvs);
            
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from student where rollno=? and class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            rs=pst.executeQuery();
            if(rs.next()){
                fathername=rs.getString("fathername");
                mothername=rs.getString("mothername");
                dob=rs.getString("dob");
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void connect4(){
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from resulte7th8th where rollno=? AND class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            
            rs=pst.executeQuery();
            if(rs.next()){
                studentname=rs.getString("name");
                English=rs.getString("Eng");
                Hindi=rs.getString("hindi");
                Mathematics=rs.getString("Math");
                Science=rs.getString("Science");
                sst=rs.getString("socialscience");
                pEnglish=rs.getString("peng");
                pHindi=rs.getString("phindi");
                pMathematics=rs.getString("pmath");
                pScience=rs.getString("pscience");
                psst=rs.getString("psocialscience");
                total=rs.getString("total");
                result=rs.getString("resulte");
            }
            eng1 = Integer.parseInt(English) + Integer.parseInt(pEnglish);
            math1 = Integer.parseInt(Mathematics) + Integer.parseInt(pMathematics);
            hindi1 = Integer.parseInt(Hindi) + Integer.parseInt(pHindi);
            Science1 = Integer.parseInt(Science) + Integer.parseInt(pScience);
            sst1 = Integer.parseInt(sst) + Integer.parseInt(psst);
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from student where rollno=? and class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            rs=pst.executeQuery();
            if(rs.next()){
                fathername=rs.getString("fathername");
                mothername=rs.getString("mothername");
                dob=rs.getString("dob");
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void connect5(){
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from resulte9th10th where rollno=? AND class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            
            rs=pst.executeQuery();
            if(rs.next()){
                studentname=rs.getString("name");
                English=rs.getString("Eng");
                Hindi=rs.getString("hindi");
                Mathematics=rs.getString("Math");
                Science=rs.getString("Science");
                sst=rs.getString("socialscience");
                physical=rs.getString("physicaleducation");
                pHindi=rs.getString("phindi");
                pMathematics=rs.getString("pmath");
                pphysical=rs.getString("pphysicaleducation");
                pEnglish=rs.getString("peng");
                psst=rs.getString("psocialscience");
                pScience=rs.getString("pscience");
                total=rs.getString("total");
                result=rs.getString("resulte");
            }
            
            eng1 = Integer.parseInt(English) + Integer.parseInt(pEnglish);
            math1 = Integer.parseInt(Mathematics) + Integer.parseInt(pMathematics);
            hindi1 = Integer.parseInt(Hindi) + Integer.parseInt(pHindi);
            Science1 = Integer.parseInt(Science) + Integer.parseInt(pScience);
            sst1 = Integer.parseInt(sst) + Integer.parseInt(psst);
            physiacl1 = Integer.parseInt(physical) + Integer.parseInt(pphysical);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","123456");
            pst=con.prepareStatement("select * from student where rollno=? and class=?");
            pst.setString(1,roll);
            pst.setString(2,classs);
            rs=pst.executeQuery();
            if(rs.next()){
                fathername=rs.getString("fathername");
                mothername=rs.getString("mothername");
                dob=rs.getString("dob");
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PrintBill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        marksheet = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        PrintBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PrintBill.setForeground(new java.awt.Color(51, 51, 51));
        PrintBill.setText("Print");
        PrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBillActionPerformed(evt);
            }
        });

        marksheet.setColumns(20);
        marksheet.setRows(5);
        jScrollPane1.setViewportView(marksheet);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left-arrow.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(PrintBill)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintBill)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBillActionPerformed
        try {
            marksheet.print();        // TODO add your handling code here:
        } catch (PrinterException ex) {
            Logger.getLogger(printresult.class.getName()).log(Level.SEVERE, null, ex);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_PrintBillActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Showresulte hm = new Showresulte();
        hm.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(printresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(printresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(printresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new printresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintBill;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea marksheet;
    // End of variables declaration//GEN-END:variables
}
