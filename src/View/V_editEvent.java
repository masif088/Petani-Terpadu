/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author GeGa
 */
public class V_editEvent extends javax.swing.JFrame {

    /**
     * Creates new form EditEvent
     */
    int mouseX;
    int mouseY;
    public V_editEvent() {
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

        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        judulField = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        isi = new javax.swing.JTextArea();
        simpanBtn = new javax.swing.JButton();
        attachFileBtn = new javax.swing.JLabel();
        text4 = new javax.swing.JLabel();
        dateChooser = new datechooser.beans.DateChooserCombo();
        foto1 = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lokasiField = new javax.swing.JTextField();
        text3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jamField = new javax.swing.JTextField();
        text5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        narahubungField = new javax.swing.JTextField();
        head = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pengaduanBtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        eventBtn = new javax.swing.JLabel();
        homeBtn = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel21.setBackground(new java.awt.Color(27, 27, 27));
        jPanel21.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel21.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel21.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(25, 25, 25));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 460, -1));

        judulField.setBackground(new java.awt.Color(26, 26, 26));
        judulField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        judulField.setForeground(new java.awt.Color(255, 255, 255));
        judulField.setText("Pameran Buah Segar");
        judulField.setBorder(null);
        jPanel10.add(judulField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 40));

        scroll.setBackground(new java.awt.Color(0, 0, 0));
        scroll.setOpaque(false);

        isi.setBackground(new java.awt.Color(25, 25, 25));
        isi.setColumns(20);
        isi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        isi.setForeground(new java.awt.Color(255, 255, 255));
        isi.setRows(5);
        isi.setText("Pada tahun ini, Kabupaten Banyuwangi Kembali Mengadakan Sebauh Pameran Event, yaitu Pameran Buah SEgar");
        isi.setBorder(null);
        isi.setOpaque(false);
        scroll.setViewportView(isi);

        jPanel10.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 460, 220));

        simpanBtn.setBackground(new java.awt.Color(118, 185, 0));
        simpanBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        simpanBtn.setText("SIMPAN");
        jPanel10.add(simpanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, -1, -1));

        attachFileBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        attachFileBtn.setForeground(new java.awt.Color(255, 255, 255));
        attachFileBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attachFileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/folder.png"))); // NOI18N
        jPanel10.add(attachFileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        text4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text4.setForeground(new java.awt.Color(255, 255, 255));
        text4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text4.setText("Waktu Event");
        jPanel10.add(text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 30));

        dateChooser.setFieldFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 18));
        jPanel10.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 300, 30));

        foto1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto1.setForeground(new java.awt.Color(255, 255, 255));
        foto1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        foto1.setText("buah.jpg");
        jPanel10.add(foto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 250, 30));

        text1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 255, 255));
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Foto Event");
        jPanel10.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        text2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 255, 255));
        text2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text2.setText("Tanggal Event");
        jPanel10.add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));
        jPanel10.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 300, 10));

        lokasiField.setBackground(new java.awt.Color(26, 26, 26));
        lokasiField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lokasiField.setForeground(new java.awt.Color(255, 255, 255));
        lokasiField.setText("Taman Blambangan Banyuwangi");
        lokasiField.setBorder(null);
        jPanel10.add(lokasiField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 300, 30));

        text3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 255, 255));
        text3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text3.setText("Lokasi Event");
        jPanel10.add(text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 110, 30));
        jPanel10.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 300, 10));

        jamField.setBackground(new java.awt.Color(26, 26, 26));
        jamField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jamField.setForeground(new java.awt.Color(255, 255, 255));
        jamField.setText("09.00 - 15.00");
        jamField.setBorder(null);
        jPanel10.add(jamField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 300, 30));

        text5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        text5.setForeground(new java.awt.Color(255, 255, 255));
        text5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text5.setText("Narahubung");
        jPanel10.add(text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 30));
        jPanel10.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 300, 10));

        narahubungField.setBackground(new java.awt.Color(26, 26, 26));
        narahubungField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        narahubungField.setForeground(new java.awt.Color(255, 255, 255));
        narahubungField.setText("Ayu (08123456789)");
        narahubungField.setBorder(null);
        jPanel10.add(narahubungField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 300, 30));

        jPanel22.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 500, 650));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 77, 1330, 680));

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
        jPanel21.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 27));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 50));

        pengaduanBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pengaduanBtn.setForeground(new java.awt.Color(255, 255, 255));
        pengaduanBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengaduanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pengaduan blank.png"))); // NOI18N
        pengaduanBtn.setText(" PENGADUAN");
        jPanel1.add(pengaduanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BATAS.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 50));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/admin blank.png"))); // NOI18N
        jLabel14.setText(" ADMIN GEOFANY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        logoutBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EXIT BLANK.png"))); // NOI18N
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, -1, -1));

        eventBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eventBtn.setForeground(new java.awt.Color(118, 185, 0));
        eventBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/EVENT FILL.png"))); // NOI18N
        eventBtn.setText(" EVENT");
        jPanel1.add(eventBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        homeBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BERANDA BLANK.png"))); // NOI18N
        homeBtn.setText(" BERANDA");
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel21.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1330, 50));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Exit.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        jPanel21.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimize.png"))); // NOI18N
        minimizeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        jPanel21.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void klikHome(MouseAdapter action){
        homeBtn.addMouseListener(action);
    }
    
    public void klikEvent(MouseAdapter action){
        eventBtn.addMouseListener(action);
    }
    
    public void klikPengaduan(MouseAdapter action) {
        pengaduanBtn.addMouseListener(action);
    }
    
    public void klikLogout(MouseAdapter action){
        logoutBtn.addMouseListener(action);
    }
        
    public void setJudul(String Judul){
        judulField.setText(Judul);        
    }
    
    public void setFoto(String Foto){
        foto1.setText(Foto);
    }
    
    public void setCalendar(Calendar Tanggal){
        dateChooser.setSelectedDate(Tanggal);
    }
    
    public void setLokasi(String Lokasi){
        lokasiField.setText(Lokasi);
    }
    
    public void setJam(String Jam){
        jamField.setText(Jam);
    }
    
    public void setNarahubung(String Narahubung){
        narahubungField.setText(Narahubung);
    }
    
    public void setIsi(String Isi){
        isi.setText(Isi);
    }
    
    public void getJudul(){
        judulField.getText();        
    }
    
    public void getCalendar(){
        dateChooser.getSelectedDate();
    }
    
    public String getLokasi(){
        return lokasiField.getText();
    }
    
    public String getJam(){
        return jamField.getText();
    }
    
    public String getNarahubung(){
        return narahubungField.getText();
    }
    
    public String getIsi(){
        return isi.getText();
    }
    
    public void klikAttachFile(MouseListener action){
        attachFileBtn.addMouseListener(action);
    }
    
    public void klikSimpan(ActionListener action){
        simpanBtn.addActionListener(action);
    }
    
    public int confirm(String isi){
        return JOptionPane.showConfirmDialog(this, isi, "Confirm", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
    }
    
    public void message(String isi){
        JOptionPane.showMessageDialog(this, isi);
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

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
        System.exit(1);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(V_login.ICONIFIED);    // TODO add your handling code here:
    }//GEN-LAST:event_minimizeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(V_editEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_editEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_editEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_editEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_editEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attachFileBtn;
    private datechooser.beans.DateChooserCombo dateChooser;
    private javax.swing.JLabel eventBtn;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel foto1;
    private javax.swing.JLabel head;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JTextArea isi;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jamField;
    private javax.swing.JTextField judulField;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JTextField lokasiField;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JTextField narahubungField;
    private javax.swing.JLabel pengaduanBtn;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel text5;
    // End of variables declaration//GEN-END:variables
}
