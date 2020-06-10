package aceitera.mysql;

import aceitera.clases.Producto;
import aceitera.clases.Proveedor;
import aceitera.uii.administrador.VerProductos;
import aceitera.uii.administrador.VerProveedoresInternal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ActualizarProducto {
    
    public boolean actualizar(Producto producto) {
        String productoAnterior = VerProductos.usuarioSeleccionado;                            //Se almacena el nombre del proveedor que se visualiza en ese momento
        Conector conector = new Conector();
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        int idProducto = 0;

        try {
            connection = conector.getConnection();                                                          //Se obtiene el id del usuario a modificar
            sql = "SELECT idProducto FROM productos WHERE nombreProducto = '" + productoAnterior + "'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                idProducto = rs.getInt("idProducto");                                                                       //Se almacena el id en una variable
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener id del producto " + e);
        }

        try {
            sql = "SELECT nombreProducto FROM productos WHERE nombreProducto = '" + producto.getNombreProducto()              //Se compara que el nombre de usuario no exista
                    + "' AND NOT idProducto = '" + idProducto + "'";                                //sin comparar con el usuario del id existente
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El nombre ya existe, agregue un numero o cambie el nombre");
            } else {
                sql = "UPDATE productos set nombreProducto=?, precioVenta=?,"
                        + "ExistenciaProducto=?, vendedor=?, telefono=?, precioCompra=?, notas=? "     //Se almacenan los nuevos datos en la D.B.
                        + "WHERE idProducto = '" + idProducto + "'";
                pst = connection.prepareStatement(sql);
                pst.setString(1, producto.getNombreProducto());
                pst.setDouble(2, producto.getPrecioVenta());
                pst.setInt(3, producto.getCantidad());
                pst.setString(4, producto.getVendedor());
                pst.setInt(5, producto.getTelefono());
                pst.setDouble(6, producto.getPrecioCompra());
                pst.setString(7, producto.getNotas());
                pst.executeUpdate();
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Error al actualizar D.B. del producto" + e);
            return false;
        }
        return false;
    }
}
