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
public class ControllerAyuda {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView empleadoView;
    private AdmFacturaListView facturaView;
    private AdmAyudaListView ayudaView;

    public ControllerAyuda(AdmPrincipalListView principalView, AdmEmpleadoListView empleadoView,
            AdmInventarioListView inventarioView, AdmFacturaListView facturaView, AdmAyudaListView ayudaView) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.empleadoView = empleadoView;
        this.facturaView = facturaView;
        this.ayudaView = ayudaView;
        
        //ayudaView.setVisible(true);
        
        //PRINCIPAL
        ayudaView.cambiarPrincipal( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            principalView.setVisible(true);
        });
        //EMPLEADO
        ayudaView.cambiarEmpleado((ActionEvent e) -> {
            ayudaView.setVisible(false);
            empleadoView.setVisible(true);
        });
        //INVENTARIO
        ayudaView.cambiarInventario( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            inventarioView.setVisible(true);
        });
        //VENTAS-FACTURA
        ayudaView.cambiarFactura( (ActionEvent e) -> {
            ayudaView.setVisible(false);
            facturaView.setVisible(true);
        });
        
    } 
}
