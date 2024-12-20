/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.RegisterC;
import Model.RegisterM;

/**
 *
 * @author Deepak
 */
public class ManagerReg extends javax.swing.JFrame {

    /**
     * Creates new form ManagerReg
     */
    public ManagerReg() {
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
        mFname = new javax.swing.JTextField();
        mLname = new javax.swing.JTextField();
        mPass = new javax.swing.JTextField();
        mNIC = new javax.swing.JTextField();
        LNIC = new javax.swing.JLabel();
        LLname = new javax.swing.JLabel();
        LPass = new javax.swing.JLabel();
        LFname = new javax.swing.JLabel();
        bRegister = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
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
        mForumTitle.setText("Manager Registration ");
        Mbox.add(mForumTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, 390, 60));

        MField_H.setBackground(new java.awt.Color(255, 255, 255));
        MField_H.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mFname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFnameActionPerformed(evt);
            }
        });
        MField_H.add(mFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 450, 48));

        mLname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(mLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 450, 48));

        mPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(mPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 207, 450, 48));

        mNIC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        MField_H.add(mNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 450, 48));

        LNIC.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LNIC.setText("NIC");
        MField_H.add(LNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 180, 30));

        LLname.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LLname.setText("Last Name");
        MField_H.add(LLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 180, 30));

        LPass.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LPass.setText("Password");
        MField_H.add(LPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 30));

        Mbox.add(MField_H, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 450, 360));

        LFname.setFont(new java.awt.Font("Leelawadee UI", 1, 15)); // NOI18N
        LFname.setText("First Name");
        Mbox.add(LFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 125, 180, 30));

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
       LoginFrame LF = new LoginFrame();
        this.setVisible(false);
        LF.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_BMouseClicked

    private void mFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mFnameActionPerformed

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        
        
        String Un = mFname.getText();
        String Pass = mPass.getText();
        String lName =  mLname.getText();
        String NIC = mNIC.getText();
        
        RegisterM REGM = new RegisterM();
        RegisterC REGC = new RegisterC();
        REGC.Register(Un,Pass,lName,NIC);
        
        
        boolean Status = REGM.Status();
        
        if(Status == true){
            RegistrationStatus.setText("Registration Successful");
            UsernameStatus.setText("MG-"+mFname.getText());
            PassStatus.setText(mPass.getText());
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
        LoginFrame LF = new LoginFrame();
        LF.setVisible(true);
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
            java.util.logging.Logger.getLogger(ManagerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerReg().setVisible(true);
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
    private javax.swing.JLabel LFname;
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
    private javax.swing.JTextField mFname;
    private javax.swing.JLabel mForumTitle;
    private javax.swing.JTextField mLname;
    private javax.swing.JTextField mNIC;
    private javax.swing.JTextField mPass;
    // End of variables declaration//GEN-END:variables
}
