package com.konthub.api.controller;

import org.springframework.http.HttpStatus;

import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.konthub.api.model.Repo;
import com.konthub.api.service.ReposService;

@RestController
@RequestMapping("/repos")
public class ReposController {

    @Autowired
    private ReposService service;
    
    @GetMapping("/{username}")
    @ResponseStatus(HttpStatus.OK)
    public String getUserRepos(@PathVariable(value = "username", required = true) String username){
        return service.getAll(username);
    }
}
