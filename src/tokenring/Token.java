package tokenring;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.Timer;

public class Token extends javax.swing.JFrame {
    /**
     * Creates new form Token
     */
    public Token() {
        initComponents();
    }
    int deltax=-1,deltay=1;
    Timer tim=new Timer(3,new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if(tokenlbl.getY()<=230){
                deltay=1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                if(bucketfull){
                    if(tokenlbl.getText().charAt(tokenlbl.getText().length()-1)=='A'){
                        tokenlbl.setText("Src:   | Dest:  ");
                        bucketfull=false;
                    }
                }
                if(!bucketfull && !a_queue.getText().equals("")){
                    tokenlbl.setText("Src: A | Dest: "+a_queue.getText().charAt(0));
                    a_queue.setText(a_queue.getText().substring(2));
                    a_buff_cnt--;
                    bucketfull=true;
                }
            }
            if(tokenlbl.getY()>=630){
                deltay=-1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                if(bucketfull){
                    if(tokenlbl.getText().charAt(tokenlbl.getText().length()-1)=='C'){
                        tokenlbl.setText("Src:   | Dest:  ");
                        bucketfull=false;
                    }
                }
                if(!bucketfull && !c_queue.getText().equals("")){
                    tokenlbl.setText("Src: C | Dest: "+c_queue.getText().charAt(0));
                    c_queue.setText(c_queue.getText().substring(2));
                    c_buff_cnt--;
                    bucketfull=true;
                }
            }
            if(tokenlbl.getX()<=240){
                deltax=1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                if(bucketfull){
                    if(tokenlbl.getText().charAt(tokenlbl.getText().length()-1)=='B'){
                        tokenlbl.setText("Src:   | Dest:  ");
                        bucketfull=false;
                    }
                }
                if(!bucketfull && !b_queue.getText().equals("")){
                    tokenlbl.setText("Src: B | Dest: "+b_queue.getText().charAt(0));
                    b_queue.setText(b_queue.getText().substring(2));
                    b_buff_cnt--;
                    bucketfull=true;
                }
            }
            if(tokenlbl.getX()>=640){
                deltax=-1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                if(bucketfull){
                    if(tokenlbl.getText().charAt(tokenlbl.getText().length()-1)=='D'){
                        tokenlbl.setText("Src:   | Dest:  ");
                        bucketfull=false;
                    }
                }
                if(!bucketfull && !d_queue.getText().equals("")){
                    tokenlbl.setText("Src: D | Dest: "+d_queue.getText().charAt(0));
                    d_queue.setText(d_queue.getText().substring(2));
                    d_buff_cnt--;
                    bucketfull=true;
                }
            }
            tokenlbl.setLocation(tokenlbl.getX()+deltax, tokenlbl.getY()+deltay);
        }
    });
    
    Queue<Integer> a=new LinkedList<>();
    Queue<Integer> b=new LinkedList<>();
    Queue<Integer> c=new LinkedList<>();
    Queue<Integer> d=new LinkedList<>();
    int a_buff_cnt=0,b_buff_cnt=0,c_buff_cnt=0,d_buff_cnt=0;
    boolean bucketfull=false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        a_queue = new javax.swing.JLabel();
        d_queue = new javax.swing.JLabel();
        c_queue = new javax.swing.JLabel();
        b_queue = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        b_send = new javax.swing.JButton();
        d_send = new javax.swing.JButton();
        c_send = new javax.swing.JButton();
        a_send = new javax.swing.JButton();
        a_list = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_list = new javax.swing.JComboBox<>();
        b_list = new javax.swing.JComboBox<>();
        d_list = new javax.swing.JComboBox<>();
        tokenlbl = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(null);

        a_queue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a_queue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(a_queue);
        a_queue.setBounds(410, 90, 165, 32);

        d_queue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        d_queue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(d_queue);
        d_queue.setBounds(820, 490, 165, 32);

        c_queue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        c_queue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(c_queue);
        c_queue.setBounds(410, 830, 165, 32);

        b_queue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b_queue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(b_queue);
        b_queue.setBounds(20, 510, 165, 32);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("C");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 730, 20, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("B");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 390, 11, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("A");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 140, 20, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("D");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(770, 380, 20, 30);

        b_send.setText("Enviar");
        b_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sendActionPerformed(evt);
            }
        });
        jPanel1.add(b_send);
        b_send.setBounds(70, 470, 79, 25);

        d_send.setText("Enviar");
        d_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_sendActionPerformed(evt);
            }
        });
        jPanel1.add(d_send);
        d_send.setBounds(860, 430, 79, 25);

        c_send.setText("Enviar");
        c_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_sendActionPerformed(evt);
            }
        });
        jPanel1.add(c_send);
        c_send.setBounds(450, 800, 79, 25);

        a_send.setText("Enviar");
        a_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_sendActionPerformed(evt);
            }
        });
        jPanel1.add(a_send);
        a_send.setBounds(460, 60, 79, 25);

        a_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "C", "D" }));
        jPanel1.add(a_list);
        a_list.setBounds(500, 30, 60, 22);

        jLabel2.setText("Send to");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(430, 30, 60, 16);

        jLabel3.setText("Send to");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 440, 60, 16);

        jLabel4.setText("Send to");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 770, 60, 16);

        jLabel5.setText("Send to");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(840, 400, 60, 16);

        c_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "D" }));
        jPanel1.add(c_list);
        c_list.setBounds(500, 770, 60, 22);

        b_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "C", "D" }));
        jPanel1.add(b_list);
        b_list.setBounds(110, 440, 60, 22);

        d_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        jPanel1.add(d_list);
        d_list.setBounds(900, 400, 60, 22);

        tokenlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tokenlbl.setText("  Src:   |Dest:   ");
        tokenlbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(tokenlbl);
        tokenlbl.setBounds(440, 231, 110, 30);

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start);
        start.setBounds(40, 20, 61, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokenring/network.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 130, 650, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized

    }//GEN-LAST:event_formComponentResized

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        tim.start();
    }//GEN-LAST:event_startActionPerformed

    private void b_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sendActionPerformed
        if(b_buff_cnt<8){
            b_buff_cnt++;
            b_queue.setText(b_queue.getText()+b_list.getSelectedItem()+"|");
        }
    }//GEN-LAST:event_b_sendActionPerformed

    private void d_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_sendActionPerformed
        if(d_buff_cnt<8){
            d_buff_cnt++;
            d_queue.setText(d_queue.getText()+d_list.getSelectedItem()+"|");
        }
    }//GEN-LAST:event_d_sendActionPerformed

    private void c_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_sendActionPerformed
        if(c_buff_cnt<8){
            c_buff_cnt++;
            c_queue.setText(c_queue.getText()+c_list.getSelectedItem()+"|");
        }
    }//GEN-LAST:event_c_sendActionPerformed

    private void a_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_sendActionPerformed
        if(a_buff_cnt<8){
            a_buff_cnt++;
            a_queue.setText(a_queue.getText()+a_list.getSelectedItem()+"|");
        }
    }//GEN-LAST:event_a_sendActionPerformed

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
            java.util.logging.Logger.getLogger(Token.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Token.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Token.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Token.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Token().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a_list;
    private javax.swing.JLabel a_queue;
    private javax.swing.JButton a_send;
    private javax.swing.JComboBox<String> b_list;
    private javax.swing.JLabel b_queue;
    private javax.swing.JButton b_send;
    private javax.swing.JComboBox<String> c_list;
    private javax.swing.JLabel c_queue;
    private javax.swing.JButton c_send;
    private javax.swing.JComboBox<String> d_list;
    private javax.swing.JLabel d_queue;
    private javax.swing.JButton d_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton start;
    private javax.swing.JLabel tokenlbl;
    // End of variables declaration//GEN-END:variables
}
