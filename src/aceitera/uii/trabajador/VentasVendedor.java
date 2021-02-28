package aceitera.uii.trabajador;

import aceitera.clases.Ventas;
import aceitera.mysql.Conector;
import aceitera.mysql.NuevaVentaSql;
import aceitera.mysql.Busqueda;
import aceitera.uii.Login.Login;
import aceitera.uii.administrador.Administrador;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class VentasVendedor extends javax.swing.JFrame {

    Conector con;
    DefaultTableModel modeloProductos;
    DefaultTableModel modeloVenta;
    Double Total = 0.0;
    String usuarioRegistrado = Login.usuario;

    public VentasVendedor() {
        initComponents();
        LlenarCbx();
        titulos();
        this.setLocationRelativeTo(null);
        AutoCompleteDecorator.decorate(cbxProductos);
        agregarVentasTabla();
        ventaTotaDial();
        clickProdutos();
        clickVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioU = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        txtPago = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cbxProductos = new javax.swing.JComboBox<>();
        labelVentaDia = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        WallpaperCenter = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        WallpaperGeneral = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Precio u:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 90, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 90, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Total:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 60, -1));

        txtPrecioU.setEditable(false);
        txtPrecioU.setBackground(new java.awt.Color(1, 1, 1));
        txtPrecioU.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtPrecioU.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 350, 300, 40));

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
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 300, 40));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(1, 1, 1));
        txtTotal.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(254, 254, 254));
        txtTotal.setSelectionColor(new java.awt.Color(0, 158, 255));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 300, 40));

        btnVender.setBackground(new java.awt.Color(0, 0, 0));
        btnVender.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setText("VENDER");
        btnVender.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnVender.setBorderPainted(false);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 130, 50));

        txtPago.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtPago.setForeground(new java.awt.Color(1, 1, 1));
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPagoKeyReleased(evt);
            }
        });
        getContentPane().add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, 130, 30));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Pago:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, 60, -1));

        jScrollPane1.setBackground(new java.awt.Color(45, 0, 169));
        jScrollPane1.setForeground(new java.awt.Color(254, 254, 254));

        tableVentas.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Sub Total", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tableVentas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 810, 910));

        tableProducto.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Sub Total", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(tableProducto);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 660, 910));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Producto:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 90, -1));

        cbxProductos.setEditable(true);
        cbxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductosActionPerformed(evt);
            }
        });
        getContentPane().add(cbxProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 300, 40));

        labelVentaDia.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        labelVentaDia.setForeground(new java.awt.Color(254, 254, 254));
        labelVentaDia.setText("0");
        getContentPane().add(labelVentaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 920, 110, 30));

        LabelTotal.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        LabelTotal.setForeground(new java.awt.Color(254, 254, 254));
        LabelTotal.setText("0");
        getContentPane().add(LabelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1800, 920, 100, 30));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 620, 130, 50));

        WallpaperCenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoRegistro.jpg"))); // NOI18N
        getContentPane().add(WallpaperCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 690, 500));

        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/logoutVenta.png"))); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setToolTipText("Salir del programa");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 750, 110, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 440, 920));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/iconoRecargar.png"))); // NOI18N
        jButton2.setToolTipText("Actualizar venta del dia");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, 70, 40));

        WallpaperGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(WallpaperGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1910, 950));

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
            if (txtCantidad.getText().equals("") || txtCantidad.getText().equals("No hay en existencia")) {
                txtTotal.setText("0");
            } else {
                Double precioU = Double.parseDouble(txtPrecioU.getText());
                int cantidad = Integer.parseInt(txtCantidad.getText());
                String total = String.valueOf(precioU * cantidad);
                txtTotal.setText(total);
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_txtCantidadKeyReleased

    private void txtPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyReleased

        try {
            if (!txtPago.getText().equals("")) {
                Double pago = Double.parseDouble(txtPago.getText());
                Double total = Double.parseDouble(txtTotal.getText());
                String vuelto = String.valueOf(pago - total);
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_txtPagoKeyReleased

    private void cbxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductosActionPerformed
        clickComboProductos();
    }//GEN-LAST:event_cbxProductosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        validar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        if (modeloProductos.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay nada agregado");
        } else {
            Double Vuelto;
            if (!txtPago.getText().equals("") && Integer.parseInt(txtPago.getText()) > -1) {
                Vuelto = Double.parseDouble(txtPago.getText()) - Total;
                JOptionPane.showMessageDialog(null, "EL vuelto es: " + Vuelto);
            }
            agregarVentasDB();
            limpiarTxt();
            LabelTotal.setText("0");
            limpiarTablaProductos();
            limpiarTablaVentas();
            agregarVentasTabla();
            ventaTotaDial();
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salir();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiarTablaVentas();
        agregarVentasTabla();
        ventaTotaDial();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JLabel WallpaperCenter;
    private javax.swing.JLabel WallpaperGeneral;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cbxProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelVentaDia;
    private javax.swing.JTable tableProducto;
    private javax.swing.JTable tableVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPago;
    private javax.swing.JTextField txtPrecioU;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    public void LlenarCbx() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String Consulta = "SELECT nombreProducto FROM productos ORDER BY nombreProducto";        //Consulta que se hara a la D.B. para obtener el nombre del producto ordenado por nombre
            ResultSet rs = Busqueda.getResultset(Consulta);
            while (rs.next()) {
                cbxProductos.addItem(rs.getString("nombreProducto"));
            }
        } catch (SQLException e) {
            System.err.println("Error al llenar tabla de productos" + e);
        }
    }

    private void clickProdutos() {
        tableProducto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto?");           //Se guarda la seleccion del usuario en un int
                if (opcion == JOptionPane.YES_OPTION) {                                                     //Se evalua si selecciono si
                    int fila = tableProducto.getSelectedRow();                                              //Se guarda la fila selecionada en un int
                    if (fila >= 0) {
                        modeloProductos.removeRow(fila);                                                    //Se elimina la fila del modelo de la tabla porductos
                        ventaTotal();
                    }
                }
            }
        });
    }

    private void clickVentas() {
        tableVentas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sql;
                PreparedStatement pst;
                ResultSet rs;
                String producto = null;
                int id = 0;
                int cantidadComprada;
                Double totalCobrado;
                int fila = tableVentas.getSelectedRow();
                String fecha = String.valueOf(modeloVenta.getValueAt(fila, 3));

                try {
                    sql = "SELECT * FROM ventas WHERE fecha = ?";
                    pst = Conector.getConnection().prepareStatement(sql);
                    pst.setString(1, fecha);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        id = rs.getInt("idVentas");
                        producto = rs.getString("nombreProducto");
                        cantidadComprada = rs.getInt("cantidad");
                        totalCobrado = rs.getDouble("total");
                        Devolucion d = new Devolucion(id, cantidadComprada, producto, totalCobrado, usuarioRegistrado);
                        d.setVisible(true);
                    }
                } catch (SQLException err) {
                    System.out.println("Error al devolver " + err);
                }
            }
        });
    }

    private void clickComboProductos() {
        limpiarTxt();
        String producto = cbxProductos.getSelectedItem().toString();
        try {
            String Consulta = "SELECT precioVenta, existenciaProducto FROM productos WHERE nombreProducto = ?";               //Consulta que se hara a la D.B. para obtener el precio y cantidad producto
            PreparedStatement ps = Busqueda.getStatement(Consulta);
            ps.setString(1, producto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                if (rs.getInt("existenciaProducto") == 0) {
                    txtPrecioU.setText("No hay en existencia");
                } else {
                    txtPrecioU.setText(rs.getString("precioVenta"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al dar click en combo " + e);
        }
    }

    private void limpiarTxt() {
        txtCantidad.setText("");
        txtTotal.setText("");
        txtPago.setText("");
    }

    private void titulos() {
        String titulosVenta[] = new String[]{"Producto", "Cantidad", "Sub Total", "Fecha"};
        String titulosProductos[] = new String[]{"Producto", "Cantidad", "Sub Total", "Fecha"};

        modeloProductos = new DefaultTableModel();
        modeloProductos.setColumnIdentifiers(titulosProductos);
        tableProducto.setModel(modeloProductos);

        modeloVenta = new DefaultTableModel();
        modeloVenta.setColumnIdentifiers(titulosVenta);
        tableVentas.setModel(modeloVenta);
    }

    private void subVenta() {
        Date fechaActual = new Date();
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        String fechaHora = formatoFecha.format(fechaActual) + " " + formatoHora.format(fechaActual);
        modeloProductos.addRow(new Object[]{
            cbxProductos.getSelectedItem().toString(), txtCantidad.getText(), txtTotal.getText(), fechaHora
        });
    }

    private void limpiarTablaProductos() {
        int filas = modeloProductos.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloProductos.removeRow(0);
        }
    }

    private void limpiarTablaVentas() {
        int filas = modeloVenta.getRowCount();
        for (int i = 0; i < filas; i++) {
            modeloVenta.removeRow(0);
        }
    }

    private void ventaTotal() {
        int filas = modeloProductos.getRowCount();
        Total = 0.0;
        for (int i = 0; i < filas; i++) {
            Total = Total + Double.parseDouble(modeloProductos.getValueAt(i, 2).toString());
        }
        LabelTotal.setText(String.valueOf(Total));
    }

    private void ventaTotaDial() {
        int filas = modeloVenta.getRowCount();
        Total = 0.0;
        for (int i = 0; i < filas; i++) {
            Total = Total + Double.parseDouble(modeloVenta.getValueAt(i, 2).toString());
        }
        labelVentaDia.setText(String.valueOf(Total));
    }

    private void ventaDia() {
        int filas = modeloVenta.getRowCount();
        Double TotalDia = 0.0;
        for (int i = 0; i < filas; i++) {
            TotalDia = TotalDia + Double.parseDouble(modeloProductos.getValueAt(i, 2).toString());
        }
        labelVentaDia.setText(String.valueOf(TotalDia));
    }

    @SuppressWarnings("empty-statement")
    private void agregarVentasDB() {
        int filas = modeloProductos.getRowCount();
        for (int i = 0; i < filas; i++) {
            String producto = String.valueOf(modeloProductos.getValueAt(i, 0));;
            int cantidad = Integer.parseInt(String.valueOf(modeloProductos.getValueAt(i, 1)));
            Double subTotal = Double.parseDouble(String.valueOf(modeloProductos.getValueAt(i, 2)));
            String horaFecha = String.valueOf(modeloProductos.getValueAt(i, 3));
            Ventas ventas = new Ventas(producto, cantidad, subTotal, usuarioRegistrado, horaFecha);
            NuevaVentaSql nuevaVenta = new NuevaVentaSql();
            nuevaVenta.nuevaVenta(ventas);
            nuevaVenta.nuevaCantidad(cantidad, producto);
        }
    }

    private void agregarVentasTabla() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

        String sql;
        PreparedStatement pst;
        ResultSet rs;
        String producto;
        int cantidad;
        Double subTotal;
        String fechaVenta;

        try {
            sql = "SELECT * FROM ventas WHERE fecha LIKE ?";                  //SQL 
            pst = Conector.getConnection().prepareStatement(sql);
            pst.setString(1, formatoFecha.format(fecha) + "%");
            rs = pst.executeQuery();

            while (rs.next()) {
                producto = rs.getString("nombreProducto");
                cantidad = rs.getInt("cantidad");
                subTotal = rs.getDouble("total");
                fechaVenta = rs.getString("fecha");

                modeloVenta.addRow(new Object[]{
                    producto, cantidad, subTotal, fechaVenta
                });
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar nuevo producto " + e);
        }
    }

    private void salir() {
        try {
            String Consulta = "SELECT rango FROM usuarios WHERE usuario = ?";        //Consulta que se hara a la D.B. para obtener el rango del usuario que se registro
            PreparedStatement pst = Busqueda.getStatement(Consulta);
            pst.setString(1, usuarioRegistrado);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String rango = rs.getString("rango");
                if (rango.equals("administrador")) {
                    this.dispose();
                } else {
                    this.dispose();
                    Login login = new Login();
                    login.setVisible(true);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener rango del usuario registrado" + e);
        }
    }

    private void validar() {
        int vendido;
        if (!txtCantidad.getText().trim().equals("")) {
            vendido = Integer.parseInt(txtCantidad.getText());
            String producto = String.valueOf(cbxProductos.getSelectedItem());
            NuevaVentaSql nuevaVenta = new NuevaVentaSql();
            int cantidad = nuevaVenta.cantidadExistente(producto);
            if (nuevaVenta.revisar(vendido, producto)) {
                subVenta();                                                                             //Obtiene el total del producto vendido
                ventaTotal();                                                                           //Suma todos los totales de la columna subtotal
                limpiarTxt();                                                                           //Limpia todo para elegir un nuevo producto
            } else {
                JOptionPane.showMessageDialog(null, "Solo hay " + cantidad + " " + producto);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Agregue una cantidad");
        }
    }
}
