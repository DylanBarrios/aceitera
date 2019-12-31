package aceitera.clases;

public class Producto {
    String nombreProducto;
    int precioVenta;
    int cantidad;
    String vendedor;
    int telefono;
    int precioCompra;
    String notas;

    public Producto(String nombreProducto, int precioVenta, int cantidad, String vendedor, int telefono, int precioCompra, String notas) {
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

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
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

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
}
