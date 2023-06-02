/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.EmpDao;
import Dao.FacDao;
import Model.Empleado;
import Model.Factura;
import Model.Inventario;
import View.AdmAyudaListView;
import View.AdmEmpleadoListView;
import View.AdmInventarioListView;
import View.AdmPrincipalListView;
import View.AdmFacturaListView;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class ControllerFactura {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmFacturaListView facturaView;
    private AdmAyudaListView ayudaView;
    
    //Model
    private Factura facturaModel;
    private FacDao dao;

    public ControllerFactura(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView,
            AdmInventarioListView inventarioView,AdmFacturaListView facturaView, AdmAyudaListView ayudaView, Factura facturaModel) throws SQLException {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        
        this.dao = new FacDao();
        mostrarDatos();
        //facturaView.setVisible(true);
        
        //PRINCIPAL
        facturaView.cambiarPrincipal( (ActionEvent e) -> {
            facturaView.setVisible(false);
            principalView.setVisible(true);
        });
        //INVENTARIO
        facturaView.cambiarInventario( (ActionEvent e) -> {
            facturaView.setVisible(false);
            inventarioView.setVisible(true);
        });
        //EMPLEADO
        facturaView.cambiarEmpleado( (ActionEvent e) -> {
            facturaView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //AYUDA
        facturaView.cambiarAyuda( (ActionEvent e) -> {
            facturaView.setVisible(false);
            ayudaView.setVisible(true);
        });
        
        //BOTONES
        //AGREGAR
        empleadoView.agregar( (ActionEvent e) -> {
            
            });
        //MODIFICAR
        empleadoView.modificar( (ActionEvent e) -> {

            });
        //ELIMINAR
        empleadoView.eliminar( (ActionEvent e) -> {

            });
        //EXPORTAR
        empleadoView.exportar( (ActionEvent e) -> {

            });
        
    }
    void mostrarDatos() throws SQLException{
        ArrayList<Factura> models = dao.findAll();
        this.facturaView.mostrarDatos(models);
    }
}
