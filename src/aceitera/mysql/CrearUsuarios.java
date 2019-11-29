package aceitera.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CrearUsuarios {

    public CrearUsuarios() {
        Conector con = new Conector();
        PreparedStatement pst = null;
        Connection connection = con.getConnection();
        
        String sql = "SELECT * FROM usuarios WHERE usuario = ?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, sql);
        } catch (Exception e) {
            System.err.println("Error al obtener al crear usuario"+e);
        }
    }
    
}
