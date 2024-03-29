
package com.portfolio268.datos.services;

import com.portfolio268.datos.models.Experiencia;
import com.portfolio268.datos.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ExperienciaService {
    
private final ExperienciaRepo experienciaRepo; 
 
 @Autowired
 public ExperienciaService (ExperienciaRepo experienciaRepo) {
     this.experienciaRepo = experienciaRepo;
 }
 
 public Experiencia agregarExperiencia (Experiencia experiencia){
   return experienciaRepo.save(experiencia);
 }
 
 public List <Experiencia>buscarExperiencia(){
 return experienciaRepo.findAll();
 }
 
 public Experiencia editarExperiencia(Experiencia experiencia){
 return experienciaRepo.save(experiencia);
}
 
 public void borrarExperiencia (Long id){
  experienciaRepo.deleteById(id);
  }

    
}
