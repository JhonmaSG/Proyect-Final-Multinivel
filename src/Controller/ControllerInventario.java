/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Inventario;
import View.AdmAyudaListView;
import View.AdmInventarioListView;
import View.AdmEmpleadoListView;
import View.AdmPrincipalListView;
import View.AdmVentasListView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jhon
 */
public class ControllerInventario {
    private AdmPrincipalListView principalView;
    private AdmInventarioListView inventarioView;
    private AdmEmpleadoListView nominaView;
    private AdmVentasListView ventasView;
    private AdmAyudaListView ayudaView;
    
    //Model
    private Inventario inventarioModel;

    public ControllerInventario(AdmPrincipalListView principalView, AdmInventarioListView inventarioView, AdmEmpleadoListView nominaView, AdmVentasListView ventasView, AdmAyudaListView ayudaView, Inventario inventarioModel ) {
        this.principalView = principalView;
        this.inventarioView = inventarioView;
        this.nominaView = nominaView;
        this.ventasView = ventasView;
        this.ayudaView = ayudaView;
        this.inventarioModel = inventarioModel;
        
        inventarioView.setVisible(true);
        
        //PRINCIPAL
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            principalView.setVisible(true);
        });
        //EMPLEADO
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            nominaView.setVisible(true);
        });
        //VENTAS-FACTURA
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            ventasView.setVisible(true);
        });
        //AYUDA
        inventarioView.JMenuInicioMouseClicked( (ActionEvent e) -> {
            inventarioView.setVisible(false);
            ayudaView.setVisible(true);
        });
    }  
}
