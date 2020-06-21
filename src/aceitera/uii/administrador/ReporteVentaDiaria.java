package aceitera.uii.administrador;

import aceitera.mysql.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ReporteVentaDiaria extends javax.swing.JInternalFrame {

    DefaultTableModel modeloVenta;

    public ReporteVentaDiaria() {
        initComponents();
        titulos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReporte = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelVentaDia = new javax.swing.JLabel();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha Inicio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Fecha Fin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        tableReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Total", "Vendedor", "Fecha", "Vendedor Devuelve", "Cantidad Devuelta"
            }
        ));
        jScrollPane1.setViewportView(tableReporte);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1260, 560));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/iconoReporteNuevo.png"))); // NOI18N
        jButton1.setText("Generar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 5, -1, -1));

        jLabel3.setText("Venta Total");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, -1, -1));

        labelVentaDia.setText("0.0");
        getContentPane().add(labelVentaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 600, 90, 30));
        getContentPane().add(jdcFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 200, -1));
        getContentPane().add(jdcFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 928, 463));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int mesFin = jdcFechaFin.getCalendar().get(Calendar.MONTH);
            int mesInicio = jdcFechaInicio.getCalendar().get(Calendar.MONTH);

            if ((mesFin+1) > (mesInicio+1)) {
                limpiarTablaVentas();
                agregarVentasTabla();
                ventaTotaDial();
            } else if (mesFin == mesInicio) {
                int diaFin = jdcFechaFin.getCalendar().get(Calendar.DAY_OF_MONTH);
                int diaInicio = jdcFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
                System.out.println(diaFin);
                if (diaFin > diaInicio) {
                    limpiarTablaVentas();
                    agregarVentasTabla();
                    ventaTotaDial();
                } else {
                    JOptionPane.showMessageDialog(null, "El dia de la fecha final debe ser mayor al dia de la fecha inicial");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El mes de la fecha final debe ser mayor al mes de la fecha inicial");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione las fechas");
            System.out.println("Error al obtener fecha "+e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JLabel labelVentaDia;
    private javax.swing.JTable tableReporte;
    // End of variables declaration//GEN-END:variables

    private void limpiarTablaVentas() {
        int filas = modeloVenta.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloVenta.removeRow(0);
        }
        tableReporte.repaint();
    }

    private void titulos() {
        String titulos[] = new String[]{"Producto", "Cantidad", "Total", "Vendedor", "Fecha", "Vendedor Devuelve", "Cantidad Devuelta"};

        modeloVenta = new DefaultTableModel();
        modeloVenta.setColumnIdentifiers(titulos);
        tableReporte.setModel(modeloVenta);
    }

    private void agregarVentasTabla() {
        Conector conector = new Conector();
        String sql;
        PreparedStatement pst;
        ResultSet rs;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        String fechaInicio = formatoFecha.format(jdcFechaInicio.getDate());
        String fechaFin = formatoFecha.format(jdcFechaFin.getDate());

        try {
            sql = "SELECT * FROM ventas WHERE fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "'";           //SQL 
            Connection connection = conector.getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String producto = rs.getString("nombreProducto");
                int cantidad = rs.getInt("cantidad");
                double total = rs.getDouble("total");
                String vendedor = rs.getString("vendedor");
                String fecha = rs.getString("fecha");
                int cantidadDevuelta = rs.getInt("cantidadDevuelta");
                String vendedorDevuelve;
                if(rs.getString("vendedorDevuelve") == null){
                    vendedorDevuelve = "Nadie ha devuelto";
                }else{
                    vendedorDevuelve = rs.getString("vendedorDevuelve");
                }    

                modeloVenta.addRow(new Object[]{
                    producto, cantidad, total, vendedor, fecha, vendedorDevuelve, cantidadDevuelta
                });
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar nuevo producto " + e);
        }
    }

    private void ventaTotaDial() {
        int filas = modeloVenta.getRowCount();
        Double Total = 0.0;
        for (int i = 0; i < filas; i++) {
            Total = Total + Double.parseDouble(modeloVenta.getValueAt(i, 2).toString());
        }
        labelVentaDia.setText(String.valueOf(Total));
    }
}
