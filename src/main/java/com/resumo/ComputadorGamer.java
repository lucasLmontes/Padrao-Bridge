package com.resumo;

public class ComputadorGamer extends Computador {

    public ComputadorGamer(Hardware hardware) {
        super(hardware);
    }

    @Override
    public float calcularDesempenho() {
        return this.hardware.desempenho() * 2;
    }
}
