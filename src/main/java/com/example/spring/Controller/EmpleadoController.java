/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring.Controller;

import com.example.spring.Model.Empleado;
import com.example.spring.Service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LOPEZ YURI
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/empleado")

public class EmpleadoController {
    
    @Autowired
    EmpleadoService objemplerep;
    
    //Buscar o consulta
    @GetMapping("traerempleado")//localhost:8081/empleado/traerempleado
    
    public List<Empleado> traerempleado(){
        return objemplerep.traerempleado();
    }
    
    //Crear o ingresar
    @PostMapping("nuevoempleado")//localhost:8081/empleado/nuevoempleado
    public String Crearempleado(@RequestBody Empleado empl){
        String mensaje=objemplerep.Guardarempleado(empl);
        return mensaje;
    }
    
    // Actualizar
    @PutMapping("actualizarempleado")//localhost:8081/empleado/actualizarempleado
    
       public String actualizarempleado(@RequestBody Empleado empl){
           String Mensaje= objemplerep.ActualizarEmpleado(empl);
           return Mensaje;
       }
       
       
       
       //Eliminar o borrar
       
    

   
 
}
