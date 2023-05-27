/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jhon
 */
public class Inventario {
    private int Cod_Mp;
    private String Nombre_Mp;
    private String Descrip_Mp;
    private int Cantidad_Exis_Mp;

    public Inventario(int Cod_Mp, String Nombre_Mp, String Descrip_Mp, int Cantidad_Exis_Mp) {
        this.Cod_Mp = Cod_Mp;
        this.Nombre_Mp = Nombre_Mp;
        this.Descrip_Mp = Descrip_Mp;
        this.Cantidad_Exis_Mp = Cantidad_Exis_Mp;
    }

    public int getCod_Mp() {
        return Cod_Mp;
    }

    public String getNombre_Mp() {
        return Nombre_Mp;
    }

    public String getDescrip_Mp() {
        return Descrip_Mp;
    }

    public int getCantidad_Exis_Mp() {
        return Cantidad_Exis_Mp;
    }
    
    
    
}
