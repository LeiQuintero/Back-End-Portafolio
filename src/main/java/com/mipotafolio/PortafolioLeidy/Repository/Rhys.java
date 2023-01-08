/*

 */
package com.mipotafolio.PortafolioLeidy.Repository;

import com.mipotafolio.PortafolioLeidy.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

//En repository solo se mencionan los métodos, no se desarrollan 

public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
