/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Inventario;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public class AdmInventarioView {
    public void mostrarDatos(ArrayList<Inventario> models){
        for (Inventario p:models) {
            System.out.println(p.getId());
            //System.out.println(p.getNombre());
        }
    }
}
