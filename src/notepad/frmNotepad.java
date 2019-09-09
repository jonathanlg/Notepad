package notepad;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Jonathan
 */
public class frmNotepad extends javax.swing.JFrame {

    protected UndoManager undoManager = new UndoManager();

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo de texto (*.txt)", "txt");
    String titulo = "Bloc de Notas";
    String nombreArchivo;
    String ruta = "";
    int longitud;
    int row;
    boolean estado = false;

    static BufferedReader reader = null;
    static JFileChooser file = new JFileChooser();
    static File fichero;
    static int seleccion;
    static String retornoDeCarro = System.getProperty("line.separator");
    static String texto;
    static PrintWriter writer = null;

    /**
     * Creates new form frmNotepad
     */
    public frmNotepad() {
        initComponents();
        cargarIcono();
        longitud = 0;
        txaSalida.requestFocus();
        this.setTitle("Sin título : " + titulo);
        lblBarraEstado.setVisible(false);
        jSeparator3.setVisible(false);
        deshabilitar();
        pnlHerramientas.setVisible(false);
        estado = false;
        System.out.println(estado);

        //Leer los eventos rehacer y deshacer
        txaSalida.getDocument().addUndoableEditListener(
                new UndoableEditListener() {

                    @Override
                    public void undoableEditHappened(UndoableEditEvent e) {
                        undoManager.addEdit(e.getEdit());
                    }
                }
        );

        //Metodos para deshacer Ctrl + Z
        mnDeshacer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (txaSalida.getText().length() != 0) {
                        undoManager.undo();
                    }
                } catch (CannotUndoException cre) {
                    System.out.println(cre.toString());
                }
            }
        });
        //----------------------------------------------

        //Metodo para rehacer Ctrl + Y
        mnRehacer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    undoManager.redo();
                } catch (CannotRedoException cre) {
                    System.out.println(cre.toString());
                }
            }
        });

        //------------------------
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEmergente = new javax.swing.JPopupMenu();
        mbnDeshacer = new javax.swing.JMenuItem();
        mbnCortar = new javax.swing.JMenuItem();
        mbnCopiar = new javax.swing.JMenuItem();
        mbnPegar = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mbnSelecAll = new javax.swing.JMenuItem();
        mbnAlinear = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSalida = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        lblBarraEstado = new javax.swing.JLabel();
        pnlHerramientas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbEstilo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbTamaño = new javax.swing.JComboBox();
        lblFuente = new javax.swing.JLabel();
        cbFuente = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnbNuevo = new javax.swing.JMenuItem();
        mnbAbrir = new javax.swing.JMenuItem();
        mnbGuardar = new javax.swing.JMenuItem();
        mnbGuardarComo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnDeshacer = new javax.swing.JMenuItem();
        mnRehacer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnbCortar = new javax.swing.JMenuItem();
        mnbCopiar = new javax.swing.JMenuItem();
        mnbPegar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnBuscar = new javax.swing.JMenuItem();
        mnbReeplazar = new javax.swing.JMenuItem();
        mnbIrA = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnbSelecAll = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnbFuente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnbHerramientas = new javax.swing.JMenuItem();
        mnbEstado = new javax.swing.JMenuItem();

        mbnDeshacer.setText("Deshacer");
        menuEmergente.add(mbnDeshacer);

        mbnCortar.setText("Cortar");
        mbnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbnCortarActionPerformed(evt);
            }
        });
        menuEmergente.add(mbnCortar);

        mbnCopiar.setText("Copiar");
        mbnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbnCopiarActionPerformed(evt);
            }
        });
        menuEmergente.add(mbnCopiar);

        mbnPegar.setText("Pegar");
        mbnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbnPegarActionPerformed(evt);
            }
        });
        menuEmergente.add(mbnPegar);
        menuEmergente.add(jSeparator5);

        mbnSelecAll.setText("Seleccionar Todo");
        mbnSelecAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbnSelecAllActionPerformed(evt);
            }
        });
        menuEmergente.add(mbnSelecAll);

        mbnAlinear.setText("Alinear");
        mbnAlinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbnAlinearActionPerformed(evt);
            }
        });
        menuEmergente.add(mbnAlinear);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bloc de Notas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        txaSalida.setColumns(20);
        txaSalida.setRows(5);
        txaSalida.setComponentPopupMenu(menuEmergente);
        txaSalida.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txaSalidaCaretUpdate(evt);
            }
        });
        txaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txaSalidaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txaSalida);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblBarraEstado.setText("Lineas : 1 , Columnas : 1");

        pnlHerramientas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setLayout(new java.awt.GridLayout(1, 6));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tp_new.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo);

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tp_open.png"))); // NOI18N
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrir);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tp_save.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar);

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tp_copy.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCopiar);

        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tp_cut.png"))); // NOI18N
        btnCortar.setToolTipText("Cortar");
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCortar);

        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tp_paste.png"))); // NOI18N
        btnPegar.setToolTipText("Pegar");
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPegar);

        jLabel3.setText("Estilo");

        cbEstilo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Negrita", "Italic", "Negrita Italic" }));
        cbEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstiloActionPerformed(evt);
            }
        });

        jLabel2.setText("Tamaño");

        cbTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "28", "72" }));
        cbTamaño.setSelectedIndex(4);
        cbTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTamañoActionPerformed(evt);
            }
        });

        lblFuente.setText("Fuente");

        cbFuente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monospaced", "Arial", "Arial Black", "Garamond", "Comic sans MS", "Times New Roman" }));
        cbFuente.setSelectedIndex(1);
        cbFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHerramientasLayout = new javax.swing.GroupLayout(pnlHerramientas);
        pnlHerramientas.setLayout(pnlHerramientasLayout);
        pnlHerramientasLayout.setHorizontalGroup(
            pnlHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHerramientasLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFuente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlHerramientasLayout.setVerticalGroup(
            pnlHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHerramientasLayout.createSequentialGroup()
                .addGroup(pnlHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFuente)
                        .addComponent(cbFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cbTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cbEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        mnbNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnbNuevo.setText("Nuevo");
        mnbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mnbNuevo);

        mnbAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnbAbrir.setText("Abrir");
        mnbAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mnbAbrir);

        mnbGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnbGuardar.setText("Guardar");
        mnbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(mnbGuardar);

        mnbGuardarComo.setText("Guardar Como...");
        mnbGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(mnbGuardarComo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");

        mnDeshacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        mnDeshacer.setText("Deshacer");
        jMenu2.add(mnDeshacer);

        mnRehacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        mnRehacer.setText("Rehacer");
        jMenu2.add(mnRehacer);
        jMenu2.add(jSeparator1);

        mnbCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnbCortar.setText("Cortar");
        mnbCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbCortarActionPerformed(evt);
            }
        });
        jMenu2.add(mnbCortar);

        mnbCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnbCopiar.setText("Copiar");
        mnbCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbCopiarActionPerformed(evt);
            }
        });
        jMenu2.add(mnbCopiar);

        mnbPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnbPegar.setText("Pegar");
        mnbPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbPegarActionPerformed(evt);
            }
        });
        jMenu2.add(mnbPegar);
        jMenu2.add(jSeparator2);

        mnBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnBuscar.setText("Buscar");
        mnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBuscarActionPerformed(evt);
            }
        });
        jMenu2.add(mnBuscar);

        mnbReeplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnbReeplazar.setText("Reemplazar...");
        mnbReeplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbReeplazarActionPerformed(evt);
            }
        });
        jMenu2.add(mnbReeplazar);

        mnbIrA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        mnbIrA.setText("Ir a...");
        mnbIrA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbIrAActionPerformed(evt);
            }
        });
        jMenu2.add(mnbIrA);
        jMenu2.add(jSeparator4);

        mnbSelecAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnbSelecAll.setText("Seleccionar Todo");
        mnbSelecAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbSelecAllActionPerformed(evt);
            }
        });
        jMenu2.add(mnbSelecAll);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Formato");

        mnbFuente.setText("Fuente...");
        mnbFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbFuenteActionPerformed(evt);
            }
        });
        jMenu3.add(mnbFuente);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ver");

        mnbHerramientas.setText("Barra de Herramientas");
        mnbHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbHerramientasActionPerformed(evt);
            }
        });
        jMenu4.add(mnbHerramientas);

        mnbEstado.setText("Barra de Estado");
        mnbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbEstadoActionPerformed(evt);
            }
        });
        jMenu4.add(mnbEstado);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 585, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBarraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3)
                    .addComponent(lblBarraEstado)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        if (estado == true) {
            int rpta = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios hechos en el documento", "Confirmar", 0);
            if (rpta == 0) {
                guardar();
            } else {
                estado = true;
            }
        } else {
            txaSalida.setText("");
            this.setTitle(": " + titulo);
            estado = false;
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuenteActionPerformed
        // TODO add your handling code here:
        darFormato();
    }//GEN-LAST:event_cbFuenteActionPerformed

    private void cbEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstiloActionPerformed
        // TODO add your handling code here:
        darFormato();
    }//GEN-LAST:event_cbEstiloActionPerformed

    private void cbTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTamañoActionPerformed
        // TODO add your handling code here:
        darFormato();
    }//GEN-LAST:event_cbTamañoActionPerformed

    private void mnbGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbGuardarComoActionPerformed
        // TODO add your handling code here:
        guardarComo();
        longitud = txaSalida.getText().length();
        estado = false;
    }//GEN-LAST:event_mnbGuardarComoActionPerformed

    private void mnbAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbAbrirActionPerformed
        // TODO add your handling code here:
        if (estado == true) {
            int rpta = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios hechos en el documento", "Confirmar", 0);
            if (rpta == 0) {
                guardar();
                abrir();
            } else {
                abrir();
                longitud = txaSalida.getText().length();
                System.out.println("Lineas : " + row);
                estado = false;
            }
        } else {
            abrir();
            this.setTitle(file.getName(fichero)+" : " + titulo);
            longitud = txaSalida.getText().length();
            System.out.println("Lineas : " + row);
            estado = false;
        }
    }//GEN-LAST:event_mnbAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
        estado = false;
        longitud = txaSalida.getText().length();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void mnbFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbFuenteActionPerformed
        // TODO add your handling code here:
        dlgFuente dlgF = new dlgFuente(this, true);
        dlgF.setLocationRelativeTo(null);
        dlgF.setVisible(true);
    }//GEN-LAST:event_mnbFuenteActionPerformed

    private void mnbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbEstadoActionPerformed
        // TODO add your handling code here:
        String estado = mnbEstado.getText();
        if (estado.equalsIgnoreCase("Barra de Estado")) {
            lblBarraEstado.setVisible(true);
            jSeparator3.setVisible(true);
            mnbEstado.setText("Ocultar Barra de Estado");
        } else {
            lblBarraEstado.setVisible(false);
            jSeparator3.setVisible(false);
            mnbEstado.setText("Barra de Estado");
        }
    }//GEN-LAST:event_mnbEstadoActionPerformed

    private void mnbSelecAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbSelecAllActionPerformed
        // TODO add your handling code here:
        txaSalida.selectAll();
    }//GEN-LAST:event_mnbSelecAllActionPerformed

    private void txaSalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txaSalidaKeyReleased
        // TODO add your handling code here:
        deshabilitar();
        estado = true;
        longitud = txaSalida.getText().length();
    }//GEN-LAST:event_txaSalidaKeyReleased

    private void mnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBuscarActionPerformed
        // TODO add your handling code here:
        dlgBuscar b = new dlgBuscar(this, false);
        b.setLocationRelativeTo(null);
        b.setVisible(true);
    }//GEN-LAST:event_mnBuscarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        // TODO add your handling code here:
        txaSalida.copy();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        // TODO add your handling code here:
        txaSalida.paste();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        // TODO add your handling code here:
        txaSalida.cut();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void mnbCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbCortarActionPerformed
        // TODO add your handling code here:
        txaSalida.cut();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_mnbCortarActionPerformed

    private void mnbCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbCopiarActionPerformed
        // TODO add your handling code here:
        txaSalida.copy();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_mnbCopiarActionPerformed

    private void mnbPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbPegarActionPerformed
        // TODO add your handling code here:
        txaSalida.paste();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_mnbPegarActionPerformed

    private void mnbReeplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbReeplazarActionPerformed
        // TODO add your handling code here:
        dlgReemplazar rem = new dlgReemplazar(this, false);
        rem.setLocationRelativeTo(null);
        rem.setVisible(true);
    }//GEN-LAST:event_mnbReeplazarActionPerformed

    private void mnbIrAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbIrAActionPerformed
        // TODO add your handling code here:
        String num = JOptionPane.showInputDialog(this, "Ingrese la fila a buscar");
    }//GEN-LAST:event_mnbIrAActionPerformed

    private void txaSalidaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txaSalidaCaretUpdate
        // TODO add your handling code here:
        int pos = evt.getDot();
        try {
            row = txaSalida.getLineOfOffset(pos) + 1;
            int col = pos - txaSalida.getLineStartOffset(row - 1) + 1;
            lblBarraEstado.setText("Lineas : " + row + " , Columnas : " + col);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txaSalidaCaretUpdate

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        String cad = txaSalida.getText();
        int longi = cad.length();
        try {
            if (estado == true && longitud != 0) {//Se hizo cambios en el documento
                int rpta = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios hechos en el documento", "Confirmar", 0);
                if (rpta == 0) {
                    guardar();
                } else {
                    System.exit(0);
                }
            } else {
                //No se realizo algun cambio
            }

        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_formWindowClosing

    private void mnbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbNuevoActionPerformed
        // TODO add your handling code here:
        if (estado == true) {
            int rpta = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios hechos en el documento", "Confirmar", 0);
            if (rpta == 0) {
                guardar();
            } else {
                estado = true;
            }
        } else {
            txaSalida.setText("");
            this.setTitle(": " + titulo);
            estado = false;
        }
    }//GEN-LAST:event_mnbNuevoActionPerformed

    private void mnbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbGuardarActionPerformed
        guardar();
        estado = false;
        longitud = txaSalida.getText().length();
    }//GEN-LAST:event_mnbGuardarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        // TODO add your handling code here:
        if (estado == true) {
            int rpta = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios hechos en el documento", "Confirmar", 0);
            if (rpta == 0) {
                guardar();
            } else {
                abrir();
                this.setTitle(": " + titulo);
                longitud = txaSalida.getText().length();
                System.out.println("Lineas : " + row);
                estado = false;
            }
        } else {
            abrir();
            this.setTitle(file.getName(fichero)+" : " + titulo);
            longitud = txaSalida.getText().length();
            System.out.println("Lineas : " + row);
            estado = false;
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void mnbHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbHerramientasActionPerformed
        // TODO add your handling code here:
        String herramientas = mnbHerramientas.getText();
        if (herramientas.equalsIgnoreCase("Barra de Herramientas")) {
            pnlHerramientas.setVisible(true);
            mnbHerramientas.setText("Ocultar Barra de Herramientas");
        } else {
            pnlHerramientas.setVisible(false);
            mnbHerramientas.setText("Barra de Herramientas");
        }
    }//GEN-LAST:event_mnbHerramientasActionPerformed

    private void mbnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbnCopiarActionPerformed
        // TODO add your handling code here:
        txaSalida.copy();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_mbnCopiarActionPerformed

    private void mbnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbnCortarActionPerformed
        // TODO add your handling code here:
        txaSalida.cut();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_mbnCortarActionPerformed

    private void mbnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbnPegarActionPerformed
        // TODO add your handling code here:
        txaSalida.paste();
        deshabilitar();
        txaSalida.requestFocus();
    }//GEN-LAST:event_mbnPegarActionPerformed

    private void mbnSelecAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbnSelecAllActionPerformed
        // TODO add your handling code here:
        txaSalida.selectAll();
    }//GEN-LAST:event_mbnSelecAllActionPerformed

    private void mbnAlinearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbnAlinearActionPerformed
        // TODO add your handling code here:
        if (mbnAlinear.getText().equals("Alinear")) {
            txaSalida.setLineWrap(true);
            mbnAlinear.setText("Deshalinear");
        } else {
            txaSalida.setLineWrap(false);
            mbnAlinear.setText("Alinear");
        }
    }//GEN-LAST:event_mbnAlinearActionPerformed

    /*Funciones*/
    public void guardar() {
        try {
            FileWriter fos = new FileWriter(ruta);
            PrintWriter out = new PrintWriter(fos);
            if (out != null) {
                out.println(txaSalida.getText());
                out.close();
            }
        } catch (IOException e) {
            guardarComo();
        }
    }

    public void guardarComo() {
        file = new JFileChooser();
        file.setFileFilter(filter);
        int opcion = file.showSaveDialog(null);
        File s = null;
        if (opcion == JFileChooser.APPROVE_OPTION) {
            s = file.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(s);
                BufferedWriter bw = new BufferedWriter(fw);
                if (txaSalida.getText().length() > 0) {
                    fw.write(txaSalida.getText());
                    ruta = String.valueOf(s);
                }
                fw.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al crear el archivo");
            }
        } else {
            //s = "Operacion Cancelada";
        }
    }

    public void abrir() {
        seleccion = file.showOpenDialog(txaSalida);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            fichero = file.getSelectedFile();
            ruta = String.valueOf(fichero);
            try {
                reader = new BufferedReader(new FileReader(fichero));
                String lineaTotal = "";
                texto = reader.readLine();
                while (texto != null) {
                    lineaTotal = lineaTotal + texto + System.getProperty("line.separator");
                    texto = reader.readLine();
                }
                txaSalida.setText(lineaTotal.toString());
                reader.close();
            } catch (Exception e) {
            }
        }
    }
    /*------------------------*/

    /*Formato a fuente*/
    public void darFormato() {
        String fuente = Estilo.leeFuente1(cbFuente);
        int estilo = Estilo.leeEstilo1(cbEstilo);
        int tamaño = Estilo.leeTamaño1(cbTamaño);
        Font miFuente = new Font(fuente, estilo, tamaño);
        txaSalida.setFont(miFuente);
    }
    /*-----------------*/

    /*Deshabilitar Botones*/
    void deshabilitar() {
        if (txaSalida.getText().trim().length() == 0) {
            mnBuscar.setEnabled(false);
            mbnCopiar.setEnabled(false);
            mbnCortar.setEnabled(false);
            btnCopiar.setEnabled(false);
            btnCortar.setEnabled(false);
            mnbCopiar.setEnabled(false);
            mnbCortar.setEnabled(false);
            mnDeshacer.setEnabled(false);
        } else {
            mnBuscar.setEnabled(true);
            mbnCopiar.setEnabled(true);
            mbnCortar.setEnabled(true);
            btnCopiar.setEnabled(true);
            btnCortar.setEnabled(true);
            mnbCopiar.setEnabled(true);
            mnbPegar.setEnabled(true);
            mnbCortar.setEnabled(true);
            mnDeshacer.setEnabled(true);
        }
    }
    /*----------------------*/

    /*------Cargar Icono---------*/
    void cargarIcono() {
        try {
            java.awt.Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/Notepad.png"));
            setIconImage(icon);
            setVisible(true);
            this.setLocationRelativeTo(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"No se pudo cargo icono");
        }
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
            java.util.logging.Logger.getLogger(frmNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNotepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPegar;
    private javax.swing.JComboBox cbEstilo;
    private javax.swing.JComboBox cbFuente;
    private javax.swing.JComboBox cbTamaño;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel lblBarraEstado;
    private javax.swing.JLabel lblFuente;
    private javax.swing.JMenuItem mbnAlinear;
    private javax.swing.JMenuItem mbnCopiar;
    private javax.swing.JMenuItem mbnCortar;
    private javax.swing.JMenuItem mbnDeshacer;
    private javax.swing.JMenuItem mbnPegar;
    private javax.swing.JMenuItem mbnSelecAll;
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuItem mnBuscar;
    private javax.swing.JMenuItem mnDeshacer;
    private javax.swing.JMenuItem mnRehacer;
    private javax.swing.JMenuItem mnbAbrir;
    private javax.swing.JMenuItem mnbCopiar;
    private javax.swing.JMenuItem mnbCortar;
    private javax.swing.JMenuItem mnbEstado;
    private javax.swing.JMenuItem mnbFuente;
    private javax.swing.JMenuItem mnbGuardar;
    private javax.swing.JMenuItem mnbGuardarComo;
    private javax.swing.JMenuItem mnbHerramientas;
    private javax.swing.JMenuItem mnbIrA;
    private javax.swing.JMenuItem mnbNuevo;
    private javax.swing.JMenuItem mnbPegar;
    private javax.swing.JMenuItem mnbReeplazar;
    private javax.swing.JMenuItem mnbSelecAll;
    private javax.swing.JPanel pnlHerramientas;
    public static javax.swing.JTextArea txaSalida;
    // End of variables declaration//GEN-END:variables
}
