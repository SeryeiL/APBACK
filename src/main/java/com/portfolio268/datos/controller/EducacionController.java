
package com.portfolio268.datos.controller;

import com.portfolio268.datos.models.Educacion;
import com.portfolio268.datos.services.EducacionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin (origins ="https://portfolioapsergio.web.app/")
@RequestMapping("/api/educacion")
public class EducacionController {
    
private final EducacionService educacionService;

public EducacionController(EducacionService educacionService){
    this.educacionService =  educacionService;
}

@GetMapping
public ResponseEntity <List<Educacion>> obtenerEducacion(){
    List<Educacion> educaciones=educacionService.buscarEducacion();
    return new ResponseEntity<>(educaciones,HttpStatus.OK);
}

@PutMapping
public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
    Educacion  updateEducacion=educacionService.editarEducacion(educacion);
    return new ResponseEntity<>(updateEducacion,HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Educacion>agregarEducacion(@RequestBody Educacion educacion){
  Educacion nuevaEducacion=educacionService.agregarEducacion(educacion);
  return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public ResponseEntity<?> borrarEducacion(@PathVariable("id")Long id){
 educacionService.borrarEducacion(id);
 return new ResponseEntity<>(HttpStatus.OK);
}
     
}
