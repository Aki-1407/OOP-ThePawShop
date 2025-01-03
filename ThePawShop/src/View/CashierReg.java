/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.RegisterCashierC;

/**
 *
 * @author Deepak
 */
public class CashierReg extends javax.swing.JFrame {

    RegisterCashierC Reg = new RegisterCashierC();
    
    public CashierReg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGcard = new javax.swing.JPanel();
        BGPanel = new javax.swing.JPanel();
        Back_B = new javax.swing.JLabel();
        Mbox = new javax.swing.JPanel();
        mForumTitle = new javax.swing.JLabel();
        MField_H = new javax.swing.JPanel();
        cLname = new javax.swing.JTextField();
        cPass = new javax.swing.JTextField();
        cNIC = new javax.swing.JTextField();
        LNIC = new javax.swing.JLabel();
        LPass = new javax.swing.JLabel();
        cFname = new javax.swing.JTextField();
        cDOB = new javax.swing.JFormattedTextField();
        LDOB = new javax.swing.JLabel();
        LGender = new javax.swing.JLabel();
        cGender = new javax.swing.JComboBox<>();
        LLname = new javax.swing.JLabel();
        bRegister = new javax.swing.JButton();
        LFname = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        DeDP = new javax.swing.JPanel();
        MsgBox = new javax.swing.JPanel();
        RegistrationStatus = new javax.swing.JLabel();
        PWlabel = new javax.swing.JLabel();
        PassStatus = new javax.swing.JLabel();
        UNlable = new javax.swing.JLabel();
        UsernameStatus = new javax.swing.JLabel();
        bReturn = new javax.swing.JButton();
        BG1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        BGcard.setLayout(new java.awt.CardLayout());

