package me.pedrooli.model.domain;

import java.util.Date;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cliente extends Pessoa {
    
    public Cliente(Long id, String nome, String email, Date dataNascimento, String celular) {
        super(id, nome, email, dataNascimento, celular);
    }
}
