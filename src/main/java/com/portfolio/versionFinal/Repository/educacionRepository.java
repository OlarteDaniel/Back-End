
package com.portfolio.versionFinal.Repository;

import com.portfolio.versionFinal.Model.educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository<educacion, Long>{
    
}
