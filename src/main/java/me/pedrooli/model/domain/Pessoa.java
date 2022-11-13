package me.pedrooli.model.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public abstract class Pessoa implements Serializable{
    protected Long id;
    protected String nome;
    protected String email;
    protected Date dataNascimento;
    protected String celular;

    public Pessoa(){
        
    }

    public Pessoa(Long id, String nome, String email, Date dataNascimento, String celular) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
    }

    

}
