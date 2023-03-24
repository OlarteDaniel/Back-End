
package com.portfolio.versionFinal.Repository;

import com.portfolio.versionFinal.Model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository<persona,Long>{
    
}
