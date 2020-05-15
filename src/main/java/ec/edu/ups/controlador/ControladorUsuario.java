/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.Telefono;
/**
 *
 * @author José Andrés Abad
 */
public class ControladorUsuario {
    private VistaUsuario vistaUsuario;
    private UsuarioDAO usuarioDAO;
    
    
    public ControladorUsuario(VistaUsuario vistaUsuario){
        this.vistaUsuario = vistaUsuario;
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public void registrar(){
        Usuario usuario = vistaUsuario.registrarUsuario();
        usuarioDAO.create(usuario);
    }
    
    public boolean verificarCredenciales(){
        String correo = vistaUsuario.enviarCorreoIngresoControlador();
        String contrasena = vistaUsuario.enviarContrasenaIngresoControlador();        
        boolean verificador = usuarioDAO.verificarDatos(correo, contrasena);
        
        return verificador;
    }
    
    public void buscarContactoUsuario(){
        String correo = vistaUsuario.enviarCorreoVinculacion();        
        int codigo = vistaUsuario.ingresarCodigoContacto();
        usuarioDAO.buscarContactoUsuario(codigo,correo);
    }
    
    public void vincularContacto(Telefono telefono){
        String correoUsuarioEnEjecucion = vistaUsuario.enviarCorreoVinculacion();
        Telefono tele = telefono;
        usuarioDAO.vincularTelefono(correoUsuarioEnEjecucion, tele);
    }
    
    public void actualizarContacto(Telefono telefono){
        String correoUsuarioEnEjecucion = vistaUsuario.actualizarContacto();        
        usuarioDAO.actualizarContacto(correoUsuarioEnEjecucion, telefono);
    }
    
    public void eliminarContacto(Telefono telefono){
        String correoUsuarioEnEjecucion = vistaUsuario.enviarCorreoVinculacion();
        usuarioDAO.deleteContacto(telefono,correoUsuarioEnEjecucion);
                
    }
    public void listarContactosUsuario(){
        String correo = vistaUsuario.enviarCorreoVinculacion();
        usuarioDAO.listarContactos(correo);
    }
    
}
