package es.dam.ad.persistencia;
import es.dam.ad.modelo.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class SerializadorAgenda {

    int n = 0;

    public boolean guardarPropietario(Propietario propietario){
        boolean estado = true;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos/propietario.dat"))){
            oos.writeObject(propietario);
        } catch (IOException ioe) {
            estado = false;
            System.out.println("[!]Excepcion capturada al guardar propietario ==> " + ioe.getMessage());
        }
        return estado;
    }

    public boolean guardarContacto(Contacto contacto){
        boolean estado = true;
        n++;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos/exportados/contacto_<\n" +
                "" + n + ">.dat"))){
            oos.writeObject(contacto);
        }catch (IOException ioe){
            estado = false;
            System.out.println("[!]Excepcion capturada al guardar contacto ==> " + ioe.getMessage());
        }
        return estado;
    }

    public boolean guardarListaContactos(ArrayList<Contacto> listaContactos){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datos/agenda.dat"))){
            oos.writeObject(listaContactos);
        }catch (IOException ioe){
            System.out.println("[!]Excepcion capturada al guardar lista de contactos ==> " + ioe.getMessage());
        }
    }
}
