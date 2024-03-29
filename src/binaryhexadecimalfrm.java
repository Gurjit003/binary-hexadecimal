/*
 * Gurjit Singh
 * Monday December 9th - 2019
 * This program displays the binary and hexadecimal conveters
 */

/**
 *
 * @author gusin5788
 */
public class binaryhexadecimalfrm extends javax.swing.JFrame {

    /**
     * Creates new form binaryhexadecimalfrm
     */
    public binaryhexadecimalfrm() {
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

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFirst = new javax.swing.JLabel();
        lblSecond = new javax.swing.JLabel();
        lblThird = new javax.swing.JLabel();
        lblFourth = new javax.swing.JLabel();
        lblFifth = new javax.swing.JLabel();
        lblSixth = new javax.swing.JLabel();
        lblSeventh = new javax.swing.JLabel();
        lblEighth = new javax.swing.JLabel();
        lblNinth = new javax.swing.JLabel();
        lblTenth = new javax.swing.JLabel();
        lblEleventh = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();
        txtSecond = new javax.swing.JTextField();
        txtThird = new javax.swing.JTextField();
        txtFourth = new javax.swing.JTextField();
        btnFirst = new javax.swing.JButton();
        btnSecond = new javax.swing.JButton();
        btnThird = new javax.swing.JButton();
        btnFourth = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFirst.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        lblFirst.setText("number systems");
        jPanel1.add(lblFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        lblSecond.setFont(new java.awt.Font("Perpetua Titling MT", 2, 16)); // NOI18N
        lblSecond.setText("decimal and binary:");
        jPanel1.add(lblSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        lblThird.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblThird.setText("enter a decimal number:");
        jPanel1.add(lblThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblFourth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblFourth.setText("Enter a binary number:");
        jPanel1.add(lblFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        lblFifth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblFifth.setText(". . . . . . .");
        jPanel1.add(lblFifth, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, -1, -1));

        lblSixth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblSixth.setText(". . . . . . .");
        jPanel1.add(lblSixth, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        lblSeventh.setFont(new java.awt.Font("Perpetua Titling MT", 2, 16)); // NOI18N
        lblSeventh.setText("Decimal and hexadecimal:");
        jPanel1.add(lblSeventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        lblEighth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblEighth.setText("enter a decimal number:");
        jPanel1.add(lblEighth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        lblNinth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblNinth.setText("enter a hexadecimal number:");
        jPanel1.add(lblNinth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        lblTenth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblTenth.setText(". . . . . . .");
        jPanel1.add(lblTenth, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        lblEleventh.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        lblEleventh.setText(". . . . . . .");
        jPanel1.add(lblEleventh, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        txtFirst.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        jPanel1.add(txtFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, -1));

        txtSecond.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        jPanel1.add(txtSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 70, -1));

        txtThird.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        jPanel1.add(txtThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 70, -1));

        txtFourth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        jPanel1.add(txtFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 70, -1));

        btnFirst.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        btnFirst.setText("dec. to bin.");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        btnSecond.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        btnSecond.setText("bin. to dec.");
        btnSecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecondActionPerformed(evt);
            }
        });
        jPanel1.add(btnSecond, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        btnThird.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        btnThird.setText("dec. to hex.");
        btnThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdActionPerformed(evt);
            }
        });
        jPanel1.add(btnThird, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        btnFourth.setFont(new java.awt.Font("Perpetua Titling MT", 0, 16)); // NOI18N
        btnFourth.setText("hex. to dec.");
        btnFourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourthActionPerformed(evt);
            }
        });
        jPanel1.add(btnFourth, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        int decimal;
        String binary;
        
        decimal = Integer.parseInt(txtFirst.getText());
        binary = Integer.toBinaryString(decimal);
        
        lblFifth.setText(binary);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnSecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecondActionPerformed
        String binary;
        int decimal;
        
        binary = txtSecond.getText();
        decimal = Integer.parseInt(binary, 2);
        
        lblSixth.setText(decimal + "");
    }//GEN-LAST:event_btnSecondActionPerformed

    private void btnThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdActionPerformed
        int decimal;
        String hexadecimal;
        
        decimal = Integer.parseInt(txtThird.getText());
        hexadecimal = Integer.toHexString(decimal);
        
        lblTenth.setText(hexadecimal);
    }//GEN-LAST:event_btnThirdActionPerformed

    private void btnFourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourthActionPerformed
        String hexadecimal;
        int decimal;
        
        hexadecimal = txtFourth.getText();
        decimal = Integer.parseInt(hexadecimal, 16);
        
        lblEleventh.setText(decimal + "");
    }//GEN-LAST:event_btnFourthActionPerformed

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
            java.util.logging.Logger.getLogger(binaryhexadecimalfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(binaryhexadecimalfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(binaryhexadecimalfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(binaryhexadecimalfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new binaryhexadecimalfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnFourth;
    private javax.swing.JButton btnSecond;
    private javax.swing.JButton btnThird;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEighth;
    private javax.swing.JLabel lblEleventh;
    private javax.swing.JLabel lblFifth;
    private javax.swing.JLabel lblFirst;
    private javax.swing.JLabel lblFourth;
    private javax.swing.JLabel lblNinth;
    private javax.swing.JLabel lblSecond;
    private javax.swing.JLabel lblSeventh;
    private javax.swing.JLabel lblSixth;
    private javax.swing.JLabel lblTenth;
    private javax.swing.JLabel lblThird;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtFourth;
    private javax.swing.JTextField txtSecond;
    private javax.swing.JTextField txtThird;
    // End of variables declaration//GEN-END:variables
}
