package com.example.ChurchSystem.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ChurchSystem.Models.MembersModels;
import com.example.ChurchSystem.Services.MembersServices;

@RestController
@RequestMapping("/miembros")
public class MembersController {
    @Autowired
    MembersServices membersServices;

    @GetMapping()
    public ArrayList<MembersModels> obtenerMiembros(){
        return membersServices.obtenerMiembros();
    } 


    @PostMapping()
    public MembersModels guardarMiembros(@RequestBody MembersModels miembro){
        return membersServices.guardarMiembros(miembro);
    }


    @GetMapping(path = "/{id}")
    public Optional<MembersModels> obtenerMiembrosPorId(@PathVariable("id")Long id){
        return this.membersServices.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<MembersModels> obtenerMiembrosPorPrioridad(@RequestParam("level")Integer level){
        return this.membersServices.obtenerPorlevel(level);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.membersServices.eliminarMiembro(id);
        if (ok){
            return "Se elimino el miembro con Id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
