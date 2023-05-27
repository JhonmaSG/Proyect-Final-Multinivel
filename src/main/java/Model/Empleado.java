/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jhon
 */
public class Empleado {
    private double Id_Em;
    private String Nombre_Em;
    private String Apellido_Em;
    private String Cargo;
    private double Tel_Em;
    private String correo_Em;
    private double Des_Pension;
    private double Des_Salud;
    private double Salario;

    public Empleado(double Id_Em, String Nombre_Em, String Apellido_Em, String Cargo, double Tel_Em, String correo_Em, double Des_Pension, double Des_Salud, double Salario) {
        this.Id_Em = Id_Em;
        this.Nombre_Em = Nombre_Em;
        this.Apellido_Em = Apellido_Em;
        this.Cargo = Cargo;
        this.Tel_Em = Tel_Em;
        this.correo_Em = correo_Em;
        this.Des_Pension = Des_Pension;
        this.Des_Salud = Des_Salud;
        this.Salario = Salario;
    }

    public double getId_Em() {
        return Id_Em;
    }

    public String getNombre_Em() {
        return Nombre_Em;
    }

    public String getApellido_Em() {
        return Apellido_Em;
    }

    public String getCargo() {
        return Cargo;
    }

    public double getTel_Em() {
        return Tel_Em;
    }

    public String getCorreo_Em() {
        return correo_Em;
    }

    public double getDes_Pension() {
        return Des_Pension;
    }

    public double getDes_Salud() {
        return Des_Salud;
    }

    public double getSalario() {
        return Salario;
    }

    
}
