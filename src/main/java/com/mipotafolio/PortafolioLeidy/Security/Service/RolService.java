/*
 * 
 */
package com.mipotafolio.PortafolioLeidy.Security.Service;


import com.mipotafolio.PortafolioLeidy.Security.Entity.Rol;
import com.mipotafolio.PortafolioLeidy.Security.Enums.RolNombre;
import com.mipotafolio.PortafolioLeidy.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional // mantiene la relación de los datos con la BD si se cae el proceso del usuario = Persistencia 

public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
