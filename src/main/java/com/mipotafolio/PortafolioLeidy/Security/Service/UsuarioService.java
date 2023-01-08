/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mipotafolio.PortafolioLeidy.Security.Service;

/**
 *
 * @author lquintero
 */

import com.mipotafolio.PortafolioLeidy.Security.Entity.Usuario;
import com.mipotafolio.PortafolioLeidy.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);//comprueba si el usuario existe o no 
    }
    
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email); //comprueba si el email existe o no 
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
