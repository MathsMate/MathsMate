package mathsmate;

import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 *
 * Note: User has to click "Reset" on CourseFinder panel to update any changes
 * from the file "courseSave.data"
 */
public class CourseFinderAdmin extends javax.swing.JPanel {

    //Declare variables
    private int index; //Keeps track of ArrayList index
    private ArrayList<Course> courseList; //Normal ArrayList
    private ArrayList<Course> defaultList; //Default ArrayList
    private boolean awaitingRecord; //Checks if program is awaiting new record

    //DEFAULTS
    Course c1 = new Course("National College of Ireland", "Dublin", "ncirl.ie", 2500, 385, 8, 4);
    Course c2 = new Course("Waterford IT", "Waterford", "wit.ie", 2000, 405, 8, 4);
    Course c5 = new Course("Sligo IT", "Sligo", "itsligo.ie", 2000, 385, 6, 2);
    Course c6 = new Course("Royal College of Surgeons", "Dublin", "rcsi.ie", 3000, 600, 8, 2);
    Course c7 = new Course("Galway-Mayo IT", "Galway", "gmit.ie", 3000, 405, 7, 2);
    Course c8 = new Course("Waterford IT", "Waterford", "wit.ie", 2500, 555, 8, 1);
    Course c3 = new Course("University College Cork", "Cork", "ucc.ie", 2500, 405, 8, 4);
    Course c9 = new Course("Galway-Mayo IT", "Mayo", "gmit.ie", 2500, 385, 8, 4);
    Course c10 = new Course("Athlone IT", "Athlone", "ait.ie", 2000, 555, 7, 2);
    Course c4 = new Course("National College of Ireland", "Dublin", "ncirl.ie", 1500, 385, 6, 2);

