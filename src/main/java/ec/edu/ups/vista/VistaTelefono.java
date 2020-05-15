/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.util.Scanner;
import ec.edu.ups.modelo.Telefono;
/**
 *
 * @author José Andrés Abad
 */
public class VistaTelefono {
    
    public Telefono registrarTelefono(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Código:");
        int codigo = scan.nextInt();
        System.out.println("Su número:");
        String numero = scan.next();
        System.out.println("Tipo movil/convencional:");
        String tipo = scan.next();
        System.out.println("Su Operadora:");
        String operadora = scan.next();
        
        Telefono telefono = new Telefono(codigo, numero, tipo, operadora);
        return telefono;
    }
    
    public int buscarContacto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Código de Contacto");
        int codigo = scan.nextInt();
        return codigo;
    }
    
    
}
