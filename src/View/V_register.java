/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import javax.accessibility.AccessibleContext;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
 *
 * @author GeGa
 */
public class V_register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    int mouseX;
    int mouseY;
    public V_register() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        attach2Btn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        namaField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        answerField = new javax.swing.JTextField();
        Perempuan = new javax.swing.JRadioButton();
        lakiLaki = new javax.swing.JRadioButton();
        dateField = new datechooser.beans.DateChooserCombo();
        daftarBtn = new javax.swing.JButton();
        questionComboBox = new javax.swing.JComboBox<>();
        emailField = new javax.swing.JTextField();
        attach1Btn = new javax.swing.JLabel();
        foto2 = new javax.swing.JLabel();
        homeBtn2 = new javax.swing.JLabel();
        foto1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(27, 27, 27));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attach2Btn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        attach2Btn.setForeground(new java.awt.Color(255, 255, 255));
        attach2Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attach2Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        jPanel3.add(attach2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        homeBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setText("Bukti Kepemilikan Sawah");
        jPanel3.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 520, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 520, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 520, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 520, 10));

        namaField.setBackground(new java.awt.Color(26, 26, 26));
        namaField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        namaField.setForeground(new java.awt.Color(255, 255, 255));
        namaField.setText("Nama Lengkap");
        namaField.setBorder(null);
        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaFieldFocusLost(evt);
            }
        });
        jPanel3.add(namaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 522, 40));

        passwordField.setBackground(new java.awt.Color(26, 26, 26));
        passwordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 522, 40));

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("KEMBALI");
        jPanel3.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 140, -1));

        answerField.setBackground(new java.awt.Color(26, 26, 26));
        answerField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        answerField.setForeground(new java.awt.Color(255, 255, 255));
        answerField.setText("Jawaban");
        answerField.setBorder(null);
        answerField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerFieldFocusLost(evt);
            }
        });
        jPanel3.add(answerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 522, 40));

        Perempuan.setBackground(new java.awt.Color(26, 26, 26));
        buttonGroup1.add(Perempuan);
        Perempuan.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Perempuan.setForeground(new java.awt.Color(255, 255, 255));
        Perempuan.setText("Perempuan");
        jPanel3.add(Perempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        lakiLaki.setBackground(new java.awt.Color(26, 26, 26));
        buttonGroup1.add(lakiLaki);
        lakiLaki.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lakiLaki.setForeground(new java.awt.Color(255, 255, 255));
        lakiLaki.setText("Laki-Laki");
        jPanel3.add(lakiLaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        dateField.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateField.setCalendarBackground(new java.awt.Color(26, 26, 26));
    dateField.setNothingAllowed(false);
    dateField.setFormat(1);
    dateField.setWeekStyle(datechooser.view.WeekDaysStyle.FULL);
    try {
        dateField.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(1998, 2, 11),
            new java.util.GregorianCalendar(1998, 2, 11))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
    e1.printStackTrace();
    }
    dateField.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 18));
    jPanel3.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 520, 40));

    daftarBtn.setBackground(new java.awt.Color(118, 185, 0));
    daftarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    daftarBtn.setText("BUAT AKUN");
    jPanel3.add(daftarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 600, -1, -1));

    questionComboBox.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    questionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Siapa Nama Gadis Ibu Anda ?", "Siapa Nama Guru SD Anda ?", "Siapa Nama Hewan Peliharaan Anda ?", "Apa Warna Kesukaan Anda ?", " " }));
    jPanel3.add(questionComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 520, 40));

    emailField.setBackground(new java.awt.Color(26, 26, 26));
    emailField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    emailField.setForeground(new java.awt.Color(255, 255, 255));
    emailField.setText("Email Address");
    emailField.setBorder(null);
    emailField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            emailFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            emailFieldFocusLost(evt);
        }
    });
    jPanel3.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 522, 40));

    attach1Btn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    attach1Btn.setForeground(new java.awt.Color(255, 255, 255));
    attach1Btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    attach1Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
    jPanel3.add(attach1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

    foto2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    foto2.setForeground(new java.awt.Color(255, 255, 255));
    foto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    foto2.setText("Belum Ada Lampiran");
    jPanel3.add(foto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, 30));

    homeBtn2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    homeBtn2.setForeground(new java.awt.Color(255, 255, 255));
    homeBtn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    homeBtn2.setText("Kartu Identitas Diri");
    jPanel3.add(homeBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

    foto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    foto1.setForeground(new java.awt.Color(255, 255, 255));
    foto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    foto1.setText("Belum Ada Lampiran");
    jPanel3.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, 30));

    jPanel4.setBackground(new java.awt.Color(118, 185, 0));

    jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(8, 10, 9));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("REGISTER");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(181, 181, 181)
            .addComponent(jLabel2)
            .addContainerGap(197, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2)
            .addContainerGap(18, Short.MAX_VALUE))
    );

    jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 560, -1));

    jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 11, 580, 650));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 1330, 680));

    head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    head.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/head.png"))); // NOI18N
    head.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        public void mouseDragged(java.awt.event.MouseEvent evt) {
            headMouseDragged(evt);
        }
    });
    head.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            headMousePressed(evt);
        }
    });
    jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 27));

    minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimize.png"))); // NOI18N
    minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            minimizeBtnMouseClicked(evt);
        }
    });
    jPanel1.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

    exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Exit.png"))); // NOI18N
    exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            exitBtnMouseClicked(evt);
        }
    });
    jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getNama(){
        return namaField.getText();
    }
    
    public String getEmail(){
        return emailField.getText();
    }
    
    public String getPassword(){
        return passwordField.getText();
    }
    
    public String getGender(){
        buttonGroup1.getSelection();
        if (lakiLaki.isSelected()) {
            return "L";
        } else if (Perempuan.isSelected()){
            return "P";
        } else {
            return "Yang Betol";
        }
    }
    
    public String getDate(){
        return dateField.getText();
    }
    
    public int getQuestion(){
        return questionComboBox.getSelectedIndex();
    }
    
    public String answer(){
        return answerField.getText();
    }
    
    public void klikAttachFile1(MouseAdapter action){
        attach1Btn.addMouseListener(action);
    }
    
    public void klikAttachFile2(MouseAdapter action){
        attach2Btn.addMouseListener(action);
    }
    
    public void klikKembali(ActionListener action){
        backBtn.addActionListener(action);
    }
    
    public void klikDaftar(ActionListener action){
        daftarBtn.addActionListener(action);
    }
    
    public void setFoto1(String teks){
        foto1.setText(teks);
    }
    
    public void setFoto2(String teks){
        foto2.setText(teks);
    }
    
    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        // TODO add your handling code here:
        int koordinatX = evt.getXOnScreen();
        int koordinatY = evt.getYOnScreen();
        this.setLocation(koordinatX-mouseX, koordinatY-mouseY);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void namaFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusGained
        // TODO add your handling code here:
        if (namaField.getText().equalsIgnoreCase("Nama Lengkap")) {
            namaField.setText("");
        }
    }//GEN-LAST:event_namaFieldFocusGained

    private void namaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusLost
        // TODO add your handling code here:
        if (namaField.getText().equalsIgnoreCase("")) {
            namaField.setText("Nama Lengkap");
        }
    }//GEN-LAST:event_namaFieldFocusLost

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        // TODO add your handling code here:
        if (emailField.getText().equalsIgnoreCase("Email Address")) {
            emailField.setText("");
        }
    }//GEN-LAST:event_emailFieldFocusGained

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
         if (emailField.getText().equalsIgnoreCase("")) {
            emailField.setText("Email Address");
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        if (passwordField.getText().equalsIgnoreCase("password")) {
            passwordField.setText("");
        }
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        // TODO add your handling code here:
        if (passwordField.getText().equalsIgnoreCase("")) {
            passwordField.setText("password");
        }
    }//GEN-LAST:event_passwordFieldFocusLost

    private void answerFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFieldFocusGained
        // TODO add your handling code here:
        if (answerField.getText().equalsIgnoreCase("Jawaban")) {
            answerField.setText("");
        }
    }//GEN-LAST:event_answerFieldFocusGained

    private void answerFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFieldFocusLost
        // TODO add your handling code here:
        if (answerField.getText().equalsIgnoreCase("")) {
            answerField.setText("Jawaban");
        }
    }//GEN-LAST:event_answerFieldFocusLost

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(V_login.ICONIFIED);    // TODO add your handling code here:
    }//GEN-LAST:event_minimizeBtnMouseClicked

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_exitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(V_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel attach1Btn;
    private javax.swing.JLabel attach2Btn;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton daftarBtn;
    private datechooser.beans.DateChooserCombo dateField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel foto2;
    private javax.swing.JLabel head;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel homeBtn2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton lakiLaki;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JTextField namaField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> questionComboBox;
    // End of variables declaration//GEN-END:variables
}
