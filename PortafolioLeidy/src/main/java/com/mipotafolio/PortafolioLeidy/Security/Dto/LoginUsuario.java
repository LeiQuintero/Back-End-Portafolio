/*

 */
package com.mipotafolio.PortafolioLeidy.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Usuario
 */
public class LoginUsuario {
    @NotBlank // no pueden estar vacios
    private String nombreUsuario;
    @NotBlank
    private String password;
    
    //Getter & Setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}