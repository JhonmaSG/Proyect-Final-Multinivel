/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jhon
 */
public class Empleado extends ModelEmpleado{
    //private int Id_Em;
    private String Nombre_Em;
    private String Apellido_Em;
    private String Cargo;
    private String Tel_Em;
    private String Correo_Em;
    private String Des_Pension;
    private String Des_Salud;
    private String Salario;

    public Empleado(int Id_Em, String Nombre_Em, String Apellido_Em, String Cargo, String Tel_Em, String Correo_Em, String Des_Pension, String Des_Salud, String Salario) {
        super(Id_Em);
        this.Nombre_Em = Nombre_Em;
        this.Apellido_Em = Apellido_Em;
        this.Cargo = Cargo;
        this.Tel_Em = Tel_Em;
        this.Correo_Em = Correo_Em;
        this.Des_Pension = Des_Pension;
        this.Des_Salud = Des_Salud;
        this.Salario = Salario;
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

    public String getTel_Em() {
        return Tel_Em;
    }

    public String getCorreo_Em() {
        return Correo_Em;
    }

    public String getDes_Pension() {
        return Des_Pension;
    }

    public String getDes_Salud() {
        return Des_Salud;
    }

    public String getSalario() {
        return Salario;
    }

    
}
