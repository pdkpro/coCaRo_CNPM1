/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.ImageIcon;

/**
 *
 * @author PC
 */
public class Exit extends javax.swing.JDialog {

    /**
     * Creates new form Exit1
     */
    public Exit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnExit = new javax.swing.JPanel();
        lbNo = new javax.swing.JLabel();
        lbYes = new javax.swing.JLabel();
        bgExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setUndecorated(true);
        setResizable(false);

        pnExit.setLayout(null);

        lbNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit/x.png"))); // NOI18N
        lbNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbNoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbNoMouseReleased(evt);
            }
        });
        pnExit.add(lbNo);
        lbNo.setBounds(385, 371, 90, 90);

        lbYes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbYes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit/Accept.png"))); // NOI18N
        lbYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbYesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbYesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbYesMouseReleased(evt);
            }
        });
        pnExit.add(lbYes);
        lbYes.setBounds(519, 371, 90, 90);

        bgExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bgExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit/Background_exit.png"))); // NOI18N
        pnExit.add(bgExit);
        bgExit.setBounds(0, 0, 1000, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNoMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_lbNoMouseClicked

    private void lbNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNoMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Exit/x_press.png"));
        lbNo.setIcon(II);
    }//GEN-LAST:event_lbNoMousePressed

    private void lbNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNoMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Exit/x.png"));
        lbNo.setIcon(II);
        int x = evt.getX();
        int y = evt.getY();
        if ((x > 0) && (x < (lbNo.getWidth())) && (y > 0) && (y < (lbNo.getHeight()))){
            dispose();
        }
    }//GEN-LAST:event_lbNoMouseReleased

    private void lbYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYesMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Exit/Accept.png"));
        lbYes.setIcon(II);
        int x = evt.getX();
        int y = evt.getY();
        if ((x > 0) && (x < (lbYes.getWidth())) && (y > 0) && (y < (lbYes.getHeight()))){
            System.exit(0);
        }
    }//GEN-LAST:event_lbYesMouseReleased

    private void lbYesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYesMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Image/Exit/Accept_press.png"));
        lbYes.setIcon(II);
    }//GEN-LAST:event_lbYesMousePressed

    private void lbYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbYesMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbYesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgExit;
    private javax.swing.JLabel lbNo;
    private javax.swing.JLabel lbYes;
    private javax.swing.JPanel pnExit;
    // End of variables declaration//GEN-END:variables
}