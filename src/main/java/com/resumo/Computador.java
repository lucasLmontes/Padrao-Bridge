package com.resumo;

public abstract class Computador {

    protected Hardware hardware;

    protected Computador(Hardware hardware) {
        this.hardware = hardware;
    }

    public abstract float calcularDesempenho();
}
