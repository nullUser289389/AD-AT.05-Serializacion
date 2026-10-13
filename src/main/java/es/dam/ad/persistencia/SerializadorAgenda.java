package es.dam.ad.persistencia;
import es.dam.ad.modelo.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class SerializadorAgenda {

    public boolean guardarPropietario(Propietario propietario, Path ruta){
        boolean estado = true;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta.toFile()))){
            oos.writeObject(propietario);
        } catch (IOException ioe) {
            estado = false;
            System.out.println("[!]Excepcion capturada al guardar propietario ==> " + ioe.getMessage());
        }
        return estado;
    }

    public boolean guardarContacto(Contacto contacto, Path ruta){
        boolean estado = true;
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta.toFile()))){
            oos.writeObject(contacto);
        }catch (IOException ioe){
            estado = false;
            System.out.println("[!]Excepcion capturada al guardar contacto ==> " + ioe.getMessage());
        }
        return estado;
    }

    public boolean guardarListaContactos(ArrayList<Contacto> listaContactos){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream())){

        }catch ()
    }
}
