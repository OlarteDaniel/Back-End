
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
@Table(name = "Persona")
public class persona {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Nombre",nullable = false,length = 45)
    private String nombre;
    
    @Column(name = "Apellido",nullable = false,length = 45)
    private String apellido;
    
    @Column(name = "Fecha_de_nacimiento",nullable = false)
    private String fnac;
    
    @Column(name = "Telefono",nullable = false,length = 12)
    private String numero;
    
    @Column (name = "Correo_electronico",nullable = false,length = 45)
    private String correo;
    
    @Column (name = "Localidad",nullable = false,length = 100)
    private String localidad;
    
    @Column (name = "Sobre_Mi",nullable = false,length = 200)
    private String sobreMi;
    
    @Column (name = "Url",nullable = false,length = 250)
    private String url;
    
    @Column (name = "Titulo",nullable = false,length = 45)
    private String titulo;
    
    public persona(){
    }

    public persona(Long id, String nombre, String apellido, String fnac, String numero, String correo, String localidad, String sobreMi, String url, String titulo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fnac = fnac;
        this.numero = numero;
        this.correo = correo;
        this.localidad = localidad;
        this.sobreMi = sobreMi;
        this.url = url;
        this.titulo = titulo;
    }

    
    
}
