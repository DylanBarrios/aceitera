package aceitera.uii.trabajador;

import aceitera.mysql.DevolucionSql;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author dylan
 */
public class Devolucion extends javax.swing.JFrame {
    private int cantidadComprada=0;
    private Double costo;
    private Double costoUnitario;
    private int id;
    private int cantidadDevuelta;
    private String producto;
    private String usuarioDevuelve;
            
    public Devolucion(int id, int cantidadComprada, String producto, Double costo, String usuarioDevuelve) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cantidadComprada = cantidadComprada;
        this.costo = costo;
        this.id = id;
        this.producto = producto;
        this.usuarioDevuelve = usuarioDevuelve;
        costoUnitario = costo / cantidadComprada;
        configuracion();
        
        spinDevolver.getEditor().getComponent(0).setBackground(Color.red);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        spinDevolver = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        lblCantidadDinero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolver Producto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad a devolver:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        spinDevolver.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        spinDevolver.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinDevolverStateChanged(evt);
            }
        });
        getContentPane().add(spinDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 35, 70, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Devolver:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        lblCantidadDinero.setFont(new java.awt.Font("Lato Heavy", 1, 24)); // NOI18N
        lblCantidadDinero.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidadDinero.setText("0");
        getContentPane().add(lblCantidadDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 62, 100, 30));

        jButton1.setBackground(new java.awt.Color(102, 0, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ok!");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 50));

        jButton2.setBackground(new java.awt.Color(102, 0, 51));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 110, 50));

        lblProducto.setFont(new java.awt.Font("Lato Heavy", 1, 22)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Aqui");
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 200, 30));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoDevolucion.jpeg"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void spinDevolverStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinDevolverStateChanged
        cantidadDevuelta = Integer.parseInt(spinDevolver.getValue().toString());
        String cantidad = String.valueOf(cantidadDevuelta*costoUnitario);
        lblCantidadDinero.setText(cantidad);
    }//GEN-LAST:event_spinDevolverStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCantidadDinero;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JSpinner spinDevolver;
    // End of variables declaration//GEN-END:variables

    public void configuracion(){
        lblProducto.setText(producto);
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(cantidadComprada);
        nm.setMinimum(0);
        nm.setStepSize(1);
        spinDevolver.setModel(nm);
    }
    
    private void actualizar() {
        DevolucionSql ventaSql = new DevolucionSql();
        Double nuevoCosto = costo - (cantidadDevuelta*costoUnitario);
        int nuevaCantidad = cantidadComprada - cantidadDevuelta;
        if (ventaSql.actualizarTablaVentas(id,nuevaCantidad,nuevoCosto,usuarioDevuelve,cantidadDevuelta) && ventaSql.actualizarTablaProductos(producto, cantidadDevuelta)) {                                                                       //Se revisa si todos los campos fueron aceptados
            JOptionPane.showMessageDialog(null, "Devolucion correcta");
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error en la devolucion");
        }
    }
}
