package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class VMain extends javax.swing.JFrame 
{

    public VMain()
    {
        setSize(947,654);
        initComponents(); 
        dt();
    }

    public void dt() 
    {
    Date d = new Date();
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MMM-dd");
    String dd = sdfDate.format(d);
    Ldate.setText(dd);

    Timer timer = new Timer(1000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            Date now = new Date();
            SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
            String tt = sdfTime.format(now);
            Ltime.setText(tt);
        }
    });
    timer.start();
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_book = new javax.swing.JButton();
        btn_member = new javax.swing.JButton();
        btn_issue_book = new javax.swing.JButton();
        btn_return_book = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_report = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Ldate = new javax.swing.JLabel();
        Ltime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 950, 640));
        setUndecorated(true);
        setSize(new java.awt.Dimension(950, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_book.setBackground(new java.awt.Color(51, 51, 51));
        btn_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/ADDBOOK.png"))); // NOI18N
        btn_book.setText("ADD BOOK");
        btn_book.setAutoscrolls(true);
        btn_book.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_book.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_book.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });
        jPanel1.add(btn_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 220));

        btn_member.setBackground(new java.awt.Color(51, 51, 51));
        btn_member.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_member.setForeground(new java.awt.Color(255, 255, 255));
        btn_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/ADDMEMBER.png"))); // NOI18N
        btn_member.setText("ADD MEMBER");
        btn_member.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_member.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_member.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });
        jPanel1.add(btn_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 220));

        btn_issue_book.setBackground(new java.awt.Color(51, 51, 51));
        btn_issue_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_issue_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_issue_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/ISSUEBOOK.png"))); // NOI18N
        btn_issue_book.setText("ISSUE BOOK");
        btn_issue_book.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_issue_book.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_issue_book.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_issue_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issue_bookActionPerformed(evt);
            }
        });
        jPanel1.add(btn_issue_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 160, 220));

        btn_return_book.setBackground(new java.awt.Color(51, 51, 51));
        btn_return_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_return_book.setForeground(new java.awt.Color(255, 255, 255));
        btn_return_book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/RETURNBOOK.png"))); // NOI18N
        btn_return_book.setText("RETURN BOOK");
        btn_return_book.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_return_book.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_return_book.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_return_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_return_bookActionPerformed(evt);
            }
        });
        jPanel1.add(btn_return_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 160, 220));

        btn_logout.setBackground(new java.awt.Color(204, 0, 0));
        btn_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("LOGOUT");
        btn_logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 610, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    WELCOME TO LIBRARY MANAGEMENT SYSTEM");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 950, 80));

        btn_report.setBackground(new java.awt.Color(51, 51, 51));
        btn_report.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_report.setForeground(new java.awt.Color(255, 255, 255));
        btn_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/REPORT.png"))); // NOI18N
        btn_report.setText("REPORTS");
        btn_report.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_report.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_report.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });
        jPanel1.add(btn_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 160, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ldate.setBackground(new java.awt.Color(102, 102, 102));
        Ldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ldate.setForeground(new java.awt.Color(102, 102, 102));
        Ldate.setText("DATE");
        jPanel2.add(Ldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        Ltime.setBackground(new java.awt.Color(102, 102, 102));
        Ltime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Ltime.setForeground(new java.awt.Color(102, 102, 102));
        Ltime.setText("TIME");
        jPanel2.add(Ltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 240, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 250, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/BackGR.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 947, 654));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        VBook b=new VBook();
        this.setVisible(false);
        b.setVisible(true);
    }//GEN-LAST:event_btn_bookActionPerformed

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
        VMember m=new VMember();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_btn_memberActionPerformed

    private void btn_issue_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issue_bookActionPerformed
        VIssue_Book ib=new VIssue_Book();
        this.setVisible(false);
        ib.setVisible(true);
    }//GEN-LAST:event_btn_issue_bookActionPerformed

    private void btn_return_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_return_bookActionPerformed
        VReturn_Book rb=new VReturn_Book();
        this.setVisible(false);
        rb.setVisible(true);
    }//GEN-LAST:event_btn_return_bookActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        
    int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirm Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) 
    {
        VLogin l = new VLogin();
        this.setVisible(false);
        l.setVisible(true);
    } 
    else 
    {
        JOptionPane.showMessageDialog(this, "Logout cancelled.", "Logout", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
        VReports r=new VReports();
        this.setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_btn_reportActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldate;
    private javax.swing.JLabel Ltime;
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
    // End of variables declaration//GEN-END:variables
}
