package aceitera.uii.administrador;

public class InformacionProducto extends javax.swing.JFrame {

    public InformacionProducto() {
        initComponents();
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
        txtProveedor = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaNotas = new javax.swing.JTextArea();
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
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Telefono Del Proveedor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Notas:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        txtProducto.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        getContentPane().add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 230, -1));

        txtPrecioVenta.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        getContentPane().add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, -1));

        txtPrecioCompra.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        getContentPane().add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 230, -1));

        jButton1.setBackground(new java.awt.Color(28, 1, 120));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Actualizar");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(254, 254, 254)));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 140, 50));

        txtExistencia.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        getContentPane().add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, -1));

        txtProveedor.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        getContentPane().add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 220, -1));

        txtTelefono.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 220, -1));

        areaNotas.setColumns(20);
        areaNotas.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        areaNotas.setRows(5);
        jScrollPane1.setViewportView(areaNotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 90));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/FondoAzul.png"))); // NOI18N
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaNotas;
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
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables


    public void llenar(String NombreProducto, int PrecioVenta, int ExistenciaProducto, String Vendedor, int Telefono, int PrecioCompra, String Notas){
        txtProducto.setText(NombreProducto);
        txtPrecioCompra.setText(String.valueOf(PrecioCompra));
        txtExistencia.setText(String.valueOf(ExistenciaProducto));
        txtProveedor.setText(Vendedor);
        txtTelefono.setText(String.valueOf(Telefono));
        txtPrecioVenta.setText(String.valueOf(PrecioVenta));
        areaNotas.setText(Notas);
    }
}
