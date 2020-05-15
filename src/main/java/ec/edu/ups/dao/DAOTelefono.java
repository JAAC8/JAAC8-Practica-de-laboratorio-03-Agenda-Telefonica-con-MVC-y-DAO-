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
import ec.edu.ups.idao.ITelefonoDAO;
/**
 *
 * @author José Andrés Abad
 */
public class DAOTelefono implements ITelefonoDAO{
    private Map<Integer,Telefono> mapTelefono;
    private Integer cont;
    public DAOTelefono(){
        mapTelefono=new TreeMap<Integer,Telefono>();
        cont=0;
    }
    
    @Override
    public void create(Telefono contacto){
        mapTelefono.put(cont, contacto);
        cont++;
    }    
    @Override
    public  void read(Integer key){//
        Telefono tel = mapTelefono.get(key);
        System.out.println("tel");
    }
    @Override
    public void update(Integer key, Telefono telefono){//
        Telefono tel = mapTelefono.put(key, telefono);
    }
    @Override
    public void delete(Integer key){//
        Telefono tel = mapTelefono.remove(key);
    }
    
    @Override
    public void findAll(){//
        Iterator it = mapTelefono.keySet().iterator();
        while(it.hasNext()){
            Integer Key = (Integer) it.next();
            System.out.println("Clave: "+Key+"  -> Valor: "+mapTelefono.get(Key));
        }
    }
}
