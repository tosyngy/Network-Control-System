package Admin;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VoterDetails extends javax.swing.JFrame {

    FormatDate fDate = new FormatDate();
    Date d;
    DefaultTableModel dataSet;
    int j;
    DbConnect dbcon;
    Variables var;
    String query;    
    static int a = -1;
    static String dat = "";

    /**
     * Creates new form LogHistory
     */
    public VoterDetails() {
        initComponents();
        dbcon = new DbConnect();
        var = new Variables();
        jButton6ActionPerformed(null);
        jButton5ActionPerformed(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton4.setText("eXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(700, 430, 100, 27);

        jButton5.setText("fetch");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 430, 70, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Network Analysis Table");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1050, 30, 180, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Cofirmed", "NY confirmed", "Conneted" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(20, 390, 120, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel10.setText("Network and User Analysis");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(490, 10, 250, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("User Analysis Table");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 30, 180, 30);

        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable( int rowIndex, int colIndex){
                return false;
            }
        };
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(750, 60, 470, 310);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "User Field"));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 370, 340, 100);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Available", "Not available" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(880, 390, 120, 30);

        jButton6.setText("fetch");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(880, 430, 70, 30);

        jTable3 = new javax.swing.JTable(){
            public boolean isCellEditable( int rowIndex, int colIndex){
                return false;
            }
        };
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable3);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(12, 60, 720, 310);

        jButton7.setText("Add Network");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(1080, 430, 130, 30);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Network Field"));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(870, 370, 350, 100);

        jButton8.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        jButton8.setText("refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(700, 390, 100, 27);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int chk = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to quit?");
        if (chk == 0) {
            System.exit(0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if (jComboBox1.getSelectedIndex() == 1) {
            query = "SELECT ip,sysid,sys_other,username,password,name,last_connect_period,status FROM access where status=1";
        } else if (jComboBox1.getSelectedIndex() == 2) {
            query = "SELECT ip,sysid,sys_other,username,password,name,last_connect_period,status FROM access where status=0";
        } else if (jComboBox1.getSelectedIndex() == 3) {
            query = "SELECT ip,sysid,sys_other,username,password,name,last_connect_period,status FROM access where status=2";
        } else {
            query = "SELECT ip,sysid,sys_other,username,password,name,last_connect_period,status FROM access";
        }
        fetch(query);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        var.setSysId(jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString());
        if(jTable2.getValueAt(jTable2.getSelectedRow(), 6).toString().equalsIgnoreCase("available"))
        a=0;
        else
            a=1;
        new navigator1(new javax.swing.JFrame(), true).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jComboBox2.getSelectedIndex() == 1) {
            query = "SELECT owner,sys_id,name,`limit`,password,status FROM network where status=0";
        } else if (jComboBox2.getSelectedIndex() == 2) {
            query = "SELECT owner,sys_id,name,`limit`,password,status FROM network where status=1";
        } else {
            query = "SELECT owner,sys_id,name,`limit`,password,status FROM network";
        }
        fetch2(query);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        var.setVoterID(jTable3.getValueAt(jTable3.getSelectedRow(), 4).toString());
       a=Integer.parseInt(jTable3.getValueAt(jTable3.getSelectedRow(), 7).toString());
        new navigator(new javax.swing.JFrame(), true).setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
new UserReg11().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton5ActionPerformed(null);
        jButton6ActionPerformed(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(VoterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoterDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
    void fetch(String query) {
        System.out.println("query " + query);
        j = 0;
        dataSet = new DefaultTableModel();        
        dataSet.addColumn("S/N");
        dataSet.addColumn("IP addr");
        dataSet.addColumn("Syst ID");
        dataSet.addColumn("Alt ID");
        dataSet.addColumn("Username");
        dataSet.addColumn("Password");
        dataSet.addColumn("Name");
        dataSet.addColumn("Last Connect Period");
        dataSet.addColumn("Status");
        try {
            dbcon.rs = dbcon.st.executeQuery(query);
            while (dbcon.rs.next()) {                
                Object[] data = new Object[]{++j, dbcon.rs.getString(1), dbcon.rs.getString(2),
                    dbcon.rs.getString(3), dbcon.rs.getString(4), dbcon.rs.getString(5),
                    dbcon.rs.getString(6), dbcon.rs.getString(7),dbcon.rs.getString(8)};
                dataSet.addRow(data);
            }
            jTable3.setModel(dataSet);            
            jTable3.repaint();
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "An Error occur while fecthing information!!!");
        }
        
    }

    void fetch2(String query) {
        System.out.println("query " + query);
        j = 0;
        dataSet = new DefaultTableModel();        
        dataSet.addColumn("S/N");
        dataSet.addColumn("Owner");
        dataSet.addColumn("Syst ID");
        dataSet.addColumn("Net Name");
        dataSet.addColumn("Limit");
        dataSet.addColumn("Passwors");
        dataSet.addColumn("Status");
        try {
            dbcon.rs = dbcon.st.executeQuery(query);
            while (dbcon.rs.next()) {                
                String status = "";
                if (dbcon.rs.getInt(6) == 0) {
                    status = "available";
                } else {
                    status = "not available";
                }
                Object[] data = new Object[]{++j, dbcon.rs.getString(1), dbcon.rs.getString(2),
                    dbcon.rs.getString(3), dbcon.rs.getString(4), dbcon.rs.getString(5), status};
                dataSet.addRow(data);
            }
            jTable2.setModel(dataSet);            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "An Error occur while fecthing information!!!");
        }
        
    }    
}
