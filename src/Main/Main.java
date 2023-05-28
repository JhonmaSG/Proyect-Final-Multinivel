/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Controller.ControllerAyuda;
import Controller.ControllerEmpleado;
import Controller.ControllerInventario;
import Controller.ControllerPrincipal;
import Controller.ControllerFactura;
import Model.Empleado;
import Model.Factura;
import Model.Inventario;
import View.AdmAyudaListView;
import View.AdmEmpleadoListView;
import View.AdmFacturaListView;
import View.AdmInventarioListView;
import View.AdmPrincipalListView;
import java.sql.SQLException;

/**
 *
 * @author Jhon
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        AdmPrincipalListView principalView = new AdmPrincipalListView();
        AdmEmpleadoListView empleadoView = new AdmEmpleadoListView();
        AdmInventarioListView inventarioView = new AdmInventarioListView();
        AdmFacturaListView facturaView = new AdmFacturaListView();
        AdmAyudaListView ayudaView = new AdmAyudaListView();
        
        Empleado  empleadoModel = null;
        Inventario  inventarioModel = null;
        Factura  facturaModel = null;
        
        ControllerPrincipal principalController = new ControllerPrincipal(
                    principalView,empleadoView, inventarioView,
                    facturaView, ayudaView);
        ControllerEmpleado empleadoController = new ControllerEmpleado(
                    principalView, empleadoView, inventarioView,
                    facturaView, ayudaView, empleadoModel);
        ControllerInventario inventarioController = new ControllerInventario(
                    principalView, empleadoView, inventarioView,
                    facturaView, ayudaView, inventarioModel);
        ControllerFactura facturaController = new ControllerFactura(
                    principalView, empleadoView, inventarioView,
                    facturaView, ayudaView, facturaModel);
        ControllerAyuda ayudaController = new ControllerAyuda(
                    principalView, empleadoView, inventarioView,
                    facturaView, ayudaView);
    }
}
