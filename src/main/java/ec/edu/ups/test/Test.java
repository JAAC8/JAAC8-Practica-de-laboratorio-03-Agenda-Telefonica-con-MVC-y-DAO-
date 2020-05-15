/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.controlador.ControladorTelefono;

/**
 *
 * @author José Andrés Abad
 */
public class Test {

    public static void main(String args[]) {
        VistaUsuario vistaUsuario = new VistaUsuario();
        VistaTelefono vistaTelefono = new VistaTelefono();

        ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario);
        ControladorTelefono controladorTelefono = new ControladorTelefono(vistaTelefono);

        System.out.println("Bienvenido! !!");

        //
        boolean repetidor = true;

        while (repetidor) {

            int elector = vistaUsuario.imprimirMenuInicio();
            switch (elector) {
                //REGISTRO
                case 1:
                    controladorUsuario.registrar();

                    break;
                //INICIO DE SESIÓN
                case 2:
                    if (controladorUsuario.verificarCredenciales()) {
                        boolean repetidor1 = true;
                        
                        while (repetidor1) {
                            int mU = vistaUsuario.menuUsuario();

                            switch (mU) {
                                case 1://Agregar Contracto
                                    Telefono telefono = controladorTelefono.registrar();
                                    controladorUsuario.vincularContacto(telefono);
                                    break;
                                case 2://Buscar Contacto
                                    controladorUsuario.buscarContactoUsuario();
                                    //controladorTelefono.buscarContacto();
                                    break;
                                case 3://Actualizar Contacto
                                    Telefono telefonoActualizado = controladorTelefono.actualizar();
                                    controladorUsuario.actualizarContacto(telefonoActualizado);
                                    break;
                                case 4://Eliminar Contacto
                                    Telefono telefono1 = controladorTelefono.eliminar();
                                    System.out.println(telefono1);
                                    controladorUsuario.eliminarContacto(telefono1);
                                    break;
                                case 5://Listar Contactos de Usuario
                                    controladorUsuario.listarContactosUsuario();
                                    break;
                                case 6://Listar COntactos de todas las cuentas
                                    controladorTelefono.listarContactos();
                                    break;
                                case 7://Salir
                                    repetidor1 = false;
                                    break;

                            }
                        }

                    }

                    break;
            }
            //SALIR
            if (elector == 3) {
                break;
            }
        }

    }
}
