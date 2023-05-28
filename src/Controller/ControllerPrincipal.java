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
public class ControllerPrincipal {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmVentasListView ventasView;
    private AdmAyudaListView ayudaView;

    public ControllerPrincipal(AdmPrincipalListView principalView, AdmInventarioListView inventarioView, AdmEmpleadoListView empleadoView, AdmVentasListView ventasView, AdmAyudaListView ayudaView) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.ventasView = ventasView;
        this.ayudaView = ayudaView;
        
        principalView.setVisible(true);
        
        //IMVENTARIO
        principalView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            principalView.setVisible(false);
            inventarioView.setVisible(true);
        });
        //EMPLEADO
        principalView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            principalView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //VENTAS-FACTURA
        principalView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            principalView.setVisible(false);
            ventasView.setVisible(true);
        });
        //AYUDA
        principalView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            principalView.setVisible(false);
            ayudaView.setVisible(true);
        });
    }
}