        BGPanel.setFocusable(false);
        BGPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
        BGPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        BGPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/angle-double-left.png"))); // NOI18N
        Back_B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_BMouseClicked(evt);
            }
        });
        BGPanel.add(Back_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 40, 40));

        Mbox.setBackground(new java.awt.Color(255, 255, 255));
        Mbox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mForumTitle.setBackground(new java.awt.Color(255, 255, 255));
        mForumTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mForumTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mForumTitle.setText("Cashier Registration ");
        Mbox.add(mForumTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, 390, 60));

        MField_H.setBackground(new java.awt.Color(255, 255, 255));
        MField_H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cLname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(cLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 210, 48));

        cPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(cPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 450, 48));

        cNIC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(cNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 207, 450, 48));

        LNIC.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LNIC.setText("NIC");
        MField_H.add(LNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 180, 30));

        LPass.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LPass.setText("Password");
        MField_H.add(LPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 30));

        cFname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(cFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 210, 48));

        cDOB.setColumns(3);
        cDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/mm/yyyy"))));
        MField_H.add(cDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 210, 50));

        LDOB.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LDOB.setText("DOB");
        MField_H.add(LDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, 30));

        LGender.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LGender.setText("Gender");
        MField_H.add(LGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 30));

        cGender.setMaximumRowCount(2);
        cGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        MField_H.add(cGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 50));

        Mbox.add(MField_H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 450, 360));

        LLname.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LLname.setText("Last Name");
        Mbox.add(LLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 115, 100, 30));

        bRegister.setBackground(new java.awt.Color(22, 163, 74));
        bRegister.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        bRegister.setForeground(new java.awt.Color(255, 255, 255));
        bRegister.setText("Register");
        bRegister.setFocusable(false);
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });
        Mbox.add(bRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 545, 390, 40));

        LFname.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LFname.setText("First Name");
        Mbox.add(LFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, 100, 30));

        BGPanel.add(Mbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 530, 610));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/gradient.png"))); // NOI18N
        BG.setFocusable(false);
        BG.setMaximumSize(new java.awt.Dimension(1280, 720));
        BG.setMinimumSize(new java.awt.Dimension(1280, 720));
        BG.setName(""); // NOI18N
        BG.setPreferredSize(new java.awt.Dimension(1280, 720));
        BGPanel.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BGcard.add(BGPanel, "card2");

        DeDP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MsgBox.setBackground(new java.awt.Color(255, 255, 255));
        MsgBox.setPreferredSize(new java.awt.Dimension(530, 420));
        MsgBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrationStatus.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        RegistrationStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MsgBox.add(RegistrationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 40, 410, 40));

        PWlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PWlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PWlabel.setText("Your Password:");
        MsgBox.add(PWlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 40));

        PassStatus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PassStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MsgBox.add(PassStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 300, 40));

        UNlable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UNlable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UNlable.setText("Your Username:");
        MsgBox.add(UNlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 40));

        UsernameStatus.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        UsernameStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MsgBox.add(UsernameStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 300, 40));

        bReturn.setBackground(new java.awt.Color(204, 204, 204));
        bReturn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        bReturn.setText("Return");
        bReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReturnActionPerformed(evt);
            }
        });
        MsgBox.add(bReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 270, 40));

        DeDP.add(MsgBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 530, 420));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Images/gradient.png"))); // NOI18N
        BG1.setFocusable(false);
        BG1.setMaximumSize(new java.awt.Dimension(1280, 720));
        BG1.setMinimumSize(new java.awt.Dimension(1280, 720));
        BG1.setName(""); // NOI18N
        BG1.setPreferredSize(new java.awt.Dimension(1280, 720));
        DeDP.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BGcard.add(DeDP, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BGcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BGcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Back_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_BMouseClicked
        this.dispose();
    }//GEN-LAST:event_Back_BMouseClicked

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        
        
        String Un = cFname.getText();
        String Pass = cPass.getText();
        String lName = cFname.getText() + " " + cLname.getText();
        String NIC = cNIC.getText();
        String Gender = (String) cGender.getSelectedItem();
        String DOB = cDOB.getText();
        
        Reg.Register(Un, Pass, lName, NIC, Gender, DOB);
        
        
        boolean Status = Reg.returnStatus();
        
        if(Status == true){
            RegistrationStatus.setText("Registration Successful");
            UsernameStatus.setText("Cs-" + cFname.getText());
            PassStatus.setText(cPass.getText());
                }
        
        else {
            RegistrationStatus.setText("Registration Failed");
        }
        
        
        
        
        BGPanel.setVisible(false);
        DeDP.setVisible(true);
    }//GEN-LAST:event_bRegisterActionPerformed

    private void bReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReturnActionPerformed
        if(RegistrationStatus.getText().equals("Registration Successful")){
        
        this.dispose();
        
        DeDP.setVisible(false);
        BGPanel.setVisible(true);
        
        cFname.setText("");
        cPass.setText("");
        cLname.setText("");
        cNIC.setText("");
        cDOB.setText("");
        
        }
        
        else{
            DeDP.setVisible(false);
            BGPanel.setVisible(true);
        }
        
        
       
    }//GEN-LAST:event_bReturnActionPerformed

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
            java.util.logging.Logger.getLogger(CashierReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel BG1;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JPanel BGcard;
    private javax.swing.JLabel Back_B;
    private javax.swing.JPanel DeDP;
    private javax.swing.JLabel LDOB;
    private javax.swing.JLabel LFname;
    private javax.swing.JLabel LGender;
    private javax.swing.JLabel LLname;
    private javax.swing.JLabel LNIC;
    private javax.swing.JLabel LPass;
    private javax.swing.JPanel MField_H;
    private javax.swing.JPanel Mbox;
    private javax.swing.JPanel MsgBox;
    private javax.swing.JLabel PWlabel;
    private javax.swing.JLabel PassStatus;
    private javax.swing.JLabel RegistrationStatus;
    private javax.swing.JLabel UNlable;
    private javax.swing.JLabel UsernameStatus;
    private javax.swing.JButton bRegister;
    private javax.swing.JButton bReturn;
    private javax.swing.JFormattedTextField cDOB;
    private javax.swing.JTextField cFname;
    private javax.swing.JComboBox<String> cGender;
    private javax.swing.JTextField cLname;
    private javax.swing.JTextField cNIC;
    private javax.swing.JTextField cPass;
    private javax.swing.JLabel mForumTitle;
    // End of variables declaration//GEN-END:variables
}
