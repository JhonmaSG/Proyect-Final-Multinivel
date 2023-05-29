/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import DaoInterface.EmpDaoInterface;
import Model.Empleado;
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
public class EmpDao implements EmpDaoInterface{
    Connector connector = null;
    
    public EmpDao(){
        this.connector = new Connector();
    }
    
    @Override
    public void update(Empleado empleadoModel) {
        String sql = "UPDATE EMPLEADO SET Nombre_Em = ?, Apellido_Em = ?, Cargo = ?, Tel_Em = ?, correo_Em = ?,Des_Pension = ?"
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
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void create(Empleado empleadoModel) {
       String sql = "INSERT INTO EMPLEADO (Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario)" +
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
            System.out.println("Error" + ex.getMessage());
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from EMPLEADO where Id_Em = ?";
        
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
        String sql = "select * from EMPLEADO where id = ?";
        Empleado model = null;
         
        try{
            PreparedStatement statement;
            statement = connector.getConnection().prepareStatement(sql);
            ResultSet resultSet;
            
            statement.setInt(1, id);
                    
            resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                model = new Empleado(
                   resultSet.getInt("Id"),
                   resultSet.getString("Nombre"),
                   resultSet.getString("Apellido"),
                   resultSet.getString("Cargo"),
                   resultSet.getString("Telefono"),
                   resultSet.getString("Correo"),
                   resultSet.getString("DesPension"),
                   resultSet.getString("DesSalud"),
                   resultSet.getString("Salario"));
              
            }
            
            resultSet.close();
            statement.close();
            connector.getConnection().close();
        } catch(SQLException ex){
            System.out.println("Error" + ex.getMessage());
        }
        
        return model;
    }
    
    public ArrayList<Empleado> findAll(){
        String sql = "SELECT * FROM EMPLEADO";
        ArrayList<Empleado> lista = new ArrayList<>();
        
        try {
            Statement statement;
       
            statement = connector.getConnection().createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sql);
        
            while (resultSet.next()) {
                Empleado model = new Empleado(
                   resultSet.getInt("Id"),
                   resultSet.getString("Nombre"),
                   resultSet.getString("Apellido"),
                   resultSet.getString("Cargo"),
                   resultSet.getString("Telefono"),
                   resultSet.getString("Correo"),
                   resultSet.getString("DesPension"),
                   resultSet.getString("DesSalud"),
                   resultSet.getString("Salario")
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
