
package com.portfolio268.datos.controller;

import com.portfolio268.datos.models.Usuario;
import com.portfolio268.datos.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin (origins ="https://portfolioapsergio.web.app/")
@RequestMapping("/api/usuario")
public class UsuarioController {
    
private final UsuarioService usuarioService;

public UsuarioController(UsuarioService usuarioService){
    this.usuarioService = usuarioService;
}

@GetMapping("/id/{id}")
public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
    
    Usuario usuario = usuarioService.buscarUsuarioPorId(id);
    return new ResponseEntity<>(usuario,HttpStatus.OK);
}

@PutMapping
public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
    Usuario updateUsuario = usuarioService.editarUsuario(usuario);
    return new ResponseEntity<>(updateUsuario,HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Usuario>agregarUsuario(@RequestBody Usuario usuario){
  Usuario nuevoUsuario = usuarioService.agregarUsuario(usuario);
  return new ResponseEntity<>(nuevoUsuario,HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public ResponseEntity<?> borrarUsuario(@PathVariable("id")Long id){
 usuarioService.borrarUsuario(id);
 return new ResponseEntity<>(HttpStatus.OK);
}
     

}
