package com.resumo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorGamerTest {

    @Test
    public void deveRetornarDesempenhoComputadorGamerComHardwareRuim() {
        Hardware hardware = new HardwareRuim();
        Computador computador = new ComputadorGamer(hardware);
        assertEquals(2.0f, computador.calcularDesempenho(), 0.01f);
    }

    @Test
    public void deveRetornarDesempenhoComputadorGamerComHardwareMedio() {
        Hardware hardware = new HardwareMedio();
        Computador computador = new ComputadorGamer(hardware);
        assertEquals(4.0f, computador.calcularDesempenho(), 0.01f);
    }

    @Test
    public void deveRetornarDesempenhoComputadorGamerComHardwareBom() {
        Hardware hardware = new HardwareBom();
        Computador computador = new ComputadorGamer(hardware);
        assertEquals(6.0f, computador.calcularDesempenho(), 0.01f);
    }
}