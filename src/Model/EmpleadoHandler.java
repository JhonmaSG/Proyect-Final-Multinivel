/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import database.ConnectorDB;
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
    ConnectorDB conexion = new ConnectorDB("confeccionista");

    public EmpleadoHandler() {
        conexion.conectar();
    }
    
    public ArrayList<Empleado> getAllEmpleado(){
        
        Empleado empleado = null;
        ArrayList<Empleado> Empleados = new ArrayList<>();
        
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `EMPLEADO`";        
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
            String query = "SELECT * FROM EMPLEADO WHERE tipo_combustible="+combustible;        
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
            String query = "INSERT INTO `EMPLEADO` (Id_Em, Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario)"
                    + " VALUES('"+empleados.getId_Em()+"',"+empleados.getNombre_Em()+","+empleados.getApellido_Em()+",'"+empleados.getCargo()
                    +"',"+empleados.getCorreo_Em()+"',"+empleados.getDes_Pension()+"',"+empleados.getDes_Salud()+"',"+empleados.getSalario()+"')";        
            PreparedStatement stmt = connection.prepareStatement(query);     
 
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
