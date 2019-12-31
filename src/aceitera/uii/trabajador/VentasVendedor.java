package aceitera.uii.trabajador;

import aceitera.mysql.Conector;
import aceitera.mysql.VerUsuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dylan
 */
public class VentasVendedor extends javax.swing.JFrame {

    Conector con;

    public VentasVendedor() {
        initComponents();
        mostrar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioU = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Wallpaper = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Venta del dia:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 130, 39));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("Producto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 90, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Precio u:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 90, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 90, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Total:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 60, -1));

        txtPrecioU.setEditable(false);
        txtPrecioU.setBackground(new java.awt.Color(1, 1, 1));
        txtPrecioU.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtPrecioU.setForeground(new java.awt.Color(254, 254, 254));
        txtPrecioU.setText("40");
        getContentPane().add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 300, 40));

        txtCantidad.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(1, 1, 1));
        txtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantidadFocusLost(evt);
            }
        });
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCantidadMouseEntered(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadKeyReleased(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 300, 40));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(1, 1, 1));
        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(254, 254, 254));
        txtTotal.setSelectionColor(new java.awt.Color(0, 158, 255));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 300, 40));

        jButton1.setText("Vender");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 460, 130, 50));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Vuelto:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 70, -1));

        txtVuelto.setEditable(false);
        txtVuelto.setBackground(new java.awt.Color(1, 1, 1));
        txtVuelto.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtVuelto.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtVuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 300, 40));

        txtPago.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtPago.setForeground(new java.awt.Color(1, 1, 1));
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagoKeyReleased(evt);
            }
        });
        getContentPane().add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 300, 40));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Pago:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 60, -1));

        jScrollPane1.setBackground(new java.awt.Color(45, 0, 169));
        jScrollPane1.setForeground(new java.awt.Color(254, 254, 254));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio u", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 590));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoFiltro.jpg"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 640, 590));

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Producto", "Notas"
            }
        ));
        jScrollPane2.setViewportView(tableProducto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1032, 90, 410, 510));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantidadFocusLost

    }//GEN-LAST:event_txtCantidadFocusLost

    private void txtCantidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseEntered

    }//GEN-LAST:event_txtCantidadMouseEntered

    private void txtCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyReleased
        try {
            if (txtCantidad.getText().equals("")) {
                txtTotal.setText("0");
            } else {
                int precioU = Integer.parseInt(txtPrecioU.getText());
                int cantidad = Integer.parseInt(txtCantidad.getText());
                String total = String.valueOf(precioU * cantidad);
                txtTotal.setText(total);
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyReleased
        try {
            if (txtPago.getText().equals("")) {
                txtVuelto.setText("0");
            } else {
                int pago = Integer.parseInt(txtPago.getText());
                int total = Integer.parseInt(txtTotal.getText());
                String vuelto = String.valueOf(pago - total);
                txtVuelto.setText(vuelto);
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_txtPagoKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables

    public void mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        String Consulta = "SELECT nombreProducto, notas FROM productos";                            //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        modelo.setColumnIdentifiers(                                            //Columnas que se llenaran
        new Object[] {
                      "Producto",
                      "Notas"
                    });
        try {
            while(rs.next()){
                modelo.addRow(new Object[]{                                     //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombreProducto"),
                    rs.getString("notas")
                });
            }
            tableProducto.setModel(modelo);
        } catch (SQLException e) {
            System.err.println("Error al llenar tabla de productos"+e);
        }
    }
}
