/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import com.github.lgooddatepicker.components.DatePicker;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author andrewc4
 */
public class PurchaseTicketView extends javax.swing.JFrame {

    /**
     * Creates new form purchaseTicketView
     */
    public PurchaseTicketView() {
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

        purchaseTicketBtn = new javax.swing.JButton();
        priceTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qtyTxt = new javax.swing.JSpinner();
        dateTxt = new com.github.lgooddatepicker.components.DatePicker();
        cancelBtn = new javax.swing.JButton();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purchaseTicketBtn.setText("Purchase Ticket");
        purchaseTicketBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseTicketBtnActionPerformed(evt);
            }
        });
        getContentPane().add(purchaseTicketBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        priceTxt.setText("59.99");
        priceTxt.setEnabled(false);
        priceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtActionPerformed(evt);
            }
        });
        getContentPane().add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 170, -1));

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 170, -1));

        jLabel1.setText("Email:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 140, -1, -1));

        jLabel2.setText("Quantity:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel3.setText("Date (MM/DD/YY):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        priceLbl.setText("Price per ticket:");
        getContentPane().add(priceLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel4.setText("Purchase Ticket Form");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        qtyTxt.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        getContentPane().add(qtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 90, -1));
        getContentPane().add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 170, -1));

        cancelBtn.setForeground(new java.awt.Color(255, 0, 0));
        cancelBtn.setText("Cancel");
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        setSize(new java.awt.Dimension(620, 528));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void priceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxtActionPerformed

    private void purchaseTicketBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseTicketBtnActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_purchaseTicketBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseTicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseTicketView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private com.github.lgooddatepicker.components.DatePicker dateTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton purchaseTicketBtn;
    private javax.swing.JSpinner qtyTxt;
    // End of variables declaration//GEN-END:variables

    public DatePicker getDateTxt() {
        return dateTxt;
    }

    public void setDateTxt(DatePicker dateTxt) {
        this.dateTxt = dateTxt;
    }

    public JTextField getEmailTxt() {
        return emailTxt;
    }

    public void setEmailTxt(JTextField emailTxt) {
        this.emailTxt = emailTxt;
    }

    public JButton getPurchaseTicketBtn() {
        return purchaseTicketBtn;
    }

    public void setPurchaseTicketBtn(JButton purchaseTicketBtn) {
        this.purchaseTicketBtn = purchaseTicketBtn;
    }

    public JSpinner getQtyTxt() {
        return qtyTxt;
    }

    public void setQtyTxt(JSpinner qtyTxt) {
        this.qtyTxt = qtyTxt;
    }

    public JTextField getPriceTxt() {
        return priceTxt;
    }

    public void setPriceTxt(JTextField priceTxt) {
        this.priceTxt = priceTxt;
    }

    public JButton getCancelBtn() {
        return cancelBtn;
    }

    public void setCancelBtn(JButton cancelBtn) {
        this.cancelBtn = cancelBtn;
    }


}
