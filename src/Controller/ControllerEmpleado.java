/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Empleado;
import View.AdmAyudaListView;
import View.AdmInventarioListView;
import View.AdmEmpleadoListView;
import View.AdmPrincipalListView;
import View.AdmVentasListView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jhon
 */
public class ControllerEmpleado {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmVentasListView ventasView;
    private AdmAyudaListView ayudaView;
    
    //Model
    private Empleado empleadoModel;

    public ControllerEmpleado(AdmPrincipalListView principalView, AdmInventarioListView inventarioView, AdmEmpleadoListView empleadoView, AdmVentasListView ventasView, AdmAyudaListView ayudaView, Empleado empleadoModel) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.ventasView = ventasView;
        this.ayudaView = ayudaView;
        this.empleadoModel = empleadoModel;
        
        empleadoView.setVisible(true);
        
        //PRINCIPAL
        empleadoView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            principalView.setVisible(true);
        });
        //IMVENTARIO
        empleadoView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            inventarioView.setVisible(true);
        });
        //VENTAS-FACTURA
        empleadoView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            ventasView.setVisible(true);
        });
        //AYUDA
        empleadoView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            ayudaView.setVisible(true);
        });
    }  
}
