package com.example.ChurchSystem.Models;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table(name = "Miembros")
public class MembersModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long miembroId;
   
    private String nombre;
   
    private long cedula;
 
    private Integer level;



    //Getters and setters

    //Id member
    public long getMemberId() {
        return miembroId;
    }
    public void setMemberId(long memberId) {
        this.miembroId = memberId;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Cedula
    public long getCedula() {
        return cedula;
    }
    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    // Level
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
}
