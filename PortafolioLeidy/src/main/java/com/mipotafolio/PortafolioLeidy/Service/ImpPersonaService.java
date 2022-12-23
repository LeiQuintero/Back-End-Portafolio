
package com.mipotafolio.PortafolioLeidy.Service;

import com.mipotafolio.PortafolioLeidy.Entity.Persona;
import com.mipotafolio.PortafolioLeidy.Interface.IPersonaService;
import com.mipotafolio.PortafolioLeidy.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Imp de Implementación de PersonaService*/

@Service  /*Annotation -le decimos que es un servicio para que la BD lo reconozca como tal*/
public class ImpPersonaService implements IPersonaService{
    @Autowired /*permite inyectar dependecias dentro de otras con la mayor facilidad*/ IPersonaRepository ipersonaRepository;   /*tipo y nombre de variable*/
  
    @Override
    public List<Persona> getPersona() { /*En el método pido que me devuelva una lista de personas. Creo una variable que contega una lista de persona*/
        List <Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
}
