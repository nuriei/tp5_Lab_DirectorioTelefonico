/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Nuri
 */
public class DirectorioTelefonico {
    private TreeMap<Integer, Contacto> directorio = new TreeMap<>();

    public void agregarContacto(Integer telefono, Contacto contacto) {
        directorio.put(telefono, contacto);
    }

    public Contacto buscarContacto(Integer telefono) {
        return directorio.get(telefono);//con el map no hace falta buscar un equivalente automaticamente si no esta arroja null
    }

    public Set<Integer> buscarTelefono(String apellido) {//aca buscamos por apellido
    Set<Integer> telefonos = new TreeSet<>();
    
    for (Integer tel : directorio.keySet()) {
        Contacto c = directorio.get(tel);
        
        if (c.getApellido().equalsIgnoreCase(apellido)) {
            telefonos.add(tel); 
        }
    }
    
    return telefonos;///se retorna telefonos para que entregue el dato
    }

    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> lista = new ArrayList<>();
        for (Contacto c : directorio.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                lista.add(c);
            }
        }
        return lista;
    }

    public void borrarContacto(Integer telefono) {
        directorio.remove(telefono);
    }

    public TreeMap<Integer, Contacto> getDirectorio() {
        return directorio;
    }
}
