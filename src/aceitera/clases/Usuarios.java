package aceitera.clases;

public class Usuarios {
    
    private String nombre;
    private int telefono;
    private String clave;
    private String usuario;
    private String rango;
    private String estado;

    public Usuarios(String nombre, int telefono, String clave, String usuario, String rango, String estado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.clave = clave;
        this.usuario = usuario;
        this.rango = rango;
        this.estado = estado;
    }

    public Usuarios() {
    }

    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
}
