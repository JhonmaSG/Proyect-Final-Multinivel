/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection extends Connector {

    public MySqlConnection() {
        // Constructor de la subclase
    }

    @Override
    public Connection getConnection() {
        // Implementación personalizada del método getConnection() según tus necesidades
        Connection connection = null;
        // Código para establecer la conexión a la base de datos
        return connection;
    }
}
