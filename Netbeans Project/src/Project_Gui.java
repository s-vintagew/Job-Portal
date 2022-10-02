import java.sql.*;
import javax.swing.*;
import java.util.Arrays;
public class Project_Gui extends javax.swing.JFrame {

    /**
     * Creates new form Project_Gui
     */
    public Project_Gui() {
        initComponents();
    }
    boolean userNameCheck()
    {
        if(jRadioButton5.isSelected())
        {
            String url= "jdbc:mysql://localhost:3306/usr";
            String uname="root",query;
            try(Connection con = DriverManager.getConnection(url,uname,"root");
                    Statement statement = con.createStatement();)
            {
                query="select username from  logindata;";
                ResultSet result=statement.executeQuery(query);
                while(result.next())
                {
                    if(result.getString("username").equals(jTextField2.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Username already Exists,\nTry Different Username");
                        return false;
                    }
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Technical Error");
                e.printStackTrace();
            }
        }
        else if(jRadioButton6.isSelected())
        {
            String url= "jdbc:mysql://localhost:3306/company";
            String uname="root",query;
            try(Connection con = DriverManager.getConnection(url,uname,"root");
                    Statement statement = con.createStatement();)
            {
                query="select username from  logindata;";
                ResultSet result=statement.executeQuery(query);
                while(result.next())
                {
                    if(result.getString("username").equals(jTextField2.getText()))
                    {
                        JOptionPane.showMessageDialog(null,"Username already Exists,\nTry Different Username");
                        return false;
                    }
                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Technical Error");
            }
        }
        return true;
    }
    boolean check_login()
    {
        if(jTextField3.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Username cannot be Blank");                
            return false;
        }
        if((new String(jPasswordField1.getPassword())).equals(""))
        {
            JOptionPane.showMessageDialog(null,"Password cannot be Blank");                
            return false;
        }
        return true;
    }
    boolean check_register()
    {
        if(jTextField2.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Username cannot be Blank");                
            return false;
        }
        if((new String(jPasswordField2.getPassword())).equals(""))
        {
            JOptionPane.showMessageDialog(null,"Passcode cannot be Blank");                
            return false;
        }
        if(jTextField7.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Phone Number cannot be Blank");                
            return false;
        }
        if(jTextField7.getText().length()!=10)
        {
            JOptionPane.showMessageDialog(null,"Phone Number should be 10 Digit");
            return false;
        }
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label9 = new java.awt.Label();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        label8 = new java.awt.Label();
        jTextField2 = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        jTextField8 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField7 = new javax.swing.JTextField();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        jTextField10 = new javax.swing.JTextField();
        label7 = new java.awt.Label();

        label9.setText("Passcode");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(170, 225, 53));
        setLocation(new java.awt.Point(550, 100));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(java.awt.SystemColor.controlHighlight);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextPane1.setText("JOB PORTAL");
        jScrollPane1.setViewportView(jTextPane1);

        jTabbedPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        jTabbedPane2.setForeground(new java.awt.Color(0, 0, 204));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton3.setText("User");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 255));
        jRadioButton4.setText("Company");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jRadioButton3)
                .addGap(62, 62, 62)
                .addComponent(jRadioButton4)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)))
        );

        label3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 102, 102));
        label3.setText("Username");

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 102, 102));
        label4.setText("Passcode");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jPasswordField1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("New User, Register ");

        jButton3.setText("here");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Login", jPanel1);

        jButton1.setBackground(java.awt.SystemColor.activeCaption);
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton5.setText("User");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(0, 0, 204));
        jRadioButton6.setText("Company");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jRadioButton6)
                .addGap(56, 56, 56))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5)))
        );

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 153, 102));
        label8.setText("Passcode");

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 153, 102));
        label2.setText("Username");

        jTextField7.setActionCommand("<Not Set>");

        label11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 153, 102));
        label11.setText("Email");

        label12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label12.setForeground(new java.awt.Color(0, 153, 102));
        label12.setText("Phone Number");

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 153, 102));
        label7.setText("Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Registration", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(check_login())
            {
        if(jRadioButton3.isSelected())
        {
            
             String url= "jdbc:mysql://localhost:3306/usr";
            String uname="root";  
            String query,username,pass;
            username=jTextField3.getText();
            pass=new String(jPasswordField1.getPassword());
            try
            {            
                Connection con = DriverManager.getConnection(url,uname,"root");
                Statement statement = con.createStatement();
                query="Select * from logindata where username='"+username+"'";
                ResultSet result= statement.executeQuery(query);
               while(result.next()){
                    String a = result.getString(1);
                    String b =  result.getString(2);
                    if(a.equals(username))
                    {
                        if(b.equals(pass))
                        {
                            this.setVisible(false);
                            new UserDashboard_GUI(username).setVisible(true);
                            return;
                        }   
                    }
                }
                JOptionPane.showMessageDialog(null, "Credentials Mismatch, Try Again!");
                //System.out.println("Failed to login");
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
            
        else if(jRadioButton4.isSelected())
        {
            String url= "jdbc:mysql://localhost:3306/company";
        String uname="root";  
        String query,username,pass;     
        username=jTextField3.getText();
        pass=new String(jPasswordField1.getPassword());              
        try
        {            
            Connection con = DriverManager.getConnection(url,uname,"root");
            Statement statement = con.createStatement();
            query="Select * from logindata where username='"+username+"'";
            ResultSet result= statement.executeQuery(query);
            while(result.next()){
                String a = result.getString(1);
                String b =  result.getString(2);
                if(a.equals(username)){
                    if(b.equals(pass))
                    {
                        this.setVisible(false);
                        new CompDashboard_GUI(username).setVisible(true);
                        return;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Credentials Mismatch, Try Again!");
        }
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!userNameCheck())
            return;
        if(check_register())
                {
        if(jRadioButton5.isSelected())
        {
            
            String url= "jdbc:mysql://localhost:3306/usr";
            String uname="root";
            String query,email,pass,usr,fname,lname; 
            int e_req,c_id;
            long cont;
            usr=jTextField2.getText(); 
            cont=Long.parseLong(jTextField7.getText()); 
            pass=new String(jPasswordField2.getPassword());
            fname=jTextField8.getText();
            
            email=jTextField10.getText();
            try(Connection con = DriverManager.getConnection(url,uname,"root");
                    Statement statement = con.createStatement();)
            {
                query="insert into logindata values('"+usr+"','"+pass+"');";
                statement.executeUpdate(query);
                query="insert into userdata(username,Name,email,phone) values"
                        + "('"+usr+"','"+fname+"','"+email+"',"+cont+");";
                statement.executeUpdate(query);
                query="insert into skills(username) values('"+usr+"');";
                statement.executeUpdate(query);
                query="insert into education(username) values('"+usr+"');";
                statement.executeUpdate(query);
                this.setVisible(false);
                new UserDashboard_GUI(usr).setVisible(true);
                
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
        else if(jRadioButton6.isSelected())
        {
            String url= "jdbc:mysql://localhost:3306/company";
            String uname="root";
            String query,email,pass,usr,fname,lname; 
            int e_req,c_id;
            long cont;
            usr=jTextField2.getText(); 
            cont=Long.parseLong(jTextField7.getText()); 
            pass=new String(jPasswordField2.getPassword());
            fname=jTextField8.getText();
            
            email=jTextField10.getText();
            try(Connection con = DriverManager.getConnection(url,uname,"root");
                    Statement statement = con.createStatement();)
            {
                query="insert into logindata values('"+usr+"','"+pass+"');";
                statement.executeUpdate(query);
                query="insert into companies(username,Name,email,contact_no) values"
                        + "('"+usr+"','"+fname+"','"+email+"',"+cont+");";
                statement.executeUpdate(query);
                this.setVisible(false);
                new CompDashboard_GUI(usr).setVisible(true);
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        userNameCheck();
    }//GEN-LAST:event_jTextField2FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
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
            java.util.logging.Logger.getLogger(Project_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables
}
