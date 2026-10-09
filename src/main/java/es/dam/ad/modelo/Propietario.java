package es.dam.ad.modelo;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Propietario implements Serializable {
    @Serial
    private static final long serialVersionUID = 123456789L;
    private String nombre;
    private String email;
    private LocalDate fechaCreacion;
    private transient String pin;

    public Propietario(
            String nombre,
            String email,
            LocalDate fechaCreacion,
            String pin
    ){

        this.nombre = nombre;
        this.email = email;
        this.fechaCreacion = LocalDate.now();


    }

}
