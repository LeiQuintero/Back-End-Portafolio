
package com.mipotafolio.PortafolioLeidy.Repository;

import com.mipotafolio.PortafolioLeidy.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository /*se deja la anotación para que lo tome como reposotorio*/

public interface IPersonaRepository extends JpaRepository <Persona, Integer>{
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
