
package com.mipotafolio.PortafolioLeidy.Controller;

import com.mipotafolio.PortafolioLeidy.Entity.Persona;
import com.mipotafolio.PortafolioLeidy.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://localhost:4200") // poner el local host del VS

public class PersonaController { /*El controlador llama al servicio, a la interface del servicio*/
   @Autowired IPersonaService ipersonaService;
   
   @GetMapping("personas/traer")/*Annotation GetMapping es para que traiga de la BD al front. Depende de la url, localhost/4200 ejm, se conecta con el front ver una persona lo hacer los dos roles: User y Admin*/
   
   public List <Persona> getPersona() { /*le digo qué debe hacer, qué devolver*/
    return ipersonaService.getPersona();
   }
   
   @PreAuthorize ("hasRole('ADMIN')") //Crear una persona solo lo hace el admin y para ello se utiliza la annotation preauthorize
   @PostMapping ("/personas/crear") /*Annotation para mandar los datos desde el front al back - se crea usuario*/
   public String createPersona (@RequestBody Persona persona)/*desde el body le vamos a mandar un un objeto Persona de tipo persona y desarrollo el método */ 
   {
       ipersonaService.savePersona(persona);
       return "La persona fue creada correctamente";
   }
     
   @PreAuthorize ("hasRole('ADMIN')")
   @DeleteMapping("/personas/borrar/{id}")/*Annotation para borrar personas con ID puntual*/
   public String deletePersona(@PathVariable Long id){
       ipersonaService.deletePersona(id);
       return "La persona fue eliminada correctamente";
   }
   
   @PreAuthorize ("hasRole('ADMIN')")
   /*la URL quedaría *ejmp:PUERTO/PERSONAS/EDITAR/id & nombre & apellido & img */
   @PutMapping ("/personas/editar/{id}")/*Annotation para editar persona*/
   public Persona editPersona(@PathVariable Long id, 
                              @RequestParam("nombre") String nuevoNombre,
                              @RequestParam("apellido") String nuevoApellido,
                              @RequestParam("img") String nuevoImg) {
       Persona persona = ipersonaService.findPersona(id);
       
       persona.setNombre(nuevoNombre);
       persona.setApellido(nuevoApellido);
       persona.setImg(nuevoImg);
       
       ipersonaService.savePersona(persona);
       return persona;
   }
   
   @GetMapping("/personas/traer/perfil")
   public Persona findPersona() {
       return ipersonaService.findPersona((long)1);
   }
   
}
