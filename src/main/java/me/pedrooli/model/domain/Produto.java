package me.pedrooli.model.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PRODUTOS")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;

    @Column(name = "tipo_unidade")
    @Enumerated(EnumType.STRING)
    private TipoUnidade tipoUnidade;

    private Double estoque;
    private Double preco;
    private Date validade;

    public Produto(Long id, String nome, TipoUnidade tipoUnidade, Double estoque, Double preco, Date validade) {
        this.id = id;
        this.nome = nome;
        this.tipoUnidade = tipoUnidade;
        this.estoque = estoque;
        this.preco = preco;
        this.validade = validade;
    }
}
