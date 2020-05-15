/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;
/**
 *
 * @author José Andrés Abad
 */
public class ControladorTelefono {
    private VistaTelefono vistaTelefono;
    private TelefonoDAO telefonoDAO;
    
    public ControladorTelefono(VistaTelefono vistaTelefono){
        this.vistaTelefono = vistaTelefono;
        this.telefonoDAO = new TelefonoDAO();
    }
    
    public Telefono registrar(){
        Telefono telefono = vistaTelefono.registrarTelefono();
        telefonoDAO.create(telefono);
        return telefono;
    }
    
    public void buscarContacto(){
        int codigo = vistaTelefono.buscarContacto();
        Telefono contacto = telefonoDAO.read(codigo);
        
        System.out.println(contacto);
    }
    
    public Telefono actualizar(){
        
        Telefono telefono = vistaTelefono.registrarTelefono();
        Telefono telefonoActualizado = telefonoDAO.update(telefono);
        
        return telefonoActualizado;
    }
    
    public Telefono eliminar(){
        int codigo = vistaTelefono.buscarContacto();
        Telefono telefono = telefonoDAO.delete(codigo);
        
        return telefono;
    }
    
    public void listarContactos(){
        telefonoDAO.findAll();
    }
}
