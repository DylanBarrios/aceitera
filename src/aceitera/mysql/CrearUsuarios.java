package aceitera.mysql;

import aceitera.clases.Usuarios;
import aceitera.mysql.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CrearUsuarios extends Conector {

    public boolean registrar(Usuarios user) {
        PreparedStatement pst = null;                                           //Prepara la conexion
        ResultSet rs;
        Connection connection = getConnection();                                //Establece la conexion
        String sql;

        try {
            sql = "SELECT usuario FROM usuarios WHERE usuario = '" + user.getUsuario() + "'";    //Query para verificar si el
            pst = connection.prepareStatement(sql);                                             //usuario ya existe
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El usuario ya exite");
            } else {
                sql = "INSERT INTO usuarios (nombre, telefono,clave,usuario,rango,estado)"
                        + "VALUES(?,?,?,?,?,?)";                                      //Genera la consulta a mysql
                pst = connection.prepareStatement(sql);                             //Se hace la peticion a mysql
                pst.setString(1, user.getNombre());                                 //Se insertan datos en la D.B.
                pst.setInt(2, user.getTelefono());
                pst.setString(3, user.getClave());
                pst.setString(4, user.getUsuario());
                pst.setString(5, user.getRango());
                pst.setString(6, user.getEstado());
                pst.execute();
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al crear usuario" + e);
        }
        return false;
    }
}
