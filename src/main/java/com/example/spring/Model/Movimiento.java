/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.spring.Model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author LOPEZ YURI
 */
@Entity
@Table(name = "movimiento")
@Data

public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idmovimiento")
    private Integer idmovimiento;
    @Basic(optional = false)
    @Column(name = "administrar_datos")
    private String administrarDatos;
    @Basic(optional = false)
    @Column(name = "registro_usuario")
    private String registroUsuario;
    @Basic(optional = false)
    @Column(name = "editar_usuario")
    private String editarUsuario;
    @Basic(optional = false)
    @Column(name = "crear_usuario")
    private String crearUsuario;
    @Basic(optional = false)
    @Column(name = "codigo_empleado")
    private String codigoEmpleado;
    @Basic(optional = false)
    @Column(name = "empleado_idempleado")
    private int empleadoIdempleado;
    
}
