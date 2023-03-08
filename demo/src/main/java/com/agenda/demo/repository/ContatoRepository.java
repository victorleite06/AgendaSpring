package com.agenda.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agenda.demo.model.Contatos;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ContatoRepository extends JpaRepository<Contatos, Integer> {
    
}
