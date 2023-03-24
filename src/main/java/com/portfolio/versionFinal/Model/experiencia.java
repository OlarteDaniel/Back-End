
package com.portfolio.versionFinal.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "Experiencia")
public class experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Nombre_Empresa",nullable = false,length = 45)
    private String nombreEmpresa;
    
    @Column(name = "Descripcion",nullable = false,length = 250)
    private String descripcion;
    
    @Column(name = "Tipo_de_trabajo",nullable = false,length = 45)
    private String tipoTrabajo;
    
    @Column(name = "Fecha_Inicio",nullable = false)
    private String fechaInicio;
    
    @Column(name = "Fecha_Fin",nullable = false)
    private String fechaFin;
    
    @Column(name = "Link_Proyecto",nullable = false,length = 200)
    private String linkProyecto;
    
    @Column(name = "Url",nullable = true,length = 200)
    private String url;
    
    @Column(name = "Url_Fondo",nullable = true,length = 200)
    private String urlFondo;

    public experiencia() {
    }

    public experiencia(Long id, String nombreEmpresa, String descripcion, String tipoTrabajo, String fechaInicio, String fechaFin, String linkProyecto, String url, String urlFondo) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.tipoTrabajo = tipoTrabajo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.linkProyecto = linkProyecto;
        this.url = url;
        this.urlFondo = urlFondo;
    }

    
    
    
}
