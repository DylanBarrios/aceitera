package aceitera.mysql;

import aceitera.clases.Producto;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NuevoProductoSql {
      
     public boolean NuevoProducto(Producto producto) {
        Conector conector = new Conector();
        String sql;
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            sql = "SELECT nombreProducto FROM productos WHERE nombreProducto ='"+producto.getNombreProducto()+"'";           //SQL para saber si el proveedor ya existe
            Connection connection = conector.getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "El producto ya existe");                          //Si el proveedor existe avisara al usuario
                return false;
            }else{
                sql = "INSERT INTO productos (nombreProducto, precioVenta, "
                        + "ExistenciaProducto, vendedor, telefono, precioCompra, notas)"
                        + "VALUES (?,?,?,?,?,?,?)";                                                             //Si el proveedor no existe ingresa los nuevos datos a la D.B. 
                pst = connection.prepareStatement(sql);
                pst.setString(1, producto.getNombreProducto());
                pst.setDouble(2, producto.getPrecioVenta());
                pst.setInt(3, producto.getCantidad());
                pst.setString(4, producto.getVendedor());
                pst.setInt(5, producto.getTelefono());
                pst.setDouble(6, producto.getPrecioCompra());
                pst.setString(7, producto.getNotas());
                pst.execute();
                return true;
            }
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Erro al cargar nuevo producto "+e);
            return false;
        }
    }
}
