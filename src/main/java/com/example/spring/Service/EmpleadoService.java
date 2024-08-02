/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring.Service;

import com.example.spring.Model.Empleado;
import com.example.spring.Repository.EmpleadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LOPEZ YURI
 */

@Service

public class EmpleadoService {
    @Autowired
    EmpleadoRepository objemplerep;
    
    public List<Empleado> traerempleado(){
        return  objemplerep.findAll();
        
    }
    
    
    public String Guardarempleado(Empleado empl){
          try{
              
              objemplerep.save(empl);
              return "Guardado exitosamente";
              
          }catch(Exception e){
              return "Ocurrio un  error al guardar" +e.getMessage();
              
          }
    }
    
    
    public String ActualizarEmpleado(Empleado empl) {
        // Buscar el empleado existente en la base de datos usando el documento
        Empleado empleadoExistente = objemplerep.findByDocumento(empl.getDocumento());

        // Verificar si el empleado existe
        if (empleadoExistente != null) {
            // Actualizar los atributos del empleado existente
            empleadoExistente.setNombre(empl.getNombre());
            empleadoExistente.setApellido(empl.getApellido());
            empleadoExistente.setCargo(empl.getCargo());
             // Guardar el empleado actualizado en la base de datos
        objemplerep.save(empleadoExistente);
            return "Se actualizó correctamente";
        } else {
            return "El empleado no existe";
        }
        
    }
    
}
