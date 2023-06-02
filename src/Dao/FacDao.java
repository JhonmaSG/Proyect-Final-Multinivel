/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


import DaoInterface.FacDaoInterface;
import Model.Factura;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.Transport;
import database.MySqlConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Jhon
 */
public class FacDao implements FacDaoInterface {
    MySqlConnection connection = new MySqlConnection();
    
    public FacDao(){
        this.connection = (MySqlConnection) new database.Connector();
    }
    
    @Override
    public void update(Factura facturaModel){
        String sql = "UPDATE factura SET Fecha_Hora_Fv = ?, Metodo_Fv = ?, Descrip_Fv = ?, Total_Pagar_Fv = ?";
       
        try{
            Factura modelUpdate = (Factura) facturaModel;
            
            PreparedStatement statement;
            statement = connection.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getFecha_Hora_Fv());
            statement.setString(2, modelUpdate.getMetodo_Fv());
            statement.setString(3, modelUpdate.getDescrip_Fv());
            statement.setString(4, modelUpdate.getTotal_Pagar_Fv());
            
            statement.setString(5, modelUpdate.getId() + "");
                    
            statement.executeUpdate();
            
            statement.close();
            connection.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Factura facturaModel) {
       String sql = "INSERT INTO factura (Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES(?, ?, ?)";
       
        try{
            Factura modelUpdate = (Factura) facturaModel;
            
            PreparedStatement statement;
            statement = connection.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getFecha_Hora_Fv());
            statement.setString(2, modelUpdate.getMetodo_Fv());
            statement.setString(3, modelUpdate.getDescrip_Fv());
            statement.setString(4, modelUpdate.getTotal_Pagar_Fv());
                    
            statement.executeUpdate();
            
            statement.close();
            connection.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM factura WHERE Cod_Mp = ?";
        
        try{            
            PreparedStatement statement;
            statement = connection.getConnection().prepareStatement(sql);            
            statement.setString(1, id + "");

            statement.executeUpdate();
            
            statement.close();
            connection.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error" + ex.getMessage());
        }
        
    }
    
    @Override
    public Factura findById(int id) {
        String sql = "SELECT * FROM factura WHERE Cod_Mp = ?";
        Factura model = null;
         
        try{
            PreparedStatement statement;
            statement = connection.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                model = new Factura(
                   resultSet.getInt("No_Fv"),
                   resultSet.getString("Fecha_Hora_Fv"),
                   resultSet.getString("Metodo_Fv"),
                   resultSet.getString("Descrip_Fv"),
                   resultSet.getString("Total_Pagar_Fv"));
              
            }
            
            resultSet.close();
            statement.close();
            connection.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return model;
    }
    
    public ArrayList<Factura> findAll(){
        String sql = "SELECT * FROM factura";
        ArrayList<Factura> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connection.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Factura model = new Factura(
                   resultSet.getInt("No_Fv"),
                   resultSet.getString("Fecha_Hora_Fv"),
                   resultSet.getString("Metodo_Fv"),
                   resultSet.getString("Descrip_Fv"),
                   resultSet.getString("Total_Pagar_Fv")
                );
                lista.add(model);
            }
            
            resultSet.close();
            statement.close();
            connection.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return lista;
    }
}
