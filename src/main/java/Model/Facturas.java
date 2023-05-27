/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jhon
 */
public class Facturas {
    private double No_Fv;
    private String Fecha_Hora_Fv;
    private String Desrip_Fv;
    private double Total_Pagar_Fv;

    public Facturas(double No_Fv, String Fecha_Hora_Fv, String Desrip_Fv, double Total_Pagar_Fv) {
        this.No_Fv = No_Fv;
        this.Fecha_Hora_Fv = Fecha_Hora_Fv;
        this.Desrip_Fv = Desrip_Fv;
        this.Total_Pagar_Fv = Total_Pagar_Fv;
    }

    public double getNo_Fv() {
        return No_Fv;
    }

    public String getFecha_Hora_Fv() {
        return Fecha_Hora_Fv;
    }

    public String getDesrip_Fv() {
        return Desrip_Fv;
    }

    public double getTotal_Pagar_Fv() {
        return Total_Pagar_Fv;
    }
    
    
    
}
