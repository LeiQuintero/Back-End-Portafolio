
package com.mipotafolio.PortafolioLeidy.Entity;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/** con la annotation @Entity se le dice a la BD que este archivo contiene entidades*/
@Getter @Setter /*con estas anotaciones se hacen los getter y setter de id,nombre,apellido,img y se importa con Lombok la dependencia de spring boot*/
@Entity

public class Persona implements Serializable {
    @Id /*se hace la annotation @Id para que lo tome como una PK*/
    @GeneratedValue (strategy = GenerationType.IDENTITY) /*Generará un numero consecutivo para cada registro*/
    private Long id;
    
    
    @NotNull /*Asegura que si o si va a agregar el nombre*/
    @Size(min = 1, max = 50, message= "No cumple con la longitud") /*se considicona un tamaño máx*/
    private String nombre;
    
    
    @NotNull 
    @Size(min = 1, max = 50, message= "No cumple con la longitud")
    private String apellido;
    
    
    @NotNull 
    @Size(min = 1, max = 50, message= "No cumple con la longitud") 
    private String img;

   
    
}
