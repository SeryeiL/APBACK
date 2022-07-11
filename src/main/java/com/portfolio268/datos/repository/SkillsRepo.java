
package com.portfolio268.datos.repository;


import com.portfolio268.datos.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills,Long >{
    
}