package notepad;

import java.awt.Font;

/**
 *
 * @author Jonathan
 */
public class dlgFuente extends javax.swing.JDialog {

    public dlgFuente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarListas();
    }

    void inicializarListas() {
        lsTamaño.setSelectedIndex(4);
        lsEstilo.setSelectedIndex(1);
        lsFuente.setSelectedIndex(1);
        txtTamaño.setText(String.valueOf(lsTamaño.getSelectedValue()));
        txtFuente.setText(String.valueOf(lsFuente.getSelectedValue()));
        txtEstilo.setText(String.valueOf(lsEstilo.getSelectedValue()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFuente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsFuente = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtEstilo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lsEstilo = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtTamaño = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lsTamaño = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        lblMuestra = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fuente");

        jLabel1.setText("Fuente:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);
        jPanel1.add(txtFuente);
        txtFuente.setBounds(0, 0, 140, 20);

        lsFuente.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Monospaced", "Arial", "Arial Black", "Garamond", "Comic sans MS", "Times New Roman" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lsFuente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsFuenteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsFuente);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 20, 140, 140);

        jLabel2.setText("Estilo:");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);
        jPanel2.add(txtEstilo);
        txtEstilo.setBounds(0, 0, 120, 20);

        lsEstilo.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Normal", "Negrita", "Italic", "Negrita Italic" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lsEstilo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsEstiloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lsEstilo);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(0, 20, 120, 140);

        jLabel3.setText("Tamaño:");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);
        jPanel3.add(txtTamaño);
        txtTamaño.setBounds(0, 0, 60, 20);

        lsTamaño.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "28", "72" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lsTamaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsTamañoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lsTamaño);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(0, 20, 60, 140);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Muestra"));

        lblMuestra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMuestra.setText("Texto de muestra");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lsEstiloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsEstiloMouseClicked
        // TODO add your handling code here:
        txtEstilo.setText(String.valueOf(lsEstilo.getSelectedValue().toString()));
        darFormato();
    }//GEN-LAST:event_lsEstiloMouseClicked

    private void lsTamañoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsTamañoMouseClicked
        // TODO add your handling code here:
        txtTamaño.setText(String.valueOf(lsTamaño.getSelectedValue().toString()));
        darFormato();
    }//GEN-LAST:event_lsTamañoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        darFormato2();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lsFuenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsFuenteMouseClicked
        // TODO add your handling code here:
        txtFuente.setText(String.valueOf(lsFuente.getSelectedValue().toString()));
        darFormato();
    }//GEN-LAST:event_lsFuenteMouseClicked

    public void darFormato() {
        String fuente = Estilo.leeFuente2(txtFuente);
        int estilo = Estilo.leeEstilo2(lsEstilo);
        int tamaño = Estilo.leeTamaño2(txtTamaño);
        Font miFuente = new Font(fuente, estilo, tamaño);
        lblMuestra.setFont(miFuente);
    }

    public void darFormato2() {
        String fuente = Estilo.leeFuente2(txtFuente);
        int estilo = Estilo.leeEstilo2(lsEstilo);
        int tamaño = Estilo.leeTamaño2(txtTamaño);
        Font miFuente = new Font(fuente, estilo, tamaño);
        frmNotepad.txaSalida.setFont(miFuente);
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
            java.util.logging.Logger.getLogger(dlgFuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgFuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgFuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgFuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgFuente dialog = new dlgFuente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMuestra;
    private javax.swing.JList lsEstilo;
    private javax.swing.JList lsFuente;
    private javax.swing.JList lsTamaño;
    private javax.swing.JTextField txtEstilo;
    private javax.swing.JTextField txtFuente;
    private javax.swing.JTextField txtTamaño;
    // End of variables declaration//GEN-END:variables
}
