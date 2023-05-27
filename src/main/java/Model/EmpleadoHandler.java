/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import database.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class EmpleadoHandler {
    Connector conexion = new Connector("confeccionista");

    public EmpleadoHandler() {
        conexion.conectar();
    }
    
    public ArrayList<Empleado> getAllEmpleado(){
        
        Empleado empleado = null;
        ArrayList<Empleado> Empleados = new ArrayList<>();
        
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `ventas`";        
            Statement stmt = connection.createStatement();                        
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                //empleado = new Empleado(result.getInt("id"),result.getString("tipo_combustible"), result.getFloat("galones"), result.getFloat("precio"),result.getString("fecha"));
                Empleados.add(empleado);   
            }
            stmt.close();
            result.close();
            return Empleados;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }                        
    }
    
        public ArrayList<Empleado> getEmpleado(String combustible){
        Empleado empleado = null;
        ArrayList<Empleado> Empleados = new ArrayList<>();
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `ventas` WHERE tipo_combustible="+combustible;        
            Statement stmt = connection.createStatement();                        
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                //empleado = new Empleado(result.getInt("id"),result.getString("tipo_combustible"), result.getFloat("galones"), result.getFloat("precio"),result.getString("fecha"));
                Empleados.add(empleado);
            }
            stmt.close();
            result.close();
            return Empleados;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }                        
    }
    
    public void Insert(Empleado empleados){
        try(Connection connection=conexion.conectar()){
            String query = "INSERT INTO `ventas` (tipo_combustible,galones,precio,fecha) VALUES('"+venta.getNombre()+
                    "',"+empleados.getCantidad()+","+empleados.getPrecioTotal()+",'"+empleados.getFecha()+"')";        
            PreparedStatement stmt = connection.prepareStatement(query);     
 
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
