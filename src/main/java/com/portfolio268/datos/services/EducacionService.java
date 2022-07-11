
package com.portfolio268.datos.services;

import com.portfolio268.datos.models.Educacion;
import com.portfolio268.datos.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
 private final EducacionRepo educacionRepo; 
 
 @Autowired
 public EducacionService (EducacionRepo educacionRepo) {
     this.educacionRepo = educacionRepo;
 }
 
 public Educacion agregarEducacion (Educacion educacion){
   return educacionRepo.save(educacion);
 }
 
 public List <Educacion>buscarEducacion(){
 return educacionRepo.findAll();
 }
 
 public Educacion editarEducacion(Educacion educacion){
 return educacionRepo.save(educacion);
}
 
 public void borrarEducacion (Long id){
  educacionRepo.deleteById(id);
  }
 

}
