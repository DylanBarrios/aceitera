package aceitera.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformacionProveedorSql {

    String proveedor;
    String telefono;
    String direccion;
    String estado;
    
    public InformacionProveedorSql(String Proveedor) {
        this.proveedor = Proveedor;
        Conector conector = new Conector();
        Connection connection;
        String sql;
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            connection = conector.getConnection();
            sql = "SELECT * FROM proveedores WHERE nombre = '"+Proveedor+"'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                proveedor = rs.getString("nombre");
                telefono = String.valueOf(rs.getInt("telefono"));
                direccion = rs.getString("direccion");
                estado = rs.getString("estado");
            }
            
        } catch (SQLException e) {
            System.out.println("Error al obtener informacion del proveedor "+e);
        }
    }

    public InformacionProveedorSql() {
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
