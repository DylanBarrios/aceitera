package aceitera.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Busqueda {
    
    public static ResultSet getResultset(String consulta){
        Statement st;
        ResultSet rs = null;
        try {
            st = Conector.getConnection().createStatement();                    //Crea un consulta
            rs = st.executeQuery(consulta);                                     //Evalua la consulta que le enviaron como parametro
        } catch (SQLException e) {
            System.err.println("Error al obtener usuarios"+e);                  //Muestra un erro si llegara a suceder
        }
        return rs;                                                              //Retorna el resultset de la consulta hecha
    }
    
     public static PreparedStatement getStatement(String consulta){
        PreparedStatement st = null;
        try {
            st = Conector.getConnection().prepareStatement(consulta);                    //Crea un consulta
        } catch (SQLException e) {
            System.err.println("Error al realizar busqueda"+e);                  //Muestra un erro si llegara a suceder
        }
        return st;                                                              //Retorna el resultset de la consulta hecha
    }
}