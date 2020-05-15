/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Usuario;
/**
 *
 * @author José Andrés Abad
 */
public interface IDAOUsuario {
    
    public void create(Usuario usuario);
    public Usuario read(String cedula);
    public void update(String cedula, int elector, String valorCampoModificar);
    public void delete(String cedula);
}
