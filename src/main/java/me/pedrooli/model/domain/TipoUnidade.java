package me.pedrooli.model.domain;

import lombok.Getter;

@Getter
public enum TipoUnidade {
    KG("Kg"),
    UN("Un"),
    CX("Cx");

    private String label;

    private TipoUnidade(String label) {
        this.label = label;
    }
}
