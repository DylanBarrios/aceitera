package aceitera.uii.Login;

import aceitera.uii.trabajador.VentasVendedor;
import javax.swing.JOptionPane;
import aceitera.mysql.Conector;
import aceitera.uii.administrador.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setBackground(new java.awt.Color(1, 1, 1));
        txtUsuario.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 270, 50));

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Clave:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jButton1.setBackground(new java.awt.Color(12, 18, 52));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("OK!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 90, -1));

        txtClave.setBackground(new java.awt.Color(1, 1, 1));
        txtClave.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        txtClave.setForeground(new java.awt.Color(254, 254, 254));
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 270, 50));

        jButton2.setBackground(new java.awt.Color(12, 18, 52));
        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/User.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 260, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aceitera/images/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Validacion();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Validacion() {
        if (!txtClave.getText().equals("") || !txtUsuario.getText().equals("")) {                                       //Verificar si los campos no estan vacios
            Conector conector = new Conector();
            String usuario = txtUsuario.getText();                                                                      //Almacena el usuario en una variable
            String clave = txtClave.getText();                                                                          //Almacena la clave en una variable
            try {
                Connection connection = conector.getConnection();
                String sql = "SELECT rango,estado FROM usuarios where usuario = '"+usuario
                        +"' and clave = '"+clave+"'";                                                                   //Consulta a la D.B. para ver si el usuario y clave exiten
                
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){
                    String rango = rs.getString("rango");                                                               //Almacena el rango en una variable
                    String estado = rs.getString("estado");                                                             //Almacena el estado en una variable
                    if(rango.equals("administrador") && estado.equals("activo")){                                       //Verifica si el usuario esta acteivo y si es adminsitrador
                        dispose();                                                                                      //Esconde el login
                        new Administrador().setVisible(true);                                                           //Muestra ventana de administrador
                    }else if((rango.equals("trabajador") || rango.equals("invitado")) && estado.equals("activo")){      //Verifica si el usuario esta activo y si es trabajador o invitado
                        dispose();
                        new VentasVendedor().setVisible(true);
                    }
                }else{                                                                                                  //Si no existe el usuario muestra un mensaje
                    JOptionPane.showMessageDialog(null, "Falló la autenticacion");
                    txtUsuario.setText("");
                    txtClave.setText("");
                }
            } catch (Exception e) {
                System.out.println("Error en login "+e);
            }

        } else {                                                                                                        //Si un campo esta vacio muestra un mensaje
            JOptionPane.showMessageDialog(null, "Llene todos los campos por favor");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
