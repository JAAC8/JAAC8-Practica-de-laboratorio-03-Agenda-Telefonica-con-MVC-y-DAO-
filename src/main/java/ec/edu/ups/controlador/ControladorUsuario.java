/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.dao.DAOUsuario;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author José Andrés Abad
 */
public class ControladorUsuario {

    private VistaUsuario vista;
    private DAOUsuario daoUser;

    public ControladorUsuario(VistaUsuario vistaUsuario) {
        this.vista = new VistaUsuario();
        this.daoUser = new DAOUsuario();
    }

    public void registrar() {
        Usuario user = vista.ingresoDeDatos();
        daoUser.create(user);
    }

    public boolean permisoDeIngreso() {
        String correo = vista.inicioDeSesionCorreo();
        String contrasena = vista.inicioDeSesionContraseña();
        return daoUser.verificadorDeExistencia(correo, contrasena);
    }

    public void eliminar() {
        String eccts = vista.solicitudContrasenaEliminacionCuenta();
        daoUser.delte(eccts);
    }

    //ACTUALIZACIONES
    public void actualizar() {
        Usuario newUsuario = vista.solicitudDeActualizacion();
        daoUser.update(newUsuario);
    }

    //Impresión de todos los datos de usuario
    public void imprimirUsuario() {
        String cedula = vista.read();
        daoUser.read(cedula);
        
    }
    //public void vincularContactos(){}
}
