
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.awt.*;
import java.text.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagit
 */
public class Sucess extends javax.swing.JFrame
{
    String gender;
    String fileName = null;
    byte[] person_imige = null;
    public Sucess()
    {
        super("INPUT DATA");
        initComponents();
        show_user();
    }
    
     public ArrayList<User> userList()
    {
        ArrayList<User> usersList = new ArrayList<>();
         try
            {
                String url = "jdbc:mysql://localhost:3306/dbo?useTimezone=true&serverTimezone=UTC&user=root&password=i34094573M$";
                try (Connection connection = DriverManager.getConnection( url ))
                  {
                      String readTable = "SELECT * FROM dbo.inputdata";
                      Statement statement = connection.createStatement();
                      ResultSet rs = statement.executeQuery(readTable);
                      User user;
                      while ( rs.next() )
                      {
                          user = new User(rs.getInt("sno"), rs.getString("name"),rs.getString("address"), rs.getString("gender"),
                          rs.getString("knowledge"), rs.getString("subject"), rs.getBytes("image"), rs.getString("date"));
                          usersList.add(user);
                      }
                  }
            }
         catch ( SQLException throwable )
                {
                    JOptionPane.showMessageDialog( null,throwable  );
                }
         return usersList;
    }
     
    public void show_user()
    {
        ArrayList<User> list = userList();
        DefaultTableModel model = ( DefaultTableModel ) jTable1_Display_User.getModel();
        Object[] row = new Object[7];
        for ( int i = 0; i < list.size(); i++ )
        {
            row[0] = list.get( i ).getSno();
            row[1] = list.get( i ).getName();
            row[2] = list.get( i).getAddress();
            row[3] = list.get( i ).getGender();
            row[4] = list.get( i ).getKnowledge();
            row[5] = list.get( i ).getSubject();
            row[6] = list.get(i).getDate();
            model.addRow(row); 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Display_User = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        java_prg = new javax.swing.JCheckBox();
        cpp = new javax.swing.JCheckBox();
        python = new javax.swing.JCheckBox();
        subject = new javax.swing.JComboBox<>();
        resetBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        pictureLbl = new javax.swing.JLabel();
        choosePic = new javax.swing.JButton();
        date_chooser = new com.toedter.calendar.JDateChooser();
        dateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));

