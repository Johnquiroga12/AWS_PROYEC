package com.todotic.demospringboots3.web.api;

import com.todotic.demospringboots3.modelo.Curso;
import com.todotic.demospringboots3.repositoryo.CursoRepositoryo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoController {
    @Autowired
    private CursoRepositoryo cursoRepository;


    @GetMapping
    List<Curso> getAll(){
        return cursoRepository.findAll();
    }

    @PostMapping
    Curso create(@RequestBody Curso curso) {
        return cursoRepository.save(curso);
    }

}
