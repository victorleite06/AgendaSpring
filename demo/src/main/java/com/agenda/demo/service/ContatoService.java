package com.agenda.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agenda.demo.model.Contatos;
import com.agenda.demo.repository.ContatoRepository;

@Service
public class ContatoService {
    
    private ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    public List<Contatos> buscarContatos() {
        return this.contatoRepository.findAll();
    }

    public Contatos salvarContato(Contatos contato) {
        return this.contatoRepository.saveAndFlush(contato);
    }
}
