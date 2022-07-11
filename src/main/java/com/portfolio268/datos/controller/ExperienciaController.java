
package com.portfolio268.datos.controller;

import com.portfolio268.datos.models.Experiencia;
import com.portfolio268.datos.services.ExperienciaService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins ="https://portfolioapsergio.web.app/")
@RequestMapping("/api/experiencia")
public class ExperienciaController {
    
private final ExperienciaService experienciaService;

public ExperienciaController(ExperienciaService experienciaService){
    this.experienciaService =  experienciaService;
}

@GetMapping
public ResponseEntity <List<Experiencia>> obtenerExperiencia(){
    List<Experiencia> experiencias=experienciaService.buscarExperiencia();
    return new ResponseEntity<>(experiencias,HttpStatus.OK);
}

@PutMapping
public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
    Experiencia  updateExperiencia=experienciaService.editarExperiencia(experiencia);
    return new ResponseEntity<>(updateExperiencia,HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Experiencia>agregarExperiencia(@RequestBody Experiencia experiencia){
  Experiencia nuevaExperiencia=experienciaService.agregarExperiencia(experiencia);
  return new ResponseEntity<>(nuevaExperiencia,HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public ResponseEntity<?> borrarExperiencia(@PathVariable("id")Long id){
 experienciaService.borrarExperiencia(id);
 return new ResponseEntity<>(HttpStatus.OK);
}
     
}
