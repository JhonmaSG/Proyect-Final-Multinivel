/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterface;

import Model.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public interface EmpDaoInterface {
    public void update(Empleado model);
    public void create(Empleado model);
    public void deleteById(int id);
    public Empleado findById(int id);
    public ArrayList<Empleado> findAll();
}
