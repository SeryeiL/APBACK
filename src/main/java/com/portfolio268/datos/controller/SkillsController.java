
package com.portfolio268.datos.controller;

import com.portfolio268.datos.models.Skills;
import com.portfolio268.datos.services.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins ="https://portfolioapsergio.web.app/")
@RequestMapping("/api/skills")
public class SkillsController {
    
private final SkillsService skillsService;

public SkillsController(SkillsService skillsService){
    this.skillsService =  skillsService;
}

@GetMapping
public ResponseEntity <List<Skills>> obtenerSkills(){
    List<Skills> skills=skillsService.buscarSkills();
    return new ResponseEntity<>(skills,HttpStatus.OK);
}

@PutMapping
public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
    Skills  updateSkills=skillsService.editarSkills(skills);
    return new ResponseEntity<>(updateSkills,HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Skills>agregarSkills(@RequestBody Skills skills){
  Skills nuevaSkills=skillsService.agregarSkills(skills);
  return new ResponseEntity<>(nuevaSkills,HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public ResponseEntity<?> borrarSkills(@PathVariable("id")Long id){
 skillsService.borrarSkills(id);
 return new ResponseEntity<>(HttpStatus.OK);
}
     
}
