package aceitera.uii.administrador;

import aceitera.mysql.InformacionProductoSql;
import aceitera.mysql.InformacionUsuarioSql;
import aceitera.mysql.VerUsuarios;
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
        String Consulta = "SELECT * FROM productos";                                                     //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        modelo.setColumnIdentifiers(                                                                     //Columnas que se llenaran
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
                modelo.addRow(new Object[]{                                                                //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombreProducto"),
                    rs.getDouble("precioVenta"),
                    rs.getDouble("precioCompra"),
                    rs.getInt("existenciaProducto"),
                    rs.getString("vendedor"),
                    rs.getInt("telefono")
                });
            }
            tableProductos.setModel(modelo);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
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
