
package com.portfolio268.datos.controller;

import com.portfolio268.datos.models.Proyecto;
import com.portfolio268.datos.services.ProyectoService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins ="https://portfolioapsergio.web.app/")
@RequestMapping("/api/proyecto")
public class ProyectoController {
    
private final ProyectoService proyectoService;

public ProyectoController(ProyectoService proyectoService){
    this.proyectoService =  proyectoService;
}

@GetMapping
public ResponseEntity <List<Proyecto>> obtenerProyecto(){
    List<Proyecto> proyectos=proyectoService.buscarProyecto();
    return new ResponseEntity<>(proyectos,HttpStatus.OK);
}

@PutMapping
public ResponseEntity<Proyecto> editarProyecto(@RequestBody Proyecto proyecto){
    Proyecto  updateProyecto=proyectoService.editarProyecto(proyecto);
    return new ResponseEntity<>(updateProyecto,HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Proyecto>agregarProyecto(@RequestBody Proyecto proyecto){
  Proyecto nuevoProyecto=proyectoService.agregarProyecto(proyecto);
  return new ResponseEntity<>(nuevoProyecto,HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public ResponseEntity<?> borrarProyecto(@PathVariable("id")Long id){
 proyectoService.borrarProyecto(id);
 return new ResponseEntity<>(HttpStatus.OK);
}
     
}
