package aceitera.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VerUsuarios {
    
    public static ResultSet getUsuarios(String consulta){
        Conector conector = new Conector();
        Connection connection = conector.getConnection();                       //Se inicializa la conexion a la D.B.
        Statement st;
        ResultSet rs = null;
        try {
            st=connection.createStatement();                                    //Crea un consulta
            rs = st.executeQuery(consulta);                                     //Evalua la consulta
        } catch (SQLException e) {
            System.err.println("Error al obtener usuarios"+e);                  //Muestra un erro si llegara a suceder
        }
        return rs;
    }
}
