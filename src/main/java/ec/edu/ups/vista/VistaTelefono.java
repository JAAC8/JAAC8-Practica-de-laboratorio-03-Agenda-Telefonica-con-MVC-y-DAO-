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
    
    public Telefono agregarContacto(){
        Scanner scann = new Scanner(System.in);
        System.out.println("REGISTRO"+"\nnota: los telefonos se ordenarán automaticamente en orden alfabetico"+"\n   la 'key' se asigna en orden ascendente según se ingresen valores"+"\n\n-.Código: ");
        int codigo = scann.nextInt();
        System.out.println("-.Número:");
        String numero=scann.next();
        System.out.println("-.Tipo:");
        String tipo = scann.next();
        System.out.println("-.Operadora:");
        String operadora= scann.next();
        
        Telefono telefono = new Telefono(codigo, numero, tipo, operadora);
        return telefono;
    }
    
    public Integer leerContacto(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese la llave(Key)");
        Integer key = scann.nextInt();
        
        return key;
    }
    
    //ACTUALIZACION TELEFONO
    public Telefono actualizarContacto(){
        Scanner scann = new Scanner(System.in);
        System.out.println("ACTUALIZACIÓN DE CONTACTO"+"\n");
        Telefono telefono = agregarContacto();
        
        return telefono;
        
    }
    public Integer keyDeActualizacion(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese la Key: ");
        Integer key = scann.nextInt();
        
        return key;
    }
    
    //Eliminar contacto
    public Integer eliminar(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese la key del contacto a eliminar");
        Integer key = scann.nextInt();
        
        return key;
    }
}
