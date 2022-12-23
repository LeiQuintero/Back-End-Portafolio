/*
 
 */
package com.mipotafolio.PortafolioLeidy.Security.Repository;

/**
 *
 * @author lquintero
 */

import com.mipotafolio.PortafolioLeidy.Security.Entity.Rol;
import com.mipotafolio.PortafolioLeidy.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}