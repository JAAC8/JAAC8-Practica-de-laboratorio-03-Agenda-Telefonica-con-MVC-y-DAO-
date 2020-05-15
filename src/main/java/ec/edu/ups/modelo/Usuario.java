/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author José Andrés Abad
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private List<Telefono> agendaTelefonica;
    
    public Usuario(){
        
    }
    public Usuario(String cedula,String nombre, String apellido, String correo, String contrasena ){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido=apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        
        agendaTelefonica = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public void agregarTelefono(Telefono telefono){
        agendaTelefonica.add(telefono);
    }
    public Telefono getContacto(int posicion){
        Telefono contacto = agendaTelefonica.get(posicion);
        return contacto;
    }
    public void actualizarContacto(int posicion, Telefono telefono){
        agendaTelefonica.set(posicion, telefono);
    }
    public int getExtensionArreglo(){
        int longitud = agendaTelefonica.size();
        return longitud;
    }
    public void eleiminarContacto(int posicion){
        agendaTelefonica.remove(posicion);
    }
    
   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Usuario:" + " [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena+"]" + agendaTelefonica;
    }

}

