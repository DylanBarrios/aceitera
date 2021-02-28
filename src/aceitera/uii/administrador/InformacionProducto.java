package aceitera.uii.administrador;

import aceitera.clases.Producto;
import aceitera.mysql.ActualizarProducto;
import aceitera.mysql.ActualizarProveedor;
import aceitera.mysql.Busqueda;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InformacionProducto extends javax.swing.JFrame {

    
    public InformacionProducto() {
        initComponents();
        proveedorItems();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtExistencia = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaNotas = new javax.swing.JTextArea();
        cbxProveedor = new javax.swing.JComboBox<>();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Producto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Precio Venta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Precio Compra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Existencia Del Producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Proveedor:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Telefono Del Proveedor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Notas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        txtProducto.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 350, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        getContentPane().add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 350, -1));

        txtPrecioCompra.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        getContentPane().add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 350, -1));

        jButton1.setBackground(new java.awt.Color(28, 1, 120));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Actualizar");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(254, 254, 254)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 140, 50));

        txtExistencia.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        getContentPane().add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 350, -1));

        txtTelefono.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 220, -1));

        areaNotas.setColumns(20);
        areaNotas.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        areaNotas.setRows(5);
        jScrollPane1.setViewportView(areaNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 310, 120));

        cbxProveedor.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cbxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 320, 35));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/FondoAzul.png"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProveedorActionPerformed
        int telefono = telefonoProveedor();
        txtTelefono.setText(String.valueOf(telefono));
    }//GEN-LAST:event_cbxProveedorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNotas;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables

    public void llenar(String NombreProducto, Double PrecioVenta, int ExistenciaProducto, String Vendedor, int Telefono, Double PrecioCompra, String Notas) {
        txtProducto.setText(NombreProducto);
        txtPrecioCompra.setText(String.valueOf(PrecioCompra));
        txtExistencia.setText(String.valueOf(ExistenciaProducto));
        cbxProveedor.setSelectedItem(Vendedor);
        txtTelefono.setText(String.valueOf(Telefono));
        txtPrecioVenta.setText(String.valueOf(PrecioVenta));
        areaNotas.setText(Notas);
    }

    private void actualizar() {
        ActualizarProducto sql = new ActualizarProducto();
        String producto = txtProducto.getText();
        String proveedor = cbxProveedor.getSelectedItem().toString();
        Double precioVenta = Double.parseDouble(txtPrecioVenta.getText());
        Double precioCompra = Double.parseDouble(txtPrecioCompra.getText());
        int telefono = Integer.parseInt(txtTelefono.getText());
        int existencia = Integer.parseInt(txtExistencia.getText());
        String notas = areaNotas.getText();

        Producto NuevoProducto = new Producto(producto, precioVenta, existencia, proveedor, telefono, precioCompra, notas);                    //Se crea un nuevo usuario con los datos modificados
        if (sql.actualizar(NuevoProducto)) {                                                                       //Se revisa si todos los campos fueron aceptados
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error, verifique los datos");
        }
    }

    public void proveedorItems() {
        String Consulta = "SELECT nombre FROM proveedores WHERE estado = 'activo'";                             //Consulta que se hara a la D.B.
        ResultSet rs = Busqueda.getResultset(Consulta);
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
        ResultSet rs = Busqueda.getResultset(Consulta);
        try {
            if (rs.next()) {
                return rs.getInt("telefono");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener el telefono del proveedor" + e);
        }
        return 0;
    }
}
