package aceitera.uii.administrador;

import aceitera.clases.Proveedor;
import aceitera.mysql.CrearProveedor;
import javax.swing.JOptionPane;

public class CrearProveedorInternal extends javax.swing.JInternalFrame {

    public CrearProveedorInternal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtNombre.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 270, 40));

        txtTelefono.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 270, 40));

        txtDireccion.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 159, 270, 40));

        jButton1.setBackground(new java.awt.Color(1, 1, 1));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Ok!");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(164, 164, 164)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 80, 40));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        Wallpaper.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        Wallpaper.setForeground(new java.awt.Color(254, 254, 254));
        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/fondoProveedor.jpeg"))); // NOI18N
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ok();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void ok() {
        CrearProveedor sql = new CrearProveedor();
        String nombre = txtNombre.getText().trim();                                                                    //Se almacena en variables los valores de los txt
        String direccion = txtDireccion.getText().trim();
        int telefono = 0;

        if (!"".equals(nombre) && !"".equals(txtTelefono.getText())) {                                          //Se verifica si el nombre y telefono fueron ingresados
            if (txtTelefono.getText().length() == 8) {                                                          //Se verifica si el numero de telefono tiene 8 numeros 
                telefono = Integer.parseInt(txtTelefono.getText());
                Proveedor proveedor = new Proveedor(nombre, telefono, direccion);                               //Se crea un nuevo proveedor con los valores de los txt
                if (sql.nuevoProveedor(proveedor)) {                                                            //Se verifica si el proveedor a podido ser registrado 
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrarse, contactar con el programador");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El numero de telefono debe ser de 8 numeros y sin espacios");               //Muestra mensaje si el numero de telefono esta mal ingresado
            }
        } else if (!"".equals(nombre)) {                                                                        //Revisa si solo el nombre fue ingresado sin importar telefono ni direccion
            Proveedor proveedor = new Proveedor(nombre, telefono, direccion);                                          //Se crea un nuevo proveedor con los valores de los txt
            if (sql.nuevoProveedor(proveedor)) {                                                                //Se verifica si el proveedor a podido ser registrado 
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrarse, contactar con el programador");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio");
        }

    }

    private void limpiar() {
        txtDireccion.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
    }
}
