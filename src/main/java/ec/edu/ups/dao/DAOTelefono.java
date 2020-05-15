/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.idao.ITelefonoDAO;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;
/**
 *
 * @author José Andrés Abad
 */
public class DAOTelefono {
    private Map<Integer,Telefono> mapTelefono;
    private Integer cont;
    public DAOTelefono(){
        mapTelefono=new TreeMap<Integer,Telefono>();
        cont=0;
    }
    
    public void create(Telefono contacto){
        mapTelefono.put(cont, contacto);
        cont++;
    }    
    public  void read(Integer key){//
        Telefono tel = mapTelefono.get(key);
        System.out.println("tel");
    }
    public void update(Integer key, Telefono telefono){//
        Telefono tel = mapTelefono.put(key, telefono);
    }
    public void delete(Integer key){//
        Telefono tel = mapTelefono.remove(key);
    }
    
    public void findAll(){//
        Iterator it = mapTelefono.keySet().iterator();
        while(it.hasNext()){
            Integer Key = (Integer) it.next();
            System.out.println("Clave: "+Key+"  -> Valor: "+mapTelefono.get(Key));
        }
    }
}
