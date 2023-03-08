package com.konthub.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.konthub.api.model.Repo;

@Service
public class ReposService {
    
    public List<Repo> getAll(Long username){
        List<Repo> repos = new ArrayList<>();
        return repos;
      }

}
