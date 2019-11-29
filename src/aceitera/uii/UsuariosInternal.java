package aceitera.uii;

import aceitera.mysql.VerUsuarios;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class UsuariosInternal extends javax.swing.JInternalFrame {

    public UsuariosInternal() {
        initComponents();
        mostrar();
    }
    
    private void mostrar(){
        DefaultTableModel modelo = new DefaultTableModel();
        String Consulta = "SELECT * FROM usuarios";                             //Consulta que se hara a la D.B.
        ResultSet rs = VerUsuarios.getUsuarios(Consulta);
        modelo.setColumnIdentifiers(                                            //Columnas que se llenaran
        new Object[] {
                      "Nombre",
                      "Telefono",
                      "Usuario",
                      "Clave",
                      "Rango"
                    });
        
        try {
            while(rs.next()){
                modelo.addRow(new Object[]{                                     //Llena filas de todos los usuarios que encuentre
                    rs.getString("nombre"),
                    rs.getInt("telefono"),
                    rs.getString("usuario"),
                    rs.getString("clave"),
                    rs.getString("rango")
                });
            }
            tableUsuarios.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error al llenar tabla de usuarios"+e);
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
}
