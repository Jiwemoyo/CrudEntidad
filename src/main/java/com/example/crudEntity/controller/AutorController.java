package com.example.crudEntity.controller;

import com.example.crudEntity.entity.Autor;
import com.example.crudEntity.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/autors")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> getAll(){
        return autorService.getAutors();
    }

    @GetMapping("/{autorID}")
    public Optional<Autor> getBId(@PathVariable("autorID") long autorID){
        return autorService.getAutor(autorID);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Autor autor){
        autorService.saveOrUpdate(autor);
    }

    @DeleteMapping("/{autorID}")
    public void saveUpdate(@PathVariable("autorID") Long autorID){
        autorService.delete(autorID);
    }
}
