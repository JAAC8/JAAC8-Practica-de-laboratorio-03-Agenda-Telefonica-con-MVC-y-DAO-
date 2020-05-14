package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    private List<Telefono> telefonos; 
    
    public Usuario(){
        telefonos = new ArrayList<>();
    }
    public Usuario(String cedula, String nombre,String apellido,String correo, String contrasena){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.contrasena=contrasena;
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
    
    //RELACION DE AGREGACION CON TELÉFONO
    public void agendaTelefonica(Telefono telfono){
        telefonos.add(telfono);
    }
    
    //INCORPORAR EQUALS Y HASHCODE (PARA CONTRASEÑA Y CORREO)<<<<----------!!!!!

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.correo);
        hash = 61 * hash + Objects.hashCode(this.contrasena);
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
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contrasena, other.contrasena)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "Usuario:"+"\n[cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasena=" + contrasena + ']'+telefonos;
    }
    
}
