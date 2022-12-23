/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mipotafolio.PortafolioLeidy.Security.Repository;

import com.mipotafolio.PortafolioLeidy.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    //Se le da la instrucción para que devuelva falso o verdadero si existen o no los datos 
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
