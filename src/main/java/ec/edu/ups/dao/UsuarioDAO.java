/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.idao.IDAOUsuario;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author José Andrés Abad
 */
public class UsuarioDAO implements IDAOUsuario {

    private Map<Integer, Usuario> mapUsuario;
    int cont;

    public UsuarioDAO() {
        mapUsuario = new TreeMap<Integer, Usuario>();
        cont = 1;
    }

    @Override
    public void create(Usuario usuario) {
        mapUsuario.put(cont, usuario);
        cont++;
    }

    @Override
    public Usuario read(String cedula) {//cuando retorne si usuario = null "USUARIO NO ENCONTRADO"
        Usuario read = null;
        for (int i = 1; i < (cont); i++) {
            if (mapUsuario.get(i).equals(cedula)) {
                //System.out.println(mapUsuario.get(i));
                read = mapUsuario.get(i);
                break;
            }
        }
        return read;
    }

    @Override
    public void update(String cedula, int elector, String valorCampoModificar) {
        Usuario update = null;
        int key = 0;

        for (int i = 1; i < (cont); i++) {
            if (mapUsuario.get(i).equals(cedula)) {
                //System.out.println(mapUsuario.get(i));
                update = mapUsuario.get(i);
                key = i;
                break;
            }
        }
        if (update.equals(null)) {
            System.out.println("CONTACTO NO ENCONTRADO...");
        } else {
            switch (elector) {
                case 1:
                    String nombre = valorCampoModificar;
                    System.out.println("Nuevo nombre es:" + nombre);
                    break;
                case 2:
                    String apellido = valorCampoModificar;
                    System.out.println("Nuevo apellido es:" + apellido);
                    break;
                case 3:
                    String correo = valorCampoModificar;
                    System.out.println("Nuevo correo es:" + correo);
                    break;
                case 4:
                    String contrasena = valorCampoModificar;
                    System.out.println("Nuevo contrasena es:" + contrasena);
                    break;
            }
            //falta añandir la modificacion
            //System.out.println("Dese modificar:"+"\n1.Nombre"+"\n2.Apellido"+"\n3.Correo"+"\n4.Contraseña");
        }

    }

    @Override
    public void delete(String cedula) {
        for (int i = 1; i < (cont); i++) {
            if (mapUsuario.get(i) != null && mapUsuario.get(i).equals(cedula)) {//
                //System.out.println(mapUsuario.get(i));
                mapUsuario.remove(i);
                System.out.println("USUARIO ELIMINADO...");
                break;
            }
        }

    }

    public void vincularTelefono(String correo, Telefono telefono) {
        Usuario vincular = new Usuario();
        int key = 0;

        for (int i = 1; i < (cont); i++) {
            if (mapUsuario.get(i).getCorreo() != null && mapUsuario.get(i).getCorreo().equals(correo)) {//
                vincular = mapUsuario.get(i);
                key = i;
                break;
            }
        }
        System.out.println(vincular);
        vincular.agregarTelefono(telefono);
        mapUsuario.put(key, vincular);
    }

    public boolean verificarDatos(String correo, String contrasena) {
        boolean verificadorCrr = false;
        boolean verificadorCts = false;
        boolean verificador = false;

        for (int i = 1; i < (cont); i++) {
            Usuario prueba = mapUsuario.get(i);
            if (prueba != null && prueba.getCorreo().equals(correo)) {//
                verificadorCrr = true;

                if (prueba.getContrasena().equals(contrasena)) {
                    verificadorCts = true;
                }

            }

            if (verificadorCrr && verificadorCts) {
                verificador = true;
                return verificador;
            }
        }

        if (verificador == false) {
            System.out.println("CREDENCIALES INCORRECTAS...");
        }
        return verificador;
    }

    public void buscarContactoUsuario(int codigo, String correo) {
        for (int i = 1; i < cont; i++) {
            Usuario user = mapUsuario.get(i);

            if (user != null && user.getCorreo().equals(correo)) {
                int sizeContactos = user.getExtensionArreglo();

                for (int j = 0; j < sizeContactos; j++) {
                    Telefono tele = user.getContacto(j);

                    if (tele != null && tele.getCodigo() == codigo) {
                        System.out.println(tele);
                        break;
                    }
                }
            }
        }

    }

    public void actualizarContacto(String correo, Telefono telefono) {

        for (int i = 1; i < cont; i++) {

            Usuario user = mapUsuario.get(i);
            if (user != null && user.getCorreo().equals(correo)) {//

                int sizeContactos = user.getExtensionArreglo();
                for (int j = 0; j < sizeContactos; j++) {

                    Telefono contacto = user.getContacto(j);
                    if (contacto.equals(telefono)) {
                        user.actualizarContacto(j, telefono);
                        System.out.println("Actualizació exitosa: " + "\n" + user.getContacto(j));
                    }

                }

            }
        }
    }

    public void deleteContacto(Telefono contacto, String correo) {

        for (int i = 1; i < cont; i++) {
            Usuario user = mapUsuario.get(i);
            if (user != null && user.getCorreo().equals(correo)) {//
                
                int sizeContactos = user.getExtensionArreglo();
                for (int j = 0; j < sizeContactos; j++) {
                    if (user.getContacto(j).equals(contacto)) {//
                        user.eleiminarContacto(j);
                    }
                }
            }

        }
    }

    public void listarContactos(String correo) {
        for (int i = 1; i < cont; i++) {
            Usuario user = mapUsuario.get(i);

            if (user != null && user.getCorreo().equals(correo)) {
                int sizeContactos = user.getExtensionArreglo();
                for (int j = 0; j < sizeContactos; j++) {
                    if (user.getContacto(j) != null) {
                        System.out.println(user.getContacto(j));
                    }
                }
                break;
            }
        }
    }

}
