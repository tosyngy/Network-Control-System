/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class navigator1 extends javax.swing.JDialog {
       
  /**
   * Creates new form navigator
   */
Variables var;
  DbConnect db;
  public navigator1(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    VoterDetails vol= new VoterDetails();
   var= new Variables();
   db= new DbConnect();
    jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED),var.getSysId()+ " Menu"));
    if(vol.a==1){
    jButton2.setEnabled(false);
    }else{
    jButton5.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setText("               Network");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 220, 24);

        jButton1.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton1.setText("Remove Network");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 190, 170, 33);

        jButton3.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 270, 90, 20);

        jButton4.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton4.setText("View Info");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 70, 170, 33);

        jButton2.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton2.setText("Denied Access");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 150, 170, 33);

        jButton5.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jButton5.setText("Grant Access");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 110, 170, 33);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Menu"));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(12, 40, 190, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new UserReg1().setVisible(true);    
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
            db.ps= db.con.prepareStatement("delete from network  where name='"+var.getSysId()+"'");
               db.ps.executeUpdate();
             log(var.getSysId()+" Network Removed by "+var.getUsername());
                JOptionPane.showMessageDialog(rootPane, "Access Denied");
        } catch (Exception e) {
        }
        setVisible(false);
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try {
            db.ps= db.con.prepareStatement("update network set status=1 where name='"+var.getSysId()+"'");
               db.ps.executeUpdate();
             log(var.getSysId()+" Denied Access by "+var.getUsername());
                JOptionPane.showMessageDialog(rootPane, "Access Denied");
        } catch (Exception e) {
        }
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   try {
            db.ps= db.con.prepareStatement("update network set status=0 where name='"+var.getSysId()+"'");
               db.ps.executeUpdate();
             log(var.getSysId()+" Granted Access by "+var.getUsername());
                JOptionPane.showMessageDialog(rootPane, "Access Granted");
        } catch (Exception e) {
        }
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
      java.util.logging.Logger.getLogger(navigator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(navigator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(navigator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(navigator1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        navigator1 dialog = new navigator1(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
     void log(String event) {
        try {
            GetIP ip=new GetIP();
            SecureCom sc= new SecureCom();
            String mobo=sc.getMotherboardSN();
            if(sc.getMotherboardSN()!=""){
            var.setSysId(sc.getMotherboardSN());
            }
             else{
            var.setSysId(sc.getHDDSelNum("C"));
            }
            db.ps = db.con.prepareStatement("INSERT INTO `log` (`sysid`,`ip` ,`status`,action)VALUES (?,?,?,?) ");
            db.ps.setString(1, var.getSysId());
            db.ps.setString(2, ip.getRealIp());
            db.ps.setString(3, "0");
            db.ps.setString(4, event);
            db.ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
