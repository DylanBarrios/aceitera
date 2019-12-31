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
        String Consulta = "SELECT * FROM productos";                             //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        modelo.setColumnIdentifiers(                                                                        //Columnas que se llenaran
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
                modelo.addRow(new Object[]{                                                                 //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombreProducto"),
                    rs.getInt("precioVenta"),
                    rs.getInt("precioCompra"),
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableProductos;
    // End of variables declaration//GEN-END:variables

    private void click() {
        tableProductos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String NombreProducto;
                int PrecioVenta;
                int ExistenciaProducto;
                String Vendedor;
                int Telefono;
                int PrecioCompra;
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
}
