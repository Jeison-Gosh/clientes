package IU;

import daoclienteimpl.ClienteImpl;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import modelos.Cliente;

public class UI extends javax.swing.JFrame {

    private ClienteImpl ci;

    public UI() throws SQLException {
        initComponents();
        restringirCampos();

        this.setTitle("Cliente");
        ci = new ClienteImpl();
        jcbtipocliente.removeAllItems();
        jcbtipocliente.addItem("Persona natural");
        jcbtipocliente.addItem("Persona juridica");

        this.setResizable(false);

        LabelClientes.setFont(new Font("Arial", Font.BOLD, 30));
        LabelClientes.setHorizontalAlignment(SwingConstants.CENTER);

        lblcedula.setFont(new Font("Times", Font.BOLD, 21));
        lbldireccion.setFont(new Font("Times", Font.BOLD, 21));
        lblnombre.setFont(new Font("Times", Font.BOLD, 21));
        lbltelefono.setFont(new Font("Times", Font.BOLD, 21));
        lblcorreo.setFont(new Font("Times", Font.BOLD, 21));
        lbltipocliente.setFont(new Font("Times", Font.BOLD, 21));
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        LabelClientes = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lbltipocliente = new javax.swing.JLabel();
        jcbtipocliente = new javax.swing.JComboBox<>();
        jtfcedula = new javax.swing.JTextField();
        jtfcorreo = new javax.swing.JTextField();
        jtfdireccion = new javax.swing.JTextField();
        jtftelefono = new javax.swing.JTextField();
        jtfnombre = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(0, 153, 204));
        Panel.setRequestFocusEnabled(false);

        LabelClientes.setText("Clientes");

        lblcedula.setForeground(new java.awt.Color(102, 102, 102));
        lblcedula.setText("Nombre:");

        lblnombre.setForeground(new java.awt.Color(102, 102, 102));
        lblnombre.setText("Cedula:");

        lbldireccion.setForeground(new java.awt.Color(102, 102, 102));
        lbldireccion.setText("Telefono:");

        lbltelefono.setForeground(new java.awt.Color(102, 102, 102));
        lbltelefono.setText("Direccion:");

        lblcorreo.setForeground(new java.awt.Color(102, 102, 102));
        lblcorreo.setText("Correo");

        lbltipocliente.setForeground(new java.awt.Color(102, 102, 102));
        lbltipocliente.setText("Tipo cliente:");

        jcbtipocliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbtipocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtipoclienteActionPerformed(evt);
            }
        });

        jtfnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfnombreKeyTyped(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnguardar.setText("Actualizar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(LabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbltipocliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblcedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbltelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(lbldireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbtipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(LabelClientes)
                .addGap(25, 25, 25)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtftelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbtipocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnguardar)
                    .addComponent(btnregistrar))
                .addGap(31, 31, 31)
                .addComponent(btnlimpiar)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setFieldsBlank() {
        jtfcedula.setText("");
        jtfcorreo.setText("");
        jtftelefono.setText("");
        jtfdireccion.setText("");
        jtfnombre.setText("");
    }

    private void restringirCampos() {
        jtfcedula.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (e.isControlDown() && (keyCode == KeyEvent.VK_V || keyCode == KeyEvent.VK_X)
                        || e.isShiftDown() && keyCode == KeyEvent.VK_INSERT) {
                    e.consume();
                }
            }
        });

        jtftelefono.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Consume el evento para evitar la entrada del carácter
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (e.isControlDown() && (keyCode == KeyEvent.VK_V || keyCode == KeyEvent.VK_X)
                        || e.isShiftDown() && keyCode == KeyEvent.VK_INSERT) {
                    e.consume(); // Consume el evento para evitar el uso de Ctrl+V (pegar) o Ctrl+X (cortar)
                }
            }
        });
    }
    private void jcbtipoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtipoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbtipoclienteActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtfcedula.getText().length() >= 5) {
                Cliente c = new Cliente();
                c.setCedula((Long.valueOf(jtfcedula.getText())));
                int i = ci.eliminarCliente(c);
                if (i != -1) {
                    setFieldsBlank();
                    JOptionPane.showMessageDialog(null, "se elimino con exito el cliente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino ningun cliente");
                }
            } else {
                throw new SQLException();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hubo una falla al intentar eliminar el cliente.");
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String scedula = JOptionPane.showInputDialog(this, "Busque a un cliente con su cedula");
        if (scedula != null && !scedula.isEmpty()) {
            try {
                long cedula = Long.parseLong(scedula);
                Cliente c = ci.listarCliente(cedula);
                if (c.getId() != 0) {
                    jtfcedula.setText(String.valueOf(c.getCedula()));
                    jtftelefono.setText(String.valueOf(c.getTelefono()));
                    jtfdireccion.setText(c.getDirección());
                    jtfcorreo.setText(String.valueOf(c.getCorreo()));
                    jtfnombre.setText(c.getNombre());
                    short index = 1;
                    if (index == c.getTipoCliente()) {
                        index = 0;
                    } else {
                        index = 1;
                    }
                    if (cedula != 0) {
                        jcbtipocliente.setSelectedIndex(index);
                    }

                    jcbtipocliente.setSelectedIndex(index);

                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Los datos ingresados no fueron encontrados");
            }
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtfcedula.getText().length() >= 5
                    && jtfnombre.getText().length() >= 3 && jtfnombre.getText().length() <= 50
                    && jtfdireccion.getText().length() <= 80 && jtfcorreo.getText().length() <= 80) {

                Cliente c = new Cliente();
                c.setCedula(Long.parseLong(jtfcedula.getText()));
                c.setCorreo(jtfcorreo.getText());
                c.setNombre(jtfnombre.getText());
                c.setDirección(jtfdireccion.getText());
                if (!jtftelefono.getText().equals("")) {
                    c.setTelefono(Long.parseLong(jtftelefono.getText()));
                }
                short tipoCliente = 1;
                if (tipoCliente == (short) jcbtipocliente.getSelectedIndex()) {
                    tipoCliente = 2;
                } else {
                    tipoCliente = 1;
                }
                c.setTipoCliente(tipoCliente);
                int i = ci.actualizarCliente(c);
                if (i != -1) {
                    setFieldsBlank();
                    JOptionPane.showMessageDialog(this, "Cliente actualizado con exito");
                } else {
                    JOptionPane.showMessageDialog(this, "No se actualizo ningun cliente");
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "introdujo un dato invalido");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jtfnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfnombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombreKeyTyped

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        // TODO add your handling code here:
        try {
            if (jtfcedula.getText().length() >= 5
                    && jtfnombre.getText().length() >= 3 && jtfnombre.getText().length() <= 50
                    && jtfdireccion.getText().length() <= 80 && jtfcorreo.getText().length() <= 80) {

                Cliente c = new Cliente();
                c.setCedula(Long.parseLong(jtfcedula.getText()));
                c.setCorreo(jtfcorreo.getText());
                c.setNombre(jtfnombre.getText());
                c.setDirección(jtfdireccion.getText());
                if(!jtftelefono.getText().equals(""))
                c.setTelefono(Long.parseLong(jtftelefono.getText()));
                short tipoCliente = 1;
                if (tipoCliente == (short)jcbtipocliente.getSelectedIndex()) {
                    tipoCliente = 2;
                } else {
                    tipoCliente = 1;
                }
                c.setTipoCliente(tipoCliente);
                int i = ci.registrarCliente(c);
                if (i != -1) {
                    setFieldsBlank();
                    JOptionPane.showMessageDialog(this, "Se ha registrado un cliente correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha registrado ningun cliente");
                }
            } else {
                throw new IllegalArgumentException();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ya existe un cliente con esa cedula");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "introdujo un dato invalido");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
        setFieldsBlank();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    public void bloquarCampos(boolean bloquear) {
        if (bloquear) {
            jtfcedula.setEditable(false);
            jtfdireccion.setEditable(false);
            jtfnombre.setEditable(false);
            jtfcorreo.setEditable(false);
            jtftelefono.setEnabled(false);
            jcbtipocliente.setEnabled(false);

        } else {
            jtfcedula.setEditable(true);
            jtfdireccion.setEditable(true);
            jtfnombre.setEditable(true);
            jtfcorreo.setEditable(true);
            jtftelefono.setEnabled(true);
            jcbtipocliente.setEnabled(true);
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelClientes;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> jcbtipocliente;
    private javax.swing.JTextField jtfcedula;
    private javax.swing.JTextField jtfcorreo;
    private javax.swing.JTextField jtfdireccion;
    private javax.swing.JTextField jtfnombre;
    private javax.swing.JTextField jtftelefono;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltipocliente;
    // End of variables declaration//GEN-END:variables
}
