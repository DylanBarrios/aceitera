package aceitera.clases;

public class Producto {
    String nombreProducto;
    Double precioVenta;
    int cantidad;
    String vendedor;
    int telefono;
    Double precioCompra;
    String notas;

    public Producto(String nombreProducto, Double precioVenta, int cantidad, String vendedor, int telefono, Double precioCompra, String notas) {
        this.nombreProducto = nombreProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.vendedor = vendedor;
        this.telefono = telefono;
        this.precioCompra = precioCompra;
        this.notas = notas;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
}
