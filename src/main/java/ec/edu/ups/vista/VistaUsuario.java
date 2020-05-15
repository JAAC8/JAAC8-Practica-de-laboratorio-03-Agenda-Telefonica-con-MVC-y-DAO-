/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.util.Scanner;
import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author José Andrés Abad
 */
public class VistaUsuario {

    //Menú
    public int menuPrincipal() {//COLOCAR EN TEST
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nAGENDA TELEFÓNICA");
        boolean repetidor = true;
        //int option;
        while (repetidor) {
            System.out.println("\n1.Resgitrarse" + "\n2.Iniciar Sesión" + "\n3.Salir");
            option = scan.nextInt();
            if (option > 3 || option < 1) {
                System.out.println("No ha seleccionado ninguno.");
                repetidor = true;
            } else {
                repetidor = false;
            }
        }
        return option;
    }

    //Resgistro
    public Usuario ingresoDeDatos() {
        Scanner scan = new Scanner(System.in);

        System.out.println("REGISTRO");
        System.out.println("\nIngrese" + "\n-Cédula: ");
        String cedula = scan.next();
        System.out.println("-Nombre:");
        String nombre = scan.next();
        System.out.println("-Apellido:");
        String apellido = scan.next();
        System.out.println("-Correo:");
        String correo = scan.next();
        System.out.println("-Contraseña:");
        String contraseña = scan.next();
        Usuario usuario = new Usuario(cedula, nombre, apellido, correo, contraseña);

        return usuario;
    }

    //Inicio de Sesión
    public String inicioDeSesionCorreo() {
        Scanner scann = new Scanner(System.in);
        System.out.println("INICIAR SESIÓN");
        System.out.println("\nIngrese el Correo:");
        String correo = scann.next();

        return correo;
    }

    public String inicioDeSesionContraseña() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese su contraseña:");
        String contraseña = scann.next();

        return contraseña;
    }

    //Menú de Usuario
    public int menuUsuario() {
        Scanner scann = new Scanner(System.in);
        int option = 0;
        boolean repetidor = true;
        while (repetidor) {
            System.out.println("\n1.Añadir Contacto" + "\n2.Buscar un Contacto" + "\n3.Actualizar Contacto" + "\n4.Actualizar Contacto" + "\n5.Eliminar Contacto" + "\n6.Imprimir Lista de Contactos" + "\n7.Editar mi Perfil" + "\n8.Salir");
            option = scann.nextInt();
            if (option > 7 || option < 1) {
                System.out.println("No ha seleccionado ninguno.");
                repetidor = true;
            } else {
                repetidor = false;
            }
        }
        return option;
    }

    //Opciones de Edición de Perfil de Usuario
    public int edicionPerfilUsuario() {
        Scanner scann = new Scanner(System.in);
        boolean repetidor = true;
        int a = 0;
        while (repetidor) {
            System.out.println("\n1.Actualizar" + "\n2.Eliminar Cuenta");
            a = scann.nextInt();
            if (a < 1 || a > 2) {
                System.out.println("No ha elegido ninguna opción");
            } else {
                repetidor = false;
            }
        }

        return a;
    }

    //Solicitud de Cédula
    public String solicitudCorreoEliminacionCuenta() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese su Dirección de correo electrrónico:");
        String correo = scann.next();

        return correo;

    }

    public String solicitudContrasenaEliminacionCuenta() {
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese su Contraseña:");
        String contrasena = scann.next();

        return contrasena;
    }
}
