
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.educacion;
import com.portfolio.versionFinal.Repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class educacionService implements IeducacionService{

    @Autowired
    public educacionRepository eduRepo;
    
    @Override
    public List<educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void eliminarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public educacion actualizarEducacion(educacion edu) {
        return eduRepo.save(edu);
    }
    
}
