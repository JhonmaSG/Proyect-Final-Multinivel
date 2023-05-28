/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
public class ControllerAyuda {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmVentasListView ventasView;
    private AdmAyudaListView ayudaView;

    public ControllerAyuda(AdmPrincipalListView principalView, AdmInventarioListView inventarioView, AdmEmpleadoListView empleadoView, AdmVentasListView ventasView, AdmAyudaListView ayudaView) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.ventasView = ventasView;
        this.ayudaView = ayudaView;
        
        ayudaView.setVisible(true);
        
        //PRINCIPAL
        ayudaView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            principalView.setVisible(true);
        });
        //IMVENTARIO
        ayudaView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            inventarioView.setVisible(true);
        });
        
        //EMPLEADO
        ayudaView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //VENTAS-FACTURA
        ayudaView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            ventasView.setVisible(true);
        });
        
    } 
}
