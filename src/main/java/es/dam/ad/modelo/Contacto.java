package es.dam.ad.modelo;

import java.io.Serial;
import java.io.Serializable;

/**
 * Clase que representa un contacto.
 * @author candido
 * */

public class Contacto implements Serializable {
    @Serial
    private static final long serialVersionUID = 123456789L;
    private int id;
    private String nombre;
    private String telefono;
    private String email;
    private boolean favorito;

    /**
     * Constructor. No incluye el atributo id ya que este lo asignara el programa.
     */

    public Contacto(
            String nombre,
            String telefono,
            String email,
            boolean favorito
    ){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.favorito = favorito;
    }

    //===============================Getters=======================================

    /**
     * Getter del atributo nombre.
     * @return El atributo nombre.
     * */
    public String getNombre(){
        return this.nombre;
    };
    /**
     * Getter del atributo telefono.
     * @return El atributo telefono.
     * */
    public String getTelefono(){
        return this.telefono;
    };
    /**
     * Getter del atributo email.
     * @return El atributo email.
     * */
    public String getEmail(){
        return this.email;
    };
    /**
     * Getter del atributo favorito.
     * @return Si es o no favorito.
     * */
    public boolean isFavorito(){
        return this.favorito;
    };

    //===============================Setters=======================================

    /**
     * Setter del atributo nombre.
     * @param nombre El nombre ha ser asignado.
     * */
    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    /**
     * Setter del atributo telefono.
     * @param telefono El atributo telefono.
     * */
    public void setTelefono(String telefono){
        this.telefono = telefono;
    };
    /**
     * Setter del atributo email.
     * @param email El atributo email.
     * */
    public void setEmail(String email){
        this.email = email;
    };
    /**
     * Setter del atributo boolean
     * @param favorito Si es o no favorito.
     * */
    public void isFavorito(boolean favorito){
        this.favorito = favorito;
    };

}
