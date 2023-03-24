
package com.portfolio.versionFinal.Controller;

import com.portfolio.versionFinal.Model.educacion;
import com.portfolio.versionFinal.Model.experiencia;
import com.portfolio.versionFinal.Model.persona;
import com.portfolio.versionFinal.Model.usuario;
import com.portfolio.versionFinal.Service.IeducacionService;
import com.portfolio.versionFinal.Service.IexperienciaService;
import com.portfolio.versionFinal.Service.IpersonaService;
import com.portfolio.versionFinal.Service.IusuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/servidor"})
public class Controller {
    
    @Autowired
    private IpersonaService persServ;
    
    @Autowired
    private IeducacionService eduServ;
    
    @Autowired
    private IexperienciaService expServ;
    
    @Autowired
    private IusuarioService userServ;
    
    /*----------------PERSONA----------------*/
    
    @PostMapping("/agregar/persona")
    public void agregarPersona(@RequestBody persona pers){
        persServ.crearPersona(pers);
    }
    
    @PutMapping("/editar/persona/{id}")
    public  persona editarPersona(@PathVariable Long id,@RequestBody persona pers){
        pers.setId(id);
        return persServ.actualizarPersona(pers);
    }
    
    @GetMapping("/ver/persona")
    @ResponseBody
    public List <persona> verPersona(){
        return persServ.verPersona();
    }
    
    @DeleteMapping("/eliminar/persona/{id}")
    public void eliminarPersona(@PathVariable Long id){
        persServ.eliminarPersona(id);
    }
    
    @GetMapping("/buscar/persona/{id}")
    public persona buscarPersona(@PathVariable Long id){
        return persServ.buscarPersona(id);
    }
    
    /*----------------PERSONA----------------*/
    
    /*---------------EDUCACION---------------*/
    
    @PostMapping("/agregar/educacion")
    public void agregarEducacion(@RequestBody educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @PutMapping("/editar/educacion/{id}")
    public  educacion editarEducacion(@PathVariable Long id,@RequestBody educacion edu){
        edu.setId(id);
        return eduServ.actualizarEducacion(edu);
    }
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List <educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @DeleteMapping("/eliminar/educacion/{id}")
    public void eliminarEducacion(@PathVariable Long id){
        eduServ.eliminarEducacion(id);
    }
    
    @GetMapping("/buscar/educacion/{id}")
    public educacion buscarEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    
    /*---------------EDUCACION---------------*/
    
    /*--------------EXPERIENCIA--------------*/
    
    @PostMapping("/agregar/experiencia")
    public void agregarExperiencia(@RequestBody experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @PutMapping("/editar/experiencia/{id}")
    public  experiencia editarExperiencia(@PathVariable Long id,@RequestBody experiencia exp){
        exp.setId(id);
        return expServ.actualizarExperiencia(exp);
    }
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List <experiencia> verExperiencia(){
        return expServ.verExperiencia();
    }
    
    @DeleteMapping("/eliminar/experiencia/{id}")
    public void eliminarExperiencia(@PathVariable Long id){
        expServ.eliminarExperiencia(id);
    }
    
    @GetMapping("/buscar/experiencia/{id}")
    public experiencia buscarExperiencia(@PathVariable Long id){
        return expServ.buscarExperiencia(id);
    }
    
    /*--------------EXPERIENCIA--------------*/
    
    /*----------------USUARIO----------------*/
    @PostMapping("/agregar/usuario")
    public void agregarUsuario(@RequestBody usuario user){
        userServ.crearUsuario(user);
    }
    
    @PutMapping("/editar/usuario/{id}")
    public usuario editarUsuario(@PathVariable Long id,@RequestBody usuario user){
        user.setId(id);
        return userServ.actualizarUsuario(user);
    }
    
    @GetMapping("/ver/usuario")
    @ResponseBody
    public List <usuario> verUsuario(){
        return userServ.verUsuario();
    }
    
    @DeleteMapping("/eliminar/usuario/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        userServ.eliminarUsuario(id);
    }
    
    @GetMapping("/buscar/usuario/{id}")
    public usuario buscarUsuario(@PathVariable Long id){
        return userServ.buscarUsuario(id);
    }
    /*----------------USUARIO----------------*/
    
}
