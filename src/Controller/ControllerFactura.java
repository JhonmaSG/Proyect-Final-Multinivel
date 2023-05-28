/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Factura;
import View.AdmAyudaListView;
import View.AdmEmpleadoListView;
import View.AdmInventarioListView;
import View.AdmPrincipalListView;
import View.AdmFacturaListView;
import java.awt.event.ActionEvent;

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

    public ControllerFactura(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView,
            AdmInventarioListView inventarioView,AdmFacturaListView facturaView, AdmAyudaListView ayudaView, Factura facturaModel) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        
        //Model
        this.facturaModel = facturaModel;
        
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
        
    }  
}
