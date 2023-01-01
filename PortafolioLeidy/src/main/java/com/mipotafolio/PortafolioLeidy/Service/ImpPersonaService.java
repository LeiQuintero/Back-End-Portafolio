
package com.mipotafolio.PortafolioLeidy.Service;

import com.mipotafolio.PortafolioLeidy.Entity.Persona;
import com.mipotafolio.PortafolioLeidy.Repository.IPersonaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/* Imp = Implementación de PersonaService*/
@Transactional //indica que haya persistencia: Lo que hay acá se mantiene en la BD
@Service  /*Annotation -le decimos que es un servicio para que la BD lo reconozca como tal*/
public class ImpPersonaService {
    @Autowired /*permite inyectar dependecias dentro de otras con la mayor facilidad*/ 
    IPersonaRepository ipersonaRepository;   /*tipo y nombre de variable*/
  
     public List<Persona> list(){
         return ipersonaRepository.findAll(); // el método arma una lista con todas las experiencias que encuentre 
     }
     
     public Optional<Persona> getOne(int id){
         return ipersonaRepository.findById(id);
     }
     
     public Optional<Persona> getByNombre(String nombre){
         return ipersonaRepository.findByNombre(nombre);
     }
     
     public void save(Persona persona){
         ipersonaRepository.save(persona);
     }
     
     public void delete(int id){ // void solo busca algo pero no devuelve. En este caso solo borra por ID 
         ipersonaRepository.deleteById(id);
     }
     
     public boolean existsById(int id){ // servirá para las validaciones
         return ipersonaRepository.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return ipersonaRepository.existsByNombre(nombre);
     }
    
    
}
