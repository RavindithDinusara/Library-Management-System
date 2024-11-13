package lms;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_book = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_member = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_report = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_return_book = new javax.swing.JButton();
        btn_issue_book = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORT MANAGEMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_book.setBackground(new java.awt.Color(0, 153, 51));
        btn_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_book.setText("ADD BOOK");
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });
        jPanel2.add(btn_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 430, 100));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORT MANAGEMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_member.setBackground(new java.awt.Color(0, 153, 51));
        btn_member.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_member.setForeground(new java.awt.Color(255, 255, 255));
        btn_member.setText("ADD MEMBER");
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });
        jPanel3.add(btn_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 430, 100));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORT MANAGEMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_report.setBackground(new java.awt.Color(0, 153, 51));
        btn_report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_report.setForeground(new java.awt.Color(255, 255, 255));
        btn_report.setText("REPORTS");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        jPanel4.add(btn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 430, 100));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORT MANAGEMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_return_book.setBackground(new java.awt.Color(0, 0, 204));
        btn_return_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_return_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_return_book.setText("RETURN BOOK");
        btn_return_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_return_bookActionPerformed(evt);
            }
        });
        jPanel5.add(btn_return_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 50));

        btn_issue_book.setBackground(new java.awt.Color(0, 153, 51));
        btn_issue_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_issue_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_issue_book.setText("ISSUE BOOK");
        btn_issue_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issue_bookActionPerformed(evt);
            }
        });
        jPanel5.add(btn_issue_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 430, 160));

        btn_logout.setBackground(new java.awt.Color(204, 0, 0));
        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 200, 30));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO LIBRARY");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 70));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/home.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 6, 980, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION)
        {
            Login l = new Login();
            this.setVisible(false);
            l.setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_issue_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issue_bookActionPerformed
        Isuue_Book ib=new Isuue_Book();
        ib.setVisible(true);
    }//GEN-LAST:event_btn_issue_bookActionPerformed

    private void btn_return_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_return_bookActionPerformed
        Return_Book rb=new Return_Book();
        rb.setVisible(true);
    }//GEN-LAST:event_btn_return_bookActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        Reports r=new Reports();
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_btn_reportActionPerformed

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
        Member m=new Member();
        m.setVisible(true);
    }//GEN-LAST:event_btn_memberActionPerformed

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        Book b=new Book();
        b.setVisible(true);
    }//GEN-LAST:event_btn_bookActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_issue_book;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_member;
    private javax.swing.JButton btn_report;
    private javax.swing.JButton btn_return_book;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
