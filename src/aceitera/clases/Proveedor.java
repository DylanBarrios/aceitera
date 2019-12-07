package aceitera.clases;

public class Proveedor {
    
    String Nombre;
    int Telefono;
    String Direccion;

    public Proveedor(String Nombre, int Telefono, String Direccion) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
}
