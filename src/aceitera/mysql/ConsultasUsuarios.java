package aceitera.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasUsuarios {

    public ConsultasUsuarios() {
        Conector con = new Conector();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection connection = con.getConnection();
        
        String sql = "SELECT * FROM usuarios WHERE usuario = ?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, sql);
        } catch (Exception e) {
        }
    }
    
}
