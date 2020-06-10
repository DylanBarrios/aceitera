package aceitera.mysql;

import aceitera.clases.Ventas;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class NuevaVentaSql {

    Conector conector = new Conector();
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public void nuevaVenta(Ventas venta) {
        try {
            sql = "INSERT INTO ventas (nombreProducto, cantidad, total, "
                    + "vendedor, fecha) VALUES (?,?,?,?,?)";                                                             //Inserta los datos enviados desde la ventana ventas
            Connection connection = conector.getConnection();
            pst = connection.prepareStatement(sql);
            pst.setString(1, venta.getNombreProducto());
            pst.setInt(2, venta.getCantidad());
            pst.setDouble(3, venta.getTotal());
            pst.setString(4, venta.getVendedor());
            pst.setString(5, venta.getFecha());
            pst.execute();                                                                                              
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error al cargar nueva venta " + e);
        }
    }

    public boolean revisar(int vendido, String Producto) {
        int enExistencia = 0;
        try {
            Connection connection = conector.getConnection();
            sql = "SELECT existenciaProducto FROM productos WHERE nombreProducto = '" + Producto + "'";                 //Obtiene la cantidad de producto que le consultan
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                enExistencia = rs.getInt("existenciaProducto");                                                         //Almacena en una varibale la cantidad del producto
            }    
            int nuevaCantidad = enExistencia - vendido;                                                                 //Resta de la cantidad existente la cantidad a vender
            if (nuevaCantidad < 0) {                                                                                    //Revisa si hay suficiente cantidad de producto para vender
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al revisar cantidades " + e);
            return false;
        }
    }

    public int cantidadExistente(String Producto) {
        try {
            Connection connection = conector.getConnection();
            sql = "SELECT existenciaProducto FROM productos WHERE nombreProducto = '" + Producto + "'";                        //Se obtiene la cantidad existente del producto para 
            pst = connection.prepareStatement(sql);                                                                            //imprimirla en pantalla si no hubiera la cantidad que buscan
            rs = pst.executeQuery();
            if (rs.next()) {
                int enExistencia = rs.getInt("existenciaProducto");
                return enExistencia;
            }else{
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener existencia del producto " + e);
            return 0;
        }
    }

    public void nuevaCantidad(int vendido, String Producto) {
        int enExistencia = 0;
        try {
            Connection connection = conector.getConnection();
            sql = "SELECT existenciaProducto FROM productos WHERE nombreProducto = '" + Producto + "'";                       //Se consula la cantidad de un producto para restar de la D.B.
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                enExistencia = rs.getInt("existenciaProducto");
            }    
            int nuevaCantidad = enExistencia - vendido;
            sql = " UPDATE productos SET existenciaProducto = '" + nuevaCantidad                                                   //Se actualiza la nueva cantidad de producto ahora en
                    + "' WHERE nombreProducto = '" + Producto + "'";                                                         //existencia
            pst = connection.prepareStatement(sql);
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Error al cargar nueva cantidad " + e);
        }
    }
}
