
package com.portfolio.versionFinal.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Educacion")
public class educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Nombre_Institucion",nullable = false,length = 45)
    private String nombreInstitucion;
    
    @Column(name = "Fecha_Inicio",nullable = false)
    private String fechaInicio;
    
    @Column(name = "Fecha_Fin",nullable = false)
    private String fechaFin;
    
    @Column(name = "Titulo",nullable = false, length = 50)
    private String titulo;
    
    @Column(name = "Descripcion",nullable = false,length = 250)
    private String descripcion;
    
    @Column(name = "Url",nullable = true,length = 200)
    private String url;

    public educacion() {
    }

    public educacion(Long id, String nombreInstitucion, String fechaInicio, String fechaFin, String titulo, String descripcion, String url) {
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
    }

    
    
}
