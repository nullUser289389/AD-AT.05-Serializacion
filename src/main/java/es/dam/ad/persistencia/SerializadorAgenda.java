package es.dam.ad.persistencia;
import es.dam.ad.modelo.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SerializadorAgenda {

    public boolean guardarPropietario(Propietario propietario, Path ruta){
        try{

        } catch (IOException ioe) {
            System.out.println("[!]Excepcion capturada al guardar propietario ==> " + ioe.getMessage());
        }
    }
}
