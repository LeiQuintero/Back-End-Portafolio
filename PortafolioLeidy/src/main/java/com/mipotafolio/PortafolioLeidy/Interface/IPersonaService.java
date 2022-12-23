
package com.mipotafolio.PortafolioLeidy.Interface;

import com.mipotafolio.PortafolioLeidy.Entity.Persona;
import java.util.List;


/*Acá detallo lo métodos que utilizaré - La I es de Interface PersonaService*/
public interface IPersonaService {
    //Traer una lista de persona - El método trae una lista que tiene como objeto personas cuando yo llame al método getPersona
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona - Una variable que se llama persona y va a contener los atributos de Persona
    public void savePersona (Persona persona);
    
    //Eliminar un objeto/usuario y lo buscamos por ID - Long es el tipo de dato y ID es el nombre/dato que tiene que buscar
    public void deletePersona (Long id);
    
    //Buscar una persona por ID - con el método findPersona y le damos como parámetro el ID que diferencia a cada persona
    public Persona findPersona(Long id);
    
}
