package Travel_Management_System;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import javax.swing.ImageIcon;


/**
 *
 * @author FarhanPC
 */
public class Travelling_Management_Systems extends javax.swing.JFrame {

    /**
     * Creates new form Travelling_Management_Systems
     */
    private Cursor cursor;
    
    
    public Travelling_Management_Systems() {
        initComponents();
         
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfFirst = new javax.swing.JTextField();
        jtfSurname = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jtfPostCode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfTelephone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRbFc = new javax.swing.JRadioButton();
        jRbStd = new javax.swing.JRadioButton();
        jRbEco = new javax.swing.JRadioButton();
        jRbReturn = new javax.swing.JRadioButton();
        jRbChyes = new javax.swing.JRadioButton();
        jRbSingle = new javax.swing.JRadioButton();
        jRbAdyes = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jReceipt = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jbTotal = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jlblTax = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jAccommodation = new javax.swing.JComboBox<>();
        jDeparture = new javax.swing.JComboBox<>();
        jDestination = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jRbInsurance = new javax.swing.JRadioButton();
        jRbLuggage = new javax.swing.JRadioButton();
        jRbAirportTax = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 102, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setText("Travel Managenmet System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 10, 900, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Firstname");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Surname");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Post Code");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jtfEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });
        jPanel2.add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 180, -1));

        jtfFirst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFirstActionPerformed(evt);
            }
        });
        jPanel2.add(jtfFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 180, -1));

        jtfSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSurnameActionPerformed(evt);
            }
        });
        jPanel2.add(jtfSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 180, -1));

        jtfAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAddressActionPerformed(evt);
            }
        });
        jPanel2.add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, -1));

        jtfPostCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfPostCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPostCodeActionPerformed(evt);
            }
        });
        jPanel2.add(jtfPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 180, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telephone");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jtfTelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtfTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelephoneActionPerformed(evt);
            }
        });
        jPanel2.add(jtfTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 180, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 280, 260));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Child");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Flight");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ticket");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Adult");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jRbFc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbFc.setText("First Class");
        jRbFc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbFcActionPerformed(evt);
            }
        });
        jPanel3.add(jRbFc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jRbStd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbStd.setText("Standard");
        jRbStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbStdActionPerformed(evt);
            }
        });
        jPanel3.add(jRbStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jRbEco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbEco.setText("Economy");
        jRbEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbEcoActionPerformed(evt);
            }
        });
        jPanel3.add(jRbEco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jRbReturn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbReturn.setText("Return");
        jRbReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbReturnActionPerformed(evt);
            }
        });
        jPanel3.add(jRbReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jRbChyes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbChyes.setText("Yes");
        jPanel3.add(jRbChyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jRbSingle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbSingle.setText("Single");
        jPanel3.add(jRbSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jRbAdyes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbAdyes.setText("Yes");
        jPanel3.add(jRbAdyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 210));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 400));

        jReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jReceipt.setText("Receipt");
        jReceipt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReceiptActionPerformed(evt);
            }
        });
        jPanel4.add(jReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("Exit");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel4.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 420, 70, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 310, 460));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Total");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblTotal.setToolTipText("");
        jlblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jlblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 250, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Tax");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jbTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbTotal.setText("Total");
        jbTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTotal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jbTotalItemStateChanged(evt);
            }
        });
        jbTotal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jbTotalMouseDragged(evt);
            }
        });
        jbTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbTotalMouseClicked(evt);
            }
        });
        jbTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTotalActionPerformed(evt);
            }
        });
        jPanel5.add(jbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 140, 70, -1));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("Reset");
        Reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel5.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Sub Total");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jlblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblSubTotal.setToolTipText("");
        jlblSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jlblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 250, 30));

        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblTax.setToolTipText("");
        jlblTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.add(jlblTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 380, 210));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Accommodation");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Departure Point");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Destination");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jAccommodation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jAccommodation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Single", "Double", "Extra" }));
        jAccommodation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jAccommodation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccommodationActionPerformed(evt);
            }
        });
        getContentPane().add(jAccommodation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 270, -1));

        jDeparture.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDeparture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Dhaka", "Chittagong", "Cox-Bazer", "Shylet" }));
        jDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepartureActionPerformed(evt);
            }
        });
        getContentPane().add(jDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 270, -1));

        jDestination.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Cox- Bazer - 3 Days", "St. Martin's Island - 2 Days", "Nilgiri - 2 Days", "Sundarbans Tour - 1 Day", "Sundarbans Tour - 3 Days", "Sylhet (Ratargul-Bisanakand)-2 Days", "Sylhet (Jaflong-Dargah Shariff)-2 Days", "Sylhet (All) - 4 Days" }));
        jDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDestinationActionPerformed(evt);
            }
        });
        getContentPane().add(jDestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 270, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setText("Receipt");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jRbInsurance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbInsurance.setText("Travelling Insurance Paid");
        jRbInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbInsuranceActionPerformed(evt);
            }
        });
        getContentPane().add(jRbInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jRbLuggage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbLuggage.setText("Ext Luggage");
        jRbLuggage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbLuggageActionPerformed(evt);
            }
        });
        getContentPane().add(jRbLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jRbAirportTax.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRbAirportTax.setText("Airport Tax Paid");
        jRbAirportTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbAirportTaxActionPerformed(evt);
            }
        });
        getContentPane().add(jRbAirportTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jtfFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFirstActionPerformed
    }//GEN-LAST:event_jtfFirstActionPerformed

    private void jtfSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSurnameActionPerformed
    }//GEN-LAST:event_jtfSurnameActionPerformed

    private void jtfAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAddressActionPerformed
    }//GEN-LAST:event_jtfAddressActionPerformed

    private void jtfPostCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPostCodeActionPerformed
    }//GEN-LAST:event_jtfPostCodeActionPerformed

    private void jtfTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelephoneActionPerformed
    }//GEN-LAST:event_jtfTelephoneActionPerformed

    private void jDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepartureActionPerformed
    }//GEN-LAST:event_jDepartureActionPerformed

    private void jRbFcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbFcActionPerformed
    }//GEN-LAST:event_jRbFcActionPerformed

    private void jRbStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbStdActionPerformed
    }//GEN-LAST:event_jRbStdActionPerformed

    private void jRbEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbEcoActionPerformed
    }//GEN-LAST:event_jRbEcoActionPerformed

    private void jReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReceiptActionPerformed
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat ("HH:mm:ss");
        String iTime = (tTime.format(timer.getTime()));
        
        SimpleDateFormat TDate = new SimpleDateFormat ("dd:MM:yyyy");
        String iDate = (TDate.format(timer.getTime()));
        
                    int num1;
                    String ref="";
                    num1 = 1325 +(int) (Math.random()*4238);
                    ref += num1 + 1325; 
        
        String Firstname = (jtfFirst.getText());
        String Surname = (jtfSurname.getText());
        String address = (jtfAddress.getText());
        String postcode = (jtfPostCode.getText());
        String telephone = (jtfTelephone.getText());
        String rTax = (jlblTax.getText());
        String rSubtotal = (jlblSubTotal.getText());
        String rTotal = (jlblTotal.getText());
        String Email = (jtfEmail.getText());
        
        jTextArea1.append("\tTravel Management System:\n\n"
                +"Ref\t:"+ ref
                +"\n-----------------------------------------------------------------"
                +"\nName\t:\t"+Firstname
                +"\nSurname\t:\t"+Surname
                +"\nAddress\t:\t"+address
                +"\nPostcode\t:\t"+postcode
                +"\nTelephone\t:\t"+telephone
                +"\nCost of Car\t:\t"+Email
                +"\nTax\t:\t"+rTax
                +"\nSub Total\t:\t"+rSubtotal
                +"\nTotal\t:\t"+rTotal
                +"\n-----------------------------------------------------------------"
                +"\nDate:\t"+iDate+"\tTime:"+iTime
                +"\n\n\tThanks for Using \n\tTravel Management System"
        );
    }//GEN-LAST:event_jReceiptActionPerformed

    private void jDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDestinationActionPerformed
    }//GEN-LAST:event_jDestinationActionPerformed

    private void jRbInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbInsuranceActionPerformed
    }//GEN-LAST:event_jRbInsuranceActionPerformed

    private void jRbLuggageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbLuggageActionPerformed
    }//GEN-LAST:event_jRbLuggageActionPerformed

    private void jRbAirportTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbAirportTaxActionPerformed
    }//GEN-LAST:event_jRbAirportTaxActionPerformed
