/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterface.EmpDaoInterface;
import Model.Empleado;
import database.Connector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class EmpDao implements EmpDaoInterface{
    Connector connector = null;
    
    public EmpDao(){
        this.connector = new Connector();
    }
    
    @Override
    public void update(Empleado empleadoModel) {
        String sql = "UPDATE empleado SET Nombre_Em = ?, Apellido_Em = ?, Cargo = ?, Tel_Em = ?, correo_Em = ?,Des_Pension = ?"
                + ", Des_Salud = ?, Salario = ?";
       
        try{
            Empleado modelUpdate = (Empleado) empleadoModel;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getNombre_Em());
            statement.setString(2, modelUpdate.getApellido_Em());
            statement.setString(3, modelUpdate.getCargo());
            statement.setString(4, modelUpdate.getTel_Em()+"");
            statement.setString(5, modelUpdate.getCorreo_Em());
            statement.setString(6, modelUpdate.getDes_Pension()+"");
            statement.setString(7, modelUpdate.getDes_Salud()+"");
            statement.setString(8, modelUpdate.getSalario()+"");
            
            statement.setString(9, modelUpdate.getId() + "");
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error update" + ex.getMessage());
        }
    }

    @Override
    public void create(Empleado empleadoModel) {
       String sql = "INSERT INTO empleado (Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario)" +
               "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
       
        try{
            Empleado modelUpdate = (Empleado) empleadoModel;
            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            
            statement.setString(1, modelUpdate.getNombre_Em());
            statement.setString(2, modelUpdate.getApellido_Em());
            statement.setString(3, modelUpdate.getCargo());
            statement.setString(4, modelUpdate.getTel_Em()+"");
            statement.setString(5, modelUpdate.getCorreo_Em());
            statement.setString(6, modelUpdate.getDes_Pension()+"");
            statement.setString(7, modelUpdate.getDes_Salud()+"");
            statement.setString(8, modelUpdate.getSalario()+"");
                    
            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error create" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from empleado where Id_Em = ?";
        
        try{            
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);            
            statement.setString(1, id + "");

            statement.executeUpdate();
            
            statement.close();
            connector.getConnection().close();
        } catch(Exception ex){
            System.out.println("Error deleteById" + ex.getMessage());
        }
    }
    
    @Override
    public Empleado findById(int id) {
        String sql = "select * from empleado where id = ?";
        Empleado model = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                model = new Empleado(
                   resultSet.getInt("Id_Em"),
                   resultSet.getString("Nombre_Em"),
                   resultSet.getString("Apellido_Em"),
                   resultSet.getString("Cargo"),
                   resultSet.getString("Tel_Em"),
                   resultSet.getString("correo_Em"),
                   resultSet.getString("Des_Pension"),
                   resultSet.getString("Des_Salud"),
                   resultSet.getString("Salario"));
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error findAll" + ex.getMessage());
        }
        
        return model;
    }
    
    public ArrayList<Empleado> findAll(){
        String sql = "select * from empleado";
        ArrayList<Empleado> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Empleado model = new Empleado(
                   resultSet.getInt("Id_Em"),
                   resultSet.getString("Nombre_Em"),
                   resultSet.getString("Apellido_Em"),
                   resultSet.getString("Cargo"),
                   resultSet.getString("Tel_Em"),
                   resultSet.getString("correo_Em"),
                   resultSet.getString("Des_Pension"),
                   resultSet.getString("Des_Salud"),
                   resultSet.getString("Salario")
                );
                lista.add(model);
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
            System.out.println("Conexion realizada FindAll");
        } catch(SQLException ex){
            System.out.println("Error5 " + ex.getMessage());
        }
        
        return lista;
    }
    
}