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
public interface IUsuarioDAO {
    public void create(Usuario user);
    public Usuario read();
    public void update(Usuario user);
    public void delte(Usuario user);
    
}
