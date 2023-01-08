/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipotafolio.PortafolioLeidy.Service;

import com.mipotafolio.PortafolioLeidy.Entity.Experiencia;
import com.mipotafolio.PortafolioLeidy.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional //Esta annotacion indica que haya persistencia: Lo que hay acá se mantiene en la BD
public class SExperiencia {
     @Autowired // inyección de reposistorio
     RExperiencia rExperiencia;
     
     public List<Experiencia> list(){
         return rExperiencia.findAll(); // el método arma una lista con todas las experiencias que encuentre 
     }
     
     public Optional<Experiencia> getOne(int id){
         return rExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByNombreE(String nombreE){
         return rExperiencia.findByNombreE(nombreE);
     }
     
     public void save(Experiencia expe){
         rExperiencia.save(expe);
     }
     
     public void delete(int id){ // void solo busca algo pero no devuelve. En este caso solo borra por ID 
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){ // servirá para las validaciones
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rExperiencia.existsByNombreE(nombreE);
     }
}

