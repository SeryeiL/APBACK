
package com.portfolio268.datos.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)   
private Long idPro;
    private String tituloPro;
    private String descPro;
    private String imagenPro;


    
}