    public CourseFinderAdmin() {
        initComponents();

        //Initialising variables and objects
        defaultList = new ArrayList<>();
        awaitingRecord = false;

        //Add defaults
        defaultList.add(c1);
        defaultList.add(c2);
        defaultList.add(c3);
        defaultList.add(c4);
        defaultList.add(c5);
        defaultList.add(c6);
        defaultList.add(c7);
        defaultList.add(c8);
        defaultList.add(c9);
        defaultList.add(c10);

        index = 0;
        indexLbl.setText("File Index: " + index);

        //Reading data from courseSave.data
        try {
            FileInputStream fIn = new FileInputStream("courseSave.data");
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            courseList = (ArrayList<Course>) oIn.readObject();
            titleField.setText(courseList.get(index).getName());
            addressField.setText(courseList.get(index).getAddress());
            urlField.setText(courseList.get(index).getUrl());
            priceField.setText(Integer.toString(courseList.get(index).getPrice()));
            pointsField.setText(Integer.toString(courseList.get(index).getPoints()));
            levelField.setText(Integer.toString(courseList.get(index).getLevel()));
            yearsField.setText(Integer.toString(courseList.get(index).getYears()));
            fIn.close();
            oIn.close(); //Closing streams
        } catch (FileNotFoundException e) {
            //Catch errors
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">File Not Found</span></html>");
            System.out.println("Error Loading Object: " + e);
        } catch (IOException | ClassNotFoundException f) {
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">Fatal Error</span></html>");
            System.out.println("Error Loading Object: " + f);
        }

        //If next index is outside of arrayList bounds, set name to "Add" for new record.
        if (index + 1 >= courseList.size()) {
            nextBtn.setText("Add");
        }

        //If there is only one record, prevent deletion.
        if (courseList.size() == 1) {
            deleteBtn.setEnabled(false);
        } else {
            deleteBtn.setEnabled(true);
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

        subjectGroup1 = new javax.swing.ButtonGroup();
        subjectGroup2 = new javax.swing.ButtonGroup();
        subjectGroup3 = new javax.swing.ButtonGroup();
        subjectGroup4 = new javax.swing.ButtonGroup();
        subjectGroup5 = new javax.swing.ButtonGroup();
        subjectGroup6 = new javax.swing.ButtonGroup();
        mainMenuPanel = new javax.swing.JPanel();
        copyrightLbl = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        indexLbl = new javax.swing.JLabel();
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
        pointsField = new javax.swing.JTextField();
        titleField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        levelField = new javax.swing.JTextField();
        yearsField = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();
        urlField = new javax.swing.JTextField();
        urlLabel = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        defaultBtn = new javax.swing.JButton();

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

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(saveBtn);
        saveBtn.setBounds(240, 450, 80, 23);

        indexLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        indexLbl.setForeground(new java.awt.Color(255, 255, 255));
        indexLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        indexLbl.setText("File Index: 25");
        mainMenuPanel.add(indexLbl);
        indexLbl.setBounds(110, 70, 180, 30);

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
        titleLbl.setBounds(20, 110, 40, 22);

        addressLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(255, 255, 255));
        addressLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addressLbl.setText("Address:");
        mainMenuPanel.add(addressLbl);
        addressLbl.setBounds(20, 150, 70, 22);

        priceLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLbl.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLbl.setText("Price:");
        mainMenuPanel.add(priceLbl);
        priceLbl.setBounds(20, 190, 70, 22);

        levelLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        levelLbl.setForeground(new java.awt.Color(255, 255, 255));
        levelLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        levelLbl.setText("Level:");
        mainMenuPanel.add(levelLbl);
        levelLbl.setBounds(20, 230, 50, 22);

        yearsLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearsLbl.setForeground(new java.awt.Color(255, 255, 255));
        yearsLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        yearsLbl.setText("Years:");
        mainMenuPanel.add(yearsLbl);
        yearsLbl.setBounds(20, 270, 50, 22);

        pointsLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pointsLbl.setForeground(new java.awt.Color(255, 255, 255));
        pointsLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pointsLbl.setText("Points:");
        mainMenuPanel.add(pointsLbl);
        pointsLbl.setBounds(20, 310, 60, 22);
        mainMenuPanel.add(pointsField);
        pointsField.setBounds(110, 310, 270, 20);
        mainMenuPanel.add(titleField);
        titleField.setBounds(110, 110, 270, 20);
        mainMenuPanel.add(addressField);
        addressField.setBounds(110, 150, 270, 20);
        mainMenuPanel.add(priceField);
        priceField.setBounds(110, 190, 270, 20);
        mainMenuPanel.add(levelField);
        levelField.setBounds(110, 230, 270, 20);
        mainMenuPanel.add(yearsField);
        yearsField.setBounds(110, 270, 270, 20);

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(deleteBtn);
        deleteBtn.setBounds(80, 450, 80, 23);

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(nextBtn);
        nextBtn.setBounds(240, 400, 80, 23);

        prevBtn.setText("Prev");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(prevBtn);
        prevBtn.setBounds(80, 400, 80, 23);
        mainMenuPanel.add(urlField);
        urlField.setBounds(110, 350, 270, 20);

        urlLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        urlLabel.setForeground(new java.awt.Color(255, 255, 255));
        urlLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        urlLabel.setText("URL:");
        mainMenuPanel.add(urlLabel);
        urlLabel.setBounds(20, 350, 60, 22);

        statusLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(255, 255, 255));
        statusLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLbl.setText("Status: Ready");
        statusLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mainMenuPanel.add(statusLbl);
        statusLbl.setBounds(0, 480, 400, 70);

        defaultBtn.setBackground(new java.awt.Color(255, 0, 51));
        defaultBtn.setForeground(new java.awt.Color(255, 255, 255));
        defaultBtn.setText("RESET");
        defaultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultBtnActionPerformed(evt);
            }
        });
        mainMenuPanel.add(defaultBtn);
        defaultBtn.setBounds(143, 550, 120, 23);

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

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        //Saves ArrayList to file courseSave.data
        try {
            FileOutputStream fOut = new FileOutputStream("courseSave.data");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            courseList.set(index, new Course(titleField.getText(), addressField.getText(), urlField.getText(), Integer.parseInt(priceField.getText()), Integer.parseInt(pointsField.getText()), Integer.parseInt(levelField.getText()), Integer.parseInt(yearsField.getText())));
            oOut.writeObject(courseList);
            statusLbl.setText("<html>Status: <span style=\"color:#00FF00\">File Saved!</span><br/><span style=\"font-size:75%;\">Click Reset to update list</span></html>"); //Alert user to succesful save
            fOut.close();
            oOut.close(); //Close steams
        } catch (FileNotFoundException e) {
            //Alert user to errors
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">File Not Found</span></html>");
            System.out.println("Error Saving Object: " + e);
        } catch (IOException f) {
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">IO Exception</span></html>");
            System.out.println("Error Saving Object: " + f);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        //Deletes record
        courseList.remove(index);

        //Change next button text appropriately
        if (index + 1 < courseList.size()) {
            nextBtn.setText("Next");
        } else {
            nextBtn.setText("Add");
        }

        //Disable delete button if courseList size is one or next index is outside array bounds
        if (courseList.size() == 1 || index + 1 >= courseList.size()) {
            deleteBtn.setEnabled(false);
        } else {
            deleteBtn.setEnabled(true);
        }

        //Clear fields
        indexLbl.setText("File Index: " + index);
        titleField.setText(courseList.get(index).getName());
        addressField.setText(courseList.get(index).getAddress());
        urlField.setText(courseList.get(index).getUrl());
        priceField.setText(Integer.toString(courseList.get(index).getPrice()));
        pointsField.setText(Integer.toString(courseList.get(index).getPoints()));
        levelField.setText(Integer.toString(courseList.get(index).getLevel()));
        yearsField.setText(Integer.toString(courseList.get(index).getYears()));
        statusLbl.setText("<html>Status: <span style=\"color:#FFFF00\">Record Deleted</span></html>"); //Alert user to deleted record
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        //If not awaiting record, save any changes to record the user was previously at
        if (!awaitingRecord) {
            try {
                //Attempt to add record to list
                courseList.set(index, new Course(titleField.getText(), addressField.getText(), urlField.getText(), Integer.parseInt(priceField.getText()), Integer.parseInt(pointsField.getText()), Integer.parseInt(levelField.getText()), Integer.parseInt(yearsField.getText())));
                statusLbl.setText("<html>Status: <span style=\"color:#00FF00\">Added Record</span></html>");
                awaitingRecord = false;
            } catch (NumberFormatException e) {
                //If user input String inside number field, show error
                System.out.println("Error: " + e);
                statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">Number Error</span></html>");
                return;
            }
        }
        //If awaiting record, try to add record to courseList, else setup panel for input
        if (awaitingRecord) {
            //Verify user filled every field with information
            if (titleField.getText().equals("") && addressField.getText().equals("") && urlField.getText().equals("") && priceField.getText().equals("") && pointsField.getText().equals("") && levelField.getText().equals("") && yearsField.getText().equals("")) {
                statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">Data Missing</span></html>");
            } else {
                try {
                    //Attempt to add record to list
                    courseList.add(new Course(titleField.getText(), addressField.getText(), urlField.getText(), Integer.parseInt(priceField.getText()), Integer.parseInt(pointsField.getText()), Integer.parseInt(levelField.getText()), Integer.parseInt(yearsField.getText())));
                    statusLbl.setText("<html>Status: <span style=\"color:#00FF00\">Added Record</span></html>");
                    awaitingRecord = false;
                } catch (NumberFormatException e) {
                    //If user input String inside number field, show error
                    System.out.println("Error: " + e);
                    statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">Number Error</span></html>");
                }
            }

        } else {
            try {
                //Display data from existing record
                if (index < courseList.size()) {
                    index++;
                    indexLbl.setText("File Index: " + index);
                    titleField.setText(courseList.get(index).getName());
                    addressField.setText(courseList.get(index).getAddress());
                    urlField.setText(courseList.get(index).getUrl());
                    priceField.setText(Integer.toString(courseList.get(index).getPrice()));
                    pointsField.setText(Integer.toString(courseList.get(index).getPoints()));
                    levelField.setText(Integer.toString(courseList.get(index).getLevel()));
                    yearsField.setText(Integer.toString(courseList.get(index).getYears()));
                    statusLbl.setText("Status: Ready");
                    nextBtn.setText("Next");
                    nextBtn.setEnabled(true);
                    awaitingRecord = false;
                }
                //Change next button to "Add"
                if (index + 1 >= courseList.size()) {
                    nextBtn.setText("Add");
                    nextBtn.setEnabled(true);
                }
                //Change delete button depending on list size and position
                if (courseList.size() == 1) {
                    deleteBtn.setEnabled(false);
                } else {
                    deleteBtn.setEnabled(true);
                }
            } catch (IndexOutOfBoundsException e) {
                //Clear all fields
                System.out.println(e);
                indexLbl.setText("File Index: " + index);
                titleField.setText("");
                addressField.setText("");
                urlField.setText("");
                priceField.setText("");
                pointsField.setText("");
                levelField.setText("");
                yearsField.setText("");
                //Notify user that program is awaiting record
                statusLbl.setText("<html>Status: <span style=\"Color:#FFFF00\">Awaiting New Record</span></html>");
                nextBtn.setText("Add");
                deleteBtn.setEnabled(false);
                awaitingRecord = true;
            }
        }
        //Disable delete button if courseList size is one or next index is outside array bounds
        if (courseList.size() == 1 || index + 1 >= courseList.size()) {
            deleteBtn.setEnabled(false);
        } else {
            deleteBtn.setEnabled(true);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        //Verify user filled every field with information
        if (titleField.getText().equals("") && addressField.getText().equals("") && urlField.getText().equals("") && priceField.getText().equals("") && pointsField.getText().equals("") && levelField.getText().equals("") && yearsField.getText().equals("")) {
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">Data Missing</span></html>");
        } else {
            try {
                //Attempt to add record to list
                courseList.set(index, new Course(titleField.getText(), addressField.getText(), urlField.getText(), Integer.parseInt(priceField.getText()), Integer.parseInt(pointsField.getText()), Integer.parseInt(levelField.getText()), Integer.parseInt(yearsField.getText())));
                statusLbl.setText("<html>Status: <span style=\"color:#00FF00\">Added Record</span></html>");
                awaitingRecord = false;
            } catch (NumberFormatException e) {
                //If user input String inside number field, show error
                System.out.println("Error: " + e);
                statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">Number Error</span></html>");
                return;
            }
        }
        //Go to previous index if the result is more than or equal to 0
        if (index - 1 >= 0) {
            index--;
        }
        //Update fields from existing record
        indexLbl.setText("File Index: " + index);
        titleField.setText(courseList.get(index).getName());
        addressField.setText(courseList.get(index).getAddress());
        urlField.setText(courseList.get(index).getUrl());
        priceField.setText(Integer.toString(courseList.get(index).getPrice()));
        pointsField.setText(Integer.toString(courseList.get(index).getPoints()));
        levelField.setText(Integer.toString(courseList.get(index).getLevel()));
        yearsField.setText(Integer.toString(courseList.get(index).getYears()));
        statusLbl.setText("Status: Ready");
        nextBtn.setText("");

        //Change next button text accordingly
        if (index + 1 < courseList.size()) {
            nextBtn.setText("Next");
        } else {
            nextBtn.setText("Add");
        }
        //Disable delete button if courseList size is one or next index is outside array bounds
        if (courseList.size() == 1 || index + 1 >= courseList.size()) {
            deleteBtn.setEnabled(false);
        } else {
            deleteBtn.setEnabled(true);
        }
        //Set awaiting record to false
        awaitingRecord = false;
    }//GEN-LAST:event_prevBtnActionPerformed

    private void defaultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultBtnActionPerformed
        //Reset entire list and file to default settings
        try {
            FileOutputStream fOut = new FileOutputStream("courseSave.data");
            FileInputStream fIn = new FileInputStream("courseSave.data");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            //Overwrite file with defaultList
            oOut.writeObject(defaultList);
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            //Update courseList from file
            courseList = (ArrayList<Course>) oIn.readObject();
            //Reset admin panel
            index = 0;
            indexLbl.setText("File Index: " + index);
            titleField.setText(courseList.get(index).getName());
            addressField.setText(courseList.get(index).getAddress());
            urlField.setText(courseList.get(index).getUrl());
            priceField.setText(Integer.toString(courseList.get(index).getPrice()));
            pointsField.setText(Integer.toString(courseList.get(index).getPoints()));
            levelField.setText(Integer.toString(courseList.get(index).getLevel()));
            yearsField.setText(Integer.toString(courseList.get(index).getYears()));
            awaitingRecord = false;
            deleteBtn.setEnabled(true);
            nextBtn.setText("Next");
            //Notifty user of reset
            statusLbl.setText("<html>Status: <span style=\"color:#ff0000\">FILE RESET</span></html>");
            fOut.close();
            fIn.close();
            oIn.close();
            oOut.close(); //Close all streams
        } catch (FileNotFoundException e) {
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">File Not Found</span></html>");
            System.out.println("Error Saving Object: " + e);
        } catch (IOException f) {
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">IO Exception</span></html>");
            System.out.println("Error Saving Object: " + f);
        } catch (ClassNotFoundException g) {
            statusLbl.setText("<html>Status: <span style=\"color:#FF0000\">ClassNotFound Exception</span></html>");
            System.out.println("Error Loading Object: " + g);
        }
    }//GEN-LAST:event_defaultBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel copyrightLbl;
    private javax.swing.JButton defaultBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel indexLbl;
    private javax.swing.JTextField levelField;
    private javax.swing.JLabel levelLbl;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JLabel nameBg;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField pointsField;
    private javax.swing.JLabel pointsLbl;
    private javax.swing.JButton prevBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel screenTitleLbl;
    private javax.swing.JLabel statusLbl;
    private javax.swing.ButtonGroup subjectGroup1;
    private javax.swing.ButtonGroup subjectGroup2;
    private javax.swing.ButtonGroup subjectGroup3;
    private javax.swing.ButtonGroup subjectGroup4;
    private javax.swing.ButtonGroup subjectGroup5;
    private javax.swing.ButtonGroup subjectGroup6;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField urlField;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField yearsField;
    private javax.swing.JLabel yearsLbl;
    // End of variables declaration//GEN-END:variables
}
