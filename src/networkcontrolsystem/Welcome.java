/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkcontrolsystem;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tosyngy
 */
public class Welcome extends javax.swing.JFrame {
   Variables var;
     DbConnect db;
    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
         db= new DbConnect();
          var= new Variables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("This app is met for Network Access Control within \nNigeria it was designed by [GroupName] under\nthe supervision of Mrs Popoola in Moshood\nAbiola Polytechnic, Abeokuta. \n\n\t\t\t--2013/2014--");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(10, 240, 440, 120);

        jButton3.setText("Connect to Network");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(20, 50, 190, 41);

        jButton4.setText("Book for Network Access");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(220, 50, 210, 41);

        jButton5.setText("Remove Your Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(20, 160, 190, 41);

        jButton8.setText("#Exit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(300, 170, 80, 30);

        jButton7.setText("Test Network Availability");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(220, 100, 210, 40);

        jButton6.setText("Disconnect From Network");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(20, 100, 190, 41);

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Navigation Page"));
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 10, 430, 210);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("registration");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Connect");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setText("Book for Net");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Disconnect");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem5.setText("Test Network");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Admin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(checkForAbsent()==false){
        new Login().setVisible(true);
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     new UserReg().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to continue?");
        if (a == JOptionPane.YES_OPTION) {
        delete();
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to close app");
        if (a == JOptionPane.YES_OPTION) {
           System.exit(0);
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        test();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to close app");
        if (a == JOptionPane.YES_OPTION) {
           System.exit(0);
        } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new UserReg().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
int chk=JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to disconnect?");
if(chk!=0){
    return;
}
        checkForPresence();      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     setVisible(false);
        new Admin.Login().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
 boolean checkForPresence() {
   if(var.getUsername()==""){
          JOptionPane.showMessageDialog(rootPane, "You need to Login before continue?");  
        return false;
        }
        boolean present = false;
        try {
            db.rs = db.st.executeQuery("select status from access where username='"+var.getUsername()+"'");
           if (db.rs.next()){ 
           if(db.rs.getInt(1)==0 || db.rs.getInt(1)==1 || var.getUsername().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "You've not connect before now");
            }else{
               db.ps = db.con.prepareStatement("update log set status=1 where action like '%" + var.getUsername() + " connect%'");
                db.ps.executeUpdate();
               db.ps= db.con.prepareStatement("update access set status=1 where username='"+var.getUsername()+"'");
               db.ps.executeUpdate();
             log(var.getUsername()+" Disconnected from network");
                JOptionPane.showMessageDialog(rootPane, "You've been discounted");
           }
           }else{
            JOptionPane.showMessageDialog(rootPane, "You've not connect be now");
           }
        } catch (Exception g) {
            g.printStackTrace();
            System.out.println("" + g);
        }
//
        return present;
//
//    }

    }
 boolean delete() {
  
        boolean present = false;
        if(var.getUsername().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "You need to Login first\nbefore you can perform this action");
       return true;
        }
        try {
            db.ps = db.con.prepareStatement("update log set status=1 where action like '%" + var.getUsername() + " connect%'");
                db.ps.executeUpdate();
              db.ps= db.con.prepareStatement("delete from access where username='"+var.getUsername()+"'");
               db.ps.executeUpdate();
                log(var.getUsername()+" Leave the Network");
                JOptionPane.showMessageDialog(rootPane, "you've been removed successfully");
         } catch (Exception g) {
             g.printStackTrace();
            System.out.println("" + g);
        }
        return present;

    }
  boolean checkForAbsent() {
        boolean present = false;
        if(var.getUsername().equals("")){
          JOptionPane.showMessageDialog(rootPane, "You need to Login before continue?");  
        return false;
        }
        try {
            db.rs = db.st.executeQuery("select status from access where username='"+var.getUsername()+"'");
            db.rs.next(); 
           if(db.rs.getInt(1)==2){
            JOptionPane.showMessageDialog(rootPane, "You've connect already");
            present=true;
            }
           
        } catch (Exception g) {
            g.printStackTrace();
            System.out.println("" + g);
        }
        return present;

    }
 
   boolean test() {
        boolean present = false;
         if(var.getUsername().equals("")){
        JOptionPane.showMessageDialog(rootPane, "You need to Login first\nbefore you can perform this action");
       return false;
         }
        try {
            db.rs = db.st.executeQuery("select status from access where username='"+var.getUsername()+"'");
            db.rs.next(); 
           if(db.rs.getInt(1)==2){
            JOptionPane.showMessageDialog(rootPane, "connected");
            }else{
              JOptionPane.showMessageDialog(rootPane, "disconnected");
           }
            log(var.getUsername()+" Test for network availability");
        } catch (Exception g) {
            g.printStackTrace();
            System.out.println("" + g);
        }
        return present;

    }
 
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
