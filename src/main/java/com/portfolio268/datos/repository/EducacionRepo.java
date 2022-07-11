
package com.portfolio268.datos.repository;


import com.portfolio268.datos.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion,Long >{
    
}
