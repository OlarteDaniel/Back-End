
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.persona;
import com.portfolio.versionFinal.Repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements IpersonaService{

    @Autowired
    public personaRepository persRepo;
    
    @Override
    public List<persona> verPersona() {
        return persRepo.findAll();
    }

    @Override
    public void crearPersona(persona pers) {
        persRepo.save(pers);
    }

    @Override
    public void eliminarPersona(Long id) {
        persRepo.deleteById(id);
    }

    @Override
    public persona buscarPersona(Long id) {
        return persRepo.findById(id).orElse(null);
    }

    @Override
    public persona actualizarPersona(persona pers) {
        return persRepo.save(pers);
    }

    
    
}
