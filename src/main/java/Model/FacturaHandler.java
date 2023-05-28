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
public class FacturaHandler {
    ConnectorDB conexion = new ConnectorDB("confeccionista");

    public FacturaHandler() {
        conexion.conectar();
    }
    
    public ArrayList<Factura> getAllFactura(){
        
        Factura factura = null;
        ArrayList<Factura> Facturas = new ArrayList<>();
        
        try(Connection connection=conexion.conectar()){
            String query = "SELECT * FROM `FACTURA`";        
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
            String query = "SELECT * FROM `FACTURA` WHERE tipo_combustible="+combustible;        
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
            String query = "INSERT INTO `FACTURA` (No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES('"+facturas.getNo_Fv()+
                    "',"+facturas.getFecha_Hora_Fv()+","+facturas.getMetodo_Fv()+",'"+facturas.getDescrip_Fv()+"',"+facturas.getTotal_Pagar_Fv()+"')";        
            PreparedStatement stmt = connection.prepareStatement(query);
 
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
