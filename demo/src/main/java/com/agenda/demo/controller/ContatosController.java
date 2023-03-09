package com.agenda.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.agenda.demo.model.Contatos;
import com.agenda.demo.service.ContatoService;

@CrossOrigin
@RestController
@RequestMapping("/api/contato")
public class ContatosController {
    
    private ContatoService contatoService;

    public ContatosController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @GetMapping("")
    public ResponseEntity<List<Contatos>> buscarContatos() {
        return ResponseEntity.ok(contatoService.buscarContatos());
    }

    @PostMapping("")
    public ResponseEntity<Contatos> salvarContato(@RequestBody Contatos contato) {
        return ResponseEntity.ok(contatoService.salvarContato(contato));
    }

    @GetMapping("/deletar/{idContato}")
    public ResponseEntity<Integer> deletarContato(@PathVariable("idContato") Integer idContato) {
        return ResponseEntity.ok(contatoService.deletarContato(idContato));
    }
}
