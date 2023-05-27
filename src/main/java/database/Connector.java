/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
public class Connector {
    private String nameDatabase = "cine";
    private Connection connection = null;
    
    
    public Connector() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(
                "jdbc:sqlite:C:\\Users\\Jhon\\Documents\\NetBeansProjects\\ProyectoFinalMulti\\Base de datos\\" + nameDatabase+".db");
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
*/
public class Connector {
    
    String bd = "";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";    
    String driver  = "com.mysql.cj.jdbc.Driver"; // SI HAY PROBLEMAS CAMBIAR POR "com.mysql.cj.jdbc.Driver"
    
    Connection cx;

    public Connector(String bd){
        this.bd = bd;
    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, user, password);
            System.out.println("Conexion exitosa con la bd " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se Conecto a la BD, error: " + ex.getMessage());   
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

