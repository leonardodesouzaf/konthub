package com.konthub.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konthub.api.service.ReposService;

@RestController
@RequestMapping("/repos")
public class ReposController {

    @Autowired
    private ReposService service;
    
    @GetMapping
    public String getUserRepos() {
        return service.getAll();
    }
}
