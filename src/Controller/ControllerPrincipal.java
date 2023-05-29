/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
public class ControllerPrincipal {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmFacturaListView facturaView;
    private AdmAyudaListView ayudaView;

    public ControllerPrincipal(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView
            , AdmInventarioListView inventarioView , AdmFacturaListView facturaView, AdmAyudaListView ayudaView) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        
        principalView.setVisible(true);
        
        //INVENTARIO
        principalView.cambiarInventario( (ActionEvent e) -> {
            principalView.setVisible(false);
            inventarioView.setVisible(true);
        });
        //EMPLEADO
        principalView.cambiarEmpleado( (ActionEvent e) -> {
            principalView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //VENTAS-FACTURA
        principalView.cambiarFactura( (ActionEvent e) -> {
            principalView.setVisible(false);
            facturaView.setVisible(true);
        });
        //AYUDA
        principalView.cambiarAyuda( (ActionEvent e) -> {
            principalView.setVisible(false);
            ayudaView.setVisible(true);
        });
    }
}
