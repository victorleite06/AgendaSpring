package com.agenda.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter 
@NoArgsConstructor
@Table(name="CONTATOS_COMPROMISSOS_656016")
public class ContatosCompromissos implements Serializable {
    
    private static final Long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@JoinColumn(name="COMPROMISSOS_656016", referencedColumnName="ID")
	private Compromissos compromissosId;

    @JoinColumn(name="CONTATOS_656016", referencedColumnName="ID")	
    private Contatos contatosId;
}
