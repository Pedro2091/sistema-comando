package me.pedrooli.model.domain;

import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable{
    private Long id;
    private List<Produto> produto;
    private Cliente cliente;
    
}
