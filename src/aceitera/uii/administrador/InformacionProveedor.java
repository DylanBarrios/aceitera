package aceitera.uii.administrador;

import aceitera.clases.Proveedor;
import aceitera.mysql.ActualizarProveedor;
import aceitera.mysql.InformacionUsuarioSql;
import javax.swing.JOptionPane;

public class InformacionProveedor extends javax.swing.JFrame {

    public InformacionProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        agregarItems();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Direccion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        txtDireccion.setBackground(new java.awt.Color(1, 1, 1));
        txtDireccion.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 300, 40));

        txtTelefono.setBackground(new java.awt.Color(1, 1, 1));
        txtTelefono.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 300, 40));

        txtNombre.setBackground(new java.awt.Color(1, 1, 1));
        txtNombre.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 300, 40));

        cbxEstado.setBackground(new java.awt.Color(1, 1, 1));
        cbxEstado.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        cbxEstado.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 160, 40));

        jButton1.setBackground(new java.awt.Color(19, 1, 78));
        jButton1.setFont(new java.awt.Font("Noto Sans", 3, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Guardar Cambios");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(254, 254, 254)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 180, 70));

        Wallpaper.setForeground(new java.awt.Color(254, 254, 254));
        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/FondoAzul.png"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void agregarItems() {                                                       //Agrega tipos de rango y estado a los combobox
        cbxEstado.addItem("activo");
        cbxEstado.addItem("inactivo");
    }

    public void llenar(String Nombre, String Telefono, String Direccion, String Estado) {                           //Llena los campos con la informacion de la B.D respecto
        InformacionUsuarioSql usuariosSql = new InformacionUsuarioSql();                                            //al usuario seleccionado en la tabla donde muestra los usuarios
        txtNombre.setText(Nombre);
        txtTelefono.setText(Telefono);
        txtDireccion.setText(Direccion);
        cbxEstado.setSelectedItem(Estado);
    }

    private void actualizar() {
        ActualizarProveedor sql = new ActualizarProveedor();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        int telefono;
        if(txtTelefono.getText().equals("")){
            telefono = 0;
        }else{
        telefono = Integer.parseInt(txtTelefono.getText());
        }
        String estado = cbxEstado.getSelectedItem().toString();

        Proveedor NuevoProveedor = new Proveedor(nombre, telefono, direccion, estado);                    //Se crea un nuevo usuario con los datos modificados
        if (sql.actualizar(NuevoProveedor)) {                                                                       //Se revisa si todos los campos fueron aceptados
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error, verifique los datos");
        }
    }
}