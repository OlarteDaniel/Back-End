
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.educacion;
import java.util.List;

public interface IeducacionService {
    
    public List<educacion> verEducacion();
    
    public void crearEducacion(educacion edu);
    
    public educacion actualizarEducacion(educacion edu);
    
    public void eliminarEducacion(Long id);
    
    public educacion buscarEducacion(Long id);
    
}
