package aceitera.uii.administrador;

import aceitera.clases.Producto;
import aceitera.mysql.NuevoProductoSql;
import aceitera.mysql.VerUsuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CrearProductoInternal extends javax.swing.JInternalFrame {

    public CrearProductoInternal() {
        initComponents();
        proveedorItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbxProveedor = new javax.swing.JComboBox<>();
        txtOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaNotas = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nombre Producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        txtNombre.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 470, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Precio De Compra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Cantidad:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Proveedor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Precio De Venta:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtPrecioCompra.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 470, -1));

        txtCantidad.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 470, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 470, -1));

        txtTelefono.setEditable(false);
        txtTelefono.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 160, -1));

        cbxProveedor.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 470, -1));

        txtOk.setBackground(new java.awt.Color(1, 1, 1));
        txtOk.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        txtOk.setForeground(new java.awt.Color(254, 254, 254));
        txtOk.setText("OK!");
        txtOk.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(131, 1, 1)));
        txtOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOkActionPerformed(evt);
            }
        });
        getContentPane().add(txtOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 150, 70));

        AreaNotas.setColumns(20);
        AreaNotas.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        AreaNotas.setRows(5);
        jScrollPane1.setViewportView(AreaNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 100));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Notas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoNuevoProducto.jpg"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOkActionPerformed
        ok();
    }//GEN-LAST:event_txtOkActionPerformed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtPrecioCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioCompraKeyTyped

    private void txtPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioVentaKeyTyped

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        int telefono = telefonoProveedor();
        txtTelefono.setText(String.valueOf(telefono));
    }//GEN-LAST:event_cbxProveedorActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaNotas;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JButton txtOk;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public void ok() {
        if (txtNombre.getText().equals("") || txtPrecioVenta.getText().equals("")
                || txtCantidad.getText().equals("") || txtPrecioCompra.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede dejar ningun espacio vacio");
        } else {
            String nombreProducto = txtNombre.getText();
            Double precioVenta = Double.valueOf(txtPrecioVenta.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String vendedor = (String) cbxProveedor.getSelectedItem();
            int telefono = Integer.parseInt(txtTelefono.getText());
            Double precioCompra = Double.parseDouble(txtPrecioCompra.getText());
            String notas = AreaNotas.getText();

            Producto producto = new Producto(nombreProducto, precioVenta, cantidad, vendedor, telefono, precioCompra, notas);
            NuevoProductoSql nuevoProducto = new NuevoProductoSql();
            if (nuevoProducto.NuevoProducto(producto)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiar();
            }
        }
    }

    public void proveedorItems() {
        String Consulta = "SELECT nombre FROM proveedores WHERE estado = 'activo'";                             //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        try {
            while (rs.next()) {
                String proveedor = rs.getString("nombre");
                cbxProveedor.addItem(proveedor);
            }
        } catch (Exception e) {
            System.err.println("Error al obtener proveedores" + e);
        }
    }

    public int telefonoProveedor() {
        String proveedor = cbxProveedor.getSelectedItem().toString();
        String Consulta = "SELECT telefono FROM proveedores WHERE nombre = '"
                + proveedor + "'";                                              //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        try {
            if (rs.next()) {
                return rs.getInt("telefono");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el telefono del proveedor" + e);
        }
        return 0;
    }
    
    public void limpiar(){
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        AreaNotas.setText("");
    }

}
