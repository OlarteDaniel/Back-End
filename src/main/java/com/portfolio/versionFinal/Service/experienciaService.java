
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.experiencia;
import com.portfolio.versionFinal.Repository.experienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienciaService implements IexperienciaService{

    @Autowired
    public experienciaRepository expRepo;
    
    @Override
    public List<experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public experiencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public experiencia actualizarExperiencia(experiencia exp) {
        return expRepo.save(exp);
    }
    
}
