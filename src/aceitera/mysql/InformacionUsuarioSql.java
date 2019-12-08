package aceitera.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformacionUsuarioSql {

    String nombre;
    String telefono;
    String clave;
    String usuario;
    String rango;
    String estado;
    
    public InformacionUsuarioSql(String Usuario) {
        this.usuario = Usuario;
        Conector conector = new Conector();
        Connection connection;
        String sql;
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            connection = conector.getConnection();
            sql = "SELECT * FROM usuarios WHERE usuario = '"+Usuario+"'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                nombre = rs.getString("nombre");
                telefono = String.valueOf(rs.getInt("telefono"));
                clave = rs.getString("clave");
                rango = rs.getString("rango");
                estado = rs.getString("estado");
            }
            
        } catch (SQLException e) {
            System.out.println("Error al obtener informacion del usuario "+e);
        }
    }

    public InformacionUsuarioSql() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getClave() {
        return clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getRango() {
        return rango;
    }

    public String getEstado() {
        return estado;
    }
    
    
}
