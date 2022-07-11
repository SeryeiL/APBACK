
package com.portfolio268.datos.services;


import com.portfolio268.datos.models.Skills;
import com.portfolio268.datos.repository.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillsService {
    
private final SkillsRepo skillsRepo; 
 
 @Autowired
 public SkillsService (SkillsRepo skillsRepo) {
     this.skillsRepo = skillsRepo;
 }
 
 public Skills agregarSkills (Skills skills){
   return skillsRepo.save(skills);
 }
 
 public List <Skills>buscarSkills(){
 return skillsRepo.findAll();
 }
 
 public Skills editarSkills(Skills skills){
 return skillsRepo.save(skills);
}
 
 public void borrarSkills (Long id){
  skillsRepo.deleteById(id);
  }

    
}
