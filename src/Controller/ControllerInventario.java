/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Dao.InvenDao;
import Model.Inventario;
import View.AdmAyudaListView;
import View.AdmInventarioListView;
import View.AdmEmpleadoListView;
import View.AdmPrincipalListView;
import View.AdmFacturaListView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class ControllerInventario {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmFacturaListView facturaView;
    private AdmAyudaListView ayudaView;
    
    //Model
    private Inventario inventarioModel;
    private InvenDao dao;

    public ControllerInventario(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView,
            AdmInventarioListView inventarioView, AdmFacturaListView facturaView, AdmAyudaListView ayudaView,
            Inventario inventarioModel ) throws SQLException {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        this.inventarioModel = inventarioModel;
        
        this.dao = new InvenDao();
        mostrarDatos();
        //inventarioView.setVisible(true);
        
        //PRINCIPAL
        inventarioView.cambiarPrincipal( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            principalView.setVisible(true);
        });
        //EMPLEADO
        inventarioView.cambiarEmpleado( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //VENTAS-FACTURA
        inventarioView.cambiarFactura( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            facturaView.setVisible(true);
        });
        //AYUDA
        inventarioView.cambiarAyuda( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            ayudaView.setVisible(true);
        });
    }
    void mostrarDatos() throws SQLException{
        ArrayList<Inventario> models = dao.findAll();
        this.inventarioView.mostrarDatos(models);
    }
}
