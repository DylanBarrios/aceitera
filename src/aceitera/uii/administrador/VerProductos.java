package aceitera.uii.administrador;

import aceitera.mysql.InformacionProductoSql;
import aceitera.mysql.InformacionUsuarioSql;
import aceitera.mysql.VerUsuarios;
import static aceitera.uii.administrador.Administrador.PanelPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class VerProductos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public static String usuarioSeleccionado = "";

    public VerProductos() {
        initComponents();
        mostrar();
        click();
    }

    private void mostrar() {
        Double TotalCompra = 0.0;
        Double TotalVenta = 0. ;
        String Consulta = "SELECT * FROM productos ORDER BY nombreProducto ASC";                                                     //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        modelo.setColumnIdentifiers( //Columnas que se llenaran
                new Object[]{
                    "Producto",
                    "Precio Venta",
                    "Precio Compra",
                    "Existencia",
                    "Proveedor",
                    "telefono"
                });

        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{ //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombreProducto"),
                    rs.getDouble("precioVenta"),
                    rs.getDouble("precioCompra"),
                    rs.getInt("existenciaProducto"),
                    rs.getString("vendedor"),
                    rs.getInt("telefono")
                });
                int cantidad = rs.getInt("existenciaProducto");    
                TotalCompra += (rs.getDouble("precioCompra") * cantidad);
                TotalVenta += (rs.getDouble("precioVenta") * cantidad);
                    
            }
            tableProductos.setModel(modelo);
            lblTCompra.setText(TotalCompra.toString());
            lblTVenta.setText(TotalVenta.toString());
        } catch (Exception e) {
            System.err.println("Error al llenar tabla de productos" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTVenta = new javax.swing.JLabel();
        lblTCompra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableProductos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/iconoRecargar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/IconoNuevoProducto.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Venta");

        jLabel3.setText("Total Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addComponent(lblTCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearProductoInternal CrearProducto = new CrearProductoInternal();
        PanelPrincipal.add(CrearProducto);
        CrearProducto.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTCompra;
    private javax.swing.JLabel lblTVenta;
    private javax.swing.JTable tableProductos;
    // End of variables declaration//GEN-END:variables

    private void click() {
        tableProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String NombreProducto;
                Double PrecioVenta;
                int ExistenciaProducto;
                String Vendedor;
                int Telefono;
                Double PrecioCompra;
                String Notas;

                int fila = tableProductos.rowAtPoint(e.getPoint());
                int columna = 0;

                if (fila > -1) {
                    usuarioSeleccionado = (String) modelo.getValueAt(fila, columna);
                    InformacionProducto informacionProducto = new InformacionProducto();
                    informacionProducto.setVisible(true);
                    InformacionProductoSql productoSql = new InformacionProductoSql(usuarioSeleccionado);
                    NombreProducto = productoSql.getNombreProducto();
                    PrecioVenta = productoSql.getPrecioVenta();
                    ExistenciaProducto = productoSql.getExistenciaProducto();
                    Vendedor = productoSql.getVendedor();
                    Telefono = productoSql.getTelefono();
                    PrecioCompra = productoSql.getPrecioCompra();
                    Notas = productoSql.getNotas();
                    informacionProducto.llenar(NombreProducto, PrecioVenta, ExistenciaProducto, Vendedor, Telefono, PrecioCompra, Notas);
                }
            }
        });

    }

    private void limpiarTabla() {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

}
