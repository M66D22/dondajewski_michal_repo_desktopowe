/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listazakupow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Michał
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        addKeyListrenerTo_md_jTextFieldWpiszCoKupiles();
        addKeyListenerTo_md_jTextFieldPodajWartosc();
        addKeyLitenerTo_md_jTextFieldPodajDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        md_jPanelWprowadzZakupy = new javax.swing.JPanel();
        md_jLabelWpiszCoKupiles = new javax.swing.JLabel();
        md_jTextFieldWpiszCoKupiles = new javax.swing.JTextField();
        md_jLabelPodajWartosc = new javax.swing.JLabel();
        md_jTextFieldPodajWartosc = new javax.swing.JTextField();
        md_jLabelTypZakupu = new javax.swing.JLabel();
        md_jComboBoxTypZakupu = new javax.swing.JComboBox<>();
        md_jLabelDataZakupu = new javax.swing.JLabel();
        md_jTextFieldDataZakupu = new javax.swing.JTextField();
        md_jLabelDzisiejszeZakupy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        md_jTextAreaMain = new javax.swing.JTextArea();
        md_jLabelWydatkiZDzisiaj = new javax.swing.JLabel();
        md_jButtonZapisz = new javax.swing.JButton();
        md_jTextFieldWydatkiZDzisiaj = new javax.swing.JTextField();
        md_jLabelWydastkiZTygodnia = new javax.swing.JLabel();
        md_jTextFieldWydatkiZTygodnia = new javax.swing.JTextField();
        md_jPanelListaZakupow = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        md_jLabelWpiszCoKupiles.setText("Wpisz co kupiłeś");

        md_jLabelPodajWartosc.setText("Podaj wartość");

        md_jLabelTypZakupu.setText("Typ zakupionego towaru");

        md_jComboBoxTypZakupu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        md_jLabelDataZakupu.setText("Data zakupu");

        md_jLabelDzisiejszeZakupy.setText("Dzisiejsze zakupy");

        md_jTextAreaMain.setEditable(false);
        md_jTextAreaMain.setColumns(20);
        md_jTextAreaMain.setRows(5);
        jScrollPane1.setViewportView(md_jTextAreaMain);

        md_jLabelWydatkiZDzisiaj.setText("Wydatki z dzisiaj:");

        md_jButtonZapisz.setText("Zapisz");
        md_jButtonZapisz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                md_jButtonZapiszActionPerformed(evt);
            }
        });

        md_jLabelWydastkiZTygodnia.setText("Wydatki z tygodnia:");

        javax.swing.GroupLayout md_jPanelWprowadzZakupyLayout = new javax.swing.GroupLayout(md_jPanelWprowadzZakupy);
        md_jPanelWprowadzZakupy.setLayout(md_jPanelWprowadzZakupyLayout);
        md_jPanelWprowadzZakupyLayout.setHorizontalGroup(
            md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addComponent(md_jLabelDzisiejszeZakupy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(md_jButtonZapisz))
                    .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(md_jLabelWpiszCoKupiles)
                                    .addComponent(md_jTextFieldWpiszCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(md_jTextFieldPodajWartosc)
                                    .addComponent(md_jLabelPodajWartosc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(md_jLabelTypZakupu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(md_jComboBoxTypZakupu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                                        .addComponent(md_jLabelDataZakupu)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(md_jTextFieldDataZakupu)))
                            .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                                .addComponent(md_jLabelWydastkiZTygodnia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(md_jTextFieldWydatkiZTygodnia))
                            .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                                .addComponent(md_jLabelWydatkiZDzisiaj)
                                .addGap(18, 18, 18)
                                .addComponent(md_jTextFieldWydatkiZDzisiaj, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        md_jPanelWprowadzZakupyLayout.setVerticalGroup(
            md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(md_jLabelWpiszCoKupiles)
                    .addComponent(md_jLabelPodajWartosc)
                    .addComponent(md_jLabelTypZakupu)
                    .addComponent(md_jLabelDataZakupu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(md_jTextFieldWpiszCoKupiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(md_jTextFieldPodajWartosc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(md_jComboBoxTypZakupu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(md_jTextFieldDataZakupu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(md_jLabelDzisiejszeZakupy)
                    .addComponent(md_jButtonZapisz))
                .addGap(18, 18, 18)
                .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(md_jPanelWprowadzZakupyLayout.createSequentialGroup()
                        .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(md_jLabelWydatkiZDzisiaj)
                            .addComponent(md_jTextFieldWydatkiZDzisiaj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(md_jPanelWprowadzZakupyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(md_jLabelWydastkiZTygodnia)
                            .addComponent(md_jTextFieldWydatkiZTygodnia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Wprowadź zakupy", md_jPanelWprowadzZakupy);

        javax.swing.GroupLayout md_jPanelListaZakupowLayout = new javax.swing.GroupLayout(md_jPanelListaZakupow);
        md_jPanelListaZakupow.setLayout(md_jPanelListaZakupowLayout);
        md_jPanelListaZakupowLayout.setHorizontalGroup(
            md_jPanelListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        md_jPanelListaZakupowLayout.setVerticalGroup(
            md_jPanelListaZakupowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Lista zakupów", md_jPanelListaZakupow);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String coKupiles,Cena, Data, Typ;
    int Wartosc;
    String zapis;
    String AktualnyText = "";
    private void md_jButtonZapiszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_md_jButtonZapiszActionPerformed
        coKupiles = md_jTextFieldWpiszCoKupiles.getText();
        Cena = md_jTextFieldPodajWartosc.getText();
        Data = md_jTextFieldDataZakupu.getText();
        Typ = (String) md_jComboBoxTypZakupu.getSelectedItem();
        AktualnyText = md_jTextAreaMain.getText();
        
        zapis = ""+coKupiles+"; "+Cena+"; "+Typ+"; "+Data;
        AktualnyText = AktualnyText + zapis + "\n";
        md_jTextAreaMain.setText(AktualnyText);
        
        md_jTextFieldWpiszCoKupiles.setText("");
        md_jTextFieldPodajWartosc.setText("");
        md_jComboBoxTypZakupu.setSelectedIndex(0);
        md_jTextFieldDataZakupu.setText("");
        
    }//GEN-LAST:event_md_jButtonZapiszActionPerformed
    
    private void addKeyListrenerTo_md_jTextFieldWpiszCoKupiles(){
        md_jTextFieldWpiszCoKupiles.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char znak = e.getKeyChar();
                int kod = (int) znak;
                
                
                if(znak == KeyEvent.VK_ENTER){
                    System.out.println("Enter");
                    md_jTextAreaMain.setText(md_jTextFieldWpiszCoKupiles.getText());
                }
                
                if (znak == KeyEvent.VK_SPACE || kod >= 97 && kod <= 199 || kod >= 65 && kod <= 89 || znak == KeyEvent.VK_BACK_SPACE){
                    md_jTextFieldWpiszCoKupiles.setEditable(true);
                }
                else{
                    md_jTextFieldWpiszCoKupiles.setEditable(false);
                }
                
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    
    private void addKeyListenerTo_md_jTextFieldPodajWartosc(){
        md_jTextFieldPodajWartosc.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char znak = e.getKeyChar();
                if (znak >= '0' && znak <= '9' || znak == KeyEvent.VK_BACK_SPACE){
                    //Wpisany dobry znak
                    md_jTextFieldPodajWartosc.setEditable(true);   
                }
                else {
                    //Wpisany zły znak
                    md_jTextFieldPodajWartosc.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
    }
    
    private void addKeyLitenerTo_md_jTextFieldPodajDate() {
        md_jTextFieldDataZakupu.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char znak = e.getKeyChar();
                if (znak >= '0' && znak <= '9' || znak == KeyEvent.VK_BACK_SPACE){
                    //Wpisany dobry znak
                    md_jTextFieldDataZakupu.setEditable(true);   
                }
                else {
                    //Wpisany zły znak
                    md_jTextFieldDataZakupu.setEditable(false);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            } 
        });
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton md_jButtonZapisz;
    private javax.swing.JComboBox<String> md_jComboBoxTypZakupu;
    private javax.swing.JLabel md_jLabelDataZakupu;
    private javax.swing.JLabel md_jLabelDzisiejszeZakupy;
    private javax.swing.JLabel md_jLabelPodajWartosc;
    private javax.swing.JLabel md_jLabelTypZakupu;
    private javax.swing.JLabel md_jLabelWpiszCoKupiles;
    private javax.swing.JLabel md_jLabelWydastkiZTygodnia;
    private javax.swing.JLabel md_jLabelWydatkiZDzisiaj;
    private javax.swing.JPanel md_jPanelListaZakupow;
    private javax.swing.JPanel md_jPanelWprowadzZakupy;
    private javax.swing.JTextArea md_jTextAreaMain;
    private javax.swing.JTextField md_jTextFieldDataZakupu;
    private javax.swing.JTextField md_jTextFieldPodajWartosc;
    private javax.swing.JTextField md_jTextFieldWpiszCoKupiles;
    private javax.swing.JTextField md_jTextFieldWydatkiZDzisiaj;
    private javax.swing.JTextField md_jTextFieldWydatkiZTygodnia;
    // End of variables declaration//GEN-END:variables
}
