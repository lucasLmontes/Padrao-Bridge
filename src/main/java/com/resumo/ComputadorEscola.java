package com.resumo;

public class ComputadorEscola extends Computador {

    public ComputadorEscola(Hardware hardware) {
        super(hardware);
    }

    @Override
    public float calcularDesempenho() {
        return this.hardware.desempenho();
    }
}
