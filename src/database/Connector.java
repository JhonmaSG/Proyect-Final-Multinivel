/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connector {
    
    String bd = "confeccionista";
    String url = "jdbc:mysql://localhost:3307/";
    String user = "root";
    String password = "";
    String driver  = "com.mysql.cj.jdbc.Driver";
    
    Connection conexion;
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Conexion exitosa con la bd " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se Conecto a la BD, error: " + ex.getMessage());
        }
        return conexion;
    }
    
    public void desconectar(){
        try {
            if( conexion != null ){
                System.out.println("Se cerro la conexion");
                conexion.close();
            }
        } catch (SQLException ex){
            System.out.println("Error al cerrar Conexion "+ ex.toString() );
        }
    }
    
    public Connection getConnection() {
        if (conexion == null) {
            conexion = conectar();
        }
        return conexion;
    }
}

