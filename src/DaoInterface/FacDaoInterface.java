/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoInterface;

import Model.Factura;
import java.util.ArrayList;

/**
 *
 * @author Jhon
 */
public interface FacDaoInterface {
    public void update(Factura model);
    public void create(Factura model);
    public void deleteById(int id);
    public Factura findById(int id);
    public ArrayList<Factura> findAll();
}
