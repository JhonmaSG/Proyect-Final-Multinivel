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
import View.AdmVentasListView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Jhon
 */
public class ControllerVentas {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmVentasListView ventasView;
    private AdmAyudaListView ayudaView;
    
    //Model
    private Factura facturaModel;

    public ControllerVentas(AdmPrincipalListView principalView, AdmInventarioListView inventarioView, AdmEmpleadoListView empleadoView, AdmVentasListView ventasView, AdmAyudaListView ayudaView, Factura facturaModel) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.ventasView = ventasView;
        this.ayudaView = ayudaView;
        
        //Model
        this.facturaModel = facturaModel;
        
        //PRINCIPAL
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            principalView.setVisible(true);
        });
        //INVENTARIO
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            ventasView.setVisible(true);
        });
        //EMPLEADO
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //AYUDA
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            ayudaView.setVisible(true);
        });
        
    }  
}
