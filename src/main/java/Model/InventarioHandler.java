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
public class InventarioHandler {
    ConnectorDB conexion = new ConnectorDB("confeccionista");

    public InventarioHandler() {
        conexion.conectar();
    }
    
    public ArrayList<Inventario> getAllInventario(){
        
        Inventario inventario = null;
        ArrayList<Inventario> Inventarios = new ArrayList<>();
        
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `ventas`";        
            Statement stmt = connection.createStatement();                        
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                //empleado = new Empleado(result.getInt("id"),result.getString("tipo_combustible"), result.getFloat("galones"), result.getFloat("precio"),result.getString("fecha"));
                Inventarios.add(inventario);   
            }
            stmt.close();
            result.close();
            return Inventarios;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }                        
    }
    
        public ArrayList<Inventario> getInventario(String combustible){
        Inventario inventario = null;
        ArrayList<Inventario> Inventarios = new ArrayList<>();
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `INVENTARIO` WHERE tipo_combustible="+combustible;        
            Statement stmt = connection.createStatement();                        
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                //inventario = new Inventario(result.getInt("id"),result.getString("tipo_combustible"), result.getFloat("galones"), result.getFloat("precio"),result.getString("fecha"));
                Inventarios.add(inventario);
            }
            stmt.close();
            result.close();
            return Inventarios;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }                        
    }
    
    public void Insert(Inventario inventarios){
        try(Connection connection=conexion.conectar()){
            String query = "INSERT INTO `INVENTARIO` (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES('"+inventarios.getCod_Mp()+
                    "',"+inventarios.getNombre_Mp()+","+inventarios.getDescrip_Mp()+",'"+inventarios.getCant_Exist_Mp()+"')";
            PreparedStatement stmt = connection.prepareStatement(query);     
 
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
