
package com.mipotafolio.PortafolioLeidy.Entity;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/** con la annotation @Entity se le dice a la BD que este archivo contiene entidades*/
@Entity

public class Persona implements Serializable {
    @Id /*se hace la annotation @Id para que lo tome como una PK*/
    @GeneratedValue (strategy = GenerationType.IDENTITY) /*Generará un numero consecutivo para cada registro*/
    private int id;
    
    
    @NotNull /*Asegura que si o si va a agregar el nombre*/
    @Size(min = 1, max = 50, message= "No cumple con la longitud") /*se considicona un tamaño máx*/
    private String nombre;
    
    
    @NotNull 
    @Size(min = 1, max = 50, message= "No cumple con la longitud")
    private String apellido;
    
    
   
    @NotNull 
    @Size(min = 1, max = 3000, message= "No cumple con la longitud")
    private String descripcion;
    
    
    //private String img;

   //constructores

    public Persona() {
    }

    public Persona(String nombre, String apellido, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
    }
    
    
    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
