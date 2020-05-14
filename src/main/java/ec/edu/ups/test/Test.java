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
    public static void main(String args[]){
        VistaUsuario vistaUsuario = new VistaUsuario();
        VistaTelefono vistaTelefono = new VistaTelefono();
        
        ControladorUsuario controladorUsuario= new ControladorUsuario(vistaUsuario);
        ControladorTelefono controladorTelefono=new ControladorTelefono(vistaTelefono);
        
        boolean repetidor=true;
        //Mantiene al usuario dentro del programa
        while(repetidor){
            int mP = vistaUsuario.menuPrincipal();
            switch(mP){
                case 1:
                    controladorUsuario.registrar();
                    break;
                case 2:
                    if(controladorUsuario.permisoDeIngreso()==true){
                        //MENÚ DE USUARIO
                        System.out.println("\n1.Resgistrar un nuevo COntacto"+"\n2.Buscar un contacto"+"\n3.Actualizar contacto"+"\n4.Actualizar contacto"+"\n5.Eliminar contacto"+"\n6.Imprimir Lista de contactos"+"\n7.Salir");
                                
                    }else{System.out.println("Ha ingresado los datos herroneos.");}
                    //booelan comprobacionDeIngreso= controladorUsuario.
                    //vista.inicioDeSesion(comprobacionDeIngreso);
                    break;
                case 3:
                    repetidor=false;
                    break;
            }
        }
    }
}