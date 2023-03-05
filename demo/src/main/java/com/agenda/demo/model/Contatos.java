package com.agenda.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(name="CONTATOS_656016")
public class Contatos implements Serializable {

	private static final Long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="NOME")
	private String nome;

	@Column(name="ENDERECO")
	private String endereco;

	@Column(name="TELEFONE")
	private String telefone;
}
