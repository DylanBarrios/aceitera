package aceitera.clases;

import java.sql.Timestamp;

public class Ventas {
    
    String nombreProducto;
    int cantidad;
    int total;
    String vendedor;
    Timestamp fecha;

    public Ventas(String nombreProducto, int cantidad, int total, String vendedor, Timestamp fecha) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.total = total;
        this.vendedor = vendedor;
        this.fecha = fecha;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
    
}
