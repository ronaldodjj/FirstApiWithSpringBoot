package com.example.ChurchSystem.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ChurchSystem.Models.MembersModels;
import com.example.ChurchSystem.Repositories.MembersRepositories;

@Service
public class MembersServices {
    
    @Autowired
    MembersRepositories membersRepositories;


    public ArrayList<MembersModels>obtenerMiembros(){
       return (ArrayList<MembersModels>) membersRepositories.findAll();
    }

    public MembersModels guardarMiembros(MembersModels members){
        return membersRepositories.save(members);
    }


    public Optional<MembersModels> obtenerPorId(long id){
        return membersRepositories.findById(id); 
    }

     
    public ArrayList<MembersModels>obtenerPorlevel(Integer level){
        return membersRepositories.findBylevel(level);
     }


     public boolean eliminarMiembro(long id){
        try {
            membersRepositories.deleteById(id);
            return true;
        } catch(Exception err) {
            return false;
        }
     }


}
