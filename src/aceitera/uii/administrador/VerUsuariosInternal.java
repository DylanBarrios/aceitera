package aceitera.uii.administrador;

import aceitera.mysql.InformacionUsuarioSql;
import aceitera.mysql.VerUsuarios;
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
        String Consulta = "SELECT nombre,telefono,usuario,rango FROM usuarios";                             //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
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

        setClosable(true);
        setIconifiable(true);

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
}
