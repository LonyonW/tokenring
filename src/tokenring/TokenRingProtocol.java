package tokenring;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class TokenRingProtocol extends javax.swing.JFrame {

    DefaultTableModel model3, model4, model5, model6, model7;

    /**
     * Creates new form TokenRingProtocol
     */
    public TokenRingProtocol() {
        initComponents();
        model3 = (DefaultTableModel) tab3.getModel();
        model4 = (DefaultTableModel) tab4.getModel();
        model5 = (DefaultTableModel) tab5.getModel();
        model6 = (DefaultTableModel) tab6.getModel();
    }

    boolean bucketfull[] = new boolean[4];
    float deltax = 0, deltay = 1;

    Timer tim3 = new Timer(10, new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if (token3p.getY() <= 190) {
                deltay = 2;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token3p.setLocation(525, 200);
                if (bucketfull[0]) {
                    if (token3.getModel().getValueAt(0, 1).equals("A")) {
                        token3.getModel().setValueAt("", 0, 0);
                        token3.getModel().setValueAt("", 0, 1);
                        bucketfull[0] = false;
                    }
                } else {
                    if (!model3.getValueAt(0, 1).equals("")) {
                        token3.getModel().setValueAt("A", 0, 0);
                        token3.getModel().setValueAt(model3.getValueAt(0, 1), 0, 1);
                        bucketfull[0] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model3.getValueAt(0, i).equals("")) {
                                model3.setValueAt("", 0, i - 1);
                            }
                            model3.setValueAt(model3.getValueAt(0, i), 0, i - 1);
                        }
                        model3.setValueAt("", 0, 8);
                    }
                }
            }
            if (token3p.getX() <= 260 || token3p.getY() >= 641) {
                deltay = 0;
                deltax = 2;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token3p.setLocation(310, 640);
                if (bucketfull[0]) {
                    if (token3.getModel().getValueAt(0, 1).equals("B")) {
                        token3.getModel().setValueAt("", 0, 0);
                        token3.getModel().setValueAt("", 0, 1);
                        bucketfull[0] = false;
                    }
                } else {
                    if (!model3.getValueAt(1, 1).equals("")) {
                        token3.getModel().setValueAt("B", 0, 0);
                        token3.getModel().setValueAt(model3.getValueAt(1, 1), 0, 1);
                        bucketfull[0] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model3.getValueAt(1, i).equals("")) {
                                model3.setValueAt("", 1, i - 1);
                            }
                            model3.setValueAt(model3.getValueAt(1, i), 1, i - 1);
                        }
                        model3.setValueAt("", 1, 8);
                    }
                }
            }
            if (token3p.getX() >= 780) {
                deltay = -2;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token3p.setLocation(780, 640);
                if (bucketfull[0]) {
                    if (token3.getModel().getValueAt(0, 1).equals("C")) {
                        token3.getModel().setValueAt("", 0, 0);
                        token3.getModel().setValueAt("", 0, 1);
                        bucketfull[0] = false;
                    }
                } else {
                    if (!model3.getValueAt(2, 1).equals("")) {
                        token3.getModel().setValueAt("C", 0, 0);
                        token3.getModel().setValueAt(model3.getValueAt(2, 1), 0, 1);
                        bucketfull[0] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model3.getValueAt(2, i).equals("")) {
                                model3.setValueAt("", 2, i - 1);
                            }
                            model3.setValueAt(model3.getValueAt(2, i), 2, i - 1);
                        }
                        model3.setValueAt("", 2, 8);
                    }
                }
            }
            token3p.setLocation(token3p.getX() + (int) deltax, token3p.getY() + (int) deltay);
        }
    });

    Timer tim4 = new Timer(3, new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if (token4p.getX() <= 320) {
                deltay = 1;
                deltax = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token4p.setLocation(321, 221);
                if (bucketfull[1]) {
                    if (token4.getModel().getValueAt(0, 1).equals("A")) {
                        token4.getModel().setValueAt("", 0, 0);
                        token4.getModel().setValueAt("", 0, 1);
                        bucketfull[1] = false;
                    }
                } else {
                    if (!model4.getValueAt(0, 1).equals("")) {
                        token4.getModel().setValueAt("A", 0, 0);
                        token4.getModel().setValueAt(model4.getValueAt(0, 1), 0, 1);
                        bucketfull[1] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model4.getValueAt(0, i).equals("")) {
                                model4.setValueAt("", 0, i - 1);
                            }
                            model4.setValueAt(model4.getValueAt(0, i), 0, i - 1);
                        }
                        model4.setValueAt("", 0, 8);
                    }
                }
            }
            if (token4p.getY() >= 641) {
                deltay = 0;
                deltax = 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token4p.setLocation(321, 640);
                if (bucketfull[1]) {
                    if (token4.getModel().getValueAt(0, 1).equals("B")) {
                        token4.getModel().setValueAt("", 0, 0);
                        token4.getModel().setValueAt("", 0, 1);
                        bucketfull[1] = false;
                    }
                } else {
                    if (!model4.getValueAt(1, 1).equals("")) {
                        token4.getModel().setValueAt("B", 0, 0);
                        token4.getModel().setValueAt(model4.getValueAt(1, 1), 0, 1);
                        bucketfull[1] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model4.getValueAt(1, i).equals("")) {
                                model4.setValueAt("", 1, i - 1);
                            }
                            model4.setValueAt(model4.getValueAt(1, i), 1, i - 1);
                        }
                        model4.setValueAt("", 1, 8);
                    }
                }
            }
            if (token4p.getX() >= 750) {
                deltay = -1;
                deltax = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token4p.setLocation(749, 640);
                if (bucketfull[1]) {
                    if (token4.getModel().getValueAt(0, 1).equals("C")) {
                        token4.getModel().setValueAt("", 0, 0);
                        token4.getModel().setValueAt("", 0, 1);
                        bucketfull[1] = false;
                    }
                } else {
                    if (!model4.getValueAt(2, 1).equals("")) {
                        token4.getModel().setValueAt("C", 0, 0);
                        token4.getModel().setValueAt(model4.getValueAt(2, 1), 0, 1);
                        bucketfull[1] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model4.getValueAt(2, i).equals("")) {
                                model4.setValueAt("", 2, i - 1);
                            }
                            model4.setValueAt(model4.getValueAt(2, i), 2, i - 1);
                        }
                        model4.setValueAt("", 2, 8);
                    }
                }
            }
            if (token4p.getY() <= 220) {
                deltay = 0;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token4p.setLocation(749, 221);
                if (bucketfull[1]) {
                    if (token4.getModel().getValueAt(0, 1).equals("D")) {
                        token4.getModel().setValueAt("", 0, 0);
                        token4.getModel().setValueAt("", 0, 1);
                        bucketfull[1] = false;
                    }
                } else {
                    if (!model4.getValueAt(3, 1).equals("")) {
                        token4.getModel().setValueAt("D", 0, 0);
                        token4.getModel().setValueAt(model4.getValueAt(3, 1), 0, 1);
                        bucketfull[1] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model4.getValueAt(3, i).equals("")) {
                                model4.setValueAt("", 3, i - 1);
                            }
                            model4.setValueAt(model4.getValueAt(3, i), 3, i - 1);
                        }
                        model4.setValueAt("", 3, 8);
                    }
                }
            }
            token4p.setLocation(token4p.getX() + (int) deltax, token4p.getY() + (int) deltay);
        }
    });

    Timer tim5 = new Timer(3, new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if (token5p.getX() <= 185) {
                deltay = 1;
                deltax = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token5p.setLocation(186, 241);
                if (bucketfull[2]) {
                    if (token5.getModel().getValueAt(0, 1).equals("A")) {
                        token5.getModel().setValueAt("", 0, 0);
                        token5.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model5.getValueAt(0, 1).equals("")) {
                        token5.getModel().setValueAt("A", 0, 0);
                        token5.getModel().setValueAt(model5.getValueAt(0, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model5.getValueAt(0, i).equals("")) {
                                model5.setValueAt("", 0, i - 1);
                            }
                            model5.setValueAt(model5.getValueAt(0, i), 0, i - 1);
                        }
                        model5.setValueAt("", 0, 8);
                    }
                }
            }
            if (token5p.getY() >= 640) {
                deltay = 0;
                deltax = 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token5p.setLocation(186, 639);
                if (bucketfull[2]) {
                    if (token5.getModel().getValueAt(0, 1).equals("B")) {
                        token5.getModel().setValueAt("", 0, 0);
                        token5.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model5.getValueAt(1, 1).equals("")) {
                        token5.getModel().setValueAt("B", 0, 0);
                        token5.getModel().setValueAt(model5.getValueAt(1, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model5.getValueAt(1, i).equals("")) {
                                model5.setValueAt("", 1, i - 1);
                            }
                            model5.setValueAt(model5.getValueAt(1, i), 1, i - 1);
                        }
                        model5.setValueAt("", 1, 8);
                    }
                }
            }
            if (token5p.getX() >= 940) {
                deltay = -1;
                deltax = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token5p.setLocation(939, 639);
                if (bucketfull[2]) {
                    if (token5.getModel().getValueAt(0, 1).equals("C")) {
                        token5.getModel().setValueAt("", 0, 0);
                        token5.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model5.getValueAt(2, 1).equals("")) {
                        token5.getModel().setValueAt("C", 0, 0);
                        token5.getModel().setValueAt(model5.getValueAt(2, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model5.getValueAt(2, i).equals("")) {
                                model5.setValueAt("", 2, i - 1);
                            }
                            model5.setValueAt(model5.getValueAt(2, i), 2, i - 1);
                        }
                        model5.setValueAt("", 2, 8);
                    }
                }
            }
            if (token5p.getY() <= 240) {
                deltay = 0;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token5p.setLocation(939, 241);
                if (bucketfull[2]) {
                    if (token5.getModel().getValueAt(0, 1).equals("D")) {
                        token5.getModel().setValueAt("", 0, 0);
                        token5.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model5.getValueAt(3, 1).equals("")) {
                        token5.getModel().setValueAt("D", 0, 0);
                        token5.getModel().setValueAt(model5.getValueAt(3, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model5.getValueAt(3, i).equals("")) {
                                model5.setValueAt("", 3, i - 1);
                            }
                            model5.setValueAt(model5.getValueAt(3, i), 3, i - 1);
                        }
                        model5.setValueAt("", 3, 8);
                    }
                }
            }
            if (token5p.getX() == 555 && token5p.getY() == 241) {
                deltay = 0;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token5p.setLocation(555, 241);
                if (bucketfull[2]) {
                    if (token5.getModel().getValueAt(0, 1).equals("E")) {
                        token5.getModel().setValueAt("", 0, 0);
                        token5.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model5.getValueAt(4, 1).equals("")) {
                        token5.getModel().setValueAt("E", 0, 0);
                        token5.getModel().setValueAt(model5.getValueAt(4, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model5.getValueAt(4, i).equals("")) {
                                model5.setValueAt("", 4, i - 1);
                            }
                            model5.setValueAt(model5.getValueAt(4, i), 4, i - 1);
                        }
                        model5.setValueAt("", 4, 8);
                    }
                }
            }
            token5p.setLocation(token5p.getX() + (int) deltax, token5p.getY() + (int) deltay);
        }
    });

    
    Timer tim6 = new Timer(3, new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            if (token6p.getX() <= 185) {
                deltay = 1;
                deltax = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token6p.setLocation(186, 241);
                if (bucketfull[2]) {
                    if (token6.getModel().getValueAt(0, 1).equals("A")) {
                        token6.getModel().setValueAt("", 0, 0);
                        token6.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model6.getValueAt(0, 1).equals("")) {
                        token6.getModel().setValueAt("A", 0, 0);
                        token6.getModel().setValueAt(model6.getValueAt(0, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model6.getValueAt(0, i).equals("")) {
                                model6.setValueAt("", 0, i - 1);
                            }
                            model6.setValueAt(model6.getValueAt(0, i), 0, i - 1);
                        }
                        model6.setValueAt("", 0, 8);
                    }
                }
            }
            if (token6p.getY() >= 640) {
                deltay = 0;
                deltax = 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token6p.setLocation(186, 639);
                if (bucketfull[2]) {
                    if (token6.getModel().getValueAt(0, 1).equals("B")) {
                        token6.getModel().setValueAt("", 0, 0);
                        token6.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model6.getValueAt(1, 1).equals("")) {
                        token6.getModel().setValueAt("B", 0, 0);
                        token6.getModel().setValueAt(model6.getValueAt(1, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model6.getValueAt(1, i).equals("")) {
                                model6.setValueAt("", 1, i - 1);
                            }
                            model6.setValueAt(model6.getValueAt(1, i), 1, i - 1);
                        }
                        model6.setValueAt("", 1, 8);
                    }
                }
            }
            if (token6p.getX() >= 555 && token6p.getX() <= 556 && token6p.getY() >= 639) {
                deltay = 0;
                deltax = 1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token6p.setLocation(556, 639);
                if (bucketfull[2]) {
                    if (token6.getModel().getValueAt(0, 1).equals("C")) {
                        token6.getModel().setValueAt("", 0, 0);
                        token6.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model6.getValueAt(2, 1).equals("")) {
                        token6.getModel().setValueAt("C", 0, 0);
                        token6.getModel().setValueAt(model6.getValueAt(2, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model6.getValueAt(2, i).equals("")) {
                                model6.setValueAt("", 2, i - 1);
                            }
                            model6.setValueAt(model6.getValueAt(2, i), 2, i - 1);
                        }
                        model6.setValueAt("", 2, 8);
                    }
                }
            }
            if (token6p.getX() >= 940) {
                deltay = -1;
                deltax = 0;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token6p.setLocation(939, 639);
                if (bucketfull[2]) {
                    if (token6.getModel().getValueAt(0, 1).equals("D")) {
                        token6.getModel().setValueAt("", 0, 0);
                        token6.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model6.getValueAt(2, 1).equals("")) {
                        token6.getModel().setValueAt("D", 0, 0);
                        token6.getModel().setValueAt(model6.getValueAt(2, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model6.getValueAt(2, i).equals("")) {
                                model6.setValueAt("", 2, i - 1);
                            }
                            model6.setValueAt(model6.getValueAt(2, i), 2, i - 1);
                        }
                        model6.setValueAt("", 2, 8);
                    }
                }
            }
            if (token6p.getY() <= 240) {
                deltay = 0;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token6p.setLocation(939, 241);
                if (bucketfull[2]) {
                    if (token6.getModel().getValueAt(0, 1).equals("E")) {
                        token6.getModel().setValueAt("", 0, 0);
                        token6.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model6.getValueAt(3, 1).equals("")) {
                        token6.getModel().setValueAt("E", 0, 0);
                        token6.getModel().setValueAt(model6.getValueAt(3, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model6.getValueAt(3, i).equals("")) {
                                model6.setValueAt("", 3, i - 1);
                            }
                            model6.setValueAt(model6.getValueAt(3, i), 3, i - 1);
                        }
                        model6.setValueAt("", 3, 8);
                    }
                }
            }
            if (token6p.getX() == 555 && token6p.getY() == 241) {
                deltay = 0;
                deltax = -1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                token6p.setLocation(555, 241);
                if (bucketfull[2]) {
                    if (token6.getModel().getValueAt(0, 1).equals("F")) {
                        token6.getModel().setValueAt("", 0, 0);
                        token6.getModel().setValueAt("", 0, 1);
                        bucketfull[2] = false;
                    }
                } else {
                    if (!model6.getValueAt(4, 1).equals("")) {
                        token6.getModel().setValueAt("F", 0, 0);
                        token6.getModel().setValueAt(model6.getValueAt(4, 1), 0, 1);
                        bucketfull[2] = true;
                        for (int i = 2; i <= 8; i++) {
                            if (model6.getValueAt(4, i).equals("")) {
                                model6.setValueAt("", 4, i - 1);
                            }
                            model6.setValueAt(model6.getValueAt(4, i), 4, i - 1);
                        }
                        model6.setValueAt("", 4, 8);
                    }
                }
            }
            token6p.setLocation(token6p.getX() + (int) deltax, token6p.getY() + (int) deltay);
        }
    });
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pan3 = new javax.swing.JPanel();
        token3p = new javax.swing.JScrollPane();
        token3 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        reset3 = new javax.swing.JButton();
        start3 = new javax.swing.JButton();
        span3 = new javax.swing.JScrollPane();
        tab3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        src3 = new javax.swing.JComboBox<>();
        dest3 = new javax.swing.JComboBox<>();
        send3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pan4 = new javax.swing.JPanel();
        span4 = new javax.swing.JScrollPane();
        tab4 = new javax.swing.JTable();
        src4 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dest4 = new javax.swing.JComboBox<>();
        send4 = new javax.swing.JButton();
        start4 = new javax.swing.JButton();
        reset4 = new javax.swing.JButton();
        token4p = new javax.swing.JScrollPane();
        token4 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pan5 = new javax.swing.JPanel();
        span5 = new javax.swing.JScrollPane();
        tab5 = new javax.swing.JTable();
        src5 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dest5 = new javax.swing.JComboBox<>();
        send5 = new javax.swing.JButton();
        start5 = new javax.swing.JButton();
        token5p = new javax.swing.JScrollPane();
        token5 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        reset5 = new javax.swing.JButton();

        pan6 = new javax.swing.JPanel();
        span6 = new javax.swing.JScrollPane();
        tab6 = new javax.swing.JTable();
        src6 = new javax.swing.JComboBox<>();
        jLabel6b = new javax.swing.JLabel();
        jLabel7b = new javax.swing.JLabel();
        dest6 = new javax.swing.JComboBox<>();
        send6 = new javax.swing.JButton();
        start6 = new javax.swing.JButton();
        token6p = new javax.swing.JScrollPane();
        token6 = new javax.swing.JTable();
        jLabel28b = new javax.swing.JLabel();
        jLabel29b = new javax.swing.JLabel();
        jLabel30b = new javax.swing.JLabel();
        jLabel31b = new javax.swing.JLabel();
        jLabel32b = new javax.swing.JLabel();
        jLabel33b = new javax.swing.JLabel();
        jLabel34b = new javax.swing.JLabel();
        jLabel35b = new javax.swing.JLabel();
        jLabel36b = new javax.swing.JLabel();
        jLabel37b = new javax.swing.JLabel();
        jLabel38b = new javax.swing.JLabel();
        jLabel27b = new javax.swing.JLabel();
        reset6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Token Ring Simulator");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1185, 900));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pan3.setLayout(null);

        token3.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "", null }
                },
                new String[] {
                        "Src", "Dest"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        token3p.setViewportView(token3);

        pan3.add(token3p);
        token3p.setBounds(530, 190, 80, 47);

        jLabel13.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan3.add(jLabel13);
        jLabel13.setBounds(530, 160, 90, 90);

        jLabel14.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan3.add(jLabel14);
        jLabel14.setBounds(270, 600, 90, 90);

        jLabel12.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan3.add(jLabel12);
        jLabel12.setBounds(790, 600, 90, 90);

        reset3.setText("Reset");
        reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset3ActionPerformed(evt);
            }
        });
        pan3.add(reset3);
        reset3.setBounds(270, 130, 79, 25);

        start3.setText("Start");
        start3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start3ActionPerformed(evt);
            }
        });
        pan3.add(start3);
        start3.setBounds(160, 130, 79, 25);

        tab3.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "A", null, null, null, null, null, null, null, null },
                        { "B", null, null, null, null, null, null, null, null },
                        { "C", null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "Source", "1", "2", "3", "4", "5", "6", "7", "8"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tab3.getTableHeader().setReorderingAllowed(false);
        span3.setViewportView(tab3);
        if (tab3.getColumnModel().getColumnCount() > 0) {
            tab3.getColumnModel().getColumn(0).setResizable(false);
        }

        pan3.add(span3);
        span3.setBounds(20, 20, 450, 80);

        jLabel2.setText("Source");
        pan3.add(jLabel2);
        jLabel2.setBounds(537, 20, 40, 16);

        jLabel3.setText("Dest");
        pan3.add(jLabel3);
        jLabel3.setBounds(683, 20, 30, 16);

        src3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        src3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                src3ActionPerformed(evt);
            }
        });
        pan3.add(src3);
        src3.setBounds(589, 20, 76, 22);

        dest3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "C" }));
        pan3.add(dest3);
        dest3.setBounds(720, 20, 76, 22);

        send3.setText("Send");
        send3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send3ActionPerformed(evt);
            }
        });
        pan3.add(send3);
        send3.setBounds(661, 50, 61, 25);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("A");
        pan3.add(jLabel15);
        jLabel15.setBounds(562, 140, 20, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("B");
        pan3.add(jLabel16);
        jLabel16.setBounds(240, 640, 20, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("C");
        pan3.add(jLabel17);
        jLabel17.setBounds(885, 640, 20, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokenring/3.png"))); // NOI18N
        pan3.add(jLabel1);
        jLabel1.setBounds(270, 190, 570, 470);

        jTabbedPane1.addTab("3 Hosts ", pan3);

        pan4.setLayout(null);

        tab4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "A", null, null, null, null, null, null, null, null },
                        { "B", null, null, null, null, null, null, null, null },
                        { "C", null, null, null, null, null, null, null, null },
                        { "D", null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "Source", "1", "2", "3", "4", "5", "6", "7", "8"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        span4.setViewportView(tab4);
        if (tab4.getColumnModel().getColumnCount() > 0) {
            tab4.getColumnModel().getColumn(0).setResizable(false);
        }

        pan4.add(span4);
        span4.setBounds(20, 20, 450, 96);

        src4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));
        src4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                src4ActionPerformed(evt);
            }
        });
        pan4.add(src4);
        src4.setBounds(589, 20, 76, 22);

        jLabel4.setText("Source");
        pan4.add(jLabel4);
        jLabel4.setBounds(537, 20, 40, 16);

        jLabel5.setText("Dest");
        pan4.add(jLabel5);
        jLabel5.setBounds(683, 20, 30, 16);

        dest4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "C", "D" }));
        pan4.add(dest4);
        dest4.setBounds(720, 20, 76, 22);

        send4.setText("Send");
        send4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send4ActionPerformed(evt);
            }
        });
        pan4.add(send4);
        send4.setBounds(661, 50, 61, 25);

        start4.setText("Start");
        start4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start4ActionPerformed(evt);
            }
        });
        pan4.add(start4);
        start4.setBounds(160, 130, 79, 25);

        reset4.setText("Reset");
        reset4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset4ActionPerformed(evt);
            }
        });
        pan4.add(reset4);
        reset4.setBounds(270, 130, 79, 25);

        token4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "", null }
                },
                new String[] {
                        "Src", "Dest"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        token4p.setViewportView(token4);

        pan4.add(token4p);
        token4p.setBounds(320, 220, 80, 47);

        jLabel19.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan4.add(jLabel19);
        jLabel19.setBounds(320, 200, 90, 90);

        jLabel20.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan4.add(jLabel20);
        jLabel20.setBounds(750, 620, 90, 90);

        jLabel21.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan4.add(jLabel21);
        jLabel21.setBounds(750, 200, 90, 90);

        jLabel22.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan4.add(jLabel22);
        jLabel22.setBounds(320, 620, 90, 90);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("B");
        pan4.add(jLabel23);
        jLabel23.setBounds(290, 650, 20, 17);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("A");
        pan4.add(jLabel24);
        jLabel24.setBounds(290, 230, 20, 17);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("D");
        pan4.add(jLabel25);
        jLabel25.setBounds(850, 230, 20, 17);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("C");
        pan4.add(jLabel26);
        jLabel26.setBounds(850, 650, 20, 17);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokenring/4.png"))); // NOI18N
        pan4.add(jLabel18);
        jLabel18.setBounds(270, 220, 560, 470);

        jTabbedPane1.addTab("4 Hosts", pan4);

        pan5.setLayout(null);

        tab5.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "A", null, null, null, null, null, null, null, null },
                        { "B", null, null, null, null, null, null, null, null },
                        { "C", null, null, null, null, null, null, null, null },
                        { "D", null, null, null, null, null, null, null, null },
                        { "E", null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "Source", "1", "2", "3", "4", "5", "6", "7", "8"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tab5.getTableHeader().setReorderingAllowed(false);
        span5.setViewportView(tab5);
        if (tab5.getColumnModel().getColumnCount() > 0) {
            tab5.getColumnModel().getColumn(0).setResizable(false);
        }

        pan5.add(span5);
        span5.setBounds(20, 20, 450, 112);

        src5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));
        src5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                src5ActionPerformed(evt);
            }
        });
        pan5.add(src5);
        src5.setBounds(589, 20, 76, 22);

        jLabel6.setText("Source");
        pan5.add(jLabel6);
        jLabel6.setBounds(537, 20, 40, 16);

        jLabel7.setText("Dest");
        pan5.add(jLabel7);
        jLabel7.setBounds(683, 20, 30, 16);

        dest5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "C", "D", "E" }));
        pan5.add(dest5);
        dest5.setBounds(720, 20, 76, 22);

        send5.setText("Send");
        send5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send5ActionPerformed(evt);
            }
        });
        pan5.add(send5);
        send5.setBounds(661, 50, 61, 25);

        start5.setText("Start");
        start5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start5ActionPerformed(evt);
            }
        });
        pan5.add(start5);
        start5.setBounds(170, 150, 79, 25);

        token5.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "", null }
                },
                new String[] {
                        "Src", "Dest"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        token5p.setViewportView(token5);

        pan5.add(token5p);
        token5p.setBounds(185, 240, 80, 47);

        jLabel28.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan5.add(jLabel28);
        jLabel28.setBounds(185, 615, 90, 90);

        jLabel29.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan5.add(jLabel29);
        jLabel29.setBounds(935, 220, 90, 90);

        jLabel30.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan5.add(jLabel30);
        jLabel30.setBounds(935, 615, 90, 90);

        jLabel31.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan5.add(jLabel31);
        jLabel31.setBounds(550, 220, 90, 90);

        jLabel32.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan5.add(jLabel32);
        jLabel32.setBounds(185, 220, 90, 90);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("B");
        pan5.add(jLabel33);
        jLabel33.setBounds(160, 630, 20, 17);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("C");
        pan5.add(jLabel34);
        jLabel34.setBounds(1030, 640, 20, 17);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("D");
        pan5.add(jLabel35);
        jLabel35.setBounds(1030, 240, 20, 17);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("E");
        pan5.add(jLabel36);
        jLabel36.setBounds(590, 200, 20, 17);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("A");
        pan5.add(jLabel37);
        jLabel37.setBounds(160, 230, 20, 17);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokenring/5.png"))); // NOI18N
        pan5.add(jLabel27);
        jLabel27.setBounds(200, 190, 790, 550);

        reset5.setText("Reset");
        reset5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset5ActionPerformed(evt);
            }
        });
        pan5.add(reset5);
        reset5.setBounds(270, 150, 79, 25);

        jTabbedPane1.addTab("5 Hosts", pan5);

        pan6.setLayout(null);

        tab6.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "A", null, null, null, null, null, null, null, null },
                        { "B", null, null, null, null, null, null, null, null },
                        { "C", null, null, null, null, null, null, null, null },
                        { "D", null, null, null, null, null, null, null, null },
                        { "E", null, null, null, null, null, null, null, null },
                        { "F", null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "Source", "1", "2", "3", "4", "5", "6", "7", "8"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tab6.getTableHeader().setReorderingAllowed(false);
        span6.setViewportView(tab6);
        if (tab6.getColumnModel().getColumnCount() > 0) {
            tab6.getColumnModel().getColumn(0).setResizable(false);
        }

        pan6.add(span6);
        span6.setBounds(20, 20, 450, 112);

        src6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        src6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                src6ActionPerformed(evt);
            }
        });
        pan6.add(src6);
        src6.setBounds(589, 20, 76, 22);

        jLabel6b.setText("Source");
        pan6.add(jLabel6b);
        jLabel6b.setBounds(537, 20, 40, 16);

        jLabel7b.setText("Dest");
        pan6.add(jLabel7b);
        jLabel7b.setBounds(683, 20, 30, 16);

        dest6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B", "C", "D", "E", "F" }));
        pan6.add(dest6);
        dest6.setBounds(720, 20, 76, 22);

        send6.setText("Send");
        send6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send6ActionPerformed(evt);
            }
        });
        pan6.add(send6);
        send6.setBounds(661, 50, 61, 25);

        start6.setText("Start");
        start6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start6ActionPerformed(evt);
            }
        });
        pan6.add(start6);
        start6.setBounds(170, 150, 79, 25);

        token6.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { "", null }
                },
                new String[] {
                        "Src", "Dest"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        token6p.setViewportView(token6);

        pan6.add(token6p);
        token6p.setBounds(185, 240, 80, 47);

        jLabel28b.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan6.add(jLabel28b);
        jLabel28b.setBounds(185, 615, 90, 90);

        jLabel29b.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan6.add(jLabel29b);
        jLabel29b.setBounds(935, 220, 90, 90);

        jLabel30b.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan6.add(jLabel30b);
        jLabel30b.setBounds(935, 615, 90, 90);

        jLabel31b.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan6.add(jLabel31b);
        jLabel31b.setBounds(550, 220, 90, 90);

        jLabel32b.setIcon(new javax.swing.ImageIcon("E:\\ASSIGNMENT\\SEM5\\CN\\Project\\user.png")); // NOI18N
        pan6.add(jLabel32b);
        jLabel32b.setBounds(185, 220, 90, 90);

        jLabel33b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33b.setText("B");
        pan6.add(jLabel33b);
        jLabel33b.setBounds(160, 630, 20, 17);

        jLabel34b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34b.setText("D");
        pan6.add(jLabel34b);
        jLabel34b.setBounds(1030, 630, 20, 17);

        jLabel35b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35b.setText("E");
        pan6.add(jLabel35b);
        jLabel35b.setBounds(1030, 240, 20, 17);

        jLabel36b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36b.setText("F");
        pan6.add(jLabel36b);
        jLabel36b.setBounds(590, 200, 20, 17);

        jLabel37b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37b.setText("A");
        pan6.add(jLabel37b);
        jLabel37b.setBounds(160, 230, 20, 17);

        jLabel38b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38b.setText("C");
        pan6.add(jLabel38b);
        jLabel38b.setBounds(590, 580, 20, 17);

        jLabel27b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tokenring/6.png"))); // NOI18N
        pan6.add(jLabel27b);
        jLabel27b.setBounds(200, 190, 790, 550);

        reset6.setText("Reset");
        reset6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset6ActionPerformed(evt);
            }
        });
        pan6.add(reset6);
        reset6.setBounds(270, 150, 79, 25);

        // jTabbedPane1.addTab("5 Hosts", pan5);

        jTabbedPane1.addTab("6 Hosts", pan6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1114,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(49, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        for (int i = 0; i < 3; i++)
            for (int j = 1; j <= 8; j++)
                model3.setValueAt("", i, j);
        for (int i = 0; i < 4; i++)
            for (int j = 1; j <= 8; j++)
                model4.setValueAt("", i, j);
        for (int i = 0; i < 5; i++)
            for (int j = 1; j <= 8; j++)
                model5.setValueAt("", i, j);
        for (int i = 0; i < 6; i++)
            for (int j = 1; j <= 8; j++)
                model6.setValueAt("", i, j);

    }// GEN-LAST:event_formWindowOpened

    private void src3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_src3ActionPerformed
        if (src3.getSelectedItem().equals("A")) {
            dest3.removeAllItems();
            dest3.addItem("B");
            dest3.addItem("C");
        } else if (src3.getSelectedItem().equals("B")) {
            dest3.removeAllItems();
            dest3.addItem("A");
            dest3.addItem("C");
        } else if (src3.getSelectedItem().equals("C")) {
            dest3.removeAllItems();
            dest3.addItem("A");
            dest3.addItem("B");
        }
    }// GEN-LAST:event_src3ActionPerformed

    private void src4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_src4ActionPerformed
        if (src4.getSelectedItem().equals("A")) {
            dest4.removeAllItems();
            dest4.addItem("B");
            dest4.addItem("C");
            dest4.addItem("D");
        } else if (src4.getSelectedItem().equals("B")) {
            dest4.removeAllItems();
            dest4.addItem("A");
            dest4.addItem("C");
            dest4.addItem("D");
        } else if (src4.getSelectedItem().equals("C")) {
            dest4.removeAllItems();
            dest4.addItem("A");
            dest4.addItem("B");
            dest4.addItem("D");
        } else if (src4.getSelectedItem().equals("D")) {
            dest4.removeAllItems();
            dest4.addItem("A");
            dest4.addItem("B");
            dest4.addItem("C");
        }
    }// GEN-LAST:event_src4ActionPerformed

    private void src5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_src5ActionPerformed
        if (src5.getSelectedItem().equals("A")) {
            dest5.removeAllItems();
            dest5.addItem("B");
            dest5.addItem("C");
            dest5.addItem("D");
            dest5.addItem("E");
        } else if (src5.getSelectedItem().equals("B")) {
            dest5.removeAllItems();
            dest5.addItem("A");
            dest5.addItem("C");
            dest5.addItem("D");
            dest5.addItem("E");
        } else if (src5.getSelectedItem().equals("C")) {
            dest5.removeAllItems();
            dest5.addItem("A");
            dest5.addItem("B");
            dest5.addItem("D");
            dest5.addItem("E");
        } else if (src5.getSelectedItem().equals("D")) {
            dest5.removeAllItems();
            dest5.addItem("A");
            dest5.addItem("B");
            dest5.addItem("C");
            dest5.addItem("E");
        } else if (src5.getSelectedItem().equals("E")) {
            dest5.removeAllItems();
            dest5.addItem("A");
            dest5.addItem("B");
            dest5.addItem("C");
            dest5.addItem("D");
        }
    }// GEN-LAST:event_src5ActionPerformed

    private void src6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_src6ActionPerformed
        if (src6.getSelectedItem().equals("A")) {
            dest6.removeAllItems();
            dest6.addItem("B");
            dest6.addItem("C");
            dest6.addItem("D");
            dest6.addItem("E");
            dest6.addItem("F");
            
        } else if (src6.getSelectedItem().equals("B")) {
            dest6.removeAllItems();
            dest6.addItem("A");
            dest6.addItem("C");
            dest6.addItem("D");
            dest6.addItem("E");
            dest6.addItem("F");
        } else if (src6.getSelectedItem().equals("C")) {
            dest6.removeAllItems();
            dest6.addItem("A");
            dest6.addItem("B");
            dest6.addItem("D");
            dest6.addItem("E");
            dest6.addItem("F");
        } else if (src6.getSelectedItem().equals("D")) {
            dest6.removeAllItems();
            dest6.addItem("A");
            dest6.addItem("B");
            dest6.addItem("C");
            dest6.addItem("E");
            dest6.addItem("F");
        } else if (src6.getSelectedItem().equals("E")) {
            dest6.removeAllItems();
            dest6.addItem("A");
            dest6.addItem("B");
            dest6.addItem("C");
            dest6.addItem("D");
            dest6.addItem("F");
        } else if (src6.getSelectedItem().equals("F")) {
            dest6.removeAllItems();
            dest6.addItem("A");
            dest6.addItem("B");
            dest6.addItem("C");
            dest6.addItem("D");
            dest6.addItem("E");
        }
    }// GEN-LAST:event_src6ActionPerformed

    private void send4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_send4ActionPerformed
        int next_empty = -1;
        for (int i = 1; i <= 8; i++) {
            if (model4.getValueAt(src4.getSelectedIndex(), i).equals("")) {
                next_empty = i;
                break;
            }
        }
        if (next_empty != -1) {
            model4.setValueAt(dest4.getSelectedItem(), src4.getSelectedIndex(), next_empty);
        }
    }// GEN-LAST:event_send4ActionPerformed

    private void start3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_start3ActionPerformed
        deltax = 0;
        deltay = 1;
        reset4.doClick();
        reset5.doClick();
        reset6.doClick();
        tim3.start();
    }// GEN-LAST:event_start3ActionPerformed

    private void send3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_send3ActionPerformed
        int next_empty = -1;
        for (int i = 1; i <= 8; i++) {
            if (model3.getValueAt(src3.getSelectedIndex(), i).equals("")) {
                next_empty = i;
                break;
            }
        }
        if (next_empty != -1) {
            model3.setValueAt(dest3.getSelectedItem(), src3.getSelectedIndex(), next_empty);
        }
    }// GEN-LAST:event_send3ActionPerformed

    private void start4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_start4ActionPerformed
        deltax = 0;
        deltay = 1;
        reset3.doClick();
        reset5.doClick();
        reset6.doClick();
        tim4.start();
    }// GEN-LAST:event_start4ActionPerformed

    private void start5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_start5ActionPerformed
        deltax = 0;
        deltay = 1;
        reset3.doClick();
        reset4.doClick();
        reset6.doClick();
        tim5.start();
    }// GEN-LAST:event_start5ActionPerformed

    private void send5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_send5ActionPerformed
        int next_empty = -1;
        for (int i = 1; i <= 8; i++) {
            if (model5.getValueAt(src5.getSelectedIndex(), i).equals("")) {
                next_empty = i;
                break;
            }
        }
        if (next_empty != -1) {
            model5.setValueAt(dest5.getSelectedItem(), src5.getSelectedIndex(), next_empty);
        }
    }// GEN-LAST:event_send5ActionPerformed

    private void start6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_start5ActionPerformed
        deltax = 0;
        deltay = 1;
        reset3.doClick();
        reset4.doClick();
        reset5.doClick();
        tim6.start();
    }// GEN-LAST:event_start5ActionPerformed

    private void send6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_send5ActionPerformed
        int next_empty = -1;
        for (int i = 1; i <= 8; i++) {
            if (model6.getValueAt(src6.getSelectedIndex(), i).equals("")) {
                next_empty = i;
                break;
            }
        }
        if (next_empty != -1) {
            model6.setValueAt(dest6.getSelectedItem(), src6.getSelectedIndex(), next_empty);
        }
    }// GEN-LAST:event_send5ActionPerformed

    private void reset3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reset3ActionPerformed
        token3p.setLocation(530, 190);
        for (int i = 0; i < 3; i++)
            for (int j = 1; j <= 8; j++)
                model3.setValueAt("", i, j);
        token3.getModel().setValueAt("", 0, 0);
        token3.getModel().setValueAt("", 0, 1);
        tim3.stop();
    }// GEN-LAST:event_reset3ActionPerformed

    private void reset4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reset4ActionPerformed
        token4p.setLocation(320, 220);
        for (int i = 0; i < 4; i++)
            for (int j = 1; j <= 8; j++)
                model4.setValueAt("", i, j);
        token4.getModel().setValueAt("", 0, 0);
        token4.getModel().setValueAt("", 0, 1);
        tim4.stop();
    }// GEN-LAST:event_reset4ActionPerformed

    private void reset5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reset5ActionPerformed
        token5p.setLocation(185, 240);
        for (int i = 0; i < 5; i++)
            for (int j = 1; j <= 8; j++)
                model5.setValueAt("", i, j);
        token5.getModel().setValueAt("", 0, 0);
        token5.getModel().setValueAt("", 0, 1);
        tim5.stop();
    }// GEN-LAST:event_reset5ActionPerformed

    private void reset6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_reset6ActionPerformed
        token6p.setLocation(185, 240);
        for (int i = 0; i < 6; i++) // se tira esto
            for (int j = 1; j <= 8; j++)
                model6.setValueAt("", i, j);
        token6.getModel().setValueAt("", 0, 0);
        token6.getModel().setValueAt("", 0, 1);
        tim6.stop();
    }// GEN-LAST:event_reset6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TokenRingProtocol.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TokenRingProtocol.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TokenRingProtocol.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TokenRingProtocol.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokenRingProtocol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dest3;
    private javax.swing.JComboBox<String> dest4;
    private javax.swing.JComboBox<String> dest5;
    private javax.swing.JComboBox<String> dest6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pan3;
    private javax.swing.JPanel pan4;
    private javax.swing.JPanel pan5;
    private javax.swing.JPanel pan6;
    private javax.swing.JButton reset3;
    private javax.swing.JButton reset4;
    private javax.swing.JButton reset5;
    private javax.swing.JButton reset6;
    private javax.swing.JButton send3;
    private javax.swing.JButton send4;
    private javax.swing.JButton send5;
    private javax.swing.JButton send6;
    private javax.swing.JScrollPane span3;
    private javax.swing.JScrollPane span4;
    private javax.swing.JScrollPane span5;
    private javax.swing.JScrollPane span6;
    private javax.swing.JComboBox<String> src3;
    private javax.swing.JComboBox<String> src4;
    private javax.swing.JComboBox<String> src5;
    private javax.swing.JComboBox<String> src6;
    private javax.swing.JButton start3;
    private javax.swing.JButton start4;
    private javax.swing.JButton start5;
    private javax.swing.JButton start6;
    private javax.swing.JTable tab3;
    private javax.swing.JTable tab4;
    private javax.swing.JTable tab5;
    private javax.swing.JTable tab6;
    private javax.swing.JTable token3;
    private javax.swing.JScrollPane token3p;
    private javax.swing.JTable token4;
    private javax.swing.JScrollPane token4p;
    private javax.swing.JTable token5;
    private javax.swing.JScrollPane token5p;
    private javax.swing.JTable token6;
    private javax.swing.JScrollPane token6p;

    private javax.swing.JLabel jLabel6b;
    private javax.swing.JLabel jLabel7b;
    private javax.swing.JLabel jLabel27b;
    private javax.swing.JLabel jLabel28b;
    private javax.swing.JLabel jLabel29b;
    private javax.swing.JLabel jLabel3b;
    private javax.swing.JLabel jLabel30b;
    private javax.swing.JLabel jLabel31b;
    private javax.swing.JLabel jLabel32b;
    private javax.swing.JLabel jLabel33b;
    private javax.swing.JLabel jLabel34b;
    private javax.swing.JLabel jLabel35b;
    private javax.swing.JLabel jLabel36b;
    private javax.swing.JLabel jLabel37b;
    private javax.swing.JLabel jLabel38b;

    // End of variables declaration//GEN-END:variables
}
