package aceitera.uii.administrador;

import aceitera.mysql.InformacionProveedorSql;
import aceitera.mysql.InformacionUsuarioSql;
import aceitera.mysql.Busqueda;
import static aceitera.uii.administrador.Administrador.PanelPrincipal;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class VerProveedoresInternal extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
        public static String proveedorSeleccionado = "";

    public VerProveedoresInternal() {
        initComponents();
        mostrar();
        click();
    }
    
    private void mostrar(){
        String Consulta = "SELECT * FROM proveedores ORDER BY nombre ASC";                          //Consulta que se hara a la D.B.
        ResultSet rs = Busqueda.getResultset(Consulta);
        modelo.setColumnIdentifiers(                                            //Columnas que se llenaran
        new Object[] {
                      "Nombre",
                      "Telefono",
                      "Direccion"
                    });
        try {
            while(rs.next()){
                modelo.addRow(new Object[]{                                     //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombre"),
                    rs.getInt("telefono"),
                    rs.getString("direccion")
                });
            }
            tableUsuarios.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al llenar tabla de proveedores"+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        tableUsuarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableUsuarios);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/iconoRecargar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/iconoCrearUsuario.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(1447, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearProveedorInternal proveedor = new CrearProveedorInternal();
        PanelPrincipal.add(proveedor);
        proveedor.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableUsuarios;
    // End of variables declaration//GEN-END:variables

    private void click() {
        tableUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String proveedor;
                String telefono;
                String direccion;
                String estado;

                int fila = tableUsuarios.rowAtPoint(e.getPoint());
                int columna = 0;

                if (fila > -1) {
                    proveedorSeleccionado = (String) modelo.getValueAt(fila, columna);
                    InformacionProveedor informacionProveedor = new InformacionProveedor();
                    informacionProveedor.setVisible(true);
                    InformacionProveedorSql proveedorSql = new InformacionProveedorSql(proveedorSeleccionado);
                    proveedor = proveedorSql.getProveedor();
                    telefono = proveedorSql.getTelefono();
                    estado = proveedorSql.getEstado();
                    direccion = proveedorSql.getDireccion();
                    
                    informacionProveedor.llenar(proveedor, telefono, direccion, estado);
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