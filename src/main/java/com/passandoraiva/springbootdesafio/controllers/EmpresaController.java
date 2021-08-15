package com.passandoraiva.springbootdesafio.controllers;

import com.passandoraiva.springbootdesafio.model.Empresa;
import com.passandoraiva.springbootdesafio.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaRepository _repository;
    @GetMapping
    public List<Empresa> get(){
        return _repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Empresa> get(@PathVariable Long id){return _repository.findById(id);}

    @PostMapping
    public Empresa post(@RequestBody Empresa empresa){return _repository.save(empresa);}

    @PutMapping
    public Empresa put(@RequestBody Empresa empresa){return  _repository.save(empresa);}

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){_repository.deleteById(id);}
}
