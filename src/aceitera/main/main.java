package aceitera.main;

import aceitera.mysql.Conector;
import aceitera.uii.Login.Login;
import aceitera.uii.administrador.Administrador;

public class main {

    public static void main(String[] args) {
        Conector conexion = new Conector();
        Login login = new Login();
        login.setVisible(true);     
    }
}
