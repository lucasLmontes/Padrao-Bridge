package com.resumo;

public class ComputadorOffice extends Computador {

    public ComputadorOffice(Hardware hardware) {
        super(hardware);
    }

    @Override
    public float calcularDesempenho() {
        return this.hardware.desempenho() * 1.25f;
    }
}
