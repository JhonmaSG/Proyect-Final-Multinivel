/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Factura;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class AdmVentasView {
    public void mostrarDatos(ArrayList<Factura> models){
        for (Factura p:models) {
            System.out.println(p.getId());
            //System.out.println(p.getNombre());
        }
    }
}
