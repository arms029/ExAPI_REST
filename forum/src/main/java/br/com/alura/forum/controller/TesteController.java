package br.com.alura.forum.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.alura.forum.modelo.Teste;
import br.com.alura.forum.repository.TesteRepository;

@RestController
@RequestMapping("/teste")
public class TesteController {
    
    @Autowired  
    private TesteRepository testeRepository;

    @GetMapping
    public String TesteGet(){
        return "teste";
    }

    @PostMapping
    public ResponseEntity<Teste> cadastrarTeste(@RequestBody @Valid Teste teste, UriComponentsBuilder uriBuilder){
        testeRepository.save(teste);
        URI uri = uriBuilder.path("/teste/{id}").buildAndExpand(teste.getId()).toUri();
        return ResponseEntity.created(uri).body(teste);
    }

}