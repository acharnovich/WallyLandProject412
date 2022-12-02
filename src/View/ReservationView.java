/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.Attraction;
import Model.SitDownFoodVendor;
import com.github.lgooddatepicker.components.DatePicker;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andrewc4
 */
public class ReservationView extends javax.swing.JPanel {

    /**
     * Creates new form ReservationView
     */
    public ReservationView(ArrayList<SitDownFoodVendor> restList) {
        initComponents();
        populateTable(restList);
    }

    public void populateTable(ArrayList<SitDownFoodVendor> restList) {
        DefaultTableModel model = (DefaultTableModel) restTbl.getModel();
        Object rowData[] = new Object[4];
        for (int i = 0; i < restList.size(); i++) {

            rowData[0] = restList.get(i).getName();
            rowData[1] = restList.get(i).getLocation();
            rowData[2] = restList.get(i).getHours();
            rowData[3] = restList.get(i).getPrice();
            model.addRow(rowData);
        }

    }

    public void populateComboBox(SitDownFoodVendor selectedRest) {
        System.out.println(selectedRest.getReservationTimes());
        timeBox.setModel(new DefaultComboBoxModel<>(selectedRest.getReservationTimes().toArray(new String[selectedRest.getReservationTimes().size()])));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reserveDateTxt = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane3 = new javax.swing.JScrollPane();
        restTbl = new javax.swing.JTable();
        timeBox = new javax.swing.JComboBox<>();
        menuBtn = new javax.swing.JButton();
        reserveBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(reserveDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 170, -1));

        restTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "Hours ", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        restTbl.getTableHeader().setReorderingAllowed(false);
        restTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restTblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(restTbl);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 47, 1000, 450));

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        timeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeBoxActionPerformed(evt);
            }
        });
        add(timeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        menuBtn.setText("View Menu");
        add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        reserveBtn.setText("Schedule Reservation ");
        add(reserveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void timeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeBoxActionPerformed

    private void restTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_restTblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton menuBtn;
    private javax.swing.JButton reserveBtn;
    private com.github.lgooddatepicker.components.DatePicker reserveDateTxt;
    private javax.swing.JTable restTbl;
    private javax.swing.JComboBox<String> timeBox;
    // End of variables declaration//GEN-END:variables

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JButton getMenuBtn() {
        return menuBtn;
    }

    public void setMenuBtn(JButton menuBtn) {
        this.menuBtn = menuBtn;
    }

    public JButton getReserveBtn() {
        return reserveBtn;
    }

    public void setReserveBtn(JButton reserveBtn) {
        this.reserveBtn = reserveBtn;
    }

    public DatePicker getReserveDateTxt() {
        return reserveDateTxt;
    }

    public void setReserveDateTxt(DatePicker reserveDateTxt) {
        this.reserveDateTxt = reserveDateTxt;
    }

    public JTable getRestTbl() {
        return restTbl;
    }

    public void setRestTbl(JTable restTbl) {
        this.restTbl = restTbl;
    }

    public JComboBox<String> getTimeBox() {
        return timeBox;
    }

    public void setTimeBox(JComboBox<String> timeBox) {
        this.timeBox = timeBox;
    }

}
