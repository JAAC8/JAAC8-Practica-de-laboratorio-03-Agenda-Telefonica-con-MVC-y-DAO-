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
public interface IDAOTelefono {
    
    public void create(Telefono telefono);
    public Telefono read(int codigo);
    public Telefono update(Telefono telefono);
    public Telefono delete(int codigo);
}
