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
public class FacturaHandler {
    Connector conexion = new Connector("confeccionista");

    public FacturaHandler() {
        conexion.conectar();
    }
    
    public ArrayList<Factura> getAllFactura(){
        
        Factura factura = null;
        ArrayList<Factura> Facturas = new ArrayList<>();
        
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `ventas`";        
            Statement stmt = connection.createStatement();                        
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                //empleado = new Empleado(result.getInt("id"),result.getString("tipo_combustible"), result.getFloat("galones"), result.getFloat("precio"),result.getString("fecha"));
                Facturas.add(factura);   
            }
            stmt.close();
            result.close();
            return Facturas;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }                        
    }
    
        public ArrayList<Factura> getFactura(String combustible){
        Factura factura = null;
        ArrayList<Factura> Facturas = new ArrayList<>();
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `ventas` WHERE tipo_combustible="+combustible;        
            Statement stmt = connection.createStatement();                        
            ResultSet result = stmt.executeQuery(query);
            
            while(result.next()){
                //factura = new Factura(result.getInt("id"),result.getString("tipo_combustible"), result.getFloat("galones"), result.getFloat("precio"),result.getString("fecha"));
                Facturas.add(factura);
            }
            stmt.close();
            result.close();
            return Facturas;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }                        
    }
    
    public void Insert(Factura facturas){
        try(Connection connection=conexion.conectar()){
            String query = "INSERT INTO `ventas` (tipo_combustible,galones,precio,fecha) VALUES('"+venta.getNombre()+
                    "',"+facturas.getCantidad()+","+facturas.getPrecioTotal()+",'"+facturas.getFecha()+"')";        
            PreparedStatement stmt = connection.prepareStatement(query);     
 
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
