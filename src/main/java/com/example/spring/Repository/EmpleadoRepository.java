/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.spring.Repository;

import com.example.spring.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LOPEZ YURI
 */


@Repository 
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{

    
    
    //Consulta personalizada para buscar un empleado por documento
    @Query("SELECT e FROM Empleado e WHERE e.documento = :documento")
    Empleado findByDocumento(@Param("documento") String documento);
    
}
