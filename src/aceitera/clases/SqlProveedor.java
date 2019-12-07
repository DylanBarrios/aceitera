package aceitera.clases;

import java.sql.Connection;
import aceitera.mysql.Conector;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SqlProveedor {

    public boolean nuevoProveedor(Proveedor proveedor) {
        Conector conector = new Conector();
        String sql;
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            sql = "SELECT nombre FROM proveedores WHERE nombre ='"+proveedor.getNombre()+"'";           //SQL para saber si el proveedor ya existe
            Connection connection = conector.getConnection();
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "El proveedor ya existe");                          //Si el proveedor existe avisara al usuario
                return false;
            }else{
                sql = "INSERT INTO proveedores (nombre, telefono, direccion)"
                        + "VALUES (?,?,?)";                                                             //Si el proveedor no existe ingresa los nuevos datos a la D.B. 
                pst = connection.prepareStatement(sql);
                pst.setString(1, proveedor.getNombre());
                pst.setInt(2, proveedor.getTelefono());
                pst.setString(3, proveedor.getDireccion());
                pst.execute();
                return true;
            }
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Erro al cargar nuevo proveedor "+e);
            return false;
        }
    }
    
}
