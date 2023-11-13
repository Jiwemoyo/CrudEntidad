package com.example.crudEntity.service;

import com.example.crudEntity.entity.Autor;
import com.example.crudEntity.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    AutorRepository autorRepository;
    public List<Autor> getAutors(){
        return autorRepository.findAll();
    }

    public Optional<Autor> getAutor(Long id){
        return autorRepository.findById(id);
    }

    public void saveOrUpdate(Autor autor){
        autorRepository.save(autor);
    }

    public void delete(Long id){
        autorRepository.deleteById(id);
    }
}
