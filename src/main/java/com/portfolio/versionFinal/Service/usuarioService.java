
package com.portfolio.versionFinal.Service;

import com.portfolio.versionFinal.Model.usuario;
import com.portfolio.versionFinal.Repository.usuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService implements IusuarioService{

    @Autowired
    public usuarioRepository userRepo;
    
    @Override
    public List<usuario> verUsuario() {
        return userRepo.findAll();
    }

    @Override
    public void crearUsuario(usuario user) {
        userRepo.save(user);
    }

    @Override
    public usuario actualizarUsuario(usuario user) {
        return userRepo.save(user);
    }

    @Override
    public void eliminarUsuario(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public usuario buscarUsuario(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
}