        jTable1_Display_User.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "sno", "Name", "Address", "Gender", "Knowledge", "Subject", "Date"
            }
        ));
        jTable1_Display_User.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTable1_Display_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Display_User);

        jLabel1.setText("Name");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Address");

        jLabel3.setText("Gender");

        jLabel4.setText("Knowledge");

        jLabel5.setText("Subject");

        name.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nameActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        java_prg.setText("Java");

        cpp.setText("C++");

        python.setText("Python");

        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select subject", "Software engineering", "Computer science", "Network administration" }));

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteBtnActionPerformed(evt);
            }
        });

        choosePic.setText("Choose");
        choosePic.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                choosePicActionPerformed(evt);
            }
        });

        dateBtn.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(male))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(address))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(java_prg)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(female)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpp)
                                .addGap(18, 18, 18)
                                .addComponent(python, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(choosePic)
                        .addGap(0, 578, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(java_prg)
                    .addComponent(cpp)
                    .addComponent(python))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(resetBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pictureLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(choosePic)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nameActionPerformed
    {//GEN-HEADEREND:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveBtnActionPerformed
    {//GEN-HEADEREND:event_saveBtnActionPerformed
        try
                {
                    String url = "jdbc:mysql://localhost:3306/dbo?useTimezone=true&serverTimezone=UTC&user=root&password=i34094573M$";
             try (Connection connection = DriverManager.getConnection( url ))
             {
                String insertQuery = "INSERT INTO dbo.inputdata (name, address, gender, knowledge, subject, image, date) VALUES(?,?,?,?,?,?,?)";
               PreparedStatement ps = connection.prepareStatement(insertQuery);
               ps.setString(1, name.getText());
               ps.setString(2, address.getText());
                 if ( male.isSelected())
                 {
                   gender = "Male";
                 }
                 else if ( female.isSelected())
                 {
                     gender = "Female";
                 }
                 ps.setString(3, gender);
                 
                 String knowledge = "";
                 if ( java_prg.isSelected())
                 {
                     knowledge+= java_prg.getText() + " ";
                 }
                 if ( cpp.isSelected())
                 {
                     knowledge+= cpp.getText() + " ";
                 }
                 if ( python.isSelected())
                 {
                     knowledge+= python.getText() + " ";
                 }
                 ps.setString(4, knowledge);
                 
                 String course;
                 course = subject.getSelectedItem().toString();
                 ps.setString(5, course);
                 ps.setBytes(6, person_imige);
                 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                 String date = sdf.format(date_chooser.getDate());
                 ps.setString(7, date);
                 ps.executeUpdate();
                 DefaultTableModel model = (DefaultTableModel)jTable1_Display_User.getModel();
                 model.setRowCount(0);
                 show_user();
                 JOptionPane.showMessageDialog(null, "Update successfull");
             }
                }
                catch ( SQLException throwable )
                {
                    JOptionPane.showMessageDialog( null,throwable  );
                }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetBtnActionPerformed
    {//GEN-HEADEREND:event_resetBtnActionPerformed
        name.setText("");
        address.setText("");
        buttonGroup1.clearSelection();
        subject.setSelectedIndex(0);
        java_prg.setSelected(false);
        cpp.setSelected(false);
        python.setSelected(false);
        pictureLbl.setIcon(null);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jTable1_Display_UserMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTable1_Display_UserMouseClicked
    {//GEN-HEADEREND:event_jTable1_Display_UserMouseClicked
        int i = jTable1_Display_User.getSelectedRow();
        TableModel model = jTable1_Display_User.getModel();
        name.setText(model.getValueAt(i,1).toString());
        address.setText(model.getValueAt(i, 2).toString());
        String sex = model.getValueAt(i, 3).toString();
        if ( sex.equals("Male"))
        {
            male.setSelected(true);
        }
        else
        {
            female.setSelected(true);
        }
        String knowledge = model.getValueAt(i, 4).toString();
        
        if ( knowledge.equals("Java "))
        {
            java_prg.setSelected(true);
            cpp.setSelected(false);
            python.setSelected(false);
        }
        if ( knowledge.equals("C++ "))
        {
            cpp.setSelected(true);
            java_prg.setSelected(false);
            python.setSelected(false);
        }
        if ( knowledge.equals("Python "))
        {
            python.setSelected(true);
            java_prg.setSelected(false);
            cpp.setSelected(false);
        }
        if ( knowledge.equals("Java C++ ") )
        {
            java_prg.setSelected(true);
            cpp.setSelected(true);
            python.setSelected(false);
        }
        if ( knowledge.equals("Java Python "))
        {
            java_prg.setSelected(true);
            cpp.setSelected(false);
            python.setSelected(true);
        }
        if ( knowledge.equals("Java C++ Python "))
        {
            java_prg.setSelected(true);
            cpp.setSelected(true);
            python.setSelected(true);
        }
        
        if ( knowledge.equals(""))
        {
            java_prg.setSelected(false);
            cpp.setSelected(false);
            python.setSelected(false);
        }
            
        String subjecString = model.getValueAt(i, 5).toString();
        if ( subjecString.equals("Software engineering"))
            subject.setSelectedIndex(1);
        
        if ( subjecString.equals("Computer science"))
            subject.setSelectedIndex(2);
        
        if ( subjecString.equals("Network administration"))
            subject.setSelectedIndex(3);
        
        byte[] img = userList().get(i).getPicture();
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(pictureLbl.getWidth(),pictureLbl.getHeight(),Image.SCALE_SMOOTH));
		pictureLbl.setIcon(imageIcon);
    }//GEN-LAST:event_jTable1_Display_UserMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateBtnActionPerformed
    {//GEN-HEADEREND:event_updateBtnActionPerformed
        try
            {
                String url = "jdbc:mysql://localhost:3306/dbo?useTimezone=true&serverTimezone=UTC&user=root&password=i34094573M$";
                try (Connection connection = DriverManager.getConnection( url ))
                  {
                      int row = jTable1_Display_User.getSelectedRow();
                      String value = (jTable1_Display_User.getModel().getValueAt(row, 0).toString());
                      String updateQuery = "UPDATE dbo.inputdata SET name=?, address=?, gender=?, knowledge=?, subject=?, image=? WHERE sno=" + value;
                      PreparedStatement ps = connection.prepareStatement(updateQuery);
                      ps.setString(1, name.getText());
                      ps.setString(2, address.getText());
                      if ( male.isSelected())
                      {
                         gender = "Male";
                      }
                 else if ( female.isSelected())
                 {
                     gender = "Female";
                 }
                 ps.setString(3, gender);
                 
                 String knowledge = "";
                 if ( java_prg.isSelected())
                 {
                     knowledge+= java_prg.getText() + " ";
                 }
                 if ( cpp.isSelected())
                 {
                     knowledge+= cpp.getText() + " ";
                 }
                 if ( python.isSelected())
                 {
                     knowledge+= python.getText() + " ";
                 }
                 ps.setString(4, knowledge);
                 
                 String course;
                 course = subject.getSelectedItem().toString();
                 ps.setString(5, course);
                 ps.setBytes(6, person_imige);
                 ps.executeUpdate();
                 DefaultTableModel model = (DefaultTableModel)jTable1_Display_User.getModel();
                 model.setRowCount(0);
                 show_user();
                 JOptionPane.showMessageDialog(null, "Update successfull");
                  }
            }
         catch ( SQLException throwable )
                {
                    JOptionPane.showMessageDialog( null,throwable  );
                }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteBtnActionPerformed
    {//GEN-HEADEREND:event_deleteBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to DELETE", "DELETE", JOptionPane.YES_NO_OPTION);
        if (option == 0)
        {
        try
            {
                String url = "jdbc:mysql://localhost:3306/dbo?useTimezone=true&serverTimezone=UTC&user=root&password=i34094573M$";
                try (Connection connection = DriverManager.getConnection( url ))
                  {
                      int row = jTable1_Display_User.getSelectedRow();
                      String value = (jTable1_Display_User.getModel().getValueAt(row, 0).toString());
                      String deleteQuery = "DELETE FROM dbo.inputdata WHERE sno=" + value;
                      PreparedStatement ps = connection.prepareStatement(deleteQuery);
                      ps.executeUpdate();
                      DefaultTableModel model = (DefaultTableModel)jTable1_Display_User.getModel();
                      model.setRowCount(0);
                      show_user();
                      JOptionPane.showMessageDialog(null, "Delete successfull");
                  }
            }
        
         catch ( SQLException throwable )
                {
                    JOptionPane.showMessageDialog( null,throwable  );
                }
        }
         
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void choosePicActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_choosePicActionPerformed
    {//GEN-HEADEREND:event_choosePicActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        fileName = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(fileName).getImage().getScaledInstance(pictureLbl.getWidth(), pictureLbl.getHeight(), Image.SCALE_SMOOTH));
        pictureLbl.setIcon(imageIcon);
        try
        {
            File image = new File(fileName);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[ 1024];
            for (int readNum; (readNum = fis.read(buffer)) != -1;)
            {
                baos.write(buffer, 0, readNum);
            }
            person_imige = baos.toByteArray();
        }
        catch ( IOException e )
        {
        }
    }//GEN-LAST:event_choosePicActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] )
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() )
            {
                if ( "Nimbus".equals(info.getName()) )
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex )
        {
            java.util.logging.Logger.getLogger(Sucess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new Sucess().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton choosePic;
    private javax.swing.JCheckBox cpp;
    private javax.swing.JButton dateBtn;
    private com.toedter.calendar.JDateChooser date_chooser;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_Display_User;
    private javax.swing.JCheckBox java_prg;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JLabel pictureLbl;
    private javax.swing.JCheckBox python;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}