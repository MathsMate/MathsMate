/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

/**
 *
 * @author Elmo
 */
public class NotesTrig extends javax.swing.JPanel {

    /**
     * Creates new form AlgebraMenu
     */
    int count;
    ArrayList<ImageNotes> n = new ArrayList<>();
    ImageNotes n1 = new ImageNotes("The Sine of angle adjacent/hypotenuse  is: the \nlength of the side Opposite angle H^A divided \nby the length of the Hypotenuse","question1 trig.gif");//Page 1
    ImageNotes n2 = new ImageNotes("Inverse Sine sin-1 takes the ratio \n  opposite/hypotenuse and gives us the angle.\n Example: Sine Function: sin(30°) = 0.5 Inverse Sine: \nsin-1(0.5) 30°","question2 trig.gif");//Page 2
    ImageNotes n3 = new ImageNotes("Example: Find the size of angle x°\n tan x° = Opposite / Adjacent\n tan x° = 300/400 = 0.75\n x° = tan-1 (0.75) = 36.9° (correct to 1 decimal place)\n ","question3 trig.gif");//Page 3
    ImageNotes n4 = new ImageNotes("The Tangent of angle ? is: tan(?) = Opposite / Adjacent\n So Inverse Tangent is :tan-1 (Opposite / Adjacent) = ?\n ","question4 trig.gif");
    ImageNotes n5 = new ImageNotes("Example: Find the size of angle a°\n cos a° = Adjacent / Hypotenuse\n cos a° = 6,750/8,100 = 0.8333...\n a° = cos-1 (0.8333...) = 33.6° (to 1 decimal place)\n ","question 5 trig.gif");//Page 5
   public NotesTrig() {
        initComponents();
        count = 0;
        n.add(n1);
        n.add(n2);
        n.add(n3);
        n.add(n4);
        n.add(n5);
        notesArea.setText(n.get(count).getNote());
   }

    /**
     * Creates new form AlgebraMenu
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textField1 = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        textArea1 = new java.awt.TextArea();
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        screenTitleLbl = new javax.swing.JLabel();
        nameBg = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        notesArea = new javax.swing.JTextArea();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        textField1.setText("textField1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/Examples.fw.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jTextField1.setText("jTextField1");

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
        screenTitleLbl.setText("Trig Notes");
        mainMenuPanel.add(screenTitleLbl);
        screenTitleLbl.setBounds(110, 10, 180, 50);

        nameBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/nameIcon.png"))); // NOI18N
        nameBg.setText("hello");
        mainMenuPanel.add(nameBg);
        nameBg.setBounds(90, 10, 220, 50);

        notesArea.setEditable(false);
        notesArea.setColumns(1);
        notesArea.setRows(1);
        notesArea.setText("Far far away, behind the word \nmountains, far from the countries V\nokalia and Consonantia, there live \nthe blind texts. Separated they live\n in Bookmarksgrove right at the coast\n of the Semantics, a large language o\ncean. A small river named Duden flow\ns by their place and supplies it \nwith the necessary regelialia. I\nt is a paradisematic country, in w\nhich roasted parts of sentences fly\\\ninto y\nour mouth. Even the all-powerful \nPointing has no control about the \nblind texts it is an almost unorthog\nraphic life One day however a small \nline of blind text by the name of \nLorem Ip\nsum decided to leave for the far World\n of Grammar. \nThe Big Oxmox advised her not to \ndo so, because there were thousands \nof bad Commas, wild Question Marks\n and devious Semikoli, but the Lit\ntle Blind Text didn’t listen. She p\nacked her seven versalia, put her\n initial into the belt and \n\n\n,,,\n,,,\n\nma");
        jScrollPane3.setViewportView(notesArea);

        mainMenuPanel.add(jScrollPane3);
        jScrollPane3.setBounds(30, 90, 340, 210);

        prevBtn.setText("Previous");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(prevBtn);
        prevBtn.setBounds(30, 540, 100, 23);

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(nextBtn);
        nextBtn.setBounds(275, 540, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathsmate/question1 trig.gif"))); // NOI18N
        mainMenuPanel.add(jLabel1);
        jLabel1.setBounds(40, 320, 330, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
            CardLayout cl = (CardLayout) layout;
            cl.show(getParent(), "TRIG_MENU");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        prevNote();
    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        nextNote();
    }//GEN-LAST:event_nextBtnActionPerformed
    private void nextNote() {
        if(count + 1 >= n.size()){
            count = 0;
        } else {
            count++;
        }
        notesArea.setText(n.get(count).getNote());
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(n.get(count).getLink())));
    }
    
    private void prevNote() {
        if(count - 1 < 0){
            count = n.size() - 1;
        } else {
            count--;
        }
        notesArea.setText(n.get(count).getNote());
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(n.get(count).getLink())));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JButton prevBtn;
    private javax.swing.JLabel screenTitleLbl;
    private java.awt.TextArea textArea1;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
