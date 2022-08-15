package com.example.ChurchSystem.Repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ChurchSystem.Models.MembersModels;

@Repository
public interface MembersRepositories extends CrudRepository<MembersModels, Long>{
    public abstract ArrayList<MembersModels> findBylevel(Integer level);
}

