package aceitera.uii.administrador;

import aceitera.mysql.CrearUsuarios;
import aceitera.clases.Usuarios;
import javax.swing.JOptionPane;

public class CrearUsuarioInternal extends javax.swing.JInternalFrame {

    public CrearUsuarioInternal() {
        initComponents();
        agregarItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        comboRangos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Telefono:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Clave:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Rango:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jButton1.setBackground(new java.awt.Color(31, 1, 111));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Ok!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 80, -1));

        txtNombre.setBackground(new java.awt.Color(1, 1, 1));
        txtNombre.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(254, 254, 254));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 420, 40));

        txtTelefono.setBackground(new java.awt.Color(1, 1, 1));
        txtTelefono.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(254, 254, 254));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 420, 40));

        txtUsuario.setBackground(new java.awt.Color(1, 1, 1));
        txtUsuario.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 420, 40));

        txtClave.setBackground(new java.awt.Color(1, 1, 1));
        txtClave.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        txtClave.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 420, 40));

        comboRangos.setBackground(new java.awt.Color(1, 1, 1));
        comboRangos.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        comboRangos.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(comboRangos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 420, 40));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, -1, -1));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, -1, -1));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoRegistro.jpg"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ok();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JComboBox<String> comboRangos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public void ok() {
        CrearUsuarios sql = new CrearUsuarios();
        Usuarios usuarios = new Usuarios();

        String nombre = txtNombre.getText();                                    //Se obtienen los datos ingresados y se almacenan en variables
        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();
        String rango = (String) comboRangos.getSelectedItem();
        int telefono = 0;

        if (nombre.equals("") || usuario.equals("") || clave.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor llene los datos de las casilla marcadas con *");
        } else {
            if (!"".equals(txtTelefono.getText())) {
                if (txtTelefono.getText().length() != 8) {
                    JOptionPane.showMessageDialog(null, "Deben ser 8 numeros sin espacios");
                } else {
                    telefono = Integer.parseInt(txtTelefono.getText());                //Se registra un numero de telefono
                    usuarios.setNombre(nombre);                                        //Se ingresa al objeto usuarios los datos
                    usuarios.setTelefono(telefono);
                    usuarios.setUsuario(usuario);
                    usuarios.setClave(clave);
                    usuarios.setRango(rango);
                    usuarios.setEstado("activo");
                }
            } else {
                usuarios.setNombre(nombre);                                            //Se ingresa al objeto usuarios los datos sin el numero de telefono
                usuarios.setTelefono(telefono);
                usuarios.setUsuario(usuario);
                usuarios.setClave(clave);
                usuarios.setRango(rango);
                usuarios.setEstado("activo");
            }
            
            if (sql.registrar(usuarios)) {                                             //Se revisa si todos los campos fueron aceptados
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error, verifique los datos");
            }
        }
    }

    public void agregarItems() {                                                       //Agrega tipos de rango
        comboRangos.addItem("administrador");
        comboRangos.addItem("trabajador");
        comboRangos.addItem("invitado");
    }

    public void limpiar() {
        txtClave.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
    }
}
