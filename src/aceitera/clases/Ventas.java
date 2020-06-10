package aceitera.clases;

import java.sql.Timestamp;

public class Ventas {
    
    String nombreProducto;
    int cantidad;
    Double total;
    String vendedor;
    String fecha;

    public Ventas(String nombreProducto, int cantidad, Double total, String vendedor, String fecha) {
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