private JFrame frame;
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       frame = new JFrame ("Exit");
       if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Travel Management System",
               JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
           System.exit(0);
        }           
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        jTextArea1.setText(null);
        jlblSubTotal.setText(null);
        jlblTotal.setText(null);
        jlblTax.setText(null);
        jtfEmail.setText(null);
        jtfFirst.setText(null);
        jtfSurname.setText(null);
        jtfAddress.setText(null);
        jtfPostCode.setText(null);
        jtfTelephone.setText(null);
        jDeparture.setSelectedItem("None");
        jAccommodation.setSelectedItem("None");
        jDestination.setSelectedItem("None");
        jRbStd.setSelected(false);
        jRbEco.setSelected(false);
        jRbFc.setSelected(false);
        jRbSingle.setSelected(false);
        jRbReturn.setSelected(false);
        jRbAdyes.setSelected(false);
        jRbChyes.setSelected(false);
        jRbAirportTax.setSelected(false);
        jRbLuggage.setSelected(false);
        jRbInsurance.setSelected(false);
        
    }//GEN-LAST:event_ResetActionPerformed

    private void jRbReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbReturnActionPerformed
    }//GEN-LAST:event_jRbReturnActionPerformed

    private void jbTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTotalMouseClicked
        
    double      Acc_Single = 65;
    double      Acc_Double = 80;
    double      Acc_Extra = 110;
    
    double      Std_Flight = 2.5;
    double      Eco_Flight = 65.5;
    double      Firstclass_Flight = 122.5;
    
    double      Airport_Tax = 6.7;
    double      Insurance = 650;
    double      Ext_Luggage = 25;
    
    double      Cox = 1000;
    double      St_Martin = 2000;
    double      Nilgiri = 2000;
    double      Sundarbans_1 = 2000;
    double      Sundarbans_3 = 4000;
    double      Sylhet_R_B = 2300;
    double      Sylhet_Jaflong = 1800;
    double      Sylhet_All = 3000;
    
    double[] TravelCost = new double [20];
    double iTax = 1.5;
        
    if((jDestination.getSelectedItem().equals("Cox- Bazer - 3 Days"))&& 
                        jAccommodation.getSelectedItem().equals("Single") && (jRbStd.isSelected()))
    {
        TravelCost[0] = Cox + Acc_Single + Std_Flight;
        TravelCost[1] = (( TravelCost[0] * iTax)/100);
        
        String Tax = String.format("%.2f/-", TravelCost[1]);
        jlblTax.setText((Tax));
        String SubTotal =  String.format("%.2f/-", TravelCost[0]);
        jlblSubTotal.setText(SubTotal);
        String Total = String.format("%.2f/-", TravelCost[0] + TravelCost[1]);
        jlblTotal.setText(Total);
    } 
     if((jDestination.getSelectedItem().equals("Cox- Bazer - 3 Days"))&& 
                 jAccommodation.getSelectedItem().equals("Single") && (jRbStd.isSelected())&& jRbAirportTax.isSelected())
    {
        TravelCost[0] = Cox + Acc_Single + Std_Flight + Airport_Tax;
        TravelCost[1] = (( TravelCost[0] * iTax)/100);
        
        String Tax = String.format("%.2f/-", TravelCost[1]);
        jlblTax.setText((Tax));
        String SubTotal =  String.format("%.2f/-", TravelCost[0]);
        jlblSubTotal.setText(SubTotal);
        String Total = String.format("%.2f/-", TravelCost[0] + TravelCost[1]);
        jlblTotal.setText(Total);
    } 
     if((jDestination.getSelectedItem().equals("Cox- Bazer - 3 Days"))&& 
            jAccommodation.getSelectedItem().equals("Single") && (jRbStd.isSelected())&& 
            jRbAirportTax.isSelected() && jRbInsurance.isSelected() )
    {
        TravelCost[0] = Cox + Acc_Single + Std_Flight + Airport_Tax + Insurance;
        TravelCost[1] = (( TravelCost[0] * iTax)/100);
        
        String Tax = String.format("%.2f/-", TravelCost[1]);
        jlblTax.setText((Tax));
        String SubTotal =  String.format("%.2f/-", TravelCost[0]);
        jlblSubTotal.setText(SubTotal);
        String Total = String.format("%.2f/-", TravelCost[0] + TravelCost[1]);
        jlblTotal.setText(Total);
    } 
     if((jDestination.getSelectedItem().equals("Cox- Bazer - 3 Days"))&& 
            jAccommodation.getSelectedItem().equals("Single") && (jRbStd.isSelected())&& 
            jRbAirportTax.isSelected() && jRbInsurance.isSelected() && jRbLuggage.isSelected() )
    {
        TravelCost[0] = Cox + Acc_Single + Std_Flight + Airport_Tax + Insurance + Ext_Luggage;
        TravelCost[1] = (( TravelCost[0] * iTax)/100);
        
        String Tax = String.format("%.2f/-", TravelCost[1]);
        jlblTax.setText((Tax));
        String SubTotal =  String.format("%.2f/-", TravelCost[0]);
        jlblSubTotal.setText(SubTotal);
        String Total = String.format("%.2f/-", TravelCost[0] + TravelCost[1]);
        jlblTotal.setText(Total);
    }
    
    
    
    
    
    
    
    
    
    }//GEN-LAST:event_jbTotalMouseClicked

    private void jbTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTotalActionPerformed
        

    }//GEN-LAST:event_jbTotalActionPerformed

    private void jAccommodationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccommodationActionPerformed
    }//GEN-LAST:event_jAccommodationActionPerformed

    private void jbTotalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTotalMouseDragged
        
        
    }//GEN-LAST:event_jbTotalMouseDragged

    private void jbTotalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jbTotalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbTotalItemStateChanged
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Travelling_Management_Systems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Travelling_Management_Systems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton Reset;
    private javax.swing.JComboBox<String> jAccommodation;
    private javax.swing.JComboBox<String> jDeparture;
    private javax.swing.JComboBox<String> jDestination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRbAdyes;
    private javax.swing.JRadioButton jRbAirportTax;
    private javax.swing.JRadioButton jRbChyes;
    private javax.swing.JRadioButton jRbEco;
    private javax.swing.JRadioButton jRbFc;
    private javax.swing.JRadioButton jRbInsurance;
    private javax.swing.JRadioButton jRbLuggage;
    private javax.swing.JRadioButton jRbReturn;
    private javax.swing.JRadioButton jRbSingle;
    private javax.swing.JRadioButton jRbStd;
    private javax.swing.JButton jReceipt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbTotal;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfFirst;
    private javax.swing.JTextField jtfPostCode;
    private javax.swing.JTextField jtfSurname;
    private javax.swing.JTextField jtfTelephone;
    // End of variables declaration//GEN-END:variables
}
