package aceitera.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InformacionProductoSql {

    String NombreProducto;
    int PrecioVenta;
    int ExistenciaProducto;
    String Vendedor;
    int Telefono;
    int PrecioCompra;
    String Notas;

    public InformacionProductoSql(String Producto) {
        this.NombreProducto = Producto;
        Conector conector = new Conector();
        Connection connection;
        String sql;
        PreparedStatement pst;
        ResultSet rs;

        try {
            connection = conector.getConnection();
            sql = "SELECT * FROM productos WHERE nombreProducto = '" + Producto + "'";
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                NombreProducto = rs.getString("nombreProducto");
                PrecioVenta = rs.getInt("precioVenta");
                ExistenciaProducto = rs.getInt("existenciaProducto");
                Vendedor = rs.getString("vendedor");
                Telefono = rs.getInt("telefono");
                PrecioCompra = rs.getInt("precioCompra");
                Notas = rs.getString("notas");
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener informacion del proveedor " + e);
        }
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getExistenciaProducto() {
        return ExistenciaProducto;
    }

    public void setExistenciaProducto(int ExistenciaProducto) {
        this.ExistenciaProducto = ExistenciaProducto;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(int PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }

    
}
