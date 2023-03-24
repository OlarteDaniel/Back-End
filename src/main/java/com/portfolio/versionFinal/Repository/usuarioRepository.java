
package com.portfolio.versionFinal.Repository;

import com.portfolio.versionFinal.Model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Long>{
    
}
