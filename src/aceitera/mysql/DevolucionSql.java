package aceitera.mysql;

import java.sql.*;
import javax.swing.JOptionPane;

public class DevolucionSql {
    
public boolean actualizarTablaVentas(int id, int cantidad, Double total, String usuarioDevuelve, int cantidadDevuelta) {
        Conector conector = new Conector();
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        
        try {
            connection = conector.getConnection();                                                          
            sql = "SELECT cantidadDevuelta, vendedorDevuelve FROM ventas WHERE idVentas = '"+id+"'";                   
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                int cantidadTotalDevuelta = cantidadDevuelta + rs.getInt("cantidadDevuelta");
                String usuariosDevuelven = usuarioDevuelve + ", " + rs.getString("vendedorDevuelve");
                sql = "UPDATE ventas set cantidad=?, total=?, cantidadDevuelta=?, "     //Se almacenan los nuevos datos en la D.B.
                        + "vendedorDevuelve=? WHERE idVentas = '" + id + "'";
                pst = connection.prepareStatement(sql);
                pst.setInt(1, cantidad);
                pst.setDouble(2, total);
                pst.setInt(3, cantidadTotalDevuelta);
                pst.setString(4, usuariosDevuelven);
                pst.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar D.B. en la devolucion" + e);
            return false;
        }
        return false;
    }    


public boolean actualizarTablaProductos(String producto, int cantidadDevuelta) {
        Conector conector = new Conector();
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
        int id=0;
        int enExistencia;
        int nuevaCantidad;
        
        try {
            connection = conector.getConnection();                                                          
            sql = "SELECT idProducto, ExistenciaProducto FROM productos WHERE nombreProducto = '"+producto+"'";                   
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){
                id = rs.getInt("idProducto");
                enExistencia = rs.getInt("ExistenciaProducto");
                nuevaCantidad = enExistencia + cantidadDevuelta;
                sql = "UPDATE productos set ExistenciaProducto=?  "     //Se almacenan los nuevos datos en la D.B.
                        + "WHERE idProducto = '" + id + "'";
                pst = connection.prepareStatement(sql);
                pst.setInt(1, nuevaCantidad);
                pst.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar D.B. productos por devolucion " + e);
            return false;
        }
        return false;
    }    
}
