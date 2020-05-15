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
    
    private String correoUsuarioEnEJecucion; 

    public int imprimirMenuInicio() {
        Scanner scan = new Scanner(System.in);

        int elector = 0;
        boolean repetidor = true;

        while (repetidor) {
            System.out.println("\n    MENÚ" + "\n\n1.Registrarse" + "\n2.Iniciar sesión" + "\n3.Salir");

            elector = scan.nextInt();
            if (elector < 1 && elector > 3) {
                System.out.println("NO HA ELEGIDO NINGUNO...");
            } else {
                return elector;
            }
        }

        return elector;
    }

    public Usuario registrarUsuario() {
        Scanner scan = new Scanner(System.in);
        Usuario usuario;

        System.out.println("REGISTRO DE USUARIO");

        System.out.println("Su Cédula:");
        String cedula = scan.next();
        System.out.println("Su Nombre:");
        String nombre = scan.next();
        System.out.println("Su Apellido:");
        String apellido = scan.next();
        System.out.println("Su correo:");
        String correo = scan.next();
        System.out.println("Escriba su Contraseña:");
        String contrasena = scan.next();

        usuario = new Usuario(cedula, nombre, apellido, correo, contrasena);
        return usuario;
    }

    public String enviarCorreoIngresoControlador() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Su correo electrónico:");
        this.correoUsuarioEnEJecucion = scan.next();
        return correoUsuarioEnEJecucion;
    }

    public String enviarContrasenaIngresoControlador() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Su contraseña:");
        String contrasena = scan.next();
        return contrasena;
    }

    public int menuUsuario() {
        Scanner scan = new Scanner(System.in);
        int elector = 0;
        boolean repetidor = true;
        System.out.println("\nHola !");

        while (repetidor) {
            System.out.println("\n  MENÚ DE USUARIO" + "\n\n1.Agregar contacto" + "\n2.Buscar Contacto" + "\n3.Actualizar Contacto" + "\n4.Eliminar Contacto" + "\n5.Listar Contactos de Usuario"+"\n6.Listar Contactos de todas las Cuentas" + "\n7.Salir");
            elector = scan.nextInt();

            if (elector < 1 || elector > 7) {
                System.out.println("NO HA ELEGIDO NINGUNO...");
            } else {
                return elector;
            }
        }
        return elector;
    }
    
    public String enviarCorreoVinculacion(){
        return this.correoUsuarioEnEJecucion;
    }

    public String actualizarContacto(){
        Scanner scan = new Scanner(System.in);
        
        return correoUsuarioEnEJecucion;
    }
    
    public int ingresarCodigoContacto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Código de contacto:");
        int codigo = scan.nextInt();
        
        return codigo;
    }
}
