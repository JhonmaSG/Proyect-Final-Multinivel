/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterface;
import Model.Inventario;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public interface InvenDaoInterface {
    public void update(Inventario model);
    public void create(Inventario model);
    public void deleteById(int id);
    public Inventario findById(int id);
    public ArrayList<Inventario> findAll();
}
