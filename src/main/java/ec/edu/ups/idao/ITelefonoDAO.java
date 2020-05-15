/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Telefono;
/**
 *
 * @author José Andrés Abad
 */
public interface ITelefonoDAO {
    public void create(Telefono contacto);
    public  void read(Integer key);
    public void update(Integer key, Telefono telefono);
    public void delete(Integer key);
    public void findAll();
}
