
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Wallet extends javax.swing.JFrame {

    /**
     * Creates new form Wallet
     */
    CabBooking cb;
    public Wallet(CabBooking b) {
        cb = b;
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdetails", "root", "bits@123")) {

                PreparedStatement ps = conn.prepareStatement("select Balance from cdetails  where uName=?");
                ps.setString(1, cb.userName);
                ResultSet rs = ps.executeQuery();
                float s;

                if (rs.next()) {
                    s = rs.getFloat(1);
                    String str = Float.toString(s);
                    currbal.setText(str);

                }

            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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

        checkbal = new javax.swing.JPanel();
        jLabelCabBooking = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        currbal = new javax.swing.JLabel();
        addmoney = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // setUndecorated(true);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkbal.setBackground(new java.awt.Color(255, 255, 255));
        checkbal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCabBooking.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabelCabBooking.setText("Click to Return to Cab Booking");
        jLabelCabBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCabBookingMouseClicked(evt);
            }
        });
        checkbal.add(jLabelCabBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel2.setText("Your current balance is :");
        checkbal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        currbal.setBackground(new java.awt.Color(0, 0, 0));
        currbal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkbal.add(currbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 150, 26));

        addmoney.setBackground(new java.awt.Color(34, 167, 240));
        addmoney.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addmoney.setForeground(new java.awt.Color(255, 255, 255));
        addmoney.setText("Add Money");
        addmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmoneyActionPerformed(evt);
            }
        });
        checkbal.add(addmoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 301, 53));

        jPanel2.setBackground(new java.awt.Color(96, 101, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addmoney.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 540, 530));

        checkbal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 940));

        getContentPane().add(checkbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-11, 92, 1480, 850));

        jPanel1.setBackground(new java.awt.Color(15, 36, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Wallet");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1479, 92));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCabBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCabBookingMouseClicked

        CabBooking cbk = new CabBooking(cb.userName);
        cbk.setVisible(true);
        cbk.pack();
        cbk.setLocationRelativeTo(null);
        cbk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelCabBookingMouseClicked

    private void addmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmoneyActionPerformed
        AddMoney adm = new AddMoney(cb);
        adm.setVisible(true);
        adm.pack();
        adm.setLocationRelativeTo(null);
        adm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_addmoneyActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Wallet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    //java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    //   new Wallet().setVisible(true);
    //}
    // });
    // }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmoney;
    private javax.swing.JPanel checkbal;
    private javax.swing.JLabel currbal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCabBooking;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}