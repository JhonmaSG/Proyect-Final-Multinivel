/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import DaoInterface.FacDaoInterface;
import Model.Factura;
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
public class FacDao implements FacDaoInterface{
    Connector connector = null;
    
    public FacDao(){
        this.connector = new Connector();
    }
    
    @Override
    public void update(Factura facturaModel) {
        String sql = "UPDATE FACTURA SET Fecha_Hora_Fv = ?, Metodo_Fv = ?, Descrip_Fv = ?, Total_Pagar_Fv = ?";
       
        try{
            Factura modelUpdate = (Factura) facturaModel;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getFecha_Hora_Fv());
            statement.setString(2, modelUpdate.getMetodo_Fv());
            statement.setString(3, modelUpdate.getDescrip_Fv());
            statement.setString(4, modelUpdate.getTotal_Pagar_Fv());
            
            statement.setString(5, modelUpdate.getId() + "");
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Factura facturaModel) {
       String sql = "INSERT INTO FACTURA (Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES(?, ?, ?)";
       
        try{
            Factura modelUpdate = (Factura) facturaModel;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getFecha_Hora_Fv());
            statement.setString(2, modelUpdate.getMetodo_Fv());
            statement.setString(3, modelUpdate.getDescrip_Fv());
            statement.setString(4, modelUpdate.getTotal_Pagar_Fv());
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM FACTURA WHERE Cod_Mp = ?";
        
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
    public Factura findById(int id) {
        String sql = "SELECT * FROM FACTURA WHERE Cod_Mp = ?";
        Factura model = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                model = new Factura(
                   resultSet.getInt("Id Factura"),
                   resultSet.getString("Fecha Factura"),
                   resultSet.getString("Descripcion Factura"),
                   resultSet.getString("Metodo De Pago"),
                   resultSet.getString("Total Pagar"),
              
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return model;
    }
    
    public ArrayList<Factura> findAll(){
        String sql = "SELECT * FROM FACTURA";
        ArrayList<Factura> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Factura model = new Factura(
                   resultSet.getInt("Id Factura"),
                   resultSet.getString("Fecha Factura"),
                   resultSet.getString("Descripcion Factura"),
                   resultSet.getString("Metodo De Pago"),
                   resultSet.getString("Total Pagar")
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
