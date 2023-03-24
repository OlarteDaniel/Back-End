/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.versionFinal.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@Entity
@Table(name = "Usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "Email",nullable = false)
    private String email;
    
    @Column(name = "Password",nullable = false)
    private String password;

    public usuario() {
    }

    public usuario(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    
    
}
