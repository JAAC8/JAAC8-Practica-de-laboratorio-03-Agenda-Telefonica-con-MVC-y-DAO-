/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.IDAOTelefono;
import ec.edu.ups.modelo.Telefono;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;

/**
 *
 * @author José Andrés Abad
 */
public class TelefonoDAO implements IDAOTelefono {

    private Map<Integer, Telefono> mapTelefono;
    private int cont;

    public TelefonoDAO() {
        this.mapTelefono = new TreeMap<Integer, Telefono>();
        cont = 1;
    }

    @Override
    public void create(Telefono telefono) {
        mapTelefono.put(cont, telefono);
        cont++;
    }

    @Override
    public Telefono read(int codigo) {
        Telefono read = new Telefono();
        for (int i = 1; i < cont; i++) {
            read = mapTelefono.get(i);
            int cod = read.getCodigo();
            if (cod == codigo) {
                return read;
            }

        }
        return read;
    }

    @Override
    public Telefono update(Telefono telefono) {
        Telefono telef = new Telefono();

        for (int i = 1; i < cont; i++) {
            if (mapTelefono.get(i)!=null && mapTelefono.get(i).equals(telefono)) {
                mapTelefono.put(i, telefono);
                return mapTelefono.get(i);
            }
        }
        return telef;
    }

    @Override
    public Telefono delete(int codigo) {
        Telefono tele = new Telefono();
        for (int i = 1; i < cont; i++) {
            tele = mapTelefono.get(i);

            if (tele != null && tele.getCodigo() == codigo) {//POSIBLE ERROR REVISAR EL EQUALS
                mapTelefono.remove(i);//POSIBLE ERROR, SOLUCION SOLAMENTE REMOVER EN BASE A LA KEY
                return tele;
            }
        }

        return null;
    }

    public void findAll() {
        Iterator it = mapTelefono.keySet().iterator();
        while (it.hasNext()) {
            Integer Key = (Integer) it.next();
            System.out.println("Clave: " + Key + "  -> Valor: " + mapTelefono.get(Key));
        }
    }

    //ELIMINAR A LA PAR DE AMBOS "DAOUSUARIO" Y "DAOTELEFONO" PROGRAMANDO UN METODO MÁS EN CADA UNO QUE HAGA ESTO <<------
    //AL IMPRIMIR TELEFONOS HAVER UNA COMPARATIVA ENTRE EL O LOS OBTENIDOS DE "DAOTELEFONO" Y DE "DAOUSUARIO" DESPUES SOLO LISTAR LOS QUE COINCIDAN Y ELIMINAR LOS OTROS
}
