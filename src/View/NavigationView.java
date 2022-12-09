/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author andrewc4
 */
public class NavigationView extends javax.swing.JFrame {

    /**
     * Creates new form NavigationView
     */
    public NavigationView() {
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

        jToolBar1 = new javax.swing.JToolBar();
        purchaseButton = new javax.swing.JButton();
        schAttBtn = new javax.swing.JButton();
        reserveBtn = new javax.swing.JButton();
        viewProfileBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jToolBar1.setEnabled(false);
        jToolBar1.setFocusable(false);

        purchaseButton.setText("Purchase Tickets");
        purchaseButton.setFocusable(false);
        purchaseButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        purchaseButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(purchaseButton);

        schAttBtn.setText("Schedule Attractions");
        schAttBtn.setEnabled(false);
        schAttBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schAttBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(schAttBtn);

        reserveBtn.setText("Reservations");
        reserveBtn.setEnabled(false);
        reserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(reserveBtn);

        viewProfileBtn.setText("View Profile");
        viewProfileBtn.setEnabled(false);
        viewProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(viewProfileBtn);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/2020-Park-Map-image-block2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        mainPanel.add(jLabel1);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1070, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void schAttBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schAttBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schAttBtnActionPerformed

    private void viewProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewProfileBtnActionPerformed

    private void reserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserveBtnActionPerformed

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
            java.util.logging.Logger.getLogger(NavigationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavigationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavigationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavigationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavigationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton reserveBtn;
    private javax.swing.JButton schAttBtn;
    private javax.swing.JButton viewProfileBtn;
    // End of variables declaration//GEN-END:variables

    public JButton getPurchaseButton() {
        return purchaseButton;
    }

    public void setPurchaseButton(JButton purchaseButton) {
        this.purchaseButton = purchaseButton;
    }

    public JButton getSchAttBtn() {
        return schAttBtn;
    }

    public void setSchAttBtn(JButton schAttBtn) {
        this.schAttBtn = schAttBtn;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }



    public JButton getViewProfileBtn() {
        return viewProfileBtn;
    }

    public void setViewProfileBtn(JButton viewProfileBtn) {
        this.viewProfileBtn = viewProfileBtn;
    }

    public JButton getReserveBtn() {
        return reserveBtn;
    }

    public void setReserveBtn(JButton reserveBtn) {
        this.reserveBtn = reserveBtn;
    }
    
}
