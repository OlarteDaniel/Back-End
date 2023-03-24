
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.usuario;
import java.util.List;

public interface IusuarioService {
    
    public List<usuario> verUsuario();
    
    public void crearUsuario(usuario user);
    
    public usuario actualizarUsuario(usuario user);
    
    public void eliminarUsuario(Long id);
    
    public usuario buscarUsuario(Long id);
    
}
