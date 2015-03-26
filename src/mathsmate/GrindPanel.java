/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsmate;

import java.awt.Desktop;
import java.net.URL;

/**
 *
 * @author Aaron
 */
public class GrindPanel extends javax.swing.JPanel {
    
    String url;
    
    /**
     * Creates new form InstitutionGrindPanel
     */
    public GrindPanel() {
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

        iGrinds1 = new javax.swing.JPanel();
        institutionLbl1 = new javax.swing.JLabel();
        iAddressLbl1 = new javax.swing.JLabel();
        placesLbl1 = new javax.swing.JLabel();
        iPriceLbl1 = new javax.swing.JLabel();
        iWebsiteLbl1 = new javax.swing.JLabel();
        iPhoneLbl1 = new javax.swing.JLabel();

        iGrinds1.setBackground(new java.awt.Color(142, 68, 173));
        iGrinds1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iGrinds1.setMaximumSize(new java.awt.Dimension(340, 100));
        iGrinds1.setMinimumSize(new java.awt.Dimension(340, 100));
        iGrinds1.setPreferredSize(new java.awt.Dimension(400, 100));
        iGrinds1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iGrinds1MouseClicked(evt);
            }
        });

        institutionLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        institutionLbl1.setForeground(new java.awt.Color(255, 255, 255));
        institutionLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        institutionLbl1.setText("Irish Grinds Ltd.");

        iAddressLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iAddressLbl1.setForeground(new java.awt.Color(255, 255, 255));
        iAddressLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iAddressLbl1.setText("Finglas, Dublin 11");

        placesLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        placesLbl1.setForeground(new java.awt.Color(255, 255, 255));
        placesLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        placesLbl1.setText("Places: 25");

        iPriceLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iPriceLbl1.setForeground(new java.awt.Color(255, 255, 255));
        iPriceLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iPriceLbl1.setText("Free");

        iWebsiteLbl1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        iWebsiteLbl1.setForeground(new java.awt.Color(255, 255, 255));
        iWebsiteLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        iWebsiteLbl1.setText("www.irishgrinds.ie");

        iPhoneLbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iPhoneLbl1.setForeground(new java.awt.Color(255, 255, 255));
        iPhoneLbl1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iPhoneLbl1.setText("086-1234567");

        javax.swing.GroupLayout iGrinds1Layout = new javax.swing.GroupLayout(iGrinds1);
        iGrinds1.setLayout(iGrinds1Layout);
        iGrinds1Layout.setHorizontalGroup(
            iGrinds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iGrinds1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iGrinds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(iGrinds1Layout.createSequentialGroup()
                        .addComponent(institutionLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iPriceLbl1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iGrinds1Layout.createSequentialGroup()
                        .addComponent(iAddressLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placesLbl1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iGrinds1Layout.createSequentialGroup()
                        .addComponent(iPhoneLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(iWebsiteLbl1)))
                .addGap(57, 57, 57))
        );
        iGrinds1Layout.setVerticalGroup(
            iGrinds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iGrinds1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(iGrinds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(institutionLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iPriceLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(iGrinds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iAddressLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placesLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(iGrinds1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iWebsiteLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iPhoneLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iGrinds1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iGrinds1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void iGrinds1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iGrinds1MouseClicked
        try {
            Desktop.getDesktop().browse(new URL("http://www." + url).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_iGrinds1MouseClicked
    
    @Override
    public void setName(String name){
        institutionLbl1.setText(name);
    }
    
    public void setPhone(int phone){
        iPhoneLbl1.setText("Ph: " + Integer.toString(phone));
    }
    
    public void setPlaces(int places){
        if(places != 0){
            placesLbl1.setText("Places: " + Integer.toString(places));
        } else {
            placesLbl1.setVisible(false);
        }
    }
    
    public void setAddress(String address){
        iAddressLbl1.setText(address); 
    }
    
    public void setURL(String url){
        iWebsiteLbl1.setText(url);
        this.url = url;
    }
    
    public void setPrice(int price){
        iPriceLbl1.setText("Price: €" + Integer.toString(price));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iAddressLbl1;
    private javax.swing.JPanel iGrinds1;
    private javax.swing.JLabel iPhoneLbl1;
    private javax.swing.JLabel iPriceLbl1;
    private javax.swing.JLabel iWebsiteLbl1;
    private javax.swing.JLabel institutionLbl1;
    private javax.swing.JLabel placesLbl1;
    // End of variables declaration//GEN-END:variables
}