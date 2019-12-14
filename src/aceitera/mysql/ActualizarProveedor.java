package aceitera.mysql;

import aceitera.clases.Proveedor;
import aceitera.uii.administrador.VerProveedoresInternal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ActualizarProveedor {
    public boolean actualizar(Proveedor proveedor) {
        String proveedorAnterior = VerProveedoresInternal.proveedorSeleccionado;                            //Se almacena el nombre del proveedor que se visualiza en ese momento
        Conector conector = new Conector();
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        int idProveedor = 0;

        try {
            connection = conector.getConnection();                                                          //Se obtiene el id del usuario a modificar
            sql = "SELECT idProveedores FROM proveedores WHERE nombre = '" + proveedorAnterior + "'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                idProveedor = rs.getInt("idProveedores");                                                                       //Se almacena el id en una variable
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener id " + e);
        }

        try {
            sql = "SELECT nombre FROM proveedores WHERE nombre = '" + proveedor.getNombre()              //Se compara que el nombre de usuario no exista
                    + "' AND NOT idProveedores = '" + idProveedor + "'";                                                        //sin comparar con el usuario del id existente
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El nombre ya existe, agregue un numero o cambie el nombre");
            } else {
                sql = "UPDATE proveedores set nombre=?, telefono=?, direccion=?, estado=?"     //Se almacenan los nuevos datos en la D.B.
                        + "WHERE idProveedores = '" + idProveedor + "'";
                pst = connection.prepareStatement(sql);
                pst.setString(1, proveedor.getNombre());
                pst.setInt(2, proveedor.getTelefono());
                pst.setString(3, proveedor.getDireccion());
                pst.setString(4, proveedor.getEstado());
                pst.executeUpdate();
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error al actualizar D.B. del proveedor" + e);
            return false;
        }
        return false;
    }
}
