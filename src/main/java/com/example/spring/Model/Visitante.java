/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.jakarta to edit this template
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
@Table(name = "visitante")
@Data

public class Visitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idvisitante")
    private Integer idvisitante;
    @Basic(optional = false)
    @Column(name = "identificaci\u00f3n")
    private String identificación;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "documento")
    private String documento;
    @Basic(optional = false)
    @Column(name = "codigo_empleado")
    private String codigoEmpleado;
    @Basic(optional = false)
    @Column(name = "empleado_idempleado")
    private int empleadoIdempleado;

}
