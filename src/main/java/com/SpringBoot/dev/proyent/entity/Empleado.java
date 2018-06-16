package com.SpringBoot.dev.proyent.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "legajo")
    private Long legajo;

    @Column(name = "nombre_apellido")
    private String nombreYApellido;

    @Column(name = "edad")
    private Integer edad;
    
    @Column(name = "tipo_doc")
    private String tipoDoc ;
    
    @Column(name = "nro_doc")
    private Integer nroDoc;
    
    private transient String cargo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }    
    
    public Integer getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(Integer nroDoc) {
        this.nroDoc = nroDoc ;
    }   
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
