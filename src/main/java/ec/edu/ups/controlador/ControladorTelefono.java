/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.dao.DAOTelefono;
/**
 *
 * @author José Andrés Abad
 */
public class ControladorTelefono {
    private VistaTelefono vistaTelefono;
    private DAOTelefono dAOTelefono;
    
    public ControladorTelefono(VistaTelefono vistaTelefono){
        this.vistaTelefono= vistaTelefono;
    }
    
    public void agregarContacto(){
        Telefono telefono = vistaTelefono.agregarContacto();
        dAOTelefono.create(telefono);
        
    }
    
    public void leer(){
        Integer key = vistaTelefono.leerContacto();
        dAOTelefono.read(key);
    }
    
    public void actualizar(){
        Telefono telefono = vistaTelefono.actualizarContacto();
        Integer key = vistaTelefono.keyDeActualizacion();
        dAOTelefono.update(key, telefono);
    }
    
    public void eleminar(){
        Integer key = vistaTelefono.eliminar();
        dAOTelefono.delete(key);
    }
    
    public void imprimirTodo(){//
        dAOTelefono.findAll();
    }
}
