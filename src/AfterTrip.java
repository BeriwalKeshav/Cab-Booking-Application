
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class AfterTrip extends javax.swing.JFrame {

    String pick , drop;
    float balance , trip_f;
    int driver_ID;
    String tt;
    String cID;
    /**
     * Creates new form AfterTrip
     * @param driverID
     * @param in
     * @param out
     * @param finalamt
     * @param f
     * @param t1
     * @param uID
     */
    public AfterTrip(int driverID, String in , String out, float finalamt, float f, String t1, String uID) {
        initComponents();
        this.setLocationRelativeTo(null);

        pick = in;
        drop = out;
        driver_ID = driverID;
        trip_f = finalamt;
        balance = f;
        tt = t1;
        cID = uID;



        pickup.setText(pick);
        Dest.setText(drop);
        tamt.setText(Float.toString(trip_f));
        ubalance.setText(Float.toString(balance));
        duration.setText(tt);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driverdetails", "root", "bits@123")) {

                PreparedStatement ps = conn.prepareStatement("select dFname, dLName ,carNo from drdetails  where dID=?");
                ps.setInt(1, driver_ID);
                ResultSet rs = ps.executeQuery();


                if (rs.next()) {


                    dname.setText(rs.getString(1) + " " + rs.getString(2));
                    cNo.setText(rs.getString(3));

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

        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uBalance = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dname = new javax.swing.JLabel();
        Dest = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tamt = new javax.swing.JLabel();
        pickup = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cNo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ubalance = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        spinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // setUndecorated(true);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 36, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Trip is Completed");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1491, 92));

        uBalance.setBackground(new java.awt.Color(255, 255, 255));
        uBalance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel3.setText("Destination :");
        uBalance.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 190, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel5.setText("Driver Name : ");
        uBalance.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, 34));

        dname.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, 330, 34));

        Dest.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(Dest, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 160, 38));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel6.setText("Trip Fare :");
        uBalance.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 140, 44));

        tamt.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(tamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 160, 44));

        pickup.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(pickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 320, 38));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel7.setText("Pickup :");
        uBalance.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 120, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel8.setText("Duration :");
        uBalance.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 140, 44));

        duration.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 191, 44));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel9.setText("Car No :");
        uBalance.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, -1, 34));

        cNo.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(cNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 191, 34));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel10.setText("Updated Balance :");
        uBalance.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 240, 44));

        ubalance.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        uBalance.add(ubalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 191, 44));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Please Rate your Trip");
        uBalance.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, 34));

        spinner1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        spinner1.setModel(new javax.swing.SpinnerNumberModel(5, 0, 5, 1));
        uBalance.add(spinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        uBalance.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 110, 121, 52));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thank you for travelling with us. Your ride details are :");
        uBalance.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 526, 65));

        jPanel2.setBackground(new java.awt.Color(96, 101, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tripcomp2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 330, 410));

        uBalance.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 560, 940));
        uBalance.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 292, 900, 10));
        uBalance.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 900, 10));
        uBalance.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 890, -1));
        uBalance.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 452, 890, 10));
        uBalance.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, 880, 10));
        uBalance.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 580, 890, 10));
        uBalance.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 890, 10));

        getContentPane().add(uBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 1491, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        float drating = 0;
        int n1 = 0;
        int n2 = 0;


        int value = (Integer) spinner1.getValue();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/driverdetails", "root", "bits@123")) {
                PreparedStatement ps = conn.prepareStatement("select rating,Counter from drdetails  where dID=?");
                ps.setInt(1, driver_ID);
                ResultSet rs = ps.executeQuery();



                if (rs.next()) {
                    drating = rs.getFloat(1);
                    n1 = rs.getInt(2);
                    n2 = n1 + 1;
                    drating = (drating * n1 + value) / n2;


                }
                String str = ( "update drdetails set rating =? where dID=?");
                ps = conn.prepareStatement(str);
                ps.setFloat(1, drating);
                ps.setInt(2, driver_ID);

                ps.execute();

                String string = ( "update drdetails set Counter =? where dID=?");
                ps = conn.prepareStatement(string);
                ps.setInt(1, n2);
                ps.setInt(2, driver_ID);
                ps.execute();


            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed
    /**/
    /**
     * @paramargs the command line arguments
     */
    //public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AfterTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfterTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfterTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfterTrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    */
    /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    //   public void run() {
    //     new AfterTrip().setVisible(true);
    //}
    //});
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dest;
    private javax.swing.JLabel cNo;
    private javax.swing.JLabel dname;
    private javax.swing.JLabel duration;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel pickup;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JLabel tamt;
    private javax.swing.JPanel uBalance;
    private javax.swing.JLabel ubalance;
    // End of variables declaration//GEN-END:variables
}