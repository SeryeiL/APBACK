
package com.portfolio268.datos.repository;


import com.portfolio268.datos.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto,Long >{
    
}
