package aceitera.mysql;

import aceitera.clases.Proveedor;
import aceitera.clases.Usuarios;
import aceitera.uii.administrador.VerUsuariosInternal;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ActualizarUsuario {

    public boolean actualizar(Usuarios usuario) {
        String usuarioAnterior = VerUsuariosInternal.usuarioSeleccionado;                                   //Se almacena el nombre del usuario que se visualiza en ese momento
        Conector conector = new Conector();
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        int id = 0;

        try {
            connection = conector.getConnection();                                                          //Se obtiene el id del usuario a modificar
            sql = "SELECT id FROM usuarios WHERE usuario = '" + usuarioAnterior + "'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");                                                                       //Se almacena el id en una variable
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener id " + e);
        }

        try {
            sql = "SELECT usuario FROM usuarios WHERE usuario = '" + usuario.getUsuario()                   //Se compara que el nombre de usuario no exista
                    + "' AND NOT id = '" + id + "'";                                                        //sin comparar con el usuario del id existente
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Usuario ya en existencia");
            } else {
                sql = "UPDATE usuarios set nombre=?, telefono=?, clave=?, usuario=?, rango=?, estado=?"     //Se almacenan los nuevos datos en la D.B.
                        + "WHERE id = '" + id + "'";
                pst = connection.prepareStatement(sql);
                pst.setString(1, usuario.getNombre());
                pst.setInt(2, usuario.getTelefono());
                pst.setString(3, usuario.getClave());
                pst.setString(4, usuario.getUsuario());
                pst.setString(5, usuario.getRango());
                pst.setString(6, usuario.getEstado());
                pst.executeUpdate();
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error al actualizar D.B. " + e);
            return false;
        }
        return false;
    }
}
