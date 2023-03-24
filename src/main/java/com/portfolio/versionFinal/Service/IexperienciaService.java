
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.experiencia;
import java.util.List;

public interface IexperienciaService {
    
    public List<experiencia> verExperiencia();
    
    public void crearExperiencia(experiencia exp);
    
    public experiencia actualizarExperiencia(experiencia exp);
    
    public void eliminarExperiencia(Long id);
    
    public experiencia buscarExperiencia(Long id);
    
}
