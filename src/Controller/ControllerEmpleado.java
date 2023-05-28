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
import View.AdmFacturaListView;
import java.awt.event.ActionEvent;

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
    
    //Model
    private Empleado empleadoModel;

    public ControllerEmpleado(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView,
            AdmInventarioListView inventarioView, AdmFacturaListView facturaView, AdmAyudaListView ayudaView,
            Empleado empleadoModel) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        this.empleadoModel = empleadoModel;
        
        //empleadoView.setVisible(true);
        
        //PRINCIPAL
        empleadoView.cambiarPrincipal( (ActionEvent e) -> {
            empleadoView.setVisible(false);
            principalView.setVisible(true);
        });
        //IMVENTARIO
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
    }  
}
