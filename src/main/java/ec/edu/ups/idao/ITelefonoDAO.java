/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Telefono;
import java.util.Map;
/**
 *
 * @author José Andrés Abad
 */
public interface ITelefonoDAO {
    public void crear();
    public void read();
    public void update();
    public void delete();
    public void findAll();
}
