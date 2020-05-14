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
    public int menuPrincipal(){//COLOCAR EN TEST
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("AGENDA TELEFÓNICA");
        boolean repetidor = true;
        //int option;
        while(repetidor){
            System.out.println("\n1.Resgitrarse"+"\n2.Iniciar Sesión"+"\n3.Salir");
            option=scan.nextInt();
            if(option>3||option<1){
                System.out.println("No ha seleccionado ninguno.");
                repetidor=true;
            }else{repetidor=false;}
        }
        return option;
    }
    //Resgistro
    public Usuario ingresoDeDatos(){
        Scanner scan=new Scanner(System.in);
        
        System.out.println("REGISTRO");
        System.out.println("\nIngrese"+"\n-Cédula: ");
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
    public boolean inicioDeSesion(boolean comprobacionDeIngreso){
        if(comprobacionDeIngreso==false){
            System.out.println("Ha ingreso los datos erroneos");
        }
        return comprobacionDeIngreso;
    }
    
    
    
    
            
}
