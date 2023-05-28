/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectorDB {
    
    String bd = "";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "";    
    String driver  = "com.mysql.cj.jdbc.Driver";
    
    Connection cx;

    public ConnectorDB(String bd){
        this.bd = bd;
    }

    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Conexion exitosa con la bd " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se Conecto a la BD, error: " + ex.getMessage());   
            Logger.getLogger(ConnectorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            if( cx != null ){
                System.out.println("Se cerro la conexion");
                cx.close();
            }
        } catch (SQLException ex){
            //Logger.getLogger(ConnectorDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al cerrar Conexion "+ ex.toString() );
        }
    }
    
}

