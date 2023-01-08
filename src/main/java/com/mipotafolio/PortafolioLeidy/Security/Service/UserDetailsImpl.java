/*
 *
 */
package com.mipotafolio.PortafolioLeidy.Security.Service;


import com.mipotafolio.PortafolioLeidy.Security.Entity.Usuario;
import com.mipotafolio.PortafolioLeidy.Security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService{ //viene de una librería ya precargada
    @Autowired
    //se inyecta
    UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(usuario);
    }
    
    
}