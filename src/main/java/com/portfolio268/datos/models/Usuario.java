
package com.portfolio268.datos.models;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario implements Serializable{
    
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nombre;
 private String apellido;
 private String titulo;
 private String descripcion;
 private String imagenPerfil;
 
 @OneToMany (fetch =FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion>educacionList;  
    
    @OneToMany (fetch =FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia>experienciaList;  
    
    @OneToMany (fetch =FetchType.LAZY, mappedBy = "idPro")
    private List<Proyecto>proyectoList;  
    
    @OneToMany (fetch =FetchType.LAZY, mappedBy = "idSkill")
    private List<Skills>skillsList;  

}
