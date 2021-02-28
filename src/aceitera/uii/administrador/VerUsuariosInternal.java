package aceitera.uii.administrador;

import aceitera.mysql.InformacionUsuarioSql;
import aceitera.mysql.Busqueda;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class VerUsuariosInternal extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    public static String usuarioSeleccionado = "";

    public VerUsuariosInternal() {
        initComponents();
        mostrar();
        click();
    }

    private void mostrar() {
        String Consulta = "SELECT nombre,telefono,usuario,rango FROM usuarios ORDER BY nombre ASC";                             //Consulta que se hara a la D.B.
        ResultSet rs = Busqueda.getResultset(Consulta);
        modelo.setColumnIdentifiers( //Columnas que se llenaran
                new Object[]{
                    "Nombre",
                    "Telefono",
                    "Usuario",
                    "Rango"
                });

        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{ //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombre"),
                    rs.getInt("telefono"),
                    rs.getString("usuario"),
                    rs.getString("rango")
                });
            }
            tableUsuarios.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al llenar tabla de usuarios" + e);
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1439, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarTabla();
        mostrar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearUsuarioInternal registro = new CrearUsuarioInternal();
        Administrador.PanelPrincipal.add(registro);
        registro.setVisible(true);        
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
                String Nombre;
                String Usuario;
                String Telefono;
                String Clave;
                String Rango;
                String Estado;

                int fila = tableUsuarios.rowAtPoint(e.getPoint());
                int columna = 2;

                if (fila > -1) {
                    usuarioSeleccionado = (String) modelo.getValueAt(fila, columna);
                    InformacionUsuario informacionUsuario = new InformacionUsuario();
                    informacionUsuario.setVisible(true);
                    InformacionUsuarioSql usuariosSql = new InformacionUsuarioSql(usuarioSeleccionado);
                    Nombre = usuariosSql.getNombre();
                    Usuario = usuariosSql.getUsuario();
                    Telefono = usuariosSql.getTelefono();
                    Clave = usuariosSql.getClave();
                    Rango = usuariosSql.getRango();
                    Estado = usuariosSql.getEstado();
                    informacionUsuario.llenar(Nombre, Usuario, Telefono, Clave, Rango, Estado);
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