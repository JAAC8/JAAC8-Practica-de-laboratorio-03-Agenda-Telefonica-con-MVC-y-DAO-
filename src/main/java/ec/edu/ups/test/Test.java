/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import java.util.Scanner;
import ec.edu.ups.modelo.Persona;
/**
 *
 * @author José Andrés Abad
 */
public class Test {
    public static void main(String args[]){
        Scanner scann = new Scanner(System.in);
        
        System.out.println("REGISTRO");
        System.out.println("Ingrese su:"+"\nCédula: ");
        String cedula = scann.next();
        System.out.println("nNombre:");
        String nombre = scann.next();
        System.out.println("Apellido:");
        String apellido = scann.next();
        System.out.println("Correo:");
        String correo = scann.next();
        System.out.println("Contraseña:");
        String contraseña = scann.next();
        Persona usuario = new Persona(cedula, nombre, apellido, correo, contraseña);
        
        System.out.println("INICIAR SESIÓN");//*
        System.out.println("Correo:");
        String correoIs = scann.next();
        System.out.println("Contraseña:");
        String contraseñaIs= scann.next();
        
        //Comparación con equals medainte Dao/Controlador        
        //if(){}
            boolean repetidor1=true;
            while(repetidor1){
            
            }
    }
    
}
