/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author Aaron
 */
public class CourseFinderAdmin extends javax.swing.JPanel {
    
    public CourseFinderAdmin() {
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

        subjectGroup1 = new javax.swing.ButtonGroup();
        subjectGroup2 = new javax.swing.ButtonGroup();
        subjectGroup3 = new javax.swing.ButtonGroup();
        subjectGroup4 = new javax.swing.ButtonGroup();
        subjectGroup5 = new javax.swing.ButtonGroup();
        subjectGroup6 = new javax.swing.ButtonGroup();
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        priceLbl = new javax.swing.JLabel();
        levelLbl = new javax.swing.JLabel();
        yearsLbl = new javax.swing.JLabel();
        pointsLbl = new javax.swing.JLabel();

        mainMenuPanel.setBackground(new java.awt.Color(52, 152, 219));
        mainMenuPanel.setPreferredSize(new java.awt.Dimension(400, 640));
        mainMenuPanel.setLayout(null);

        copyrightLbl.setBackground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        copyrightLbl.setForeground(new java.awt.Color(255, 255, 255));
        copyrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyrightLbl.setText("Copyright © 2015 | Maths Mate");
        copyrightLbl.setAlignmentY(0.0F);
        mainMenuPanel.add(copyrightLbl);
        copyrightLbl.setBounds(30, 580, 340, 30);

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/homeIcon.png"))); // NOI18N
        homeBtn.setAlignmentY(0.0F);
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        homeBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        homeBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(homeBtn);
        homeBtn.setBounds(300, 10, 80, 50);

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/backIcon.png"))); // NOI18N
        backBtn.setAlignmentY(0.0F);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.setMaximumSize(new java.awt.Dimension(100, 100));
        backBtn.setMinimumSize(new java.awt.Dimension(100, 100));
        backBtn.setPreferredSize(new java.awt.Dimension(100, 100));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(backBtn);
        backBtn.setBounds(20, 10, 80, 50);

        screenTitleLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        screenTitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        screenTitleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenTitleLbl.setText("CF - Admin");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        titleLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titleLbl.setText("Title:");
        mainMenuPanel.add(titleLbl);
        titleLbl.setBounds(20, 80, 40, 22);

        addressLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(255, 255, 255));
        addressLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addressLbl.setText("Address:");
        mainMenuPanel.add(addressLbl);
        addressLbl.setBounds(20, 110, 70, 22);

        priceLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLbl.setText("Price:");
        mainMenuPanel.add(priceLbl);
        priceLbl.setBounds(20, 140, 70, 22);

        levelLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        levelLbl.setForeground(new java.awt.Color(255, 255, 255));
        levelLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        levelLbl.setText("Level:");
        mainMenuPanel.add(levelLbl);
        levelLbl.setBounds(20, 170, 50, 22);

        yearsLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearsLbl.setForeground(new java.awt.Color(255, 255, 255));
        yearsLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yearsLbl.setText("Years:");
        mainMenuPanel.add(yearsLbl);
        yearsLbl.setBounds(20, 200, 50, 22);

        pointsLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pointsLbl.setForeground(new java.awt.Color(255, 255, 255));
        pointsLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pointsLbl.setText("Points:");
        mainMenuPanel.add(pointsLbl);
        pointsLbl.setBounds(20, 230, 60, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "COURSE_FINDER");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel levelLbl;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JLabel pointsLbl;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.ButtonGroup subjectGroup1;
    private javax.swing.ButtonGroup subjectGroup2;
    private javax.swing.ButtonGroup subjectGroup3;
    private javax.swing.ButtonGroup subjectGroup4;
    private javax.swing.ButtonGroup subjectGroup5;
    private javax.swing.ButtonGroup subjectGroup6;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel yearsLbl;
    // End of variables declaration//GEN-END:variables
}
