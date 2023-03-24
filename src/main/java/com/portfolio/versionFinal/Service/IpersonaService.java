
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.persona;
import java.util.List;

public interface IpersonaService {
    
    public List<persona> verPersona();
    
    public void crearPersona(persona pers);
    
    public persona actualizarPersona(persona pers);
    
    public void eliminarPersona(Long id);
    
    public persona buscarPersona(Long id);
}
