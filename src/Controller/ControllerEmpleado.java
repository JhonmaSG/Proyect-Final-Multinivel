/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.EmpDao;
import Model.Empleado;
import View.AdmAyudaListView;
import View.AdmEmpleadoDataView;
import View.AdmInventarioListView;
import View.AdmEmpleadoListView;
import View.AdmPrincipalListView;
import View.AdmFacturaListView;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Jhon
 */
public class ControllerEmpleado {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmFacturaListView facturaView;
    private AdmAyudaListView ayudaView;
    
    private AdmEmpleadoDataView agregarView;
    
    //Model
    private Empleado empleadoModel; 
    //Dao
    private EmpDao dao;

    public ControllerEmpleado(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView,
            AdmInventarioListView inventarioView, AdmFacturaListView facturaView, AdmAyudaListView ayudaView,
            AdmEmpleadoDataView agregarView, Empleado empleadoModel) throws SQLException {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        this.agregarView = agregarView;
        this.empleadoModel = empleadoModel;
        
        this.dao = new EmpDao();
        //empleadoView.setVisible(true);
        mostrarDatos();
        //VENTANAS DE FRAME
        //PRINCIPAL
        empleadoView.cambiarPrincipal( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            principalView.setVisible(true);
        });
        //INVENTARIO
        empleadoView.cambiarInventario( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            inventarioView.setVisible(true);
        });
        //VENTAS-FACTURA
        empleadoView.cambiarFactura( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            facturaView.setVisible(true);
        });
        //AYUDA
        empleadoView.cambiarAyuda( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            ayudaView.setVisible(true);
        });
        //BOTONES
        //AGREGAR
        empleadoView.agregar( (ActionEvent e) -> {
            agregarView.setVisible(true);
        });
        }
    
    void mostrarDatos() throws SQLException{
        ArrayList<Empleado> models = dao.findAll();
        this.empleadoView.mostrarDatos(models);
    }
}
