/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterface.InvenDaoInterface;
import Model.Empleado;
import Model.Inventario;
import com.sun.jdi.connect.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class InvenDao implements InvenDaoInterface{
    Connector connector = null;
    
    public InvenDao(){
        this.connector = new Connector();
    }
    
    @Override
    public void update(Inventario inventarioModel) {
        String sql = "UPDATE INVENTARIO SET Nombre_Mp = ?, Descrip_Mp = ?, Cant_Exist_Mp = ?";
       
        try{
            Inventario modelUpdate = (Inventario) inventarioModel;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getNombre_Mp());
            statement.setString(2, modelUpdate.getDescrip_Mp());
            statement.setString(3, modelUpdate.getCant_Exist_Mp());
            
            statement.setString(4, modelUpdate.getId() + "");
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Inventario inventarioModel) {
       String sql = "INSERT INTO INVENTARIO (Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES(?, ?, ?)";
       
        try{
            Inventario modelUpdate = (Inventario) inventarioModel;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getNombre_Mp());
            statement.setString(2, modelUpdate.getDescrip_Mp());
            statement.setString(3, modelUpdate.getCant_Exist_Mp());
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM INVENTARIO WHERE Cod_Mp = ?";
        
        try{            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);            
            statement.setString(1, id + "");

            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
        
    }
    
    @Override
    public Empleado findById(int id) {
        String sql = "SELECT * FROM INVENTARIO WHERE Cod_Mp = ?";
        Inventario model = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                model = new Inventario(
                   resultSet.getInt("Id Material"),
                   resultSet.getString("Nombre Material"),
                   resultSet.getString("Descripcion Material"),
                   resultSet.getString("Cantidad Existente"),
              
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return model;
    }
    
    public ArrayList<Inventario> findAll(){
        String sql = "SELECT * FROM INVENTARIO";
        ArrayList<Inventario> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Inventario model = new Inventario(
                   resultSet.getInt("Id Material"),
                   resultSet.getString("Nombre Material"),
                   resultSet.getString("Descripcion Material"),
                   resultSet.getString("Cantidad Existente")
                );
                lista.add(model);
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return lista;
    }
}
