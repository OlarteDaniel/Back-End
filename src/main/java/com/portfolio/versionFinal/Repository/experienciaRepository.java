
package com.portfolio.versionFinal.Repository;

import com.portfolio.versionFinal.Model.experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository<experiencia, Long> {
    
}
