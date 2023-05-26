/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;

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
