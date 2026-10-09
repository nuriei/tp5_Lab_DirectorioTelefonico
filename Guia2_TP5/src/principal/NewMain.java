/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Contacto;
import entidades.DirectorioTelefonico;

/**
 *
 * @author Nuri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DirectorioTelefonico directorio = new DirectorioTelefonico();

        Contacto c1 = new Contacto(32184893, "Juan", "Saez", "San Luis", "Av. Siempreviva 742");
        Contacto c2 = new Contacto(40111222, "Maria", "Perez", "San Luis", "Calle Falsa 123");
        Contacto c3 = new Contacto(11222333, "Pedro", "Saez", "Villa Mercedes", "Mitre 500");

        directorio.agregarContacto(266431584, c1);//le falta un numero porque use int no long
        directorio.agregarContacto(266400000, c2);
        directorio.agregarContacto(265711223, c3);

        System.out.println("Contacto con tel 2664315840: " + directorio.buscarContacto(266431584));

        System.out.println("Teléfonos de apellido Saez: " + directorio.buscarTelefono("Saez"));

        System.out.println("Contactos en San Luis: " + directorio.buscarContactos("San Luis"));

        directorio.borrarContacto(266400000);
        System.out.println("Contacto borrado. ¿Existe?: " + directorio.buscarContacto(266400000));
    }
    
    
    
}
