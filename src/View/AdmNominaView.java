/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Empleado;
import Model.Factura;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class AdmNominaView {
    public void mostrarDatos(ArrayList<Empleado> models){
        for (Empleado p:models) {
            System.out.println(p.getId());
            //System.out.println(p.getNombre());
        }
    }
}
