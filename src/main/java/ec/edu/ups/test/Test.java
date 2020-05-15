/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.vista.VistaUsuario;
import ec.edu.ups.vista.VistaTelefono;

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

        boolean repetidor = true;
        //Mantiene al usuario dentro del programa
        while (repetidor) {
            int mP = vistaUsuario.menuPrincipal();
            switch (mP) {
                case 1:
                    controladorUsuario.registrar();
                    break;
                case 2://Acceso a mi Cuenta
                    boolean repetidor1 = true;
                    if (controladorUsuario.permisoDeIngreso() == true) {

                        while (repetidor1) {
                            //MENÚ DE USUARIO
                            int mU = vistaUsuario.menuUsuario();
                            switch (mU) {
                                //Modificaciones de la Agenda
                                case 1://Añadir Contacto

                                    break;
                                case 2://Buscar Contacto
                                    break;
                                case 3://Actualizar Contacto
                                    break;
                                case 4://Eliminar Cuenta
                                    break;
                                case 5://Imprimir Lista de COntactos
                                    break;
                                //Modificaciones de Perfil de Usuario
                                case 6://Actualizar mi Perfil
                                    int eP = vistaUsuario.edicionPerfilUsuario();
                                    switch (eP) {
                                        case 1://Actualización de Usuario
                                            controladorUsuario.actualizar();
                                            break;
                                        case 2://Eliminación de Usuario
                                            controladorUsuario.eliminar();
                                            break;
                                    }
                                    break;
                                case 7://Imprimir Datos completos de Usuario
                                    controladorUsuario.imprimirUsuario();
                                    break;
                                case 8:
                                    repetidor1 = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Ha ingresado los datos herroneos.");
                    }

                    break;
                case 3:
                    repetidor = false;
                    break;
            }
        }
    }
}
