/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jhon
 */
public class Inventario extends ModelInventario{
    private String Nombre_Mp;
    private String Descrip_Mp;
    private String Cant_Exist_Mp;

    public Inventario(int Cod_Mp, String Nombre_Mp, String Descrip_Mp, String Cant_Exist_Mp) {
        super(Cod_Mp);
        this.Nombre_Mp = Nombre_Mp;
        this.Descrip_Mp = Descrip_Mp;
        this.Cant_Exist_Mp = Cant_Exist_Mp;
    }

    public String getNombre_Mp() {
        return Nombre_Mp;
    }

    public String getDescrip_Mp() {
        return Descrip_Mp;
    }

    public String getCant_Exist_Mp() {
        return Cant_Exist_Mp;
    }
    
    
    
}
